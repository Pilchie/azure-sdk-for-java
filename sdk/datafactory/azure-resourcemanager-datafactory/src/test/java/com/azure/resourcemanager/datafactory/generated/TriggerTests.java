// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Trigger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TriggerTests {
    @Test
    public void testDeserialize() {
        Trigger model =
            BinaryData
                .fromString(
                    "{\"type\":\"Trigger\",\"description\":\"skfc\",\"runtimeState\":\"Disabled\",\"annotations\":[],\"\":{}}")
                .toObject(Trigger.class);
        Assertions.assertEquals("skfc", model.description());
    }

    @Test
    public void testSerialize() {
        Trigger model =
            new Trigger()
                .withDescription("skfc")
                .withAnnotations(Arrays.asList())
                .withAdditionalProperties(mapOf("type", "Trigger", "runtimeState", "Disabled"));
        model = BinaryData.fromObject(model).toObject(Trigger.class);
        Assertions.assertEquals("skfc", model.description());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
