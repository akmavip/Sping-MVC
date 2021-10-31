package ptithcm.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="OrderDetails", uniqueConstraints= @UniqueConstraint(columnNames= {"order_id", "productsize_id"}))
public class OrderDetailsEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="totalMoney")
	private Float totalMoney;
	
	
	@ManyToOne
	@JoinColumn(name="order_id")
    private OrdersEntity order;
	
	@ManyToOne
	@JoinColumn(name="productsize_id")
    private ProductsSizesEntity productsize;
 
	
	
}
