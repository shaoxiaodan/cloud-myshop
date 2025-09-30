package com.shaoxiaodan.cart.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "CartFormDTO", description = "cart-service-CartFormDTO")
public class CartFormDTO {

	@Schema(description = "id")
	private Long itemId;

	@Schema(description = "name")
	private String name;

	@Schema(description = "specification")
	private String spec;

	@Schema(description = "price")
	private Integer price;

	@Schema(description = "image")
	private String image;
}
