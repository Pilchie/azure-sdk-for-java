// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BlobIndexerDataToExtract. */
public final class BlobIndexerDataToExtract extends ExpandableStringEnum<BlobIndexerDataToExtract> {
    /** Static value storageMetadata for BlobIndexerDataToExtract. */
    public static final BlobIndexerDataToExtract STORAGE_METADATA = fromString("storageMetadata");

    /** Static value allMetadata for BlobIndexerDataToExtract. */
    public static final BlobIndexerDataToExtract ALL_METADATA = fromString("allMetadata");

    /** Static value contentAndMetadata for BlobIndexerDataToExtract. */
    public static final BlobIndexerDataToExtract CONTENT_AND_METADATA = fromString("contentAndMetadata");

    /**
     * Creates or finds a BlobIndexerDataToExtract from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BlobIndexerDataToExtract.
     */
    @JsonCreator
    public static BlobIndexerDataToExtract fromString(String name) {
        return fromString(name, BlobIndexerDataToExtract.class);
    }

    /**
     * Gets known BlobIndexerDataToExtract values.
     *
     * @return known BlobIndexerDataToExtract values.
     */
    public static Collection<BlobIndexerDataToExtract> values() {
        return values(BlobIndexerDataToExtract.class);
    }
}
