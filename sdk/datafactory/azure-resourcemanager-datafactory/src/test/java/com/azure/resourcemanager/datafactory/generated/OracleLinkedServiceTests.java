// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureKeyVaultSecretReference;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.OracleLinkedService;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OracleLinkedServiceTests {
    @Test
    public void testDeserialize() {
        OracleLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"Oracle\",\"typeProperties\":{\"password\":{\"type\":\"AzureKeyVaultSecret\"}},\"connectVia\":{\"referenceName\":\"xmbjroum\",\"parameters\":{}},\"description\":\"al\",\"parameters\":{\"zgfxonjtpusl\":{\"type\":\"Bool\"},\"pvti\":{\"type\":\"Bool\"},\"bpdbollgr\":{\"type\":\"SecureString\"},\"iuas\":{\"type\":\"SecureString\"}},\"annotations\":[],\"\":{}}")
                .toObject(OracleLinkedService.class);
        Assertions.assertEquals("xmbjroum", model.connectVia().referenceName());
        Assertions.assertEquals("al", model.description());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("zgfxonjtpusl").type());
    }

    @Test
    public void testSerialize() {
        OracleLinkedService model =
            new OracleLinkedService()
                .withConnectVia(new IntegrationRuntimeReference().withReferenceName("xmbjroum").withParameters(mapOf()))
                .withDescription("al")
                .withParameters(
                    mapOf(
                        "zgfxonjtpusl",
                        new ParameterSpecification().withType(ParameterType.BOOL),
                        "pvti",
                        new ParameterSpecification().withType(ParameterType.BOOL),
                        "bpdbollgr",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING),
                        "iuas",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING)))
                .withAnnotations(Arrays.asList())
                .withPassword(new AzureKeyVaultSecretReference());
        model = BinaryData.fromObject(model).toObject(OracleLinkedService.class);
        Assertions.assertEquals("xmbjroum", model.connectVia().referenceName());
        Assertions.assertEquals("al", model.description());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("zgfxonjtpusl").type());
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
