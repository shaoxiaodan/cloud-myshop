package com.shaoxiaodan.cart.domain.pojo;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Schema(name = "Cart", description = "cart-service-Cart")
public class Cart implements Serializable {

	private static final long serialVersionUID = 1L;

	@Schema(description = "id")
	private Long id;

	@Schema(description = "user id")
	private Long userId;

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

	@Schema(description = "image")
	private String image;

	@Schema(description = "create time")
	private LocalDateTime createTime;

	@Schema(description = "update time")
	private LocalDateTime updateTime;

}
