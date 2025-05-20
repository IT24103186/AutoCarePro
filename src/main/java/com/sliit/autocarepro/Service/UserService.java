package com.sliit.autocarepro.Service;

import com.sliit.autocarepro.Model.User;

import java.util.List;

public interface UserService {

    public String registerUser(User user);
    public List<User> getAllUsers();
    public void updateUser(User user, int id);
    public void deleteUser(int id);
}
