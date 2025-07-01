package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Project;
import com.example.demo.service.ClientService;
import com.example.demo.service.ProjectService;

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private ClientService clientService;

    @GetMapping("/")
    public String showLandingPage(Model model) {
        model.addAttribute("projects", projectService.getAllProjects());
        model.addAttribute("clients", clientService.getAllClients());
        return "index";
    }

      @GetMapping("/admin")
    public String showAdmin(Model model) {
        // model.addAttribute("projects", projectService.getAllProjects());
        return "admin/dashboard";
    }

    @GetMapping("/admin/projects")
    public String showAdminProjects(Model model) {
        model.addAttribute("projects", projectService.getAllProjects());
        model.addAttribute("project", new Project());
        return "admin/projects";
    }

    @PostMapping("/admin/projects")
    public String saveProject(@ModelAttribute("project") Project project) {
        projectService.saveProject(project);
        return "redirect:/admin/projects";
    }
}
