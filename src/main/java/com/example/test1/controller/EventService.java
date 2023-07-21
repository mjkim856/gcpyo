package com.example.test1.controller;

import java.util.List;

public interface EventService {
    void insertEvent(EventDto dto);
    void updateEvent(EventDto dto);
    EventDto getEvent(String tel);
    void deleteEvent(int seq);
    List<EventDto> getAllEvent();
}
