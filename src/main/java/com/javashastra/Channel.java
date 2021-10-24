package com.javashastra;

import com.fasterxml.jackson.annotation.*;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({"channel-name", "channel-category"})
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Channel {

    @JsonProperty("channel-name")
    private String name;

    @JsonProperty("channel-category")
    private String category;


    private int subscribers;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone = "Asia/Kolkata")
    Date dateCreated;

    public Channel(String name, String category, int subscribers, Date dateCreated) {
        this.name = name;
        this.category = category;
        this.subscribers = subscribers;
        this.dateCreated = dateCreated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Channel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public int getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(int subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", subscribers=" + subscribers +
                '}';
    }
}
