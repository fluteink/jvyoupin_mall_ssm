package com.jyp.pojo;

public class Category {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category.id
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category.name
     *
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category.id
     *
     * @return the value of t_category.id
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category.id
     *
     * @param id the value for t_category.id
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category.name
     *
     * @return the value of t_category.name
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category.name
     *
     * @param name the value for t_category.name
     * @mbg.generated Fri Nov 04 12:18:43 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}