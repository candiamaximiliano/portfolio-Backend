package dev.candiamaximiliano.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dev.candiamaximiliano.portfolio.model.AcademicInfo;
import dev.candiamaximiliano.portfolio.model.PersonalInfo;
import dev.candiamaximiliano.portfolio.model.Skill;
import dev.candiamaximiliano.portfolio.model.WorkExperience;
import dev.candiamaximiliano.portfolio.service.PortfolioService;

@Controller
@RequestMapping("/personal-info")
public class PortfolioController {
    
    private final PortfolioService portfolioService;

    @Autowired
    public PortfolioController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    // Personal Info

    @GetMapping
    public String showPersonalInfo(Model model) {
        PersonalInfo personalInfo = portfolioService.getPersonalInfo();
        model.addAttribute("personalInfo", personalInfo);
        return "personal-info-page";
        }

    // Create
    @PostMapping("/personal-info")
    public String addPersonalInfo(PersonalInfo personalInfo) {
        portfolioService.savePersonalInfo(personalInfo);
        return "redirect:/personal-info";
    }

    // Read
    @GetMapping("/personal-info/{id}")
    public String getPersonalInfo(@PathVariable Long id, Model model) {
        PersonalInfo personalInfo = portfolioService.getPersonalInfo(id);
        model.addAttribute("personalInfo", personalInfo);
        return "personal-info-page";
    }

    // Update
    @PostMapping("/personal-info/{id}")
    public String updatePersonalInfo(@PathVariable Long id, PersonalInfo personalInfo) {
        portfolioService.savePersonalInfo(personalInfo);
        return "redirect:/personal-info";
    }

    // Delete
    @PostMapping("/personal-info/{id}/delete")
    public String deletePersonalInfo(@PathVariable Long id) {
        portfolioService.deletePersonalInfo(id);
        return "redirect:/personal-info";
    }

    //Academic Info

    @GetMapping("/academic-info")
    public String showAcademicInfo(Model model) {
        List<AcademicInfo> academicInfoList = portfolioService.getAcademicInfoList();
        model.addAttribute("academicInfoList", academicInfoList);
        return "academic-info-page";
    }

    // Create
    @PostMapping("/academic-info")
    public String addAcademicInfo(AcademicInfo academicInfo) {
        portfolioService.saveAcademicInfo(academicInfo);
        return "redirect:/academic-info";
    }

    // Read
    @GetMapping("/academic-info/{id}")
    public String getAcademicInfo(@PathVariable Long id, Model model) {
        AcademicInfo academicInfo = portfolioService.getAcademicInfo(id);
        model.addAttribute("academicInfo", academicInfo);
        return "academic-info-page";
    }

    // Update
    @PostMapping("/academic-info/{id}")
    public String updateAcademicInfo(@PathVariable Long id, AcademicInfo academicInfo) {
        portfolioService.saveAcademicInfo(academicInfo);
        return "redirect:/academic-info";
    }

    // Delete
    @PostMapping("/academic-info/{id}/delete")
    public String deleteAcademicInfo(@PathVariable Long id) {
        portfolioService.deleteAcademicInfo(id);
        return "redirect:/academic-info";
    }

    // Work Experience

    @GetMapping("/work-experience")
    public String showWorkExperience(Model model) {
        List<WorkExperience> workExperienceList = portfolioService.getWorkExperienceList();
        model.addAttribute("workExperienceList", workExperienceList);
        return "work-experience-page";
    }

    // Create
    @PostMapping("/work-experience")
    public String addWorkExperience(WorkExperience workExperience) {
        portfolioService.saveWorkExperience(workExperience);
        return "redirect:/work-experience";
    }

    // Read
    @GetMapping("/work-experience/{id}")
    public String getWorkExperience(@PathVariable Long id, Model model) {
        WorkExperience workExperience = portfolioService.getWorkExperience(id);
        model.addAttribute("workExperience", workExperience);
        return "work-experience-page";
    }

    // Update
    @PostMapping("/work-experience/{id}")
    public String updateWorkExperience(@PathVariable Long id, WorkExperience workExperience) {
        portfolioService.saveWorkExperience(workExperience);
        return "redirect:/work-experience";
    }

    // Delete
    @PostMapping("/work-experience/{id}/delete")
    public String deleteWorkExperience(@PathVariable Long id) {
        portfolioService.deleteWorkExperience(id);
        return "redirect:/work-experience";
    }

    // Skills

    @GetMapping("/skills")
    public String showSkills(Model model) {
    List<Skill> skillList = portfolioService.getSkillList();
    model.addAttribute("skillList", skillList);
    return "skill-page";
    }

    // Create
    @PostMapping("/skills")
    public String addSkill(Skill skill) {
        portfolioService.saveSkill(skill);
        return "redirect:/skills";
    }

    // Read
    @GetMapping("/skills/{id}")
    public String getSkill(@PathVariable Long id, Model model) {
        Skill skill = portfolioService.getSkill(id);
        model.addAttribute("skill", skill);
        return "skill-page";
    }

    // Update
    @PostMapping("/skills/{id}")
    public String updateSkill(@PathVariable Long id, Skill skill) {
        portfolioService.saveSkill(skill);
        return "redirect:/skills";
    }

    // Delete
    @PostMapping("/skills/{id}/delete")
    public String deleteSkill(@PathVariable Long id) {
        portfolioService.deleteSkill(id);
        return "redirect:/skills";
    }
}
