// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.models.GeoBackupPolicyState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A database geo backup policy. */
@Fluent
public final class GeoBackupPolicyInner extends ProxyResource {
    /*
     * The properties of the geo backup policy.
     */
    @JsonProperty(value = "properties", required = true)
    private GeoBackupPolicyProperties innerProperties = new GeoBackupPolicyProperties();

    /*
     * Kind of geo backup policy.  This is metadata used for the Azure portal
     * experience.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Backup policy location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Get the innerProperties property: The properties of the geo backup policy.
     *
     * @return the innerProperties value.
     */
    private GeoBackupPolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the kind property: Kind of geo backup policy. This is metadata used for the Azure portal experience.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the location property: Backup policy location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the state property: The state of the geo backup policy.
     *
     * @return the state value.
     */
    public GeoBackupPolicyState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: The state of the geo backup policy.
     *
     * @param state the state value to set.
     * @return the GeoBackupPolicyInner object itself.
     */
    public GeoBackupPolicyInner withState(GeoBackupPolicyState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GeoBackupPolicyProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the storageType property: The storage type of the geo backup policy.
     *
     * @return the storageType value.
     */
    public String storageType() {
        return this.innerProperties() == null ? null : this.innerProperties().storageType();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model GeoBackupPolicyInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GeoBackupPolicyInner.class);
}
