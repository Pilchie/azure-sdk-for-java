// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.AssessmentsClient;
import com.azure.resourcemanager.security.fluent.models.SecurityAssessmentResponseInner;
import com.azure.resourcemanager.security.models.Assessments;
import com.azure.resourcemanager.security.models.ExpandEnum;
import com.azure.resourcemanager.security.models.SecurityAssessmentResponse;

public final class AssessmentsImpl implements Assessments {
    private static final ClientLogger LOGGER = new ClientLogger(AssessmentsImpl.class);

    private final AssessmentsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public AssessmentsImpl(
        AssessmentsClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SecurityAssessmentResponse> list(String scope) {
        PagedIterable<SecurityAssessmentResponseInner> inner = this.serviceClient().list(scope);
        return Utils.mapPage(inner, inner1 -> new SecurityAssessmentResponseImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityAssessmentResponse> list(String scope, Context context) {
        PagedIterable<SecurityAssessmentResponseInner> inner = this.serviceClient().list(scope, context);
        return Utils.mapPage(inner, inner1 -> new SecurityAssessmentResponseImpl(inner1, this.manager()));
    }

    public SecurityAssessmentResponse get(String resourceId, String assessmentName) {
        SecurityAssessmentResponseInner inner = this.serviceClient().get(resourceId, assessmentName);
        if (inner != null) {
            return new SecurityAssessmentResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SecurityAssessmentResponse> getWithResponse(
        String resourceId, String assessmentName, ExpandEnum expand, Context context) {
        Response<SecurityAssessmentResponseInner> inner =
            this.serviceClient().getWithResponse(resourceId, assessmentName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SecurityAssessmentResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceId, String assessmentName) {
        this.serviceClient().delete(resourceId, assessmentName);
    }

    public Response<Void> deleteWithResponse(String resourceId, String assessmentName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceId, assessmentName, context);
    }

    public SecurityAssessmentResponse getById(String id) {
        String resourceId =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{resourceId}/providers/Microsoft.Security/assessments/{assessmentName}", "resourceId");
        if (resourceId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'resourceId'.", id)));
        }
        String assessmentName =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{resourceId}/providers/Microsoft.Security/assessments/{assessmentName}", "assessmentName");
        if (assessmentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assessments'.", id)));
        }
        ExpandEnum localExpand = null;
        return this.getWithResponse(resourceId, assessmentName, localExpand, Context.NONE).getValue();
    }

    public Response<SecurityAssessmentResponse> getByIdWithResponse(String id, ExpandEnum expand, Context context) {
        String resourceId =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{resourceId}/providers/Microsoft.Security/assessments/{assessmentName}", "resourceId");
        if (resourceId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'resourceId'.", id)));
        }
        String assessmentName =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{resourceId}/providers/Microsoft.Security/assessments/{assessmentName}", "assessmentName");
        if (assessmentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assessments'.", id)));
        }
        return this.getWithResponse(resourceId, assessmentName, expand, context);
    }

    public void deleteById(String id) {
        String resourceId =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{resourceId}/providers/Microsoft.Security/assessments/{assessmentName}", "resourceId");
        if (resourceId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'resourceId'.", id)));
        }
        String assessmentName =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{resourceId}/providers/Microsoft.Security/assessments/{assessmentName}", "assessmentName");
        if (assessmentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assessments'.", id)));
        }
        this.deleteWithResponse(resourceId, assessmentName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceId =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{resourceId}/providers/Microsoft.Security/assessments/{assessmentName}", "resourceId");
        if (resourceId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'resourceId'.", id)));
        }
        String assessmentName =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{resourceId}/providers/Microsoft.Security/assessments/{assessmentName}", "assessmentName");
        if (assessmentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assessments'.", id)));
        }
        return this.deleteWithResponse(resourceId, assessmentName, context);
    }

    private AssessmentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    public SecurityAssessmentResponseImpl define(String name) {
        return new SecurityAssessmentResponseImpl(name, this.manager());
    }
}
