package com.dshevchenkoo.timesheet.controller;

import com.dshevchenkoo.timesheet.domain.TeachingGroup;
import com.dshevchenkoo.timesheet.repos.TeachingGroupRepo;
import com.sun.xml.internal.messaging.saaj.util.TeeInputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private TeachingGroupRepo teachingGroupRepo;

    @GetMapping("/")
    public String greeting(Map<String, Object> model){
        return "greeting";
    }

    @GetMapping("/main")
    public String main(Map<String, Object> model){
        Iterable<TeachingGroup> groups = teachingGroupRepo.findAll();
        model.put("groups", groups);
        return "main";
    }

    @PostMapping("/main")
    public String add(@RequestParam String number, Map<String, Object> model){
        TeachingGroup teachingGroup = new TeachingGroup(number);
        teachingGroupRepo.save(teachingGroup);
        Iterable<TeachingGroup> groups = teachingGroupRepo.findAll();
        model.put("groups", groups);
        return "main";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String filter, Map<String, Object> model){
        Iterable<TeachingGroup> groups;
        if (filter != null && !filter.isEmpty()){
            groups = teachingGroupRepo.findByNumber(filter);
        } else {
            groups = teachingGroupRepo.findAll();
        }
        model.put("groups", groups);
        return "main";
    }

}
