// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzureMySqlTableDatasetTypeProperties;
import org.junit.jupiter.api.Test;

public final class AzureMySqlTableDatasetTypePropertiesTests {
    @Test
    public void testDeserialize() {
        AzureMySqlTableDatasetTypeProperties model =
            BinaryData.fromString("{}").toObject(AzureMySqlTableDatasetTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        AzureMySqlTableDatasetTypeProperties model = new AzureMySqlTableDatasetTypeProperties();
        model = BinaryData.fromObject(model).toObject(AzureMySqlTableDatasetTypeProperties.class);
    }
}
