# ProjectsApi

All URIs are relative to *http://localhost:8762/tramways/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMap**](ProjectsApi.md#createMap) | **POST** /projects/{projectId}/maps | Creates a map
[**createProject**](ProjectsApi.md#createProject) | **POST** /projects | Creates a new project
[**deleteMap**](ProjectsApi.md#deleteMap) | **DELETE** /projects/{projectId}/maps/{mapId} | Deletes a map
[**deleteProject**](ProjectsApi.md#deleteProject) | **DELETE** /projects/{id} | Deletes a project
[**getMap**](ProjectsApi.md#getMap) | **GET** /projects/{projectId}/maps/{mapId} | Gets a map
[**getProject**](ProjectsApi.md#getProject) | **GET** /projects/{id} | Gets project
[**getProjects**](ProjectsApi.md#getProjects) | **GET** /projects | Gets user projects
[**updateMap**](ProjectsApi.md#updateMap) | **PUT** /projects/{projectId}/maps/{mapId} | Updates a map
[**updateProject**](ProjectsApi.md#updateProject) | **PUT** /projects/{id} | Updates a project


<a name="createMap"></a>
# **createMap**
> RoadMap createMap(projectId, createMapRequest)

Creates a map

### Example
```java
// Import classes:
import it.tramways.projects.api.ApiClient;
import it.tramways.projects.api.ApiException;
import it.tramways.projects.api.Configuration;
import it.tramways.projects.api.auth.*;
import it.tramways.projects.api.models.*;
import it.tramways.projects.api.v1.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8762/tramways/rest");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | 
    CreateMapRequest createMapRequest = new CreateMapRequest(); // CreateMapRequest | 
    try {
      RoadMap result = apiInstance.createMap(projectId, createMapRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createMap");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **createMapRequest** | [**CreateMapRequest**](CreateMapRequest.md)|  | [optional]

### Return type

[**RoadMap**](RoadMap.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |

<a name="createProject"></a>
# **createProject**
> createProject(createProjectRequest)

Creates a new project

### Example
```java
// Import classes:
import it.tramways.projects.api.ApiClient;
import it.tramways.projects.api.ApiException;
import it.tramways.projects.api.Configuration;
import it.tramways.projects.api.auth.*;
import it.tramways.projects.api.models.*;
import it.tramways.projects.api.v1.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8762/tramways/rest");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    CreateProjectRequest createProjectRequest = new CreateProjectRequest(); // CreateProjectRequest | 
    try {
      apiInstance.createProject(createProjectRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createProject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createProjectRequest** | [**CreateProjectRequest**](CreateProjectRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |

<a name="deleteMap"></a>
# **deleteMap**
> deleteMap(projectId, mapId)

Deletes a map

### Example
```java
// Import classes:
import it.tramways.projects.api.ApiClient;
import it.tramways.projects.api.ApiException;
import it.tramways.projects.api.Configuration;
import it.tramways.projects.api.auth.*;
import it.tramways.projects.api.models.*;
import it.tramways.projects.api.v1.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8762/tramways/rest");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | 
    String mapId = "mapId_example"; // String | 
    try {
      apiInstance.deleteMap(projectId, mapId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteMap");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **mapId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |

<a name="deleteProject"></a>
# **deleteProject**
> deleteProject(id)

Deletes a project

### Example
```java
// Import classes:
import it.tramways.projects.api.ApiClient;
import it.tramways.projects.api.ApiException;
import it.tramways.projects.api.Configuration;
import it.tramways.projects.api.auth.*;
import it.tramways.projects.api.models.*;
import it.tramways.projects.api.v1.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8762/tramways/rest");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteProject(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteProject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |

<a name="getMap"></a>
# **getMap**
> RoadMap getMap(projectId, mapId)

Gets a map

### Example
```java
// Import classes:
import it.tramways.projects.api.ApiClient;
import it.tramways.projects.api.ApiException;
import it.tramways.projects.api.Configuration;
import it.tramways.projects.api.auth.*;
import it.tramways.projects.api.models.*;
import it.tramways.projects.api.v1.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8762/tramways/rest");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | 
    String mapId = "mapId_example"; // String | 
    try {
      RoadMap result = apiInstance.getMap(projectId, mapId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getMap");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **mapId** | **String**|  |

### Return type

[**RoadMap**](RoadMap.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |

<a name="getProject"></a>
# **getProject**
> Project getProject(id)

Gets project

### Example
```java
// Import classes:
import it.tramways.projects.api.ApiClient;
import it.tramways.projects.api.ApiException;
import it.tramways.projects.api.Configuration;
import it.tramways.projects.api.auth.*;
import it.tramways.projects.api.models.*;
import it.tramways.projects.api.v1.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8762/tramways/rest");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      Project result = apiInstance.getProject(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Project**](Project.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |

<a name="getProjects"></a>
# **getProjects**
> List&lt;ProjectDescription&gt; getProjects()

Gets user projects

### Example
```java
// Import classes:
import it.tramways.projects.api.ApiClient;
import it.tramways.projects.api.ApiException;
import it.tramways.projects.api.Configuration;
import it.tramways.projects.api.auth.*;
import it.tramways.projects.api.models.*;
import it.tramways.projects.api.v1.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8762/tramways/rest");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    try {
      List<ProjectDescription> result = apiInstance.getProjects();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjects");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ProjectDescription&gt;**](ProjectDescription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |

<a name="updateMap"></a>
# **updateMap**
> updateMap(projectId, mapId, updateMapRequest)

Updates a map

### Example
```java
// Import classes:
import it.tramways.projects.api.ApiClient;
import it.tramways.projects.api.ApiException;
import it.tramways.projects.api.Configuration;
import it.tramways.projects.api.auth.*;
import it.tramways.projects.api.models.*;
import it.tramways.projects.api.v1.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8762/tramways/rest");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | 
    String mapId = "mapId_example"; // String | 
    UpdateMapRequest updateMapRequest = new UpdateMapRequest(); // UpdateMapRequest | 
    try {
      apiInstance.updateMap(projectId, mapId, updateMapRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updateMap");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **mapId** | **String**|  |
 **updateMapRequest** | [**UpdateMapRequest**](UpdateMapRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |

<a name="updateProject"></a>
# **updateProject**
> updateProject(id, updateProjectRequest)

Updates a project

### Example
```java
// Import classes:
import it.tramways.projects.api.ApiClient;
import it.tramways.projects.api.ApiException;
import it.tramways.projects.api.Configuration;
import it.tramways.projects.api.auth.*;
import it.tramways.projects.api.models.*;
import it.tramways.projects.api.v1.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8762/tramways/rest");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | 
    UpdateProjectRequest updateProjectRequest = new UpdateProjectRequest(); // UpdateProjectRequest | 
    try {
      apiInstance.updateProject(id, updateProjectRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updateProject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **updateProjectRequest** | [**UpdateProjectRequest**](UpdateProjectRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |

