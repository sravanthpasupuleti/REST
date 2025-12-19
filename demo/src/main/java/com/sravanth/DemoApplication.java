package com.sravanth;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import com.sravanth.service.OwnerService;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@PropertySource("messages.properties")
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner{

	private final OwnerService ownerService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(save());
		System.out.println(findOwner());
		System.out.println(updateOwner());
		System.out.println(updatePetDetails());
		System.out.println(deleteOwner());
		System.out.println(findAllOwners());
	}

	public String save(){
		return ownerService.saveOwner();
	}

	public String findOwner(){
		return ownerService.findOwner();
	}

	public String updateOwner(){
		return ownerService.updateOwner();
	}

	public String updatePetDetails(){
		return ownerService.updatePetDetails();
	}

	public String deleteOwner(){
		return ownerService.deleteOwner();
	}

	public String findAllOwners(){
		return ownerService.findAllOwners();
	}
}
