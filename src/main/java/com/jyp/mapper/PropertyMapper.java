package com.jyp.mapper;

import com.jyp.pojo.Property;
import com.jyp.pojo.PropertyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PropertyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_property
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    long countByExample(PropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_property
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int deleteByExample(PropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_property
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_property
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int insert(Property record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_property
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int insertSelective(Property record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_property
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    List<Property> selectByExample(PropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_property
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    Property selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_property
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int updateByExampleSelective(@Param("record") Property record, @Param("example") PropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_property
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int updateByExample(@Param("record") Property record, @Param("example") PropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_property
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int updateByPrimaryKeySelective(Property record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_property
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int updateByPrimaryKey(Property record);
}