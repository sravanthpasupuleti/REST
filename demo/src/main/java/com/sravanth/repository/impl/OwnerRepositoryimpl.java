package com.sravanth.repository.impl;

import org.springframework.stereotype.Repository;

import com.sravanth.repository.OwnerRepository;

@Repository
public class OwnerRepositoryimpl implements OwnerRepository{

    @Override
    public String save() {
        return "Owner is saved";
    }

    @Override
    public String find() {
        return "Owner is found";
    }

    @Override
    public String updateOwner() {
       return "Owner is successfully updated";
    }

    @Override
    public String updatePetDetails() {
        return "Pet details is successfully updated";
    }

    @Override
    public String delete() {
        return "Owner is deleted";
    }

    @Override
    public String findAll() {
        return "Found All Owners";
    }
    
}
