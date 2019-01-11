package com.dfm.currencyexchangeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dfm.currencyexchangeservice.model.Currency;
import com.dfm.currencyexchangeservice.service.CurrencyService;


@RestController
public class CurrencyDetails {
	@Autowired
	CurrencyService currencyService;
	
	@GetMapping("/currency/{code}")
	Currency getCurrencyDetails(@PathVariable String code) {
		return(currencyService.getCurrencyDetails(code));
	}
	
	@GetMapping("/currencies")
	List<Currency> getCurrencies() {
		return(currencyService.getAllCurrencies());
	}
	
}
