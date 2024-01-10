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
import { ChatResponseMessage } from './chatResponseMessage';

export class ChatResponseChoice {
    /**
    * The index of the choice in the list of choices.
    */
    'index': number;
    'message': ChatResponseMessage;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "index",
            "baseName": "index",
            "type": "number"
        },
        {
            "name": "message",
            "baseName": "message",
            "type": "ChatResponseMessage"
        }    ];

    static getAttributeTypeMap() {
        return ChatResponseChoice.attributeTypeMap;
    }
}

