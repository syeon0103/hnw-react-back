package com.hnw.back.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String userName;

    @Override
    public String toString() {
        return "UserInfo [userName=" + userName  + "]";
    }



}
