// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.WaitActivityTypeProperties;
import org.junit.jupiter.api.Test;

public final class WaitActivityTypePropertiesTests {
    @Test
    public void testDeserialize() {
        WaitActivityTypeProperties model = BinaryData.fromString("{}").toObject(WaitActivityTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        WaitActivityTypeProperties model = new WaitActivityTypeProperties();
        model = BinaryData.fromObject(model).toObject(WaitActivityTypeProperties.class);
    }
}
