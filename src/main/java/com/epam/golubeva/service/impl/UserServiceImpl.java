package com.epam.golubeva.service.impl;

import com.epam.golubeva.entity.User;
import com.epam.golubeva.service.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl  implements UserService {

    @Override
    public List<User> generationUsers() {
        return Arrays.asList(
                new User("Andrey","Andreev","andrey12","123321"),
                new User("Ivan","Ivanov","ivan._.ivan","098)-+"),
                new User("Petr","Petrov","petr1","petrFirst")
        );
    }
}
