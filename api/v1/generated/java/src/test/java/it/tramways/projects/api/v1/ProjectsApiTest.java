/*
 * Tramways Roadmaps API
 * Tramways Roadmaps API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.tramways.projects.api.v1;

import it.tramways.projects.api.ApiException;
import it.tramways.projects.api.v1.model.CreateMapRequest;
import it.tramways.projects.api.v1.model.CreateProjectRequest;
import it.tramways.projects.api.v1.model.Project;
import it.tramways.projects.api.v1.model.ProjectDescription;
import it.tramways.projects.api.v1.model.RoadMap;
import it.tramways.projects.api.v1.model.UpdateMapRequest;
import it.tramways.projects.api.v1.model.UpdateProjectRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectsApi
 */
@Ignore
public class ProjectsApiTest {

    private final ProjectsApi api = new ProjectsApi();

    
    /**
     * Creates a map
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMapTest() throws ApiException {
        String projectId = null;
        CreateMapRequest createMapRequest = null;
        RoadMap response = api.createMap(projectId, createMapRequest);

        // TODO: test validations
    }
    
    /**
     * Creates a new project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProjectTest() throws ApiException {
        CreateProjectRequest createProjectRequest = null;
        api.createProject(createProjectRequest);

        // TODO: test validations
    }
    
    /**
     * Deletes a map
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMapTest() throws ApiException {
        String projectId = null;
        String mapId = null;
        api.deleteMap(projectId, mapId);

        // TODO: test validations
    }
    
    /**
     * Deletes a project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProjectTest() throws ApiException {
        String id = null;
        api.deleteProject(id);

        // TODO: test validations
    }
    
    /**
     * Gets a map
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMapTest() throws ApiException {
        String projectId = null;
        String mapId = null;
        RoadMap response = api.getMap(projectId, mapId);

        // TODO: test validations
    }
    
    /**
     * Gets project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectTest() throws ApiException {
        String id = null;
        Project response = api.getProject(id);

        // TODO: test validations
    }
    
    /**
     * Gets user projects
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectsTest() throws ApiException {
        List<ProjectDescription> response = api.getProjects();

        // TODO: test validations
    }
    
    /**
     * Updates a map
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMapTest() throws ApiException {
        String projectId = null;
        String mapId = null;
        UpdateMapRequest updateMapRequest = null;
        api.updateMap(projectId, mapId, updateMapRequest);

        // TODO: test validations
    }
    
    /**
     * Updates a project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProjectTest() throws ApiException {
        String id = null;
        UpdateProjectRequest updateProjectRequest = null;
        api.updateProject(id, updateProjectRequest);

        // TODO: test validations
    }
    
}
