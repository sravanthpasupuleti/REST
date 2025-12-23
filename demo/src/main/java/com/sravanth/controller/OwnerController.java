package com.sravanth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sravanth.services.OwnerService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class OwnerController {

    private final OwnerService ownerService;

    @ResponseBody
    @RequestMapping(value = "/owners" , method = RequestMethod.POST)
    public String save(){
        try {
            return ownerService.saveOwner();
        } catch (Exception e) {
           return e.getMessage();
        }
    }

    @ResponseBody
    @RequestMapping(value = "/owners" , method = RequestMethod.GET)
    public String findOwner(){
        try {
            return ownerService.findOwner();
        } catch (Exception e) {
           return e.getMessage();
        }
    }

    @ResponseBody
    @RequestMapping(value = "/owners" , method = RequestMethod.PUT)
    public String updateOwner(){
        try {
            return ownerService.updateOwner();
        } catch (Exception e) {
           return e.getMessage();
        }
    }

    @ResponseBody
    @RequestMapping(value = "/owners" , method = RequestMethod.PATCH)
    public String updatePetDetails(){
        try {
            return ownerService.updatePetDetails();
        } catch (Exception e) {
           return e.getMessage();
        }
    }

    @ResponseBody
    @RequestMapping(value = "/owners" , method = RequestMethod.DELETE)
    public String deleteOwner(){
        try {
            return ownerService.deleteOwner();
        } catch (Exception e) {
           return e.getMessage();
        }
    }

    public String findAllOwners(){
        try {
            return ownerService.findAllOwners();
        } catch (Exception e) {
           return e.getMessage();
        }
    }
}
