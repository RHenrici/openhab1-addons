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
package org.openhab.library.tel.items;

import java.util.ArrayList;
import java.util.List;

import org.openhab.core.items.GenericItem;
import org.openhab.core.types.Command;
import org.openhab.core.types.State;
import org.openhab.core.types.UnDefType;
import org.openhab.library.tel.types.CallType;

/**
 *
 * @author Kai Kreuzer - Initial contribution
 */
public class CallItem extends GenericItem {

    private static List<Class<? extends State>> acceptedDataTypes = new ArrayList<>();
    private static List<Class<? extends Command>> acceptedCommandTypes = new ArrayList<>();

    static {
        acceptedDataTypes.add(CallType.class);
        acceptedDataTypes.add(UnDefType.class);
    }

    public CallItem(String name) {
        super(name);
    }

    @Override
    public List<Class<? extends State>> getAcceptedDataTypes() {
        return acceptedDataTypes;
    }

    @Override
    public List<Class<? extends Command>> getAcceptedCommandTypes() {
        return acceptedCommandTypes;
    }

}
