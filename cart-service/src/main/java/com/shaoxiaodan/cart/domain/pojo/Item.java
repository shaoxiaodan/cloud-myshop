package com.shaoxiaodan.cart.domain.pojo;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Schema(name = "Item", description = "cart-service-Item")
public class Item implements Serializable {

	private static final long serialVersionUID = 1L;

	@Schema(description = "id")
	private Long id;

	@Schema(description = "name")
	private String name;

	@Schema(description = "price")
	private Integer price;

	@Schema(description = "stock")
	private Integer stock;

	@Schema(description = "image")
	private String image;

	@Schema(description = "category")
	private String category;

	@Schema(description = "brand")
	private String brand;

	@Schema(description = "specification")
	private String spec;

	@Schema(description = "sold")
	private Integer sold;

	@Schema(description = "commentCount")
	private Integer commentCount;

	@Schema(description = "is AD")
	private Boolean isAD;

}
