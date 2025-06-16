package com.hnw.back.repository;

import com.hnw.back.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface UserRepository
        extends JpaRepository<UserInfo, String>,
        JpaSpecificationExecutor<UserInfo> {


   /* List<UserInfo> findByName(String name);


*/


}
