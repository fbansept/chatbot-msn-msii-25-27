package edu.ban7.chatbotmsnmsii2527.dao;

import edu.ban7.chatbotmsnmsii2527.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppUserDao extends JpaRepository<AppUser,Integer> {

    Optional<AppUser> findByEmail(String email);
}
