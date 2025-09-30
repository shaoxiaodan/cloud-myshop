package com.shaoxiaodan.item.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.shaoxiaodan.item.domain.dto.OrderDetailDTO;
import com.shaoxiaodan.item.domain.pojo.Item;
import com.shaoxiaodan.item.mapper.ItemMapper;
import com.shaoxiaodan.item.service.ItemService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

//	@Autowired
	private final ItemMapper itemMaper;

	@Override
	public Item queryItemById(Long id) {
//		return itemMaper.getItemById(id);
		return new Item();
	}

	@Override
	public List<Item> queryTop10Item() {
//		return itemMaper.queryTop10Item();

		List<Item> items = new ArrayList<Item>();
		Item item = new Item();
		item.setId(1l);
		item.setName("OpenFeign...");
		item.setBrand("Spring Cloud Alibaba...");
		items.add(item);
		return items;
	}

	@Override
	public List<Item> queryAllItem() {
//		return itemMaper.getAllItem();

		List<Item> items = new ArrayList<Item>();
		items.add(new Item());
		items.add(new Item());
		items.add(new Item());
		return items;
	}

	@Override
	public List<Item> queryItemByIds(Collection<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addItem(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateItem(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteItemById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteItemByIds(Collection<Long> ids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deductStock(List<OrderDetailDTO> items) {
		// TODO Auto-generated method stub

	}

}
