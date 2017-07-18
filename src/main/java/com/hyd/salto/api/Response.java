package com.hyd.salto.api;

import java.util.HashMap;
import java.util.Map;

/**
 * (description)
 * created at 2017/7/18
 *
 * @author yidin
 */
public class Response {

    public static Response success() {
        return new Response();
    }

    //////////////////////////////////////////////////////////////

    private boolean success = true;

    private Map<String, Object> attributes = new HashMap<>();

    public Response() {
    }

    public Response(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public Response setAttribute(String attributeName, Object attributeValue) {
        this.attributes.put(attributeName, attributeValue);
        return this;
    }
}
