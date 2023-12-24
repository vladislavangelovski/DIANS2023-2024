package com.cooltour.cooltour.service.impl;

import com.cooltour.cooltour.model.Object;
import com.cooltour.cooltour.repository.ObjectRepository;
import com.cooltour.cooltour.service.ObjectService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ObjectServiceImpl implements ObjectService {
    private final ObjectRepository objectRepository;

    public ObjectServiceImpl(ObjectRepository objectRepository) {
        this.objectRepository = objectRepository;
    }

    @Override
    public List<Object> findObjectByName(String name) {
        return objectRepository.findObjectByName(name);
    }

    @Override
    public List<Object> findObjectByTypeOrName(String type, String name) {
        return this.objectRepository.findObjectByTypeOrName(type, name);
    }

    @Override
    public List<Object> filterByCategoryAndQuery(String category, String query) {
        List<Object> cat =  this.objectRepository.findObjectByType(category);
        List<Object> name =  this.objectRepository.findObjectByNameContaining(query);

        if(query.equals(null) || query.equals("") || query.equals("Search for something..")){
            if(category.equals("site")){
                return objectRepository.findAll();
            }
            else{
                return cat;
            }
        }
        else{
            if(category.equals("site")){
                return name;
            }
            else{
                return name.stream().map(o -> {
                    Object match = cat.stream().filter(i->i.getId().equals(o.getId())).findFirst().orElse(null);
                    if(match!=null){
                        return o;
                    }
                    else return null;
                }).filter(Objects::nonNull).collect(Collectors.toList());
            }

        }

    }

    @Override
    public List<Object> findAll() {
        return objectRepository.findAll();
    }
}
