package com.example.outbox.user.util;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum NewsLetter {
	BEST_SELLERS(1, "Best Sellers"),
	MARKET_ANALYSIS(2, "Market Analysis"),
	TOP_SELLERS(3, "Top Sellers"),
	HOT_KEYWORDS(4, "Hot Keywords"),
	TOP_BRANDS(5, "Top Brands"),
	TOP_CATEGORIES(6, "Top Categories"),
	SALES_REPORT(7, "Sales Report");

	private Integer id;
	private String newsLetter;
}