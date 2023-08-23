package com.coderCampus.AssignmentSubmissionApp.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.coderCampus.AssignmentSubmissionApp.domain.User;

@Service
public class USerDetailServiceImpl implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = new User();
		user.setUsername(username);
		user.setPassword("asdfasdf");
		user.setId(1L);
		return new User();

	}

}
