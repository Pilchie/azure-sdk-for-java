// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch;

import com.azure.core.util.Context;

/** Samples for Certificate Get. */
public final class CertificateGetSamples {
    /**
     * Sample code: Get Certificate with Deletion Error.
     *
     * @param batchManager Entry point to BatchManager.
     */
    public static void getCertificateWithDeletionError(com.azure.resourcemanager.batch.BatchManager batchManager) {
        batchManager
            .certificates()
            .getWithResponse(
                "default-azurebatch-japaneast",
                "sampleacct",
                "sha1-0a0e4f50d51beadeac1d35afc5116098e7902e6e",
                Context.NONE);
    }

    /**
     * Sample code: Get Certificate.
     *
     * @param batchManager Entry point to BatchManager.
     */
    public static void getCertificate(com.azure.resourcemanager.batch.BatchManager batchManager) {
        batchManager
            .certificates()
            .getWithResponse(
                "default-azurebatch-japaneast",
                "sampleacct",
                "sha1-0a0e4f50d51beadeac1d35afc5116098e7902e6e",
                Context.NONE);
    }
}