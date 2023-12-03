package com.cooltour.cooltourprototype.service;

import com.cooltour.cooltourprototype.model.Object;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ObjectService {
    List<Object> findAll();
    Object findObjectByName(String name);
}
