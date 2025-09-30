package com.shaoxiaodan.cart.domain.vo;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "CartVO", description = "cart-service-CartVO")
public class CartVO {

	@Schema(description = "id")
	private Long id;

	@Schema(description = "sku id")
	private Long itemId;

	@Schema(description = "num")
	private Integer num;

	@Schema(description = "name")
	private String name;

	@Schema(description = "specification")
	private String spec;

	@Schema(description = "price")
	private Integer price;

	@Schema(description = "newPrice")
	private Integer newPrice;

	@Schema(description = "status")
	private Integer status = 1;

	@Schema(description = "stock")
	private Integer stock = 10;

	@Schema(description = "image")
	private String image;

	@Schema(description = "create time")
	private LocalDateTime createTime;

}
