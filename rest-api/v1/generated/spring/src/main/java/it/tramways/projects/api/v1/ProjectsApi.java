/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package it.tramways.projects.api.v1;

import it.tramways.projects.api.v1.model.CreateMapRequest;
import it.tramways.projects.api.v1.model.CreateProjectRequest;
import it.tramways.projects.api.v1.model.Project;
import it.tramways.projects.api.v1.model.ProjectDescription;
import it.tramways.projects.api.v1.model.RoadMap;
import it.tramways.projects.api.v1.model.UpdateMapRequest;
import it.tramways.projects.api.v1.model.UpdateProjectRequest;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-14T00:55:55.334+01:00[Europe/Berlin]")
@Validated
@Api(value = "projects", description = "the projects API")
public interface ProjectsApi {

    /**
     * POST /projects/{projectId}/maps : Creates a map
     *
     * @param projectId  (required)
     * @param createMapRequest  (optional)
     * @return Ok (status code 200)
     */
    @ApiOperation(value = "Creates a map", nickname = "createMap", notes = "", response = RoadMap.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "projects", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = RoadMap.class) })
    @PostMapping(
        value = "/projects/{projectId}/maps",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<RoadMap> createMap(@ApiParam(value = "",required=true) @PathVariable("projectId") String projectId,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) CreateMapRequest createMapRequest);


    /**
     * POST /projects : Creates a new project
     *
     * @param createProjectRequest  (optional)
     * @return Ok (status code 200)
     */
    @ApiOperation(value = "Creates a new project", nickname = "createProject", notes = "", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "projects", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok") })
    @PostMapping(
        value = "/projects",
        consumes = { "application/json" }
    )
    ResponseEntity<Void> createProject(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) CreateProjectRequest createProjectRequest);


    /**
     * DELETE /projects/{projectId}/maps/{mapId} : Deletes a map
     *
     * @param projectId  (required)
     * @param mapId  (required)
     * @return Ok (status code 200)
     */
    @ApiOperation(value = "Deletes a map", nickname = "deleteMap", notes = "", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "projects", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok") })
    @DeleteMapping(
        value = "/projects/{projectId}/maps/{mapId}"
    )
    ResponseEntity<Void> deleteMap(@ApiParam(value = "",required=true) @PathVariable("projectId") String projectId,@ApiParam(value = "",required=true) @PathVariable("mapId") String mapId);


    /**
     * DELETE /projects/{id} : Deletes a project
     *
     * @param id  (required)
     * @return Ok (status code 200)
     */
    @ApiOperation(value = "Deletes a project", nickname = "deleteProject", notes = "", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "projects", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok") })
    @DeleteMapping(
        value = "/projects/{id}"
    )
    ResponseEntity<Void> deleteProject(@ApiParam(value = "",required=true) @PathVariable("id") String id);


    /**
     * GET /projects/{projectId}/maps/{mapId} : Gets a map
     *
     * @param projectId  (required)
     * @param mapId  (required)
     * @return Ok (status code 200)
     */
    @ApiOperation(value = "Gets a map", nickname = "getMap", notes = "", response = RoadMap.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "projects", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = RoadMap.class) })
    @GetMapping(
        value = "/projects/{projectId}/maps/{mapId}",
        produces = { "application/json" }
    )
    ResponseEntity<RoadMap> getMap(@ApiParam(value = "",required=true) @PathVariable("projectId") String projectId,@ApiParam(value = "",required=true) @PathVariable("mapId") String mapId);


    /**
     * GET /projects/{id} : Gets project
     *
     * @param id  (required)
     * @return Ok (status code 200)
     */
    @ApiOperation(value = "Gets project", nickname = "getProject", notes = "", response = Project.class, authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "projects", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Project.class) })
    @GetMapping(
        value = "/projects/{id}",
        produces = { "application/json" }
    )
    ResponseEntity<Project> getProject(@ApiParam(value = "",required=true) @PathVariable("id") String id);


    /**
     * GET /projects : Gets user projects
     *
     * @return Ok (status code 200)
     */
    @ApiOperation(value = "Gets user projects", nickname = "getProjects", notes = "", response = ProjectDescription.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "projects", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ProjectDescription.class, responseContainer = "List") })
    @GetMapping(
        value = "/projects",
        produces = { "application/json" }
    )
    ResponseEntity<List<ProjectDescription>> getProjects();


    /**
     * PUT /projects/{projectId}/maps/{mapId} : Updates a map
     *
     * @param projectId  (required)
     * @param mapId  (required)
     * @param updateMapRequest  (optional)
     * @return Ok (status code 200)
     */
    @ApiOperation(value = "Updates a map", nickname = "updateMap", notes = "", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "projects", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok") })
    @PutMapping(
        value = "/projects/{projectId}/maps/{mapId}",
        consumes = { "application/json" }
    )
    ResponseEntity<Void> updateMap(@ApiParam(value = "",required=true) @PathVariable("projectId") String projectId,@ApiParam(value = "",required=true) @PathVariable("mapId") String mapId,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) UpdateMapRequest updateMapRequest);


    /**
     * PUT /projects/{id} : Updates a project
     *
     * @param id  (required)
     * @param updateProjectRequest  (optional)
     * @return Ok (status code 200)
     */
    @ApiOperation(value = "Updates a project", nickname = "updateProject", notes = "", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "projects", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok") })
    @PutMapping(
        value = "/projects/{id}",
        consumes = { "application/json" }
    )
    ResponseEntity<Void> updateProject(@ApiParam(value = "",required=true) @PathVariable("id") String id,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) UpdateProjectRequest updateProjectRequest);

}
