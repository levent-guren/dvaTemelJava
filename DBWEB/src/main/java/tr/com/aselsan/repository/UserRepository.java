package tr.com.aselsan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.com.aselsan.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
