# ChatBootAi.ChatRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**[ChatRequestMessage]**](ChatRequestMessage.md) | A list of messages comprising the conversation so far. | 
**model** | **String** | ID of the model to use. | [optional] 
**stream** | **Boolean** | If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only server-sent events as they become available, with the stream terminated by a data DONE | [optional] 
**temperature** | **Number** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or top_p but not both. | [optional] [default to 1]
**topP** | **Number** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. | [optional] [default to 1]
**user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. | [optional] 


