// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.OdbcSource;
import org.junit.jupiter.api.Test;

public final class OdbcSourceTests {
    @Test
    public void testDeserialize() {
        OdbcSource model = BinaryData.fromString("{\"type\":\"OdbcSource\",\"\":{}}").toObject(OdbcSource.class);
    }

    @Test
    public void testSerialize() {
        OdbcSource model = new OdbcSource();
        model = BinaryData.fromObject(model).toObject(OdbcSource.class);
    }
}
