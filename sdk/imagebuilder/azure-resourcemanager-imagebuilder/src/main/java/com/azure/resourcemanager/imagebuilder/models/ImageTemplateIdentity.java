// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Identity for the image template. */
@Fluent
public class ImageTemplateIdentity {
    /*
     * The type of identity used for the image template. The type 'None' will
     * remove any identities from the image template.
     */
    @JsonProperty(value = "type")
    private ResourceIdentityType type;

    /*
     * The list of user identities associated with the image template. The user
     * identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     */
    @JsonProperty(value = "userAssignedIdentities")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, ImageTemplateIdentityUserAssignedIdentities> userAssignedIdentities;

    /**
     * Get the type property: The type of identity used for the image template. The type 'None' will remove any
     * identities from the image template.
     *
     * @return the type value.
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of identity used for the image template. The type 'None' will remove any
     * identities from the image template.
     *
     * @param type the type value to set.
     * @return the ImageTemplateIdentity object itself.
     */
    public ImageTemplateIdentity withType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: The list of user identities associated with the image template. The user
     * identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @return the userAssignedIdentities value.
     */
    public Map<String, ImageTemplateIdentityUserAssignedIdentities> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The list of user identities associated with the image template. The user
     * identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the ImageTemplateIdentity object itself.
     */
    public ImageTemplateIdentity withUserAssignedIdentities(
        Map<String, ImageTemplateIdentityUserAssignedIdentities> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userAssignedIdentities() != null) {
            userAssignedIdentities()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
