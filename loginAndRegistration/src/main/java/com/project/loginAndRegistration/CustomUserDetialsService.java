package com.project.loginAndRegistration;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetialsService implements UserDetailsService {

    @Autowired // Added Autowired
    private UserRepositary userRepositary;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepositary.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Username or Password not found");
        }
        return new CustomUserDetails(user.getUsername(), user.getPassword(), authorities(), user.getFullName());
    }

    public Collection<? extends GrantedAuthority> authorities() {
        return Arrays.asList(new SimpleGrantedAuthority("USER"));
    }
}
