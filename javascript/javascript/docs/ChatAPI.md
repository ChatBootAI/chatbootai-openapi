# ChatBootAi.ChatAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chat**](ChatAPI.md#chat) | **POST** /chat | Engage a conversation with ChatBootAI



## chat

> ChatResponse chat(opts)

Engage a conversation with ChatBootAI

Post a prompt to ChatBootAI and receive a response

### Example

```javascript
import ChatBootAi from 'chat_boot_ai';

let apiInstance = new ChatBootAi.ChatAPI();
let opts = {
  'chatRequest': new ChatBootAi.ChatRequest() // ChatRequest | 
};
apiInstance.chat(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatRequest** | [**ChatRequest**](ChatRequest.md)|  | [optional] 

### Return type

[**ChatResponse**](ChatResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

