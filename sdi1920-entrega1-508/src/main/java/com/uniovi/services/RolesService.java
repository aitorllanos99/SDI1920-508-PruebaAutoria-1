package com.uniovi.services;

import org.springframework.stereotype.Service;

@Service
public class RolesService {
	String[] roles = { "ROLE_STANDART", "ROLE_ADMIN" };

	public String[] getRoles() {
		return roles;
	}
}
