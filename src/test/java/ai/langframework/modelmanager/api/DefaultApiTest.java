/*
 * CORE-ModelManager-API
 * Created by AWS Lambda
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ai.langframework.modelmanager.api;

import ai.langframework.modelmanager.client.ApiException;
import ai.langframework.modelmanager.model.Model;
import ai.langframework.modelmanager.model.ModelVersion;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Disabled
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createModelTest() throws ApiException {
        String callerId = null;
        Model model = null;
        Object response = api.createModel(callerId, model);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createModelVersionTest() throws ApiException {
        String modelId = null;
        String callerId = null;
        ModelVersion modelVersion = null;
        Object response = api.createModelVersion(modelId, callerId, modelVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteModelTest() throws ApiException {
        String modelId = null;
        String callerId = null;
        Object response = api.deleteModel(modelId, callerId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteModelVersionTest() throws ApiException {
        String modelId = null;
        String callerId = null;
        String versionId = null;
        Object response = api.deleteModelVersion(modelId, callerId, versionId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getModelDetailsTest() throws ApiException {
        String modelId = null;
        String callerId = null;
        Object response = api.getModelDetails(modelId, callerId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getModelsTest() throws ApiException {
        String callerId = null;
        Object response = api.getModels(callerId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateModelTest() throws ApiException {
        String modelId = null;
        String callerId = null;
        Model model = null;
        Object response = api.updateModel(modelId, callerId, model);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateModelVersionTest() throws ApiException {
        String modelId = null;
        String callerId = null;
        String versionId = null;
        ModelVersion modelVersion = null;
        Object response = api.updateModelVersion(modelId, callerId, versionId, modelVersion);
        // TODO: test validations
    }

}
