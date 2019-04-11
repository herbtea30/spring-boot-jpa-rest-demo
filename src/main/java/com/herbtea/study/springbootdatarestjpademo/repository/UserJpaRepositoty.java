package com.herbtea.study.springbootdatarestjpademo.repository;

import com.herbtea.study.springbootdatarestjpademo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserJpaRepositoty extends JpaRepository<Users, String> {
    Users findByName(String name);
}
