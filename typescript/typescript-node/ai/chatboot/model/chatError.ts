/**
 * ChatBootAI
 * This is ChatBootAI specification described as OpenAPI 3.0.  ChatBoot AI allows you to interact with several user interface and back-ends following the same OpenAPI contract.
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';

/**
* Error sent by ChatBoot.
*/
export class ChatError {
    'statusCode'?: number;
    'code'?: string;
    'error'?: string;
    'message'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "statusCode",
            "baseName": "statusCode",
            "type": "number"
        },
        {
            "name": "code",
            "baseName": "code",
            "type": "string"
        },
        {
            "name": "error",
            "baseName": "error",
            "type": "string"
        },
        {
            "name": "message",
            "baseName": "message",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ChatError.attributeTypeMap;
    }
}
