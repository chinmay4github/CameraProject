package com.tega.cameraproject.model.bus.model;

import com.tega.cameraproject.model.bus.EventModel;
import com.tega.cameraproject.model.entity.Data;

public class EventUpdateLocation implements EventModel {

    private Data data;

    public EventUpdateLocation(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

}
