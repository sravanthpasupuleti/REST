package com.sravanth.repository;

public interface OwnerRepository {
    String save();

	String find();

	String updateOwner();
	
	String updatePetDetails();

	String delete();

	String findAll();
}
