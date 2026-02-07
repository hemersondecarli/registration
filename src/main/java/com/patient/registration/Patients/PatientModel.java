package com.patient.registration.Patients;

import com.patient.registration.Disease.DiseaseModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name =  "tb_registration")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private int age;

    @ManyToMany
    //Foreign Key
    @JoinColumn(name = "disease_id")
    private DiseaseModel disease;

}
