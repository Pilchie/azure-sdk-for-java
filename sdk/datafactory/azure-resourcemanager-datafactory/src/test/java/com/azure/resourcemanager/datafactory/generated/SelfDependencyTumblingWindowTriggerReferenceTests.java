// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SelfDependencyTumblingWindowTriggerReference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SelfDependencyTumblingWindowTriggerReferenceTests {
    @Test
    public void testDeserialize() {
        SelfDependencyTumblingWindowTriggerReference model =
            BinaryData
                .fromString(
                    "{\"type\":\"SelfDependencyTumblingWindowTriggerReference\",\"offset\":\"nimx\",\"size\":\"nerxrzu\"}")
                .toObject(SelfDependencyTumblingWindowTriggerReference.class);
        Assertions.assertEquals("nimx", model.offset());
        Assertions.assertEquals("nerxrzu", model.size());
    }

    @Test
    public void testSerialize() {
        SelfDependencyTumblingWindowTriggerReference model =
            new SelfDependencyTumblingWindowTriggerReference().withOffset("nimx").withSize("nerxrzu");
        model = BinaryData.fromObject(model).toObject(SelfDependencyTumblingWindowTriggerReference.class);
        Assertions.assertEquals("nimx", model.offset());
        Assertions.assertEquals("nerxrzu", model.size());
    }
}
