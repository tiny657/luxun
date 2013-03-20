/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.leansoft.luxun.broker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.leansoft.luxun.common.annotations.ClientSide;

/**
 * produce or consume messages with given brokers list
 * 
 * @author bulldog
 * 
 */
@ClientSide
public class ConfigBrokerInfo implements BrokerInfo {

    private final String brokerList;

    private final Map<Integer, Broker> allBrokers = new HashMap<Integer, Broker>();
    
    private final List<Integer> brokerIds = new ArrayList<Integer>();

    public ConfigBrokerInfo(String brokerList) {
        this.brokerList = brokerList;
        try {
            init();
        } catch (RuntimeException e) {
            throw new IllegalArgumentException("illegal broker.list", e);
        }
    }

    public Broker getBrokerInfo(int brokerId) {
        return allBrokers.get(brokerId);
    }
    
	@Override
	public List<Integer> getBrokerIdList() {
		return brokerIds;
	}

    public void close() {
        allBrokers.clear();
        brokerIds.clear();
    }

    private void init() {
        String[] brokerInfoList = this.brokerList.split(",");
        for (String bInfo : brokerInfoList) {
            final String[] idHostPort = bInfo.split(":");
            final int id = Integer.parseInt(idHostPort[0]);
            final String host = idHostPort[1];
            final int port = Integer.parseInt(idHostPort[2]);
            allBrokers.put(id, new Broker(id, host, host, port));
            brokerIds.add(id);
        }
    }
}
