/* tslint:disable */
/* eslint-disable */
/**
 * Tramways Roadmaps API
 * Tramways Roadmaps API
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import { Property } from './property';

/**
 * 
 * @export
 * @interface Configurable
 */
export interface Configurable {
    /**
     * 
     * @type {string}
     * @memberof Configurable
     */
    id?: string;
    /**
     * 
     * @type {string}
     * @memberof Configurable
     */
    category?: string;
    /**
     * 
     * @type {string}
     * @memberof Configurable
     */
    configurableType?: string;
    /**
     * 
     * @type {Array<Property>}
     * @memberof Configurable
     */
    props?: Array<Property>;
}


