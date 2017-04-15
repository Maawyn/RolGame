package interfaces;

public interface IPersonaje {
	
	/**
	 * Elimina al personaje
	 */
	public void morir();
	
	/**
	 * Este metodo permite quitar vida a un objetivo
	 * @param mod es un modificador de puntos de vida
	 * @param obje es el objetivo al que se le resta vida
	 */
	public int atacar(int mod, IPersonaje obje);
	
	public void recuperarVida(int vida);
	
	public void perderVida(int vida);
}
