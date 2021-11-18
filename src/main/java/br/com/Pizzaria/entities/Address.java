package br.com.Pizzaria.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_address")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Address {
	
	@Id
    @Column(name = "client_id")
	private Long Id;
	
	@Column(name = "number")
	private Integer number;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "district")
	private String district;
	
	@Column(name = "reference")
	private String reference;
	
	@Column(name = "city")
	private String city;
	
	@OneToOne
    @MapsId
    @JoinColumn(name = "client_id")
    private Client client;	
	
}
