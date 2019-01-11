package com.dfm.currencyexchangeservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dfm.currencyexchangeservice.config.CurrencyConfig;
import com.dfm.currencyexchangeservice.model.Currency;

@Service
public class CurrencyService {
	@Autowired
	CurrencyConfig currencyConfig;
	
	public Currency getCurrencyDetails(String code) {
		return(currencyConfig.getCurrency(code));
	}
	
	public List<Currency> getAllCurrencies(){
		return(currencyConfig.getCurrencies());
	}
}
