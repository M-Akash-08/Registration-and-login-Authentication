package com.project.loginAndRegistration;

public interface UserService {
	 User findByUsername(String username);

	 User save(UserDto userDto);
}
