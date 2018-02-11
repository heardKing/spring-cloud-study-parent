package com.cuixx.provider.dao;

import com.cuixx.provider.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
