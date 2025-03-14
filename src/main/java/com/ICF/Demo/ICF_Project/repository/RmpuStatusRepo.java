package com.ICF.Demo.ICF_Project.repository;

import com.ICF.Demo.ICF_Project.model.RmpuStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RmpuStatusRepo extends JpaRepository<RmpuStatus, Long> {

}
