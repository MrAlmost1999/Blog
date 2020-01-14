package com.mralmost.community.model;

import lombok.Data;

/**
 * @author Lxj
 * @Package com.mralmost.community.Model
 * @Description TODO
 * @date: 2020/1/10
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
