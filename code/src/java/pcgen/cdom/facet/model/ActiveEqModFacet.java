/*
 * Copyright (c) Thomas Parker, 2009.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA
 */
package pcgen.cdom.facet.model;

import pcgen.cdom.enumeration.CharID;
import pcgen.cdom.enumeration.ListKey;
import pcgen.cdom.facet.base.AbstractSourcedListFacet;
import pcgen.cdom.facet.event.DataFacetChangeEvent;
import pcgen.cdom.facet.event.DataFacetChangeListener;
import pcgen.cdom.inst.EquipmentHead;
import pcgen.core.EquipmentModifier;

/**
 * ActiveEqModFacet is a Facet that tracks the EqMods that are on EquipmentHeads active on
 * the PlayerCharacter.
 */
public class ActiveEqModFacet extends AbstractSourcedListFacet<CharID, EquipmentModifier>
        implements DataFacetChangeListener<CharID, EquipmentHead>
{

    @Override
    public void dataAdded(DataFacetChangeEvent<CharID, EquipmentHead> dfce)
    {
        CharID id = dfce.getCharID();
        EquipmentHead head = dfce.getCDOMObject();
        for (EquipmentModifier eqMod : head.getSafeListFor(ListKey.EQMOD))
        {
            add(id, eqMod, head);
        }
    }

    @Override
    public void dataRemoved(DataFacetChangeEvent<CharID, EquipmentHead> dfce)
    {
        CharID id = dfce.getCharID();
        EquipmentHead head = dfce.getCDOMObject();
        for (EquipmentModifier eqMod : head.getSafeListFor(ListKey.EQMOD))
        {
            remove(id, eqMod, head);
        }
    }
}
