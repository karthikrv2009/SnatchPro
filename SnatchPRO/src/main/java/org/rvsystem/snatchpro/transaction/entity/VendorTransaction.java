package org.rvsystem.snatchpro.transaction.entity;

import java.util.Date;
import java.util.Set;

import org.rvsystem.snatchpro.item.entity.Item;

public class VendorTransaction {

	private long id;
	
	private Set<Item> items;
	
	private long Quantity;
	
	private Date startDate;
	
	private Date endDate;
	
	private Reciept reciept;
	

}
