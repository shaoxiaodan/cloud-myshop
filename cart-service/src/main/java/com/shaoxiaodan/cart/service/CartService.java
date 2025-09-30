package com.shaoxiaodan.cart.service;

import java.util.Collection;
import java.util.List;

import com.shaoxiaodan.cart.domain.pojo.Cart;
import com.shaoxiaodan.cart.domain.pojo.Item;

public interface CartService {

	void addItem2Cart(Cart Cart);

	List<Cart> queryMyCarts();
	
	Item getSingleItem();

	void removeByItemIds(Collection<Long> itemIds);
}
