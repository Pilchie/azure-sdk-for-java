// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.PrivateEndpointConnectionResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.PrivateEndpointConnection;
import com.azure.resourcemanager.recoveryservicesbackup.models.PrivateEndpointConnectionResource;
import java.util.Collections;
import java.util.Map;

public final class PrivateEndpointConnectionResourceImpl
    implements PrivateEndpointConnectionResource,
        PrivateEndpointConnectionResource.Definition,
        PrivateEndpointConnectionResource.Update {
    private PrivateEndpointConnectionResourceInner innerObject;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public PrivateEndpointConnection properties() {
        return this.innerModel().properties();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public PrivateEndpointConnectionResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }

    private String vaultName;

    private String resourceGroupName;

    private String privateEndpointConnectionName;

    public PrivateEndpointConnectionResourceImpl withExistingVault(String vaultName, String resourceGroupName) {
        this.vaultName = vaultName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public PrivateEndpointConnectionResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .put(vaultName, resourceGroupName, privateEndpointConnectionName, this.innerModel(), Context.NONE);
        return this;
    }

    public PrivateEndpointConnectionResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .put(vaultName, resourceGroupName, privateEndpointConnectionName, this.innerModel(), context);
        return this;
    }

    PrivateEndpointConnectionResourceImpl(
        String name, com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerObject = new PrivateEndpointConnectionResourceInner();
        this.serviceManager = serviceManager;
        this.privateEndpointConnectionName = name;
    }

    public PrivateEndpointConnectionResourceImpl update() {
        return this;
    }

    public PrivateEndpointConnectionResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .put(vaultName, resourceGroupName, privateEndpointConnectionName, this.innerModel(), Context.NONE);
        return this;
    }

    public PrivateEndpointConnectionResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .put(vaultName, resourceGroupName, privateEndpointConnectionName, this.innerModel(), context);
        return this;
    }

    PrivateEndpointConnectionResourceImpl(
        PrivateEndpointConnectionResourceInner innerObject,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.vaultName = Utils.getValueFromIdByName(innerObject.id(), "vaults");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.privateEndpointConnectionName = Utils.getValueFromIdByName(innerObject.id(), "privateEndpointConnections");
    }

    public PrivateEndpointConnectionResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .getWithResponse(vaultName, resourceGroupName, privateEndpointConnectionName, Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpointConnectionResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .getWithResponse(vaultName, resourceGroupName, privateEndpointConnectionName, context)
                .getValue();
        return this;
    }

    public PrivateEndpointConnectionResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public PrivateEndpointConnectionResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public PrivateEndpointConnectionResourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public PrivateEndpointConnectionResourceImpl withProperties(PrivateEndpointConnection properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public PrivateEndpointConnectionResourceImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }
}
