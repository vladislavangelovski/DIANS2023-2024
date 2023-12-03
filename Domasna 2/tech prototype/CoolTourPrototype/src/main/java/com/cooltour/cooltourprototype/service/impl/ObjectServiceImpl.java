package com.cooltour.cooltourprototype.service.impl;

import com.cooltour.cooltourprototype.model.Object;
import com.cooltour.cooltourprototype.repository.ObjectRepository;
import com.cooltour.cooltourprototype.service.ObjectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
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
