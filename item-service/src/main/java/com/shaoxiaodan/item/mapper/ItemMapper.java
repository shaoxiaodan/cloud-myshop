package com.shaoxiaodan.item.mapper;

import java.util.Collection;
import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.shaoxiaodan.item.domain.dto.OrderDetailDTO;
import com.shaoxiaodan.item.domain.pojo.Item;

public interface ItemMapper {

	@Select("select * from item limit 0,5")
	public List<Item> getAllItem();

	@Select("select * from item limit 0,10")
	public List<Item> queryTop10Item();

	@Select("select * from item where id = ${id}")
	public Item getItemById(Long id);

	@Select("select * from item where id = ${id}")
	public List<Item> getItemByIds(Collection<Long> ids);

	@Update("update item set stock = stock - #{num} where id =${itemId}")
	void updateStock(OrderDetailDTO orderDetailDTO);
}
