package com.sliit.autocarepro.Repository;

import com.sliit.autocarepro.Model.User;
import com.sliit.autocarepro.Model.Vehicle;
import org.springframework.stereotype.Repository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        saveToTextFile();
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
        saveToTextFile();
    }

    public void delete(int id) {
        users.removeIf(c -> c.getId() == id);
        saveToTextFile();
    }

    private String saveToTextFile() {
        String folderPath = "src/main/java/com/sliit/autocarepro/Log";
        String filePath = folderPath + File.separator + "UserSaveLog.txt";

        // Create the Log folder if it doesn't exist
        File folder = new File(folderPath);
        if (!folder.exists()) {
            boolean folderCreated = folder.mkdirs();
            if (!folderCreated) {
                return "Error creating Log folder at " + folderPath;
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (User record : users) {
                writer.write(String.format("id: %d, name: %s, email: %s, phone: %s, password: %s, role: %s",
                        record.getId(),
                        record.getName(),
                        record.getEmail(),
                        record.getPhone(),
                        record.getpassword(),
                        record.getrole()));
            }
            return "Data successfully saved to " + filePath;
        } catch (IOException e) {
            e.printStackTrace();
            return "Error saving data to file: " + e.getMessage();
        }
    }
}
