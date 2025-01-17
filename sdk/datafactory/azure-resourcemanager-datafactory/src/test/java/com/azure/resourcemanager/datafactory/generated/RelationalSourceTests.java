// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.RelationalSource;
import org.junit.jupiter.api.Test;

public final class RelationalSourceTests {
    @Test
    public void testDeserialize() {
        RelationalSource model =
            BinaryData.fromString("{\"type\":\"RelationalSource\",\"\":{}}").toObject(RelationalSource.class);
    }

    @Test
    public void testSerialize() {
        RelationalSource model = new RelationalSource();
        model = BinaryData.fromObject(model).toObject(RelationalSource.class);
    }
}
