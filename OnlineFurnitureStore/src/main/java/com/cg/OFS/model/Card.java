package com.cg.OFS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Card_tbl")
public class Card {
	@Id
	@Column(name="Card_No")
	private int cardNo;
	
	@Column(name="Card_Name")
	private String cardName;
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	
	

}
