package com.sravanth.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import com.sravanth.exception.OwnerNotFoundException;
import com.sravanth.service.OwnerService;
import com.sravanth.repository.OwnerRepository;

@Service
@RequiredArgsConstructor
public class OwnerServiceimpl implements OwnerService{

    private final OwnerRepository ownerRepository;

    @Value("${owner.found.exception}")
    private String ownerNotFound;

    boolean toggle = true;

    public String saveOwner(){
        return ownerRepository.save();
    }

	public String findOwner() throws OwnerNotFoundException{
        if(toggle){
            toggle = !toggle;
            return ownerRepository.find();
        }else{
            toggle = !toggle;
            throw new OwnerNotFoundException(ownerNotFound);
        }
        
    }
	
	public String updateOwner() throws OwnerNotFoundException{
         if(toggle){
            toggle = !toggle;
            return ownerRepository.updateOwner();
        }else{
            toggle = !toggle;
            throw new OwnerNotFoundException(ownerNotFound);
        }
    }

	public String updatePetDetails() throws OwnerNotFoundException{
        if(toggle){
            toggle = !toggle;
            return ownerRepository.updatePetDetails();
        }else{
            toggle = !toggle;
            throw new OwnerNotFoundException(ownerNotFound);
        }
    }

	public String deleteOwner() throws OwnerNotFoundException{
        if(toggle){
            toggle = !toggle;
            return ownerRepository.delete();
        }else{
            toggle = !toggle;
            throw new OwnerNotFoundException(ownerNotFound);
        }
    }

	public String findAllOwners(){
        return ownerRepository.findAll();
    }
}
