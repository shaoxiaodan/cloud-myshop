package com.shaoxiaodan.cart.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface CartMapper {

	@Update("UPDATE cart SET num = num + 1 WHERE user_id = #{userId} AND item_id = #{itemId}")
    void updateNum(@Param("itemId") Long itemId, @Param("userId") Long userId);
}
