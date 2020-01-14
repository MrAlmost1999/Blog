package com.mralmost.community.model;

import lombok.Data;

/**
 * @author Lxj
 * @Package com.mralmost.community.model
 * @Description TODO
 * @date: 2020/1/12
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private String tag;
}
