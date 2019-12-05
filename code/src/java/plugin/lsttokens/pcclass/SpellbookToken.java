/*
 * Copyright (c) 2008 Tom Parker <thpr@users.sourceforge.net>
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
package plugin.lsttokens.pcclass;

import pcgen.cdom.enumeration.ObjectKey;
import pcgen.core.PCClass;
import pcgen.rules.persistence.token.AbstractYesNoToken;
import pcgen.rules.persistence.token.CDOMPrimaryToken;

/**
 * Class deals with SPELLBOOK Token
 */
public class SpellbookToken extends AbstractYesNoToken<PCClass> implements CDOMPrimaryToken<PCClass>
{

    @Override
    public String getTokenName()
    {
        return "SPELLBOOK";
    }

    @Override
    protected ObjectKey<Boolean> getObjectKey()
    {
        return ObjectKey.SPELLBOOK;
    }

    @Override
    public Class<PCClass> getTokenClass()
    {
        return PCClass.class;
    }
}
