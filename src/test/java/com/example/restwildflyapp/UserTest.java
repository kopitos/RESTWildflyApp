package com.example.restwildflyapp;

import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class UserTest {

    @PersistenceContext
    EntityManager em;

    @Inject
    UserEJB ejb;

    @Test
    public void createNewUser() {
        LocalDate date = LocalDate.parse("1997-07-27");
        User user = new User(1, "lan@123", "Lan Anh", "Tran", date,"1234");
        ejb.register(user);
        assertNotNull(user);
    }
}
