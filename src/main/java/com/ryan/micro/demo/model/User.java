package com.ryan.micro.demo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("tb_user")
@Data
public class User {

    private Integer id;

    private String userId;

    private String realityName;

    private String mobile;
}
