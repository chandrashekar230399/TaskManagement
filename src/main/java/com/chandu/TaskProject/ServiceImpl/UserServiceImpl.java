package com.chandu.TaskProject.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandu.TaskProject.Entity.Users;
import com.chandu.TaskProject.Payload.UserDto;
import com.chandu.TaskProject.Repository.UserRepository;
import com.chandu.TaskProject.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDto createUser(UserDto userdto) {
		Users user = userDtoToEntity(userdto);//converted userDto to Users.class
		Users savedUser =userRepo.save(user);
		return entityToUserDto(savedUser);
	}
	private Users userDtoToEntity(UserDto userdto) {
		Users users = new Users();
		users.setName(userdto.getName());
		users.setEmail(userdto.getEmail());
		users.setPassword(userdto.getPassword());
		return users;
	}
	
	private UserDto entityToUserDto(Users savedUser) {
		UserDto userdto = new UserDto();
		userdto.setId(savedUser.getId());
		userdto.setName(savedUser.getName());
		userdto.setEmail(savedUser.getEmail());
		userdto.setPassword(savedUser.getPassword());
		return userdto;
		
	}

}
