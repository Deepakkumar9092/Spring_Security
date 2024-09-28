package com.sellopy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sellopy.configration.MyUserDetails;
import com.sellopy.model.UserDtls;
import com.sellopy.repository.UserRepository;
@Service
public class MyUserDetailsService implements UserDetailsService{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserDtls user = userRepository.findByUsername(username);
		
		
		if(user == null) {
			throw new UsernameNotFoundException("user not found");
		}
		
		return new MyUserDetails(user);
	}

}
