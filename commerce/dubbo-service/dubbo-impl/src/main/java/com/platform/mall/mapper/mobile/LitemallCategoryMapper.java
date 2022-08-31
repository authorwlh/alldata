package com.platform.mall.mapper.mobile;

import java.util.List;

import com.platform.mall.entity.mobile.LitemallCategory;
import com.platform.mall.entity.mobile.LitemallCategoryExample;
import org.apache.ibatis.annotations.Param;

public interface LitemallCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    long countByExample(LitemallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    int insert(LitemallCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    int insertSelective(LitemallCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    LitemallCategory selectOneByExample(LitemallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    LitemallCategory selectOneByExampleSelective(@Param("example") LitemallCategoryExample example, @Param("selective") LitemallCategory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    List<LitemallCategory> selectByExampleSelective(@Param("example") LitemallCategoryExample example, @Param("selective") LitemallCategory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    List<LitemallCategory> selectByExample(LitemallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    LitemallCategory selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallCategory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    LitemallCategory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    LitemallCategory selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallCategory record, @Param("example") LitemallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallCategory record, @Param("example") LitemallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") LitemallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}
