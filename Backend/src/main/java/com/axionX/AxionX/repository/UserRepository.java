package com.axionX.AxionX.repository;

import com.axionX.AxionX.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
