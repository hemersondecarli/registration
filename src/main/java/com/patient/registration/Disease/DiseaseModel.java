package com.patient.registration.Disease;

public class DiseaseModel {

    private Long id;
    private String name;
    private String description;
    private String severity;

    public DiseaseModel(){

    }

    public DiseaseModel(Long id, String name, String description, String severity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.severity = severity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

}
