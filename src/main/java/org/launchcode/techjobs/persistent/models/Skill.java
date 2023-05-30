package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;
@Entity
public class Skill extends AbstractEntity {
    @Size(max = 500, message = "Description is too long! Max is 500 characters.")
    public String description;

    public Skill(String description){
        this.description = description;
    }
    public Skill(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}