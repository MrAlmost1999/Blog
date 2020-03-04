package com.mralmost.community.mapper;

import com.mralmost.community.model.GithubUser;
import com.mralmost.community.model.GithubUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GithubUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table github_user
     *
     * @mbg.generated Wed Mar 04 21:53:55 CST 2020
     */
    long countByExample(GithubUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table github_user
     *
     * @mbg.generated Wed Mar 04 21:53:55 CST 2020
     */
    int deleteByExample(GithubUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table github_user
     *
     * @mbg.generated Wed Mar 04 21:53:55 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table github_user
     *
     * @mbg.generated Wed Mar 04 21:53:55 CST 2020
     */
    int insert(GithubUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table github_user
     *
     * @mbg.generated Wed Mar 04 21:53:55 CST 2020
     */
    int insertSelective(GithubUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table github_user
     *
     * @mbg.generated Wed Mar 04 21:53:55 CST 2020
     */
    List<GithubUser> selectByExample(GithubUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table github_user
     *
     * @mbg.generated Wed Mar 04 21:53:55 CST 2020
     */
    GithubUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table github_user
     *
     * @mbg.generated Wed Mar 04 21:53:55 CST 2020
     */
    int updateByExampleSelective(@Param("record") GithubUser record, @Param("example") GithubUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table github_user
     *
     * @mbg.generated Wed Mar 04 21:53:55 CST 2020
     */
    int updateByExample(@Param("record") GithubUser record, @Param("example") GithubUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table github_user
     *
     * @mbg.generated Wed Mar 04 21:53:55 CST 2020
     */
    int updateByPrimaryKeySelective(GithubUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table github_user
     *
     * @mbg.generated Wed Mar 04 21:53:55 CST 2020
     */
    int updateByPrimaryKey(GithubUser record);
}