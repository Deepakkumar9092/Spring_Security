package com.sellopy.configration;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import com.sellopy.model.UserDtls;

public class MyUserDetails implements UserDetails{
	
	@Autowired
	private UserDtls userDtls;

	

	public MyUserDetails() {
		super();
	}

	public UserDtls getUserDtls() {
		return userDtls;
	}

	public void setUserDtls(UserDtls userDtls) {
		this.userDtls = userDtls;
	}

	public MyUserDetails(UserDtls userDtls) {
		super();
		this.userDtls = userDtls;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	SimpleGrantedAuthority authority = new SimpleGrantedAuthority("USER");
		return Arrays.asList(authority);
	}

	@Override
	public String getPassword() {
	
		return userDtls.getPassword();
	}

	@Override
	public String getUsername() {
		
		return userDtls.getUsername();
	}

}
