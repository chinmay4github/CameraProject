package com.tega.cameraproject.model.bus.model;

import com.tega.cameraproject.model.bus.EventModel;
import com.tega.cameraproject.model.entity.GpsStatusEntity;

public class EventUpdateStatus implements EventModel {

    private GpsStatusEntity status;

    public EventUpdateStatus(GpsStatusEntity status) {
        this.status = status;
    }

    public GpsStatusEntity getStatus() {
        return status;
    }

}

