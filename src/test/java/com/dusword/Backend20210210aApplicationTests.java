package com.dusword;

import com.dusword.entity.Test_user;
import com.dusword.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Backend20210210aApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void saveUser(){
        Test_user user=new Test_user();
        user.setUSER_NAME("lixiangjie716");
        user.setUSER_PASSWORD("12345678");
        Test_user user1=userRepository.save(user);
        System.out.println(user1);
    }

}
