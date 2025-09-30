package com.shaoxiaodan.item.service;

import java.util.Collection;
import java.util.List;

import com.shaoxiaodan.item.domain.dto.ItemDTO;
import com.shaoxiaodan.item.domain.dto.OrderDetailDTO;
import com.shaoxiaodan.item.domain.pojo.Item;

public interface ItemService {

	void deductStock(List<OrderDetailDTO> items);

	List<Item> queryAllItem();

	List<Item> queryTop10Item();

	Item queryItemById(Long id);

	List<Item> queryItemByIds(Collection<Long> ids);

	boolean addItem(Item item);

	boolean updateItem(Item item);

	boolean deleteItemById(Long id);

	boolean deleteItemByIds(Collection<Long> ids);

}
