package org.rvsystem.snatchpro.item.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.rvsystem.snatchpro.category.entity.Category;

public class Item {
	@Id
	@SequenceGenerator(name = "ITEM_SEQ", sequenceName = "ITEM_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ITEM_SEQ")
	@Column(name = "ID", unique = true, nullable = false)
	private long id;
	
	@Column(name="ITEM_NAME")
	private String itemName;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="HEADLINE")
	private String headLine;
	
	@Column(name="TERMS_AND_CONDITION")
	private String termsAndConditions;

	@Column(name="CATEGORY")
	private Category category;
	
	@Column(name="STATUS")
	private String status;
	
	
}
