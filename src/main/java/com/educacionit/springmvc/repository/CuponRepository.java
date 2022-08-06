package com.educacionit.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educacionit.springmvc.domain.Cupones;

@Repository
public interface CuponRepository extends JpaRepository<Cupones, Long>{

}
