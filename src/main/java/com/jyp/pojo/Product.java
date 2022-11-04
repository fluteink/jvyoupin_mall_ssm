package com.jyp.pojo;

import java.util.Date;

public class Product {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product.id
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product.name
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product.sub_title
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    private String subTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product.original_price
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    private Float originalPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product.promote_price
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    private Float promotePrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product.stock
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    private Integer stock;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product.cid
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    private Integer cid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product.create_date
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    private Date createDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product.id
     *
     * @return the value of t_product.id
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product.id
     *
     * @param id the value for t_product.id
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product.name
     *
     * @return the value of t_product.name
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product.name
     *
     * @param name the value for t_product.name
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product.sub_title
     *
     * @return the value of t_product.sub_title
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product.sub_title
     *
     * @param subTitle the value for t_product.sub_title
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product.original_price
     *
     * @return the value of t_product.original_price
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public Float getOriginalPrice() {
        return originalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product.original_price
     *
     * @param originalPrice the value for t_product.original_price
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public void setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product.promote_price
     *
     * @return the value of t_product.promote_price
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public Float getPromotePrice() {
        return promotePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product.promote_price
     *
     * @param promotePrice the value for t_product.promote_price
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public void setPromotePrice(Float promotePrice) {
        this.promotePrice = promotePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product.stock
     *
     * @return the value of t_product.stock
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product.stock
     *
     * @param stock the value for t_product.stock
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product.cid
     *
     * @return the value of t_product.cid
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product.cid
     *
     * @param cid the value for t_product.cid
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product.create_date
     *
     * @return the value of t_product.create_date
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product.create_date
     *
     * @param createDate the value for t_product.create_date
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}