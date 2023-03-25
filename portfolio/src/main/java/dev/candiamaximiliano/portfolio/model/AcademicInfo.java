package dev.candiamaximiliano.portfolio.model;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "academics")
public class AcademicInfo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "institution_name")
    private String institutionName;

    @Column(name = "degree_name")
    private String degreeName;

    @Column(name = "completion_date")
    private LocalDate completionDate;

    // otros atributos de información académica

    public AcademicInfo() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public LocalDate getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }

    // setters/getters para los otros atributos

    @Override
    public String toString() {
        return "AcademicInfo{" + "id=" + id + ", institutionName=" + institutionName + ", degreeName=" 
                + degreeName + ", completionDate=" + completionDate + '}';
    }
}
