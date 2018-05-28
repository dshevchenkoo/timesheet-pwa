package com.dshevchenkoo.timesheet;

import com.dshevchenkoo.timesheet.domain.Group;
import com.dshevchenkoo.timesheet.repos.GroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {
    @Autowired
    private GroupRepo groupRepo;

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name, Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(Map<String, Object> model){
        Iterable<Group> groups = groupRepo.findAll();
        model.put("groups", groups);
        return "main";
    }

    @PostMapping
    public String add(@RequestParam String number, Map<String, Object> model){
        Group group = new Group(number);
        groupRepo.save(group);
        Iterable<Group> groups = groupRepo.findAll();
        model.put("groups", groups);
        return "main";
    }
}
