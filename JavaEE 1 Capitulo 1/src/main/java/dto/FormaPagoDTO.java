package dto;

public class FormaPagoDTO {

	private int idFromaPago;
	private String descripcion;
	private double recargo;
	
	
	/**
	 * @return the idFromaPago
	 */
	public int getIdFromaPago() {
		return idFromaPago;
	}
	/**
	 * @param idFromaPago the idFromaPago to set
	 */
	public void setIdFromaPago(int idFromaPago) {
		this.idFromaPago = idFromaPago;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the precio
	 */
	public double getRecargo() {
		return recargo;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setRecargo(double recargo) {
		this.recargo = recargo;
	}
	
	
	
	
	
}
