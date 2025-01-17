// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.AzureDataExplorerCommandActivity;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureDataExplorerCommandActivityTests {
    @Test
    public void testDeserialize() {
        AzureDataExplorerCommandActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureDataExplorerCommand\",\"typeProperties\":{},\"linkedServiceName\":{\"referenceName\":\"xlyzkxit\",\"parameters\":{}},\"policy\":{\"retryIntervalInSeconds\":585154950,\"secureInput\":true,\"secureOutput\":false,\"\":{}},\"name\":\"ovmozsayebraz\",\"description\":\"lpzbtzuykykipf\",\"dependsOn\":[{\"activity\":\"epfnoc\",\"dependencyConditions\":[\"Skipped\",\"Skipped\",\"Completed\"],\"\":{}},{\"activity\":\"pztgazwyqejgaaok\",\"dependencyConditions\":[\"Completed\",\"Skipped\",\"Failed\",\"Completed\"],\"\":{}}],\"userProperties\":[{\"name\":\"kcy\"},{\"name\":\"mffngdyfcixr\"},{\"name\":\"lcqvhoejgoiutgw\"},{\"name\":\"mkahpqha\"}],\"\":{}}")
                .toObject(AzureDataExplorerCommandActivity.class);
        Assertions.assertEquals("ovmozsayebraz", model.name());
        Assertions.assertEquals("lpzbtzuykykipf", model.description());
        Assertions.assertEquals("epfnoc", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("kcy", model.userProperties().get(0).name());
        Assertions.assertEquals("xlyzkxit", model.linkedServiceName().referenceName());
        Assertions.assertEquals(585154950, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
    }

    @Test
    public void testSerialize() {
        AzureDataExplorerCommandActivity model =
            new AzureDataExplorerCommandActivity()
                .withName("ovmozsayebraz")
                .withDescription("lpzbtzuykykipf")
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("epfnoc")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("pztgazwyqejgaaok")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.FAILED,
                                            DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays
                        .asList(
                            new UserProperty().withName("kcy"),
                            new UserProperty().withName("mffngdyfcixr"),
                            new UserProperty().withName("lcqvhoejgoiutgw"),
                            new UserProperty().withName("mkahpqha")))
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("xlyzkxit").withParameters(mapOf()))
                .withPolicy(
                    new ActivityPolicy()
                        .withRetryIntervalInSeconds(585154950)
                        .withSecureInput(true)
                        .withSecureOutput(false)
                        .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(AzureDataExplorerCommandActivity.class);
        Assertions.assertEquals("ovmozsayebraz", model.name());
        Assertions.assertEquals("lpzbtzuykykipf", model.description());
        Assertions.assertEquals("epfnoc", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("kcy", model.userProperties().get(0).name());
        Assertions.assertEquals("xlyzkxit", model.linkedServiceName().referenceName());
        Assertions.assertEquals(585154950, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
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
