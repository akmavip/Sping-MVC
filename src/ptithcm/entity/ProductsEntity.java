package ptithcm.entity;

import java.util.Collection;

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

@Entity
@Table(name="Products")
public class ProductsEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="image")
	private String image;
	
	@Column(name="unitPrice")
	private Float unitPrice;
	
	@Column(name="salePrice")
	private Float salePrice;
	
	@Column(name="discount")
	private Float discount;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="description")
	private String description;
	
	@Column(name="viewCount")
	private Integer viewCount;

	
	@ManyToOne
	@JoinColumn(name="category_id")
	private CategoriesEntity categories;
		
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private Collection<ProductsSizesEntity> productsize;

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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Float getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Float salePrice) {
		this.salePrice = salePrice;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getViewCount() {
		return viewCount;
	}

	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	public CategoriesEntity getCategories() {
		return categories;
	}

	public void setCategories(CategoriesEntity categories) {
		this.categories = categories;
	}

	public Collection<ProductsSizesEntity> getProductsize() {
		return productsize;
	}

	public void setProductsize(Collection<ProductsSizesEntity> productsize) {
		this.productsize = productsize;
	}
	

}
