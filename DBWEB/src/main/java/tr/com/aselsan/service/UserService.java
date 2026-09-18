package tr.com.aselsan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import tr.com.aselsan.entity.User;
import tr.com.aselsan.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public List<User> getUsers() {
		return userRepository.findAll();
	}

	public User getUser(int id) {
		return userRepository.findById(id).orElse(null);
	}

	@Transactional
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Transactional
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}

}
