package com.shaoxiaodan.item.domain.pojo;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Item implements Serializable {

	private static final long serialVersionUID = 1L;

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

}
