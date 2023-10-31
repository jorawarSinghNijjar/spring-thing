package com.jorawar.singh.socialmediaapp.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int userCount = 0;

    static{
        users.add(new User(++userCount,"Anaam", LocalDate.now().minusYears(49)));
        users.add(new User(++userCount,"Brahmand", LocalDate.now().minusYears(20)));
        users.add(new User(++userCount,"Prahalad", LocalDate.now().minusYears(70)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(Integer id) {
        return users.stream().filter(user -> id.equals(user.getId())).findFirst().orElse(null);
    }

    public User save(User user) {
        user.setId(++userCount);
        users.add(user);
        return user;
    }

    public void deleteById(int id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
