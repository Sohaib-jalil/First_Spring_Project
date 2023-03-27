package com.example.first_spring_project.repositories;

import com.example.first_spring_project.entities.Patient;
import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    public List<Patient> findByMalade(boolean m);
    public Page<Patient> findByMalade(boolean m, Pageable pageable);
    public List<Patient> findByMaladeAndScoreLessThan(boolean m, int score);
    public List<Patient> findByDateNaissanecBetweenAndMaladeIsTrueOrNomLike(Date d1, Date d2, String mc);

    @Query("select p from Patient p where p.nom like :x and p.score < :y")
    public List<Patient> chercherPatients(@Param("x") String mc,@Param("y") int scoreMin);

}
