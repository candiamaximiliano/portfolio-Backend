package dev.candiamaximiliano.portfolio.model;

import javax.persistence.*;

@Entity
@Table(name = "skills")
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "skill_name")
    private String skillName;

    @Column(name = "description")
    private String description;

    // otros atributos para las habilidades

    public Skill() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // setters/getters para los otros atributos

    @Override
    public String toString() {
        return "Skill{" + "id=" + id + ", skillName=" + skillName + ", description=" + description + '}';
    }
}
