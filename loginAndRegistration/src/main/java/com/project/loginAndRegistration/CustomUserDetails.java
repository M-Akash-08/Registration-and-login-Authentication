package com.project.loginAndRegistration;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@SuppressWarnings("serial")
public class CustomUserDetails implements UserDetails{
	private String username;
	private String password;
	private Collection<? extends GrantedAuthority> authorites;
	private String fullName;
	
	public CustomUserDetails(String username,String password,Collection<? extends GrantedAuthority> authorites,String fullName) {
		this.username = username;
		this.password = password;
		this.authorites = authorites;
		this.fullName = fullName;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities(){
		return authorites;
	}
	
	 @Override
	 public String getPassword() {
	  return password;
	 }

	 @Override
	 public String getUsername() {
	  return username;
	 }

	 @Override
	 public boolean isAccountNonExpired() {
	  return true;
	 }

	 @Override
	 public boolean isAccountNonLocked() {
	  return true;
	 }

	 @Override
	 public boolean isCredentialsNonExpired() {
	  return true;
	 }

	 @Override
	 public boolean isEnabled() {
	  return true;
	 }
	
	
}
