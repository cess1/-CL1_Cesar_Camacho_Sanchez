@Entity
public class Producto {
    @Id
    @Size(min = 6, max = 6, message = "El IdProducto debe tener 6 caracteres")
    private String idProducto;

    @Size(min = 1, max = 50, message = "La Descripcion debe tener entre 1 y 50 caracteres")
    private String descripcion;

    @DecimalMin(value = "50.0", message = "El PrecioUnidad debe estar entre 50 y 500")
    @DecimalMax(value = "500.0", message = "El PrecioUnidad debe estar entre 50 y 500")
    private double precioUnidad;

    @Min(value = 1, message = "El Stock debe ser mayor a CERO")
    private int stock;

    @Pattern(regexp = "[01]", message = "El Estado debe aceptar solo '1' o '0'")
    private String estado;

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

 
}
