package com.patient.registration.Disease;

import com.patient.registration.Patients.PatientModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_disease")
//Getters Setters
@Data
//Constructor no arguments
@NoArgsConstructor
//Constructor all arguments
@AllArgsConstructor
public class DiseaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String severity;
    private String treatment;

    @OneToMany(mappedBy = "disease")
    private List<PatientModel> patient;

}
