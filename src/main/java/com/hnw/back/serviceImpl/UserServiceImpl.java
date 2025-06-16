package com.hnw.back.serviceImpl;

import com.hnw.back.entity.UserInfo;
import com.hnw.back.repository.UserRepository;
import com.hnw.back.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseEntity<?> userInfo() {

        List<UserInfo> users = userRepository.findAll();

        log.info("users:::" + users);

        if (users.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(users);
    }
}
