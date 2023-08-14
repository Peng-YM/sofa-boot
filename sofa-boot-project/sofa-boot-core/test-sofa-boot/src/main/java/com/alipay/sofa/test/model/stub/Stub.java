/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.test.model.stub;

import org.springframework.test.context.TestContext;

import java.util.Set;

/**
 * @author pengym
 * @version Stub.java, v 0.1 2023年08月07日 17:52 pengym
 */
public interface Stub {
    /**
     * Resolve the actual stub targets
     * @param testContext TestContext
     * @return The actual stub targets
     */
    Set<Object> resolveTargets(TestContext testContext);
}
