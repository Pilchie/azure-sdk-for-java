// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a user that is recommended to be allowed for a certain rule. */
@Fluent
public final class UserRecommendation {
    /*
     * Represents a user that is recommended to be allowed for a certain rule
     */
    @JsonProperty(value = "username")
    private String username;

    /*
     * The recommendation action of the machine or rule
     */
    @JsonProperty(value = "recommendationAction")
    private RecommendationAction recommendationAction;

    /**
     * Get the username property: Represents a user that is recommended to be allowed for a certain rule.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: Represents a user that is recommended to be allowed for a certain rule.
     *
     * @param username the username value to set.
     * @return the UserRecommendation object itself.
     */
    public UserRecommendation withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the recommendationAction property: The recommendation action of the machine or rule.
     *
     * @return the recommendationAction value.
     */
    public RecommendationAction recommendationAction() {
        return this.recommendationAction;
    }

    /**
     * Set the recommendationAction property: The recommendation action of the machine or rule.
     *
     * @param recommendationAction the recommendationAction value to set.
     * @return the UserRecommendation object itself.
     */
    public UserRecommendation withRecommendationAction(RecommendationAction recommendationAction) {
        this.recommendationAction = recommendationAction;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
