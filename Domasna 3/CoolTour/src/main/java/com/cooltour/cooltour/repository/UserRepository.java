package com.cooltour.cooltour.repository;

import com.cooltour.cooltour.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
