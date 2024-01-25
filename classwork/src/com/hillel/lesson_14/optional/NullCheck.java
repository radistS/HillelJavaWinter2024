package com.hillel.lesson_14.optional;


import com.hillel.lesson_14.streamExample.businessObject.User;
import java.util.Objects;
import java.util.Optional;

public class NullCheck {
    public static void main(String[] args) {
        User user = null;

        if (Objects.nonNull(getUser())){
            System.out.println("not null");
        } else {
            System.out.println("null");
        }
    }

    public static Optional<User> getUser(){
        return Optional.of(null);
    }
}
