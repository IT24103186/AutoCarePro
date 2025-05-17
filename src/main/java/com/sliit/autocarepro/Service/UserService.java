package com.sliit.autocarepro.Service;

import com.sliit.autocarepro.Model.User;
import com.sliit.autocarepro.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerCustomer(User user) {
        userRepository.save(user);
    }

    public List<User> getAllCustomers() {
        return userRepository.findAll();
    }

    public void updateCustomer(User customer) {
        userRepository.update(customer);
    }

    public void deleteCustomer(int id) {
        userRepository.delete(id);
    }
}
