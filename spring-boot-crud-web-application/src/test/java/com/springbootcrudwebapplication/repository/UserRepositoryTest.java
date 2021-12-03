package com.springbootcrudwebapplication.repository;

import com.springbootcrudwebapplication.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
@AutoConfigureTestDatabase(replace =AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testAddNewUser() {
        User user = new User();
        user.setEmail("shaukat@gmail.com");
        user.setPassword("shaukat123");
        user.setFirstName("shaukat");
        user.setLastName("makandar");

        User user1 = userRepository.save(user);
        assertThat(user1).isNotNull();
        assertThat(user1.getId()).isGreaterThan(0);
    }

    @Test
    public void testGetAllUser() {
        List<User> users = userRepository.findAll();

        assertThat(users).isNotNull();

        for (User user : users) {

            System.out.println(user);
        }

    }

    @Test
    public void testUpdate()
    {
        long userId=1;
        Optional<User> optionalUser = userRepository.findById(userId);
        User user=optionalUser.get();
        user.setPassword("bye123");
        userRepository.save(user);

        User updatedUser = userRepository.findById(userId).get();
        assertThat(updatedUser.getPassword()).isEqualTo("bye123");

    }

    @Test
    public void testGetUser()
    {
        long userId=2;
        Optional<User> optionalUser = userRepository.findById(userId);
        assertThat(optionalUser).isPresent();
        System.out.println(optionalUser.get());
    }

    @Test
    public void testDelete()
    {
        long userId=1;
        userRepository.deleteById(userId);

        Optional<User> optionalUser = userRepository.findById(userId);
        assertThat(optionalUser).isNotPresent();


    }

}