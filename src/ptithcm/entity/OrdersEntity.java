package ptithcm.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Orders")
public class OrdersEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@Column(name = "orderDate")
	private Date orderDate;

	@Column(name="totalMoney")
	private Float totalMoney;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private CustomersEntity customers;
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private Collection<OrderDetailsEntity> orderdetails;
	
	
	public Float getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(Float totalMoney) {
		this.totalMoney = totalMoney;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CustomersEntity getCustomers() {
		return customers;
	}

	public void setCustomers(CustomersEntity customers) {
		this.customers = customers;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	public Collection<OrderDetailsEntity> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(Collection<OrderDetailsEntity> orderdetails) {
		this.orderdetails = orderdetails;
	}
}
