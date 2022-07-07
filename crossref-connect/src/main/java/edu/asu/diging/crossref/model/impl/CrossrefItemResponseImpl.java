package edu.asu.diging.crossref.model.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.crossref.model.Item;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossrefItemResponseImpl {

    private String status;
    @JsonProperty("message-type")
    private String messageType;
    @JsonProperty("message-version")
    private String messageVersion;
    private Item message;
    
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessageType() {
        return messageType;
    }
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
    public String getMessageVersion() {
        return messageVersion;
    }
    public void setMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
    }
    public Item getMessage() {
        return message;
    }
    public void setMessage(Item message) {
        this.message = message;
    }
}
