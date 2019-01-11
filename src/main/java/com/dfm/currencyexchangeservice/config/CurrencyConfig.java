package com.dfm.currencyexchangeservice.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import com.dfm.currencyexchangeservice.model.Currency;



@Configuration
public class CurrencyConfig {
	private List<Currency> currencies;
	
	public CurrencyConfig() {
		this.currencies = createCurrencyList();
	}

	private List<Currency> createCurrencyList(){
		List<Currency> c = new ArrayList<Currency>();
		c.add(createCurrency("US Dollar", "USD", 1.0));
		c.add(createCurrency("Indian Rupee", "INR", 70.0));
		return(c);
	}
	
	private Currency createCurrency(String name, String code, double rate) {
		Currency c = new Currency();
		c.setCode(code);
		c.setName(name);
		c.setRate(rate);
		return(c);
	}
	
	public Currency getCurrency(String code) {
		Currency c = this.currencies.stream()
							.filter(currency -> currency.getCode().equals(code))
							.findAny()
			                .orElse(null);
		return(c);
	}
	
	public List<Currency> getCurrencies(){
		return(this.currencies);
	}
}
