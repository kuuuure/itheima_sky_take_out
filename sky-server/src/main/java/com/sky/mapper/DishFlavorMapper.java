package com.sky.mapper;


import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorMapper {

    /**
     * 批量插入口味数据
     * @param flavors
     */
    public void insertBatch(List<DishFlavor> flavors);


    /**
     * 根据 dish_id 删除菜品口味
     * @param dishId
     */
    @Delete("delete from dish_flavor where dish_id=#{dishId}")
    void deleteByDishId(Long dishId);


    /**
     * 根据 dish_id集合 删除菜品口味
     * @param dishIds
     */
    void deleteByDishIds(List<Long> dishIds);
}
