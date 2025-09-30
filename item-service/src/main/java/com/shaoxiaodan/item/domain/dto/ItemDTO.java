package com.shaoxiaodan.item.domain.dto;

import lombok.Data;

@Data
public class ItemDTO {

	private Long id;
	private String name;
	private Integer price;
	private Integer stock;
	private String image;
	private String category;
	private String brand;
	private String spec;
	private Integer sold;
	private Integer commentCount;
	private Boolean isAD;
	private String status;

}
