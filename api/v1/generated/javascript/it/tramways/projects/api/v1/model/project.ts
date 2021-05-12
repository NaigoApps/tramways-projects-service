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


import { RoadMapDescription } from './road-map-description';

/**
 * 
 * @export
 * @interface Project
 */
export interface Project {
    /**
     * 
     * @type {string}
     * @memberof Project
     */
    uuid?: string;
    /**
     * 
     * @type {string}
     * @memberof Project
     */
    name?: string;
    /**
     * 
     * @type {string}
     * @memberof Project
     */
    owner?: string;
    /**
     * 
     * @type {Array<RoadMapDescription>}
     * @memberof Project
     */
    roadMaps?: Array<RoadMapDescription>;
}

