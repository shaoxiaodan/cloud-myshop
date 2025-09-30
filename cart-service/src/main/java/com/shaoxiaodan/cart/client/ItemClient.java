package com.shaoxiaodan.cart.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.shaoxiaodan.cart.domain.pojo.Item;

@FeignClient(value = "item-service")
public interface ItemClient {

	@GetMapping("/items/top10")
	public List<Item> queryTop10Item();

}
