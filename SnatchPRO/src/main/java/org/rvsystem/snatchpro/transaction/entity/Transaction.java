package org.rvsystem.snatchpro.transaction.entity;

import java.math.BigInteger;

import org.rvsystem.snatchpro.customer.entity.Customer;
import org.rvsystem.snatchpro.item.entity.Item;

public class Transaction {

	private long id;
	
	private Item item;
	
	private Customer customer;
	
	private String status;
	
	private BigInteger amount;
	
	
	
}
