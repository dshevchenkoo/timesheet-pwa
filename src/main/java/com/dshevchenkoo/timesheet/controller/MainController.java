package com.dshevchenkoo.timesheet.controller;

import com.dshevchenkoo.timesheet.domain.TeachingGroup;
import com.dshevchenkoo.timesheet.domain.User;
import com.dshevchenkoo.timesheet.repos.TeachingGroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@Controller
public class MainController {
    @Autowired
    private TeachingGroupRepo teachingGroupRepo;

    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping("/")
    public String greeting(Map<String, Object> model){
        return "greeting";
    }

    @GetMapping("/main")
    public String main(@RequestParam(required = false, defaultValue = "") String filter, Model model){
        Iterable<TeachingGroup> groups = teachingGroupRepo.findAll();


        if (filter != null && !filter.isEmpty()){
            groups = teachingGroupRepo.findByNumber(filter);
        } else {
            groups = teachingGroupRepo.findAll();
        }

        model.addAttribute("groups", groups);
        model.addAttribute("filter", filter);

        return "main";
    }

    @PostMapping("/main")
    public String add(
            @AuthenticationPrincipal User user,
            @RequestParam String number,
            Map<String, Object> model,
            @RequestParam("file") MultipartFile file
    ) throws IOException {
        TeachingGroup teachingGroup = new TeachingGroup(number, user);

        if (file != null && !file.getOriginalFilename().isEmpty()) {
            File uploadDir = new File(uploadPath);

            if (!uploadDir.exists()) {
                uploadDir.mkdir();
            }

            String uuidFile = UUID.randomUUID().toString();
            String resultFileame = uuidFile + "." + file.getOriginalFilename();

            file.transferTo(new File(uploadPath + "/" + resultFileame));

            teachingGroup.setFilename(resultFileame);
        }

        teachingGroupRepo.save(teachingGroup);

        Iterable<TeachingGroup> groups = teachingGroupRepo.findAll();

        model.put("groups", groups);

        return "main";
    }
}
