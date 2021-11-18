package br.com.Pizzaria.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_orderItem")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long orderItemId;

	@Column(name = "quantity")
	private Integer orderItemQuantity;

	@Column(name = "price")
	private Double orderItemPrice;

	@Column(name = "observation")
	private Double orderItemObservation;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "item_id", referencedColumnName = "id")
	private Item orderItem;
	
	@ManyToOne
    @JoinColumn(name="order_id", nullable=false)
    private OrderItem order;

	public double subTotal() {
		return orderItemQuantity * orderItemPrice;
	}

}
