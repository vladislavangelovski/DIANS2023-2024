package com.cooltour.cooltour.repository;

import com.cooltour.cooltour.model.Object;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectRepository extends JpaRepository<Object, Long> {
    Object findObjectByName(String name);
}
