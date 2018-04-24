package com.jjuarez.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jjuarez.isbnclient.ISBNClient;

@RestController
public class ISBNValidatorController {
	
	@Autowired
	private ISBNClient isbnClient;
	
	@RequestMapping("/validate-isbn13")
	@ResponseBody
	public String validateISBN(@RequestParam(value="isbn", defaultValue="") String isbn) {
		return "ISBN valid: " + isbnClient.validateISBN(isbn).isIsValidISBN13Result();
	}
}
