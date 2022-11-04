package com.jyp.mapper;

import com.jyp.pojo.Review;
import com.jyp.pojo.ReviewExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReviewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_review
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    long countByExample(ReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_review
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int deleteByExample(ReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_review
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_review
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int insert(Review record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_review
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int insertSelective(Review record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_review
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    List<Review> selectByExample(ReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_review
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    Review selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_review
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int updateByExampleSelective(@Param("record") Review record, @Param("example") ReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_review
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int updateByExample(@Param("record") Review record, @Param("example") ReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_review
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int updateByPrimaryKeySelective(Review record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_review
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int updateByPrimaryKey(Review record);
}