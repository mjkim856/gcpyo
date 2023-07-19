package com.example.test1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    EventService service;

    @GetMapping("/event")
    public String event() {
        return "eventjsp";
    }

    @PostMapping("/event")
    public ModelAndView event(EventDto dto) {
        ModelAndView mv = new ModelAndView();
        service.insertEvent(dto);
        mv.addObject("dto", dto);
        mv.setViewName("completejsp");
        return mv;
    }

    @PostMapping("/check")
    public ModelAndView check(String telCheck) {
        ModelAndView mv = new ModelAndView();
        EventDto dto = service.getEvent(telCheck);
        mv.addObject("dto", dto);
        mv.setViewName("insdeljsp");
        return mv;
    }

    @PostMapping("/update")
    public ModelAndView update(EventDto edto) {
        ModelAndView mv = new ModelAndView();
        service.updateEvent(edto);
        EventDto dto = service.getEvent(edto.getTel());
        mv.addObject("dto", dto);
        mv.setViewName("completejsp");
        return mv;
    }

    @GetMapping("/index")
    public String index() {
        return "indexjsp";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value="seq", required=true) int seq) {
        service.deleteEvent(seq);
        return "eventjsp";
    }

    @GetMapping ("/complete")
    public String complete() {
        return "completejsp";
    }





//    @PostMapping("/event")
//    public ModelAndView event(@RequestParam("name") String name,
//                              @RequestParam("gender") String gender,
//                              @RequestParam("age") String age,
//                              @RequestParam("tel") String tel) {
//        ModelAndView mv = new ModelAndView();
//        service.insertEvent(dto);
//        mv.setViewName("completejsp");
//        return mv;
//    }



//    @PostMapping("/event")
//    public ModelAndView event(EventDto dto) {
//        ModelAndView mv = new ModelAndView();
//        service.insertEvent(dto);
//        mv.setViewName("complete");
//        return mv;
//    }

//    @PostMapping("/event")
//    public EventDto event(@RequestBody EventDto dto) {
//        ModelAndView mv = new ModelAndView();
//        service.insertEvent(dto);
//        mv.setViewName("complete");
//        return dto;
//    }

//    @GetMapping ("/complete")
////    public String complete(@RequestParam("name") String name, @RequestParam("gender") int gender,  @RequestParam("age") int age,  @RequestParam("tel") int tel) {
//    public String complete() {
////        service.getEvent();
//        return "completejsp";
//    }


}
