package services;

import entitites.User;
import org.springframework.stereotype.Service;
import repositories.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {this.userRepository = userRepository;}

    public User updateUser(User userRequest){
        return Optional.of(userRequest)
                .map(userRepository::save)
                .orElseThrow(() -> new RuntimeException("Error updating user"));
    }

    public User getUser (Long id){
        return Optional.of(id)
                .map(this::getErrorFindingUser)
                .orElseThrow(() -> new RuntimeException("Error finding user"));
    }

    private User getErrorFindingUser(Long userId){
        return userRepository.findById(userId).orElseThrow(() -> new RuntimeException("Error finding game"));
    }

    public User saveUser(String userId, User userRequest, User password) {
        userRequest.setUserId((long) Integer.parseInt(userId));
        return Optional.of(userRequest)
                .map(userRepository::save)
                .orElseThrow(() -> new RuntimeException("Error saving user"));
    }
}
