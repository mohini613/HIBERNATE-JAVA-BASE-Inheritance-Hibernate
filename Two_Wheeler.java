package com.InheritanceHibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
@DiscriminatorValue("Two_Wheeler")

public class Two_Wheeler extends Vehical{
       private String Sterring_Type;

	public void setSterring_Type(String string) {
		// TODO Auto-generated method stub
		
	}
       
}
