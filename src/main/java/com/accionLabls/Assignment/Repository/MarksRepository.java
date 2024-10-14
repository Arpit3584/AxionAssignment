package com.accionLabls.Assignment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accionLabls.Assignment.Entity.Marks;

public interface MarksRepository extends JpaRepository<Marks,Integer> {

}
