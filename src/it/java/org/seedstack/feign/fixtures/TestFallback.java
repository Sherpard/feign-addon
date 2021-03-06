/**
 * Copyright (c) 2013-2016, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.feign.fixtures;

import org.seedstack.feign.fixtures.apis.TestAPI;

public class TestFallback implements TestAPI {
    @Override
    public Message getMessage() {
        return new Message("Fallback response", "fallback");
    }

    @Override
    public Message get404() {
        return new Message("Error code: 404 !", "fallback");
    }
}
