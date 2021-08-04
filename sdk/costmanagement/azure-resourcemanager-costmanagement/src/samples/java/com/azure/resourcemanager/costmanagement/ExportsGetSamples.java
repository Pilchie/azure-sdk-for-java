// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement;

import com.azure.core.util.Context;

/** Samples for Exports Get. */
public final class ExportsGetSamples {
    /**
     * Sample code: EnrollmentAccountExport.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void enrollmentAccountExport(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .exports()
            .getWithResponse(
                "providers/Microsoft.Billing/billingAccounts/100/enrollmentAccounts/456", "TestExport", Context.NONE);
    }

    /**
     * Sample code: BillingAccountExport.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void billingAccountExport(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .exports()
            .getWithResponse("providers/Microsoft.Billing/billingAccounts/123456", "TestExport", Context.NONE);
    }

    /**
     * Sample code: DepartmentExport.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void departmentExport(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .exports()
            .getWithResponse(
                "providers/Microsoft.Billing/billingAccounts/12/departments/1234", "TestExport", Context.NONE);
    }

    /**
     * Sample code: SubscriptionExport.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void subscriptionExport(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .exports()
            .getWithResponse("subscriptions/00000000-0000-0000-0000-000000000000", "TestExport", Context.NONE);
    }

    /**
     * Sample code: ResourceGroupExport.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void resourceGroupExport(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .exports()
            .getWithResponse(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/MYDEVTESTRG",
                "TestExport",
                Context.NONE);
    }

    /**
     * Sample code: ManagementGroupExport.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void managementGroupExport(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .exports()
            .getWithResponse("providers/Microsoft.Management/managementGroups/TestMG", "TestExport", Context.NONE);
    }
}