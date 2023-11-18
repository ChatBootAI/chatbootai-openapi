# ChatBootAI - OpenAPI

This repository contains the ChatBootAI OpenAPI Contract as well as many generated languages stubs and models.
The directory structure is as follows:

```
.
├── LICENSE
├── README.md
├── java                     # The generated Java SDK
│   ├── java-api             # The Java REST API
│   └── java-model           # The Java APIs
├── javascript
│   ├── javascript-api
│   └── javascript-model
├── jaxrs-spec
│   ├── jaxrs-spec-api
│   └── jaxrs-spec-model
├── python
│   ├── python-api
│   └── python-model
└── openapi.yml              # The ChatBootAI OpenAPI Contract
```

# The ChatBootAI OpenAPI Contract

The ChatBootAI OpenAPI Contract in located under the `openapi.yml` file.

You can also visualize the OpenAPI Contract using the [OpenAPI online editor](https://editor.swagger.io)

# Manually Generating the model and APIs from the ChatBootAI OpenAPI Contract

[OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator) allows generation of API client libraries (SDK generation), server stubs, and documentation automatically given an OpenAPI Spec.
Swagger CodeGen supports several programming languages.
Execute the following command to see the list of supported languages and framworks:

```bash
openapi-generator list
```

You will something like this:

```bash
CLIENT generators:
    - ada
    - android
    - apex
    - bash
    - c
    - clojure
    - cpp-qt-client
    - cpp-restsdk
    - cpp-tiny (beta)
    - cpp-tizen
    - cpp-ue4 (beta)
    ...
```

For example, to generate a Java client library from the ChatBootAI OpenAPI Contract, run the following command:

```bash
openapi-generator generate -i openapi.yml -g jaxrs-spec -o ./java/java-api --api-package ai.chatboot.api --model-package ai.chatboot.model
```

# References

* [OpenAPI Initiative](https://www.openapis.org/) and the [OpenAPI Specification](https://spec.openapis.org/oas/latest.html)
* [The OpenAPI API Reference for the Chat endpoint](https://platform.openai.com/docs/api-reference/chat)
* [Chat Backend Protocol](https://github.com/Azure/azureml_run_specification/blob/chat-protocol/specs/chat-protocol/chat-app-protocol.md)
* [OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator)
* [OpenAPI online editor](https://editor.swagger.io)
