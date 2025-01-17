// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.Expression;
import com.azure.resourcemanager.datafactory.models.SwitchActivity;
import com.azure.resourcemanager.datafactory.models.SwitchCase;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SwitchActivityTests {
    @Test
    public void testDeserialize() {
        SwitchActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"Switch\",\"typeProperties\":{\"on\":{\"value\":\"zynuh\"},\"cases\":[{\"value\":\"qshavlj\",\"activities\":[]}],\"defaultActivities\":[{\"type\":\"Activity\",\"name\":\"rqolnthbb\",\"description\":\"gzukw\",\"dependsOn\":[],\"userProperties\":[],\"\":{}},{\"type\":\"Activity\",\"name\":\"kjthfce\",\"description\":\"ncjmlfuyf\",\"dependsOn\":[],\"userProperties\":[],\"\":{}},{\"type\":\"Activity\",\"name\":\"iddhlrufzc\",\"description\":\"jmqrfuiocuselq\",\"dependsOn\":[],\"userProperties\":[],\"\":{}},{\"type\":\"Activity\",\"name\":\"zrhxuddqmdtf\",\"description\":\"sjmrkkhm\",\"dependsOn\":[],\"userProperties\":[],\"\":{}}]},\"name\":\"lgyqixokw\",\"description\":\"awhva\",\"dependsOn\":[{\"activity\":\"fqqdl\",\"dependencyConditions\":[\"Completed\",\"Completed\",\"Completed\"],\"\":{}},{\"activity\":\"aymjchtvsnvlaq\",\"dependencyConditions\":[\"Succeeded\",\"Failed\",\"Completed\",\"Completed\"],\"\":{}},{\"activity\":\"tuwqkokb\",\"dependencyConditions\":[\"Skipped\",\"Failed\"],\"\":{}},{\"activity\":\"mgobllmsnwg\",\"dependencyConditions\":[\"Failed\",\"Completed\"],\"\":{}}],\"userProperties\":[{\"name\":\"khtmhobcyanrfv\"},{\"name\":\"tvkhgvo\"},{\"name\":\"gxkfnaoaqymhccto\"},{\"name\":\"uowyrnskbyhqu\"}],\"\":{}}")
                .toObject(SwitchActivity.class);
        Assertions.assertEquals("lgyqixokw", model.name());
        Assertions.assertEquals("awhva", model.description());
        Assertions.assertEquals("fqqdl", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("khtmhobcyanrfv", model.userProperties().get(0).name());
        Assertions.assertEquals("zynuh", model.on().value());
        Assertions.assertEquals("qshavlj", model.cases().get(0).value());
        Assertions.assertEquals("rqolnthbb", model.defaultActivities().get(0).name());
        Assertions.assertEquals("gzukw", model.defaultActivities().get(0).description());
    }

    @Test
    public void testSerialize() {
        SwitchActivity model =
            new SwitchActivity()
                .withName("lgyqixokw")
                .withDescription("awhva")
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("fqqdl")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("aymjchtvsnvlaq")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.SUCCEEDED,
                                            DependencyCondition.FAILED,
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("tuwqkokb")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("mgobllmsnwg")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.FAILED, DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays
                        .asList(
                            new UserProperty().withName("khtmhobcyanrfv"),
                            new UserProperty().withName("tvkhgvo"),
                            new UserProperty().withName("gxkfnaoaqymhccto"),
                            new UserProperty().withName("uowyrnskbyhqu")))
                .withOn(new Expression().withValue("zynuh"))
                .withCases(Arrays.asList(new SwitchCase().withValue("qshavlj").withActivities(Arrays.asList())))
                .withDefaultActivities(
                    Arrays
                        .asList(
                            new Activity()
                                .withName("rqolnthbb")
                                .withDescription("gzukw")
                                .withDependsOn(Arrays.asList())
                                .withUserProperties(Arrays.asList())
                                .withAdditionalProperties(mapOf("type", "Activity")),
                            new Activity()
                                .withName("kjthfce")
                                .withDescription("ncjmlfuyf")
                                .withDependsOn(Arrays.asList())
                                .withUserProperties(Arrays.asList())
                                .withAdditionalProperties(mapOf("type", "Activity")),
                            new Activity()
                                .withName("iddhlrufzc")
                                .withDescription("jmqrfuiocuselq")
                                .withDependsOn(Arrays.asList())
                                .withUserProperties(Arrays.asList())
                                .withAdditionalProperties(mapOf("type", "Activity")),
                            new Activity()
                                .withName("zrhxuddqmdtf")
                                .withDescription("sjmrkkhm")
                                .withDependsOn(Arrays.asList())
                                .withUserProperties(Arrays.asList())
                                .withAdditionalProperties(mapOf("type", "Activity"))));
        model = BinaryData.fromObject(model).toObject(SwitchActivity.class);
        Assertions.assertEquals("lgyqixokw", model.name());
        Assertions.assertEquals("awhva", model.description());
        Assertions.assertEquals("fqqdl", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("khtmhobcyanrfv", model.userProperties().get(0).name());
        Assertions.assertEquals("zynuh", model.on().value());
        Assertions.assertEquals("qshavlj", model.cases().get(0).value());
        Assertions.assertEquals("rqolnthbb", model.defaultActivities().get(0).name());
        Assertions.assertEquals("gzukw", model.defaultActivities().get(0).description());
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
