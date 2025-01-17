// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Category of the connection. */
public final class ConnectionCategory extends ExpandableStringEnum<ConnectionCategory> {
    /** Static value PythonFeed for ConnectionCategory. */
    public static final ConnectionCategory PYTHON_FEED = fromString("PythonFeed");

    /** Static value ContainerRegistry for ConnectionCategory. */
    public static final ConnectionCategory CONTAINER_REGISTRY = fromString("ContainerRegistry");

    /** Static value Git for ConnectionCategory. */
    public static final ConnectionCategory GIT = fromString("Git");

    /**
     * Creates or finds a ConnectionCategory from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConnectionCategory.
     */
    @JsonCreator
    public static ConnectionCategory fromString(String name) {
        return fromString(name, ConnectionCategory.class);
    }

    /**
     * Gets known ConnectionCategory values.
     *
     * @return known ConnectionCategory values.
     */
    public static Collection<ConnectionCategory> values() {
        return values(ConnectionCategory.class);
    }
}
