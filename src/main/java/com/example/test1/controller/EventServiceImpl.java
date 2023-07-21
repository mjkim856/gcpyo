package com.example.test1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("eventService")
public class EventServiceImpl implements EventService {

    @Autowired
    EventDao dao;

    @Override
    public void insertEvent(EventDto dto) {
        dao.insertEvent(dto);
    }

    @Override
    public void updateEvent(EventDto dto) {
        dao.updateEvent(dto);
    }

    @Override
    public EventDto getEvent(String tel) {
        return dao.getEvent(tel);
    }

    @Override
    public void deleteEvent(int seq) {
        dao.deleteEvent(seq);
    }

    @Override
    public List<EventDto> getAllEvent() {
        return dao.getAllEvent();
    }

}
