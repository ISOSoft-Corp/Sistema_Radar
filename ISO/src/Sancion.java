
public class Sancion {
	
	private int IDExpediente;
	private	String conductor;
	private double importe;
	private int puntos;
	private int IDSancion;
	
	public Sancion(int iDExpediente, String conductor, int iDSancion) {
		IDExpediente = iDExpediente;
		this.conductor = conductor;
		IDSancion = iDSancion;
	}
	//setMulta()
	
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getIDExpediente() {
		return IDExpediente;
	}
	public String getConductor() {
		return conductor;
	}
	public double getImporte() {
		return importe;
	}
	public int getIDSancion() {
		return IDSancion;
	}
	
}
