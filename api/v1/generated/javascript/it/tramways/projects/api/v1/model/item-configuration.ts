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


import { Property } from './property';

/**
 * 
 * @export
 * @interface ItemConfiguration
 */
export interface ItemConfiguration {
    /**
     * 
     * @type {string}
     * @memberof ItemConfiguration
     */
    uuid?: string;
    /**
     * 
     * @type {string}
     * @memberof ItemConfiguration
     */
    category?: string;
    /**
     * 
     * @type {string}
     * @memberof ItemConfiguration
     */
    name?: string;
    /**
     * 
     * @type {Array<Property>}
     * @memberof ItemConfiguration
     */
    props?: Array<Property>;
}


