package in.bushansirgur.jdbcapidemo.service;

import in.bushansirgur.jdbcapidemo.model.User;
import in.bushansirgur.jdbcapidemo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }


    public void createUser(User user) {
        userRepository.createUser(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteUser(id);
    }

    public User findUserById(Long id) {
        return userRepository.findUserById(id);
    }

    public void updateUser(User user) {
        userRepository.update(user);
    }
}
