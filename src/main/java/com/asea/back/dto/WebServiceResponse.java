/*
 * Copyright (c) 2019 Outreach Solutions as a Service LLC - All Rights Reserved.
 * Unauthorized copying of this file via any medium is strictly prohibited without written permission.
 */

package com.asea.back.dto;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Default response object for web service requests.
 */
public class WebServiceResponse {
    //	@ApiResponse(notes = "Indicates whether the request was processed successfully or not.", required = true)
    private boolean success;

    //	@Schema(notes = "Contains an optional message from the executed service.", required = false)
    private String message;

    //	@Schema(notes = "Contains the data that will be returned to the client.")
    private Object data;

    private String token;


    /**
     * Private constructor, enforce data initialization
     */
    private WebServiceResponse() {
    }


    /**
     * Build a response object from the provided map of objects.
     *
     * @param success Request success flag.
     * @param message Operation message.
     * @param list    Content to be returned to the client.
     */
    public WebServiceResponse(boolean success, String message, List<?> list) {
        this.success = success;
        this.message = message;
        this.data = list;
    }
/////////////////////

    /**
     * Build a response object from the provided map of objects.
     *
     * @param success Request success flag.
     * @param message Operation message.
     * @param list    Content to be returned to the client.
     */
    public WebServiceResponse(boolean success, String message, List<?> list, String token) {
        this.success = success;
        this.message = message;
        this.data = list;
        this.token = token;

    }


/////////////

    /**
     * Build a response object from the provided map of objects.
     *
     * @param success Request success flag.
     * @param message Operation message.
     * @param data    Content to be returned to the client.
     */
    public WebServiceResponse(boolean success, String message, Map<String, Object> data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }


    /**
     * Build a response object from the provided object.
     *
     * @param success Request success flag.
     * @param message Operation message.
     * @param data    Content to be returned to the client.
     */
    public WebServiceResponse(boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }


    /**
     * Build a response object with no return data.
     *
     * @param success Request success flag.
     * @param message Operation message.
     */
    public WebServiceResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }


    /**
     * Builds a response object with no return data and the default operation message.
     *
     * @param success Request success flag.
     */
    public WebServiceResponse(boolean success) {
        this.success = success;
        this.message = success ? "OK" : "Error";
    }


    /**
     * Builds a response object with only one key-value pair response.
     *
     * @param success Request success flag.
     * @param message Operation message.
     * @param key     Key that will contain the response value to be returned.
     * @param value   Value to be assigned to the key.
     */
    public WebServiceResponse(boolean success, String message, String key, Object value) {
        this.success = success;
        this.message = message;
        this.data = Collections.singletonMap(key, value);
    }


    /**
     * Builds a success response object with content on the response.
     *
     * @param data Content to be returned to the client.
     */
    public WebServiceResponse(Object data) {
        this.success = true;
        this.message = "OK";
        this.data = data;
    }


    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        if (data == null) data = new HashMap<>();
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


}
