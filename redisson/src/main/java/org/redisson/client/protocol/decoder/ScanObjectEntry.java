/**
 * Copyright 2018 Nikita Koksharov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.redisson.client.protocol.decoder;

import org.redisson.misc.HashValue;

/**
 * 
 * @author Nikita Koksharov
 *
 */
public class ScanObjectEntry {

    private final HashValue hash;
    private final Object obj;

    public ScanObjectEntry(HashValue hash, Object obj) {
        this.hash = hash;
        this.obj = obj;
    }

    public HashValue getHash() {
        return hash;
    }

    public Object getObj() {
        return obj;
    }

}
