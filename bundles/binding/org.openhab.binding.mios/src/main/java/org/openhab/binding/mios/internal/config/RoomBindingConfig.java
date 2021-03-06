/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.mios.internal.config;

import org.openhab.core.items.Item;
import org.openhab.core.transform.TransformationException;
import org.openhab.core.types.Command;
import org.openhab.model.item.binding.BindingConfigParseException;

/**
 *
 * @author Mark Clark
 * @since 1.6.0
 */
public class RoomBindingConfig extends MiosBindingConfig {

    private RoomBindingConfig(String context, String itemName, String unitName, int id, String stuff,
            Class<? extends Item> itemType, String inTransform, String outTransform)
                    throws BindingConfigParseException {
        super(context, itemName, unitName, id, stuff, itemType, null, inTransform, outTransform);
    }

    /**
     * Static constructor-method.
     * 
     * @return an initialized MiOS Room Binding Configuration object.
     */
    public static final MiosBindingConfig create(String context, String itemName, String unitName, int id, String stuff,
            Class<? extends Item> itemType, String inTransform, String outTransform)
                    throws BindingConfigParseException {
        MiosBindingConfig c = new RoomBindingConfig(context, itemName, unitName, id, stuff, itemType, inTransform,
                outTransform);

        c.initialize();
        return c;
    }

    /**
     * Returns the value "<code>room</code>".
     * 
     * @return the value "<code>room</code>"
     */
    @Override
    public String getMiosType() {
        return "room";
    }

    /**
     * This method throws a {@link TransformationException}, as MiOS Room attributes don't support being called.
     * 
     * @throws TransformationException
     */
    @Override
    public String transformCommand(Command command) throws TransformationException {
        throw new TransformationException("Room attributes don't support Command Transformations");
    }
}
