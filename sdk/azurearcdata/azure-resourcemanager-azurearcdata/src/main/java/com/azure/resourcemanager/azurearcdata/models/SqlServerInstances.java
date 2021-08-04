// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of SqlServerInstances. */
public interface SqlServerInstances {
    /**
     * List sqlServerInstance resources in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SqlServerInstance.
     */
    PagedIterable<SqlServerInstance> list();

    /**
     * List sqlServerInstance resources in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SqlServerInstance.
     */
    PagedIterable<SqlServerInstance> list(Context context);

    /**
     * Gets all sqlServerInstances in a resource group.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all sqlServerInstances in a resource group.
     */
    PagedIterable<SqlServerInstance> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all sqlServerInstances in a resource group.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all sqlServerInstances in a resource group.
     */
    PagedIterable<SqlServerInstance> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieves a SQL Server Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlServerInstanceName Name of SQL Server Instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SqlServerInstance.
     */
    SqlServerInstance getByResourceGroup(String resourceGroupName, String sqlServerInstanceName);

    /**
     * Retrieves a SQL Server Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlServerInstanceName Name of SQL Server Instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SqlServerInstance.
     */
    Response<SqlServerInstance> getByResourceGroupWithResponse(
        String resourceGroupName, String sqlServerInstanceName, Context context);

    /**
     * Deletes a SQL Server Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlServerInstanceName The name of SQL Server Instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String sqlServerInstanceName);

    /**
     * Deletes a SQL Server Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlServerInstanceName The name of SQL Server Instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String sqlServerInstanceName, Context context);

    /**
     * Retrieves a SQL Server Instance resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SqlServerInstance.
     */
    SqlServerInstance getById(String id);

    /**
     * Retrieves a SQL Server Instance resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SqlServerInstance.
     */
    Response<SqlServerInstance> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a SQL Server Instance resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a SQL Server Instance resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new SqlServerInstance resource.
     *
     * @param name resource name.
     * @return the first stage of the new SqlServerInstance definition.
     */
    SqlServerInstance.DefinitionStages.Blank define(String name);
}