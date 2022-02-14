package ar.com.educacionit.domain;

import java.util.Date;

public class Articulos {

	private Long id;
	private String titulo;
	private Date fechaCreacion;
	private String codigo;
	private Double precio;
	private Integer stock;
	private Long marcaID;
	private Long categoriaID;
	
	//constructor
	//alt+shif+s
	
	

//hacia la base de datos
	public Articulos(String titulo, Date fechaCreacion, String codigo, Double precio, Integer stock, Long marcaID,
			Long categoriaID) {
	
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.codigo = codigo;
		this.precio = precio;
		this.stock = stock;
		this.marcaID = marcaID;
		this.categoriaID = categoriaID;
	}
//desde la base de datos
	public Articulos(Long id, String titulo, Date fechaCreacion, String codigo, Double precio, Integer stock,
			Long marcaID, Long categoriaID) {
		
		this.id = id;
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.codigo = codigo;
		this.precio = precio;
		this.stock = stock;
		this.marcaID = marcaID;
		this.categoriaID = categoriaID;
	}
	
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public String getPrecio(String pattern) {
		//##,###.00
		return this.precio.toString();
	}
	public String getTitulo() {
		return titulo;
	}
	public String getTitulo(boolean isUpperCase) {
		if(isUpperCase) {
			return this.titulo.toUpperCase();
		}else {
			return this.titulo;
		}
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Long getMarcaID() {
		return marcaID;
	}
	public void setMarcaID(Long marcaID) {
		this.marcaID = marcaID;
	}
	public Long getCategoriaID() {
		return categoriaID;
	}
	public void setCategoriaID(Long categoriaID) {
		this.categoriaID = categoriaID;
	}
	public Long getId() {
		return id;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Articulo [id=" + id + ", titulo=" + titulo + ", fechaCreacion=" + fechaCreacion + ", codigo=" + codigo
				+ ", precio=" + precio + ", stock=" + stock + ", marcaID=" + marcaID + ", categoriaID=" + categoriaID
				+ "]";
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	//public String toString();
	
	
}