package com.shaoxiaodan.cart.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shaoxiaodan.cart.domain.pojo.Cart;
import com.shaoxiaodan.cart.domain.pojo.Item;
import com.shaoxiaodan.cart.service.CartService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "cart-service-mgr:8082", description = "cart-service-mgr API")
@RestController
@RequestMapping("/carts")
@RequiredArgsConstructor
public class CartController {

//	@Autowired
//	private CartService carServcie;
	private final CartService carServcie;

	@GetMapping("/test1")
	public void chkClient() {
		System.out.println("CartController --> queryMyCarts");

		// Distributed remote invocation
		Item item = carServcie.getSingleItem();
		System.out.println("CartController::test1, item = " + item);
		System.out.println("CartController::test1, id = " + item.getId());
		System.out.println("CartController::test1, name = " + item.getName());
		System.out.println("CartController::test1, brand = " + item.getBrand());
	}

	@Operation(summary = "cart-service-queryMyCarts")
	@GetMapping("/query")
	public List<Cart> queryMyCarts() {
		System.out.println("CartController --> queryMyCarts");

		// Distributed remote invocation
		return carServcie.queryMyCarts();
	}

	@Operation(summary = "cart-service-addItem2Cart")
	@PostMapping()
	public void addItem2Cart(@RequestBody Cart cart) {
		System.out.println("CartController --> addItem2Cart");
		carServcie.addItem2Cart(cart);
	}

	@Operation(summary = "cart-service-updateCart")
	@PutMapping
	public void updateCart() {
		System.out.println("CartController --> updateCart");
	}

	@Operation(summary = "cart-service-deleteCartItem")
	@DeleteMapping("{id}")
	public void deleteCartItem(Long id) {
		System.out.println("CartController --> deleteCartItem");
	}

	@Operation(summary = "cart-service-deleteCartItemByIds")
	@DeleteMapping("{ids}")
	public void deleteCartItemByIds(List<Long> ids) {
		System.out.println("CartController --> deleteCartItemByIds");
	}

}
