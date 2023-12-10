package com.cooltour.cooltour.service.impl;

import com.cooltour.cooltour.model.Object;
import com.cooltour.cooltour.repository.ObjectRepository;
import com.cooltour.cooltour.service.ObjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjectServiceImpl implements ObjectService {
    private final ObjectRepository objectRepository;

    public ObjectServiceImpl(ObjectRepository objectRepository) {
        this.objectRepository = objectRepository;
    }

    @Override
    public Object findObjectByName(String name) {
        return objectRepository.findObjectByName(name);
    }

    @Override
    public List<Object> findAll() {
        return objectRepository.findAll();
    }
}
