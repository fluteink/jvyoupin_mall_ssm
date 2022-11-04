package com.jyp.mapper;

import com.jyp.pojo.Product;
import com.jyp.pojo.ProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    long countByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int deleteByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int insertSelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    List<Product> selectByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    Product selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    int updateByPrimaryKey(Product record);
}