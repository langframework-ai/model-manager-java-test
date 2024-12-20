# DefaultApi

All URIs are relative to *https://vy5wlaao1l.execute-api.us-east-1.amazonaws.com/default*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createModel**](DefaultApi.md#createModel) | **POST** /api/v1/models/{caller_id} |  |
| [**createModelVersion**](DefaultApi.md#createModelVersion) | **POST** /api/v1/model/{model_id}/version/{caller_id} |  |
| [**deleteModel**](DefaultApi.md#deleteModel) | **DELETE** /api/v1/model/{model_id}/{caller_id} |  |
| [**deleteModelVersion**](DefaultApi.md#deleteModelVersion) | **DELETE** /api/v1/model/{model_id}/versions/{version_id}/{caller_id} |  |
| [**getModelDetails**](DefaultApi.md#getModelDetails) | **GET** /api/v1/model/{model_id}/{caller_id} |  |
| [**getModels**](DefaultApi.md#getModels) | **GET** /api/v1/models/{caller_id} |  |
| [**updateModel**](DefaultApi.md#updateModel) | **PUT** /api/v1/model/{model_id}/{caller_id} |  |
| [**updateModelVersion**](DefaultApi.md#updateModelVersion) | **PUT** /api/v1/model/{model_id}/versions/{version_id}/{caller_id} |  |


<a id="createModel"></a>
# **createModel**
> Object createModel(callerId, model)



### Example
```java
// Import classes:
import ai.langframework.modelmanager.client.ApiClient;
import ai.langframework.modelmanager.client.ApiException;
import ai.langframework.modelmanager.client.Configuration;
import ai.langframework.modelmanager.client.models.*;
import ai.langframework.modelmanager.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vy5wlaao1l.execute-api.us-east-1.amazonaws.com/default");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String callerId = "callerId_example"; // String | 
    Model model = new Model(); // Model | 
    try {
      Object result = apiInstance.createModel(callerId, model);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **callerId** | **String**|  | |
| **model** | [**Model**](Model.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |

<a id="createModelVersion"></a>
# **createModelVersion**
> Object createModelVersion(modelId, callerId, modelVersion)



### Example
```java
// Import classes:
import ai.langframework.modelmanager.client.ApiClient;
import ai.langframework.modelmanager.client.ApiException;
import ai.langframework.modelmanager.client.Configuration;
import ai.langframework.modelmanager.client.models.*;
import ai.langframework.modelmanager.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vy5wlaao1l.execute-api.us-east-1.amazonaws.com/default");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    String callerId = "callerId_example"; // String | 
    ModelVersion modelVersion = new ModelVersion(); // ModelVersion | 
    try {
      Object result = apiInstance.createModelVersion(modelId, callerId, modelVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createModelVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |
| **callerId** | **String**|  | |
| **modelVersion** | [**ModelVersion**](ModelVersion.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |

<a id="deleteModel"></a>
# **deleteModel**
> Object deleteModel(modelId, callerId)



### Example
```java
// Import classes:
import ai.langframework.modelmanager.client.ApiClient;
import ai.langframework.modelmanager.client.ApiException;
import ai.langframework.modelmanager.client.Configuration;
import ai.langframework.modelmanager.client.models.*;
import ai.langframework.modelmanager.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vy5wlaao1l.execute-api.us-east-1.amazonaws.com/default");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    String callerId = "callerId_example"; // String | 
    try {
      Object result = apiInstance.deleteModel(modelId, callerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |
| **callerId** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |

<a id="deleteModelVersion"></a>
# **deleteModelVersion**
> Object deleteModelVersion(modelId, callerId, versionId)



### Example
```java
// Import classes:
import ai.langframework.modelmanager.client.ApiClient;
import ai.langframework.modelmanager.client.ApiException;
import ai.langframework.modelmanager.client.Configuration;
import ai.langframework.modelmanager.client.models.*;
import ai.langframework.modelmanager.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vy5wlaao1l.execute-api.us-east-1.amazonaws.com/default");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    String callerId = "callerId_example"; // String | 
    String versionId = "versionId_example"; // String | 
    try {
      Object result = apiInstance.deleteModelVersion(modelId, callerId, versionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteModelVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |
| **callerId** | **String**|  | |
| **versionId** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |

<a id="getModelDetails"></a>
# **getModelDetails**
> Object getModelDetails(modelId, callerId)



### Example
```java
// Import classes:
import ai.langframework.modelmanager.client.ApiClient;
import ai.langframework.modelmanager.client.ApiException;
import ai.langframework.modelmanager.client.Configuration;
import ai.langframework.modelmanager.client.models.*;
import ai.langframework.modelmanager.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vy5wlaao1l.execute-api.us-east-1.amazonaws.com/default");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    String callerId = "callerId_example"; // String | 
    try {
      Object result = apiInstance.getModelDetails(modelId, callerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getModelDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |
| **callerId** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |

<a id="getModels"></a>
# **getModels**
> Object getModels(callerId)



### Example
```java
// Import classes:
import ai.langframework.modelmanager.client.ApiClient;
import ai.langframework.modelmanager.client.ApiException;
import ai.langframework.modelmanager.client.Configuration;
import ai.langframework.modelmanager.client.models.*;
import ai.langframework.modelmanager.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vy5wlaao1l.execute-api.us-east-1.amazonaws.com/default");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String callerId = "callerId_example"; // String | 
    try {
      Object result = apiInstance.getModels(callerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getModels");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **callerId** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |

<a id="updateModel"></a>
# **updateModel**
> Object updateModel(modelId, callerId, model)



### Example
```java
// Import classes:
import ai.langframework.modelmanager.client.ApiClient;
import ai.langframework.modelmanager.client.ApiException;
import ai.langframework.modelmanager.client.Configuration;
import ai.langframework.modelmanager.client.models.*;
import ai.langframework.modelmanager.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vy5wlaao1l.execute-api.us-east-1.amazonaws.com/default");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    String callerId = "callerId_example"; // String | 
    Model model = new Model(); // Model | 
    try {
      Object result = apiInstance.updateModel(modelId, callerId, model);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |
| **callerId** | **String**|  | |
| **model** | [**Model**](Model.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |

<a id="updateModelVersion"></a>
# **updateModelVersion**
> Object updateModelVersion(modelId, callerId, versionId, modelVersion)



### Example
```java
// Import classes:
import ai.langframework.modelmanager.client.ApiClient;
import ai.langframework.modelmanager.client.ApiException;
import ai.langframework.modelmanager.client.Configuration;
import ai.langframework.modelmanager.client.models.*;
import ai.langframework.modelmanager.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vy5wlaao1l.execute-api.us-east-1.amazonaws.com/default");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    String callerId = "callerId_example"; // String | 
    String versionId = "versionId_example"; // String | 
    ModelVersion modelVersion = new ModelVersion(); // ModelVersion | 
    try {
      Object result = apiInstance.updateModelVersion(modelId, callerId, versionId, modelVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateModelVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |
| **callerId** | **String**|  | |
| **versionId** | **String**|  | |
| **modelVersion** | [**ModelVersion**](ModelVersion.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |

