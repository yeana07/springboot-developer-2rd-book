package me.leeyena.springbootdeveloper.repository;

import me.leeyena.springbootdeveloper.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email); //1.email로 사용자 정보 가져옴
}