package dev.candiamaximiliano.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.candiamaximiliano.portfolio.model.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {

}

