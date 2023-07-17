/*
 *  Copyright 2022 Red Hat
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.jboss.hal.core.accesscontrol;

import javax.inject.Inject;

import com.gwtplatform.mvp.client.proxy.Gatekeeper;

/** A gatekeeper which needs {@link AccessControl#superUserOrAdministrator()} to pass. */
public class SensitiveGatekeeper implements Gatekeeper {

    private final AccessControl accessControl;

    @Inject
    public SensitiveGatekeeper(AccessControl accessControl) {
        this.accessControl = accessControl;
    }

    @Override
    public boolean canReveal() {
        return accessControl.superUserOrAdministrator();
    }
}
