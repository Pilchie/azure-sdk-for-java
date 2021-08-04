// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Amazon Marketplace Web Service linked service properties. */
@Fluent
public final class AmazonMwsLinkedServiceTypeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AmazonMwsLinkedServiceTypeProperties.class);

    /*
     * The endpoint of the Amazon MWS server, (i.e. mws.amazonservices.com)
     */
    @JsonProperty(value = "endpoint", required = true)
    private Object endpoint;

    /*
     * The Amazon Marketplace ID you want to retrieve data from. To retrieve
     * data from multiple Marketplace IDs, separate them with a comma (,).
     * (i.e. A2EUQ1WTGCTBG2)
     */
    @JsonProperty(value = "marketplaceID", required = true)
    private Object marketplaceId;

    /*
     * The Amazon seller ID.
     */
    @JsonProperty(value = "sellerID", required = true)
    private Object sellerId;

    /*
     * The Amazon MWS authentication token.
     */
    @JsonProperty(value = "mwsAuthToken")
    private SecretBase mwsAuthToken;

    /*
     * The access key id used to access data.
     */
    @JsonProperty(value = "accessKeyId", required = true)
    private Object accessKeyId;

    /*
     * The secret key used to access data.
     */
    @JsonProperty(value = "secretKey")
    private SecretBase secretKey;

    /*
     * Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     */
    @JsonProperty(value = "useEncryptedEndpoints")
    private Object useEncryptedEndpoints;

    /*
     * Specifies whether to require the host name in the server's certificate
     * to match the host name of the server when connecting over SSL. The
     * default value is true.
     */
    @JsonProperty(value = "useHostVerification")
    private Object useHostVerification;

    /*
     * Specifies whether to verify the identity of the server when connecting
     * over SSL. The default value is true.
     */
    @JsonProperty(value = "usePeerVerification")
    private Object usePeerVerification;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the endpoint property: The endpoint of the Amazon MWS server, (i.e. mws.amazonservices.com).
     *
     * @return the endpoint value.
     */
    public Object endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: The endpoint of the Amazon MWS server, (i.e. mws.amazonservices.com).
     *
     * @param endpoint the endpoint value to set.
     * @return the AmazonMwsLinkedServiceTypeProperties object itself.
     */
    public AmazonMwsLinkedServiceTypeProperties withEndpoint(Object endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the marketplaceId property: The Amazon Marketplace ID you want to retrieve data from. To retrieve data from
     * multiple Marketplace IDs, separate them with a comma (,). (i.e. A2EUQ1WTGCTBG2).
     *
     * @return the marketplaceId value.
     */
    public Object marketplaceId() {
        return this.marketplaceId;
    }

    /**
     * Set the marketplaceId property: The Amazon Marketplace ID you want to retrieve data from. To retrieve data from
     * multiple Marketplace IDs, separate them with a comma (,). (i.e. A2EUQ1WTGCTBG2).
     *
     * @param marketplaceId the marketplaceId value to set.
     * @return the AmazonMwsLinkedServiceTypeProperties object itself.
     */
    public AmazonMwsLinkedServiceTypeProperties withMarketplaceId(Object marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Get the sellerId property: The Amazon seller ID.
     *
     * @return the sellerId value.
     */
    public Object sellerId() {
        return this.sellerId;
    }

    /**
     * Set the sellerId property: The Amazon seller ID.
     *
     * @param sellerId the sellerId value to set.
     * @return the AmazonMwsLinkedServiceTypeProperties object itself.
     */
    public AmazonMwsLinkedServiceTypeProperties withSellerId(Object sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * Get the mwsAuthToken property: The Amazon MWS authentication token.
     *
     * @return the mwsAuthToken value.
     */
    public SecretBase mwsAuthToken() {
        return this.mwsAuthToken;
    }

    /**
     * Set the mwsAuthToken property: The Amazon MWS authentication token.
     *
     * @param mwsAuthToken the mwsAuthToken value to set.
     * @return the AmazonMwsLinkedServiceTypeProperties object itself.
     */
    public AmazonMwsLinkedServiceTypeProperties withMwsAuthToken(SecretBase mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

    /**
     * Get the accessKeyId property: The access key id used to access data.
     *
     * @return the accessKeyId value.
     */
    public Object accessKeyId() {
        return this.accessKeyId;
    }

    /**
     * Set the accessKeyId property: The access key id used to access data.
     *
     * @param accessKeyId the accessKeyId value to set.
     * @return the AmazonMwsLinkedServiceTypeProperties object itself.
     */
    public AmazonMwsLinkedServiceTypeProperties withAccessKeyId(Object accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * Get the secretKey property: The secret key used to access data.
     *
     * @return the secretKey value.
     */
    public SecretBase secretKey() {
        return this.secretKey;
    }

    /**
     * Set the secretKey property: The secret key used to access data.
     *
     * @param secretKey the secretKey value to set.
     * @return the AmazonMwsLinkedServiceTypeProperties object itself.
     */
    public AmazonMwsLinkedServiceTypeProperties withSecretKey(SecretBase secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     *
     * @return the useEncryptedEndpoints value.
     */
    public Object useEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     *
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the AmazonMwsLinkedServiceTypeProperties object itself.
     */
    public AmazonMwsLinkedServiceTypeProperties withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     *
     * @return the useHostVerification value.
     */
    public Object useHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     *
     * @param useHostVerification the useHostVerification value to set.
     * @return the AmazonMwsLinkedServiceTypeProperties object itself.
     */
    public AmazonMwsLinkedServiceTypeProperties withUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     *
     * @return the usePeerVerification value.
     */
    public Object usePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     *
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the AmazonMwsLinkedServiceTypeProperties object itself.
     */
    public AmazonMwsLinkedServiceTypeProperties withUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AmazonMwsLinkedServiceTypeProperties object itself.
     */
    public AmazonMwsLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpoint() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property endpoint in model AmazonMwsLinkedServiceTypeProperties"));
        }
        if (marketplaceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property marketplaceId in model AmazonMwsLinkedServiceTypeProperties"));
        }
        if (sellerId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sellerId in model AmazonMwsLinkedServiceTypeProperties"));
        }
        if (mwsAuthToken() != null) {
            mwsAuthToken().validate();
        }
        if (accessKeyId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property accessKeyId in model AmazonMwsLinkedServiceTypeProperties"));
        }
        if (secretKey() != null) {
            secretKey().validate();
        }
    }
}