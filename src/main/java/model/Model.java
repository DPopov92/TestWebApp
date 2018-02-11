package main.java.model;

import main.java.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class Model {
    private static Model instance = new Model();
    private List<User> userList;

    public static Model getInstance() {
        return instance;
    }

    public Model() {
        userList = new ArrayList<>();
    }

    public void add(User user){
        userList.add(user);
    }
    public List<String> list() {
        return userList.stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }
}
