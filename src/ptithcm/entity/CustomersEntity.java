package ptithcm.entity;

import javax.persistence.*;

import java.util.Collection;

@Entity
@Table(name="Customers")
public class CustomersEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="password")
	private String password;
	
	@Column(name="name")
	private String name;
	
	@Column(name="phone")
	private String phone;

	@Column(name="email", unique= true)
	private String email;
	
	@Column(name="isActive")
	private Boolean isActive;
	
	@Column(name="isAdmin")
	private Boolean isAdmin;
	
	@OneToMany(mappedBy = "customers", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Collection<OrdersEntity> orders;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Collection<CartsEntity> cart;
	
	@Column(name="address")
	private String address;
	
	public Integer getId() {
		return id;
	}

	public Collection<CartsEntity> getCart() {
		return cart;
	}

	public void setCart(Collection<CartsEntity> cart) {
		this.cart = cart;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Collection<OrdersEntity> getOrders() {
		return orders;
	}

	public void setOrders(Collection<OrdersEntity> orders) {
		this.orders = orders;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
		
}
