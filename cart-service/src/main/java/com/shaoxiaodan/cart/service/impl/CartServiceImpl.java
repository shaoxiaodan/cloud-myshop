package com.shaoxiaodan.cart.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.shaoxiaodan.cart.client.ItemClient;
import com.shaoxiaodan.cart.domain.pojo.Cart;
import com.shaoxiaodan.cart.domain.pojo.Item;
import com.shaoxiaodan.cart.service.CartService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

//	private final DiscoveryClient discoveryClient;

	private final ItemClient itemClient;

	@Override
	public void addItem2Cart(Cart Cart) {
		// TODO Auto-generated method stub
	}

	@Override
	public Item getSingleItem() {
		List<Item> items = itemClient.queryTop10Item();
		System.out.println("CartServiceImpl::getSingleItem, items=" + items);
		return items.get(0);
	}

	@Override
	public List<Cart> queryMyCarts() {
		// 分布式远程调用
		List<Item> items = itemClient.queryTop10Item();
		System.out.println("client::queryMyCarts-->items=" + items);
		return null;
	}

	@Override
	public void removeByItemIds(Collection<Long> itemIds) {
		// TODO Auto-generated method stub
	}

}
