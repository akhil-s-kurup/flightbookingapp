package org.airkerala.dao;

import org.airkerala.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}