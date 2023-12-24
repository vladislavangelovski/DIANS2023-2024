package com.cooltour.cooltour.service;

import com.cooltour.cooltour.model.Object;

import java.util.List;

public interface ObjectService {
    List<Object> findAll();
    List<Object> findObjectByName(String name);
    List<Object> findObjectByTypeOrName(String category, String name);

    List<Object> filterByCategoryAndQuery(String category, String query);
}
