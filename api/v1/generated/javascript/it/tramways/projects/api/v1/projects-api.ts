/* tslint:disable */
/* eslint-disable */
/**
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


import globalAxios, { AxiosPromise, AxiosInstance } from 'axios';
import { Configuration } from '../../../../../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from '../../../../../common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../../../../../base';
// @ts-ignore
import { CreateMapRequest } from '../../../../../it/tramways/projects/api/v1/model';
// @ts-ignore
import { CreateProjectRequest } from '../../../../../it/tramways/projects/api/v1/model';
// @ts-ignore
import { Project } from '../../../../../it/tramways/projects/api/v1/model';
// @ts-ignore
import { ProjectDescription } from '../../../../../it/tramways/projects/api/v1/model';
// @ts-ignore
import { RoadMap } from '../../../../../it/tramways/projects/api/v1/model';
// @ts-ignore
import { UpdateMapRequest } from '../../../../../it/tramways/projects/api/v1/model';
// @ts-ignore
import { UpdateProjectRequest } from '../../../../../it/tramways/projects/api/v1/model';
/**
 * ProjectsApi - axios parameter creator
 * @export
 */
export const ProjectsApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Creates a map
         * @param {string} projectId 
         * @param {CreateMapRequest} [createMapRequest] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createMap: async (projectId: string, createMapRequest?: CreateMapRequest, options: any = {}): Promise<RequestArgs> => {
            // verify required parameter 'projectId' is not null or undefined
            assertParamExists('createMap', 'projectId', projectId)
            const localVarPath = `/projects/{projectId}/maps`
                .replace(`{${"projectId"}}`, encodeURIComponent(String(projectId)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter, options.query);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(createMapRequest, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Creates a new project
         * @param {CreateProjectRequest} [createProjectRequest] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createProject: async (createProjectRequest?: CreateProjectRequest, options: any = {}): Promise<RequestArgs> => {
            const localVarPath = `/projects`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter, options.query);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(createProjectRequest, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Deletes a map
         * @param {string} projectId 
         * @param {string} mapId 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteMap: async (projectId: string, mapId: string, options: any = {}): Promise<RequestArgs> => {
            // verify required parameter 'projectId' is not null or undefined
            assertParamExists('deleteMap', 'projectId', projectId)
            // verify required parameter 'mapId' is not null or undefined
            assertParamExists('deleteMap', 'mapId', mapId)
            const localVarPath = `/projects/{projectId}/maps/{mapId}`
                .replace(`{${"projectId"}}`, encodeURIComponent(String(projectId)))
                .replace(`{${"mapId"}}`, encodeURIComponent(String(mapId)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'DELETE', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter, options.query);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Deletes a project
         * @param {string} id 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteProject: async (id: string, options: any = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('deleteProject', 'id', id)
            const localVarPath = `/projects/{id}`
                .replace(`{${"id"}}`, encodeURIComponent(String(id)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'DELETE', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter, options.query);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Gets a map
         * @param {string} projectId 
         * @param {string} mapId 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getMap: async (projectId: string, mapId: string, options: any = {}): Promise<RequestArgs> => {
            // verify required parameter 'projectId' is not null or undefined
            assertParamExists('getMap', 'projectId', projectId)
            // verify required parameter 'mapId' is not null or undefined
            assertParamExists('getMap', 'mapId', mapId)
            const localVarPath = `/projects/{projectId}/maps/{mapId}`
                .replace(`{${"projectId"}}`, encodeURIComponent(String(projectId)))
                .replace(`{${"mapId"}}`, encodeURIComponent(String(mapId)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter, options.query);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Gets project
         * @param {string} id 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getProject: async (id: string, options: any = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('getProject', 'id', id)
            const localVarPath = `/projects/{id}`
                .replace(`{${"id"}}`, encodeURIComponent(String(id)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter, options.query);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Gets user projects
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getProjects: async (options: any = {}): Promise<RequestArgs> => {
            const localVarPath = `/projects`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter, options.query);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Updates a map
         * @param {string} projectId 
         * @param {string} mapId 
         * @param {UpdateMapRequest} [updateMapRequest] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateMap: async (projectId: string, mapId: string, updateMapRequest?: UpdateMapRequest, options: any = {}): Promise<RequestArgs> => {
            // verify required parameter 'projectId' is not null or undefined
            assertParamExists('updateMap', 'projectId', projectId)
            // verify required parameter 'mapId' is not null or undefined
            assertParamExists('updateMap', 'mapId', mapId)
            const localVarPath = `/projects/{projectId}/maps/{mapId}`
                .replace(`{${"projectId"}}`, encodeURIComponent(String(projectId)))
                .replace(`{${"mapId"}}`, encodeURIComponent(String(mapId)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'PUT', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter, options.query);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(updateMapRequest, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Updates a project
         * @param {string} id 
         * @param {UpdateProjectRequest} [updateProjectRequest] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateProject: async (id: string, updateProjectRequest?: UpdateProjectRequest, options: any = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('updateProject', 'id', id)
            const localVarPath = `/projects/{id}`
                .replace(`{${"id"}}`, encodeURIComponent(String(id)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'PUT', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter, options.query);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(updateProjectRequest, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * ProjectsApi - functional programming interface
 * @export
 */
export const ProjectsApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = ProjectsApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @summary Creates a map
         * @param {string} projectId 
         * @param {CreateMapRequest} [createMapRequest] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async createMap(projectId: string, createMapRequest?: CreateMapRequest, options?: any): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<RoadMap>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.createMap(projectId, createMapRequest, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Creates a new project
         * @param {CreateProjectRequest} [createProjectRequest] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async createProject(createProjectRequest?: CreateProjectRequest, options?: any): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<void>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.createProject(createProjectRequest, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Deletes a map
         * @param {string} projectId 
         * @param {string} mapId 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async deleteMap(projectId: string, mapId: string, options?: any): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<void>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.deleteMap(projectId, mapId, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Deletes a project
         * @param {string} id 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async deleteProject(id: string, options?: any): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<void>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.deleteProject(id, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Gets a map
         * @param {string} projectId 
         * @param {string} mapId 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getMap(projectId: string, mapId: string, options?: any): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<RoadMap>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getMap(projectId, mapId, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Gets project
         * @param {string} id 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getProject(id: string, options?: any): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Project>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getProject(id, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Gets user projects
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getProjects(options?: any): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<ProjectDescription>>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getProjects(options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Updates a map
         * @param {string} projectId 
         * @param {string} mapId 
         * @param {UpdateMapRequest} [updateMapRequest] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async updateMap(projectId: string, mapId: string, updateMapRequest?: UpdateMapRequest, options?: any): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<void>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.updateMap(projectId, mapId, updateMapRequest, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Updates a project
         * @param {string} id 
         * @param {UpdateProjectRequest} [updateProjectRequest] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async updateProject(id: string, updateProjectRequest?: UpdateProjectRequest, options?: any): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<void>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.updateProject(id, updateProjectRequest, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * ProjectsApi - factory interface
 * @export
 */
export const ProjectsApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = ProjectsApiFp(configuration)
    return {
        /**
         * 
         * @summary Creates a map
         * @param {string} projectId 
         * @param {CreateMapRequest} [createMapRequest] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createMap(projectId: string, createMapRequest?: CreateMapRequest, options?: any): AxiosPromise<RoadMap> {
            return localVarFp.createMap(projectId, createMapRequest, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Creates a new project
         * @param {CreateProjectRequest} [createProjectRequest] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createProject(createProjectRequest?: CreateProjectRequest, options?: any): AxiosPromise<void> {
            return localVarFp.createProject(createProjectRequest, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Deletes a map
         * @param {string} projectId 
         * @param {string} mapId 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteMap(projectId: string, mapId: string, options?: any): AxiosPromise<void> {
            return localVarFp.deleteMap(projectId, mapId, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Deletes a project
         * @param {string} id 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteProject(id: string, options?: any): AxiosPromise<void> {
            return localVarFp.deleteProject(id, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Gets a map
         * @param {string} projectId 
         * @param {string} mapId 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getMap(projectId: string, mapId: string, options?: any): AxiosPromise<RoadMap> {
            return localVarFp.getMap(projectId, mapId, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Gets project
         * @param {string} id 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getProject(id: string, options?: any): AxiosPromise<Project> {
            return localVarFp.getProject(id, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Gets user projects
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getProjects(options?: any): AxiosPromise<Array<ProjectDescription>> {
            return localVarFp.getProjects(options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Updates a map
         * @param {string} projectId 
         * @param {string} mapId 
         * @param {UpdateMapRequest} [updateMapRequest] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateMap(projectId: string, mapId: string, updateMapRequest?: UpdateMapRequest, options?: any): AxiosPromise<void> {
            return localVarFp.updateMap(projectId, mapId, updateMapRequest, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Updates a project
         * @param {string} id 
         * @param {UpdateProjectRequest} [updateProjectRequest] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        updateProject(id: string, updateProjectRequest?: UpdateProjectRequest, options?: any): AxiosPromise<void> {
            return localVarFp.updateProject(id, updateProjectRequest, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * ProjectsApi - object-oriented interface
 * @export
 * @class ProjectsApi
 * @extends {BaseAPI}
 */
export class ProjectsApi extends BaseAPI {
    /**
     * 
     * @summary Creates a map
     * @param {string} projectId 
     * @param {CreateMapRequest} [createMapRequest] 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ProjectsApi
     */
    public createMap(projectId: string, createMapRequest?: CreateMapRequest, options?: any) {
        return ProjectsApiFp(this.configuration).createMap(projectId, createMapRequest, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Creates a new project
     * @param {CreateProjectRequest} [createProjectRequest] 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ProjectsApi
     */
    public createProject(createProjectRequest?: CreateProjectRequest, options?: any) {
        return ProjectsApiFp(this.configuration).createProject(createProjectRequest, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Deletes a map
     * @param {string} projectId 
     * @param {string} mapId 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ProjectsApi
     */
    public deleteMap(projectId: string, mapId: string, options?: any) {
        return ProjectsApiFp(this.configuration).deleteMap(projectId, mapId, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Deletes a project
     * @param {string} id 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ProjectsApi
     */
    public deleteProject(id: string, options?: any) {
        return ProjectsApiFp(this.configuration).deleteProject(id, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Gets a map
     * @param {string} projectId 
     * @param {string} mapId 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ProjectsApi
     */
    public getMap(projectId: string, mapId: string, options?: any) {
        return ProjectsApiFp(this.configuration).getMap(projectId, mapId, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Gets project
     * @param {string} id 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ProjectsApi
     */
    public getProject(id: string, options?: any) {
        return ProjectsApiFp(this.configuration).getProject(id, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Gets user projects
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ProjectsApi
     */
    public getProjects(options?: any) {
        return ProjectsApiFp(this.configuration).getProjects(options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Updates a map
     * @param {string} projectId 
     * @param {string} mapId 
     * @param {UpdateMapRequest} [updateMapRequest] 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ProjectsApi
     */
    public updateMap(projectId: string, mapId: string, updateMapRequest?: UpdateMapRequest, options?: any) {
        return ProjectsApiFp(this.configuration).updateMap(projectId, mapId, updateMapRequest, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Updates a project
     * @param {string} id 
     * @param {UpdateProjectRequest} [updateProjectRequest] 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ProjectsApi
     */
    public updateProject(id: string, updateProjectRequest?: UpdateProjectRequest, options?: any) {
        return ProjectsApiFp(this.configuration).updateProject(id, updateProjectRequest, options).then((request) => request(this.axios, this.basePath));
    }
}
