package com.InheritanceHibernate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;
@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS )
@DiscriminatorColumn(name = "DTYPE")

public class Vehical {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int V_Id;
    private String V_Type;
	public void setV_Type(String string) {
		// TODO Auto-generated method stub
		
	}

}
