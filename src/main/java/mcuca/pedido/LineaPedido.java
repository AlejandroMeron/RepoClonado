package mcuca.pedido;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import mcuca.producto.Producto;

@Entity
public class LineaPedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Pedido pedido;
	
	@ManyToOne
	private Producto producto;
	
	private int cantidad;
	
	
	private boolean enCocina;
	
	//private Long pedidoId;
	
	protected LineaPedido() {}
	
	public LineaPedido(int cantidad, Producto producto, Pedido pedido, boolean enCocina) {
		this.cantidad = cantidad;
		this.producto = producto;
		this.pedido = pedido;
		this.enCocina = enCocina;
	}
	
	public Long getId() { return this.id; }
	public Pedido getPedido() { return this.pedido; }
	public Producto getProducto() { return this.producto; }
	public int getCantidad() { return this.cantidad; }
	public boolean isEnCocina() { return this.enCocina; }
	//public Long getPedidoId() { return this.pedidoId; }
	
	public void setPedido(Pedido pedido) { this.pedido = pedido; }
	public void setProducto(Producto producto) { this.producto = producto; }
	public void setCantidad(int cantidad) { this.cantidad = cantidad; }
	public void setEnCocina(boolean enCocina) { this.enCocina = enCocina; }
	//public void setPedidoId(Long pedidoId) { this.pedidoId = pedidoId; }
	
	@Override
	public String toString() 
	{ 
		return String.format(
				"Pedido %d, Producto %s, Cantidad %d, en cocina: %b", 
				/*this.pedido.getId(),*/ this.producto.getNombre(), this.cantidad, this.enCocina
		); 
	}

}
