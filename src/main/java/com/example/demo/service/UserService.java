package com.example.demo.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserRequest;
import com.example.demo.entity.User;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;


    public User create(UserRequest dto) {
        User user = new User(dto.getName(), dto.getEmail());
        return userRepository.save(user);
    }

    public User findById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (!optionalUser.isPresent()) {
            throw new ResourceNotFoundException("User not found");
        }
        return optionalUser.get();
    }

    public Page<User> findAllPaged(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return userRepository.findAll(pageable);
    }

    public User update(Long id, UserRequest dto) {
    	Optional<User> optionalUser = userRepository.findById(id);
    	
	    if (!optionalUser.isPresent()) {
	        throw new ResourceNotFoundException("User not found");
	    }
	
	    User user = optionalUser.get();
	
	    if (dto.getName() != null) {
	        user.setName(dto.getName());
	    }
	    if (dto.getEmail() != null) {
	        user.setEmail(dto.getEmail());
	    }
	
	    return userRepository.save(user);
	}

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
