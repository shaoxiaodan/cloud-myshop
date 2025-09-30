package com.shaoxiaodan.item.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shaoxiaodan.item.domain.pojo.Item;
import com.shaoxiaodan.item.service.ItemService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "item-servce-mgr", description = "item-servce-mgr api docs")
@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {

//	@Autowired
//	private ItemService itemService;
	private final ItemService itemService;

	@Operation(summary = "item-servce-queryItem")
	@GetMapping
	public List<Item> queryItem() {
		System.out.println("ItemController --> queryItem");
		return itemService.queryAllItem();
	}
	
	@Operation(summary = "item-servce-queryTop10Item")
	@GetMapping("/top10")
	public List<Item> queryTop10Item() {
		System.out.println("ItemController --> queryTop10Item");
		return itemService.queryTop10Item();
	}

//	@GetMapping
//	public List<Item> queryItemByIds(@RequestParam("ids") List<Long> ids) {
//		System.out.println("ItemController --> queryItemByIds");
//		return itemService.queryItemByIds(ids);
//	}

	@Operation(summary = "item-servce-queryItemById")
	@GetMapping("/{id}")
	public Item queryItemById(@PathVariable("id") Long id) {
		System.out.println("ItemController --> queryItemById");
		return itemService.queryItemById(id);
	}

	@Operation(summary = "item-servce-addItem")
	@PostMapping
	public void addItem(@RequestBody Item item) {
		System.out.println("ItemController --> addItem");
		itemService.addItem(item);
	}

	@Operation(summary = "item-servce-updateItem")
	@PutMapping
	public void updateItem(@RequestBody Item item) {
		System.out.println("ItemController --> updateItem");
		itemService.updateItem(item);
	}

	@Operation(summary = "item-servce-deleteItemById")
	@DeleteMapping("/{id}")
	public void deleteItemById(@PathVariable("id") Long id) {
		System.out.println("ItemController --> deleteItemById");
		itemService.deleteItemById(id);
	}

	@Operation(summary = "item-servce-deleteItemByIds")
	@DeleteMapping("/{ids}")
	public void deleteItemByIds(@PathVariable("ids") List<Long> ids) {
		System.out.println("ItemController --> deleteItemByIds");
		itemService.deleteItemByIds(ids);
	}

}
