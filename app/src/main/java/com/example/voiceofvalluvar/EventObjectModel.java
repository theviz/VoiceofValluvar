package com.example.voiceofvalluvar;

import android.media.metrics.Event;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EventObjectModel {
    private String eventName;
    private String venueName;
    private Date startTime;
    private Date endTime;

    public EventObjectModel(String eventName, String venueName, Date startTime, Date endTime) {
        this.eventName = eventName;
        this.venueName = venueName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getEventName() {
        return eventName;
    }

    public Date getEndTime() {
        return endTime;
    }

    public String getVenueName() {
        return venueName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getEventDateString() {
        return new SimpleDateFormat("E, dd MMM yyyy").format(this.startTime);
    }

    public String getEventTimeFormat() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        return dateFormat.format(this.startTime) + "-" + dateFormat.format(this.endTime);
    }
}
