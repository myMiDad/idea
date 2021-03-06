package com.test.mapper;

import com.test.entity.Books;
import java.util.List;

public interface BooksMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table books
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table books
     *
     * @mbg.generated
     */
    int insert(Books record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table books
     *
     * @mbg.generated
     */
    Books selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table books
     *
     * @mbg.generated
     */
    List<Books> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table books
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Books record);
}