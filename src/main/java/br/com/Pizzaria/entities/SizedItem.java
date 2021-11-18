package br.com.Pizzaria.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("Sized")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class SizedItem extends Item{
	
	@Column(name = "mediumPrice")
	private Double mediumSizePrice;
	
	@Column(name = "largeSize")
	private Double largeSizePrice;
}
