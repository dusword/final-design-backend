package com.dusword.repository;

import com.dusword.entity.Test_user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Test_user,Integer> {
}
