package com.sliit.autocarepro.Service;

import com.sliit.autocarepro.Model.User;
import com.sliit.autocarepro.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;}

    @Override
    public String registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void updateUser(User user, int id) {
        userRepository.update(user,id);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.delete(id);
    }
}
