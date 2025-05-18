package com.sliit.autocarepro.Service;

import com.sliit.autocarepro.Model.User;
import com.sliit.autocarepro.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {



    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;}


    public String registeruser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void updateUser(User user, int id) {
        userRepository.update(user,id);
    }

    public void deleteUser(int id) {
        userRepository.delete(id);
    }
}
