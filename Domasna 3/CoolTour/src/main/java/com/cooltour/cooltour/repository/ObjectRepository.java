package com.cooltour.cooltour.repository;

import com.cooltour.cooltour.model.Object;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ObjectRepository extends JpaRepository<Object, Long> {
    List<Object> findObjectByName(String name);
    List<Object> findObjectByNameContaining(String name);
    List<Object> findObjectByType(String type);
    List<Object> findObjectByTypeOrName(String type, String name);
}
