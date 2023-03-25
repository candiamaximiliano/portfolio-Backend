package dev.candiamaximiliano.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.candiamaximiliano.portfolio.model.PersonalInfo;

@Repository
public interface PersonalInfoRepository extends JpaRepository<PersonalInfo, Long>{
    PersonalInfo findFirstByOrderByIdDesc();
}
