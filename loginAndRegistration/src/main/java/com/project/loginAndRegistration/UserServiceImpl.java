package com.project.loginAndRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service // Marks this class as a Spring service component
public class UserServiceImpl implements UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepositary userRepository; // Add @Autowired to inject the repository

    // Constructor can be @Autowired (optional)
    @Autowired
    public UserServiceImpl(UserRepositary userRepository) {
        this.userRepository = userRepository;
    }

	public User findByUsername(String username) {
		return userRepository.findByUsername(username);

	}

//	@Override
	public User save(UserDto userDto) {
		User user = new User(userDto.getUsername(),passwordEncoder.encode(userDto.getPassword()),userDto.getFullName());
		return userRepository.save(user);
	}
    
    
}
