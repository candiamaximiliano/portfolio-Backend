package dev.candiamaximiliano.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.candiamaximiliano.portfolio.model.AcademicInfo;

@Repository
public interface AcademicInfoRepository extends JpaRepository<AcademicInfo, Long> {

}

