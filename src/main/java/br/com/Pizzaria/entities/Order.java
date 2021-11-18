package br.com.Pizzaria.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.Pizzaria.entities.enums.OrderStatus;
import br.com.Pizzaria.entities.enums.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_order")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long orderId;

	@Column(name = "paymentMethod")
	@Enumerated(EnumType.ORDINAL)
	private PaymentMethod orderPaymentMethod;

	@Column(name = "orderStatus")
	@Enumerated(EnumType.ORDINAL)
	private OrderStatus orderStatus;

	@OneToMany(mappedBy = "order")
	private Set<OrderItem> items;

	public Double getTotal() {

		double total = 0.0;

		if (items.size() > 0) {
			for (OrderItem oi : items) {
				total += oi.subTotal();
			}
			return total;
		} else {
			return null;
		}
	}

}
