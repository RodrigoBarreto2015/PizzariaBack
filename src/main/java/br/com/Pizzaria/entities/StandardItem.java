package br.com.Pizzaria.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("Standard")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class StandardItem extends Item{
	
	@Column(name = "price")
	private Double itemPrice;
}
