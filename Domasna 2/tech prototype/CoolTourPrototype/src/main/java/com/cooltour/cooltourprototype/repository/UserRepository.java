package com.cooltour.cooltourprototype.repository;

import com.cooltour.cooltourprototype.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
