package com.shaoxiaodan.item.domain.query;

import lombok.Data;

@Data
public class ItemPageQuery {
	private String key;
	private String category;
	private String brand;
	private Integer price;
	private Integer maxPrice;

}
