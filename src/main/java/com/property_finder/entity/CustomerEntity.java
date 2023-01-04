package com.property_finder.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class CustomerEntity {
     @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private long customerid;
	    private String customername;
	    
		public long getCustomerid() {
			return customerid;
		}
		public void setCustomerid(long customerid) {
			this.customerid = customerid;
		}
		public String getCustomername() {
			return customername;
		}
		public void setCustomername(String customername) {
			this.customername = customername;
		}
		@Override
		public String toString() {
			return "CustomerEntity [customerid=" + customerid + ", customername=" + customername + "]";
		}
		public CustomerEntity(long customerid, String customername) {
			super();
			this.customerid = customerid;
			this.customername = customername;
		}
		public CustomerEntity() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
}
