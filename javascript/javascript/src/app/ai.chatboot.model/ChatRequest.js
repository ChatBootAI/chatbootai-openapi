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
import ChatRequestMessage from './ChatRequestMessage';

/**
 * The ChatRequest model module.
 * @module ai.chatboot.model/ChatRequest
 * @version 0.0.1
 */
class ChatRequest {
    /**
     * Constructs a new <code>ChatRequest</code>.
     * Represents the chat request sent to the model.
     * @alias module:ai.chatboot.model/ChatRequest
     * @param messages {Array.<module:ai.chatboot.model/ChatRequestMessage>} A list of messages comprising the conversation so far.
     */
    constructor(messages) { 
        
        ChatRequest.initialize(this, messages);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, messages) { 
        obj['messages'] = messages;
    }

    /**
     * Constructs a <code>ChatRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:ai.chatboot.model/ChatRequest} obj Optional instance to populate.
     * @return {module:ai.chatboot.model/ChatRequest} The populated <code>ChatRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ChatRequest();

            if (data.hasOwnProperty('messages')) {
                obj['messages'] = ApiClient.convertToType(data['messages'], [ChatRequestMessage]);
            }
            if (data.hasOwnProperty('model')) {
                obj['model'] = ApiClient.convertToType(data['model'], 'String');
            }
            if (data.hasOwnProperty('stream')) {
                obj['stream'] = ApiClient.convertToType(data['stream'], 'Boolean');
            }
            if (data.hasOwnProperty('temperature')) {
                obj['temperature'] = ApiClient.convertToType(data['temperature'], 'Number');
            }
            if (data.hasOwnProperty('top_p')) {
                obj['top_p'] = ApiClient.convertToType(data['top_p'], 'Number');
            }
            if (data.hasOwnProperty('user')) {
                obj['user'] = ApiClient.convertToType(data['user'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ChatRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ChatRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ChatRequest.RequiredProperties) {
            if (!data[property]) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['messages']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['messages'])) {
                throw new Error("Expected the field `messages` to be an array in the JSON data but got " + data['messages']);
            }
            // validate the optional field `messages` (array)
            for (const item of data['messages']) {
                ChatRequestMessage.validateJSON(item);
            };
        }
        // ensure the json data is a string
        if (data['model'] && !(typeof data['model'] === 'string' || data['model'] instanceof String)) {
            throw new Error("Expected the field `model` to be a primitive type in the JSON string but got " + data['model']);
        }
        // ensure the json data is a string
        if (data['user'] && !(typeof data['user'] === 'string' || data['user'] instanceof String)) {
            throw new Error("Expected the field `user` to be a primitive type in the JSON string but got " + data['user']);
        }

        return true;
    }


}

ChatRequest.RequiredProperties = ["messages"];

/**
 * A list of messages comprising the conversation so far.
 * @member {Array.<module:ai.chatboot.model/ChatRequestMessage>} messages
 */
ChatRequest.prototype['messages'] = undefined;

/**
 * ID of the model to use.
 * @member {String} model
 */
ChatRequest.prototype['model'] = undefined;

/**
 * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only server-sent events as they become available, with the stream terminated by a data DONE
 * @member {Boolean} stream
 */
ChatRequest.prototype['stream'] = undefined;

/**
 * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or top_p but not both.
 * @member {Number} temperature
 * @default 1
 */
ChatRequest.prototype['temperature'] = 1;

/**
 * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.
 * @member {Number} top_p
 * @default 1
 */
ChatRequest.prototype['top_p'] = 1;

/**
 * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse.
 * @member {String} user
 */
ChatRequest.prototype['user'] = undefined;






export default ChatRequest;

