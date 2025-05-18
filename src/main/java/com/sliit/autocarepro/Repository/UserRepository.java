package com.sliit.autocarepro.Repository;

import com.sliit.autocarepro.Model.User;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
@Repository
public class UserRepository {
    private LinkedList<User> users = new LinkedList<>();
    private static int nextId = 1;

    public String save(User user) {
        if (user.getId() == 0) {
            user.setId(nextId++);
        }
        users.add(user);
        return "Registration Successful";
    }

    public List<User> findAll() {
        return new LinkedList<>(users);
    }

    public User findById(int id) {
        return users.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }


    public void update(User user, int id) {
        User existing = findById(id);
        if (existing != null) {
            existing.setName(user.getName());
            existing.setEmail(user.getEmail());
            existing.setPhone(user.getPhone());
        }
    }



    public void delete(int id) {
        users.removeIf(c -> c.getId() == id);
    }
}
