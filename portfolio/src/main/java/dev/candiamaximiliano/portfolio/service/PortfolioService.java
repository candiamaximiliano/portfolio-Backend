package dev.candiamaximiliano.portfolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.candiamaximiliano.portfolio.model.AcademicInfo;
import dev.candiamaximiliano.portfolio.model.PersonalInfo;
import dev.candiamaximiliano.portfolio.model.Skill;
import dev.candiamaximiliano.portfolio.model.WorkExperience;
import dev.candiamaximiliano.portfolio.repository.AcademicInfoRepository;
import dev.candiamaximiliano.portfolio.repository.PersonalInfoRepository;
import dev.candiamaximiliano.portfolio.repository.SkillRepository;
import dev.candiamaximiliano.portfolio.repository.WorkExperienceRepository;

@Service
public class PortfolioService {
    
    private final PersonalInfoRepository personalInfoRepository;
    private final AcademicInfoRepository academicInfoRepository;
    private final WorkExperienceRepository workExperienceRepository;
    private final SkillRepository skillRepository;

    @Autowired
    public PortfolioService(PersonalInfoRepository personalInfoRepository,
                            AcademicInfoRepository academicInfoRepository,
                            WorkExperienceRepository workExperienceRepository,
                            SkillRepository skillRepository) {
        this.personalInfoRepository = personalInfoRepository;
        this.academicInfoRepository = academicInfoRepository;
        this.workExperienceRepository = workExperienceRepository;
        this.skillRepository = skillRepository;
    }

    // Personal Info

    public PersonalInfo getPersonalInfo() {
        return personalInfoRepository.findFirstByOrderByIdDesc();
    }

    public PersonalInfo getPersonalInfo(Long id) {
        Optional<PersonalInfo> result = personalInfoRepository.findById(id);
        return result.orElse(null);
    }
    
    public void savePersonalInfo(PersonalInfo personalInfo) {
        personalInfoRepository.save(personalInfo);
    }
    
    public void deletePersonalInfo(Long id) {
        personalInfoRepository.deleteById(id);
    }
    
    // Academic Info

    public List<AcademicInfo> getAcademicInfoList() {
        return academicInfoRepository.findAll();
    }

    public AcademicInfo getAcademicInfo(Long id) {
        Optional<AcademicInfo> result = academicInfoRepository.findById(id);
        return result.orElse(null);
    }
    
    public void saveAcademicInfo(AcademicInfo academicInfo) {
        academicInfoRepository.save(academicInfo);
    }
    
    public void deleteAcademicInfo(Long id) {
        academicInfoRepository.deleteById(id);
    }
    
    // Work Experience

    public List<WorkExperience> getWorkExperienceList() {
        return workExperienceRepository.findAll();
    }

    public WorkExperience getWorkExperience(Long id) {
        Optional<WorkExperience> result = workExperienceRepository.findById(id);
        return result.orElse(null);
    }
    
    public void saveWorkExperience(WorkExperience workExperience) {
        workExperienceRepository.save(workExperience);
    }
    
    public void deleteWorkExperience(Long id) {
        workExperienceRepository.deleteById(id);
    }
    
    // Skill

    public List<Skill> getSkillList() {
        return skillRepository.findAll();
    }

    public Skill getSkill(Long id) {
        Optional<Skill> result = skillRepository.findById(id);
        return result.orElse(null);
    }
    
    public void saveSkill(Skill skill) {
        skillRepository.save(skill);
    }
    
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }    
}


