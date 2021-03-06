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
package org.openhab.binding.xbmc.rpc.calls;

import java.util.HashMap;
import java.util.Map;

import org.openhab.binding.xbmc.rpc.RpcCall;

import com.ning.http.client.AsyncHttpClient;

/**
 * JSONRPC.Ping RPC
 *
 * @author Ben Jones
 * @since 1.5.0
 */
public class JSONRPCPing extends RpcCall {

    private boolean pong = false;

    public JSONRPCPing(AsyncHttpClient client, String uri) {
        super(client, uri);
    }

    @Override
    protected String getName() {
        return "JSONRPC.Ping";
    }

    @Override
    protected Map<String, Object> getParams() {
        return new HashMap<String, Object>();
    }

    @Override
    protected void processResponse(Map<String, Object> response) {
        pong = response.containsKey("result") && response.get("result").equals("pong");
    }

    public boolean isPong() {
        return pong;
    }
}
