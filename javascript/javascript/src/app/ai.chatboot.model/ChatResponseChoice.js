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
 *
 */

import ApiClient from '../ApiClient';
import ChatResponseMessage from './ChatResponseMessage';

/**
 * The ChatResponseChoice model module.
 * @module ai.chatboot.model/ChatResponseChoice
 * @version 0.0.1
 */
class ChatResponseChoice {
    /**
     * Constructs a new <code>ChatResponseChoice</code>.
     * @alias module:ai.chatboot.model/ChatResponseChoice
     * @param index {Number} The index of the choice in the list of choices.
     * @param message {module:ai.chatboot.model/ChatResponseMessage} 
     */
    constructor(index, message) { 
        
        ChatResponseChoice.initialize(this, index, message);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, index, message) { 
        obj['index'] = index;
        obj['message'] = message;
    }

    /**
     * Constructs a <code>ChatResponseChoice</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:ai.chatboot.model/ChatResponseChoice} obj Optional instance to populate.
     * @return {module:ai.chatboot.model/ChatResponseChoice} The populated <code>ChatResponseChoice</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ChatResponseChoice();

            if (data.hasOwnProperty('index')) {
                obj['index'] = ApiClient.convertToType(data['index'], 'Number');
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ChatResponseMessage.constructFromObject(data['message']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ChatResponseChoice</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ChatResponseChoice</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ChatResponseChoice.RequiredProperties) {
            if (!data[property]) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // validate the optional field `message`
        if (data['message']) { // data not null
          ChatResponseMessage.validateJSON(data['message']);
        }

        return true;
    }


}

ChatResponseChoice.RequiredProperties = ["index", "message"];

/**
 * The index of the choice in the list of choices.
 * @member {Number} index
 */
ChatResponseChoice.prototype['index'] = undefined;

/**
 * @member {module:ai.chatboot.model/ChatResponseMessage} message
 */
ChatResponseChoice.prototype['message'] = undefined;






export default ChatResponseChoice;
