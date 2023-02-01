package com.devsuperior.movieflix.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.movieflix.DTO.UserDTO;
import com.devsuperior.movieflix.services.UserService;



@RestController
@RequestMapping(value = "/users/profile")
public class UserResource {

	@Autowired
	private UserService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDTO> getProfile(@PathVariable Long id){
		UserDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
}
