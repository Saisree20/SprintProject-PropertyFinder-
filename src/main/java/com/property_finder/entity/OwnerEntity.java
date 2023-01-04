package com.property_finder.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Owner")
public class OwnerEntity {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long ownerid;
	private String ownername;
	
	public long getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(long ownerid) {
		this.ownerid = ownerid;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	@Override
	public String toString() {
		return "OwnerEntity [ownerid=" + ownerid + ", ownername=" + ownername + "]";
	}
	public OwnerEntity(long ownerid, String ownername) {
		super();
		this.ownerid = ownerid;
		this.ownername = ownername;
	}
	public OwnerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
