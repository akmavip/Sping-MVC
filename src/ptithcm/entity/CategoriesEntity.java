package ptithcm.entity;

import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name="Categories")
public class CategoriesEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy = "categories", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Collection<ProductsEntity> products;

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<ProductsEntity> getProducts() {
		return products;
	}

	public void setProducts(Collection<ProductsEntity> products) {
		this.products = products;
	}
	
}
