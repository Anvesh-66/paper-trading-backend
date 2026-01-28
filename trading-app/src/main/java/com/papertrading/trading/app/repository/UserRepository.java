package com.papertrading.trading.app.repository;

import com.papertrading.trading.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  UserRepository extends JpaRepository<User,Long> {

}
