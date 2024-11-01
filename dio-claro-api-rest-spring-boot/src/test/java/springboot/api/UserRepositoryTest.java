package springboot.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import springboot.api.model.User;
import springboot.api.repository.UserRepository;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveUser() {
        User user = new User();
        user.setName("Test User");
        User savedUser = userRepository.save(user);

        Assertions.assertNotNull(savedUser.getId());
        Assertions.assertEquals("Test User", savedUser.getName());
    }

    @Test
    public void testFindUserById() {
        User user = new User();
        user.setName("Another User");
        User savedUser = userRepository.save(user);

        User retrievedUser = userRepository.findById(savedUser.getId()).orElse(null);
        Assertions.assertNotNull(retrievedUser);
        Assertions.assertEquals(savedUser.getName(), retrievedUser.getName());
    }

}


