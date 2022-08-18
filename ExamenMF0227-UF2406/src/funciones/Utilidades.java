package funciones;
/**
 * Clase de utilidades que devuelve las siguientes funciones
 * devulveNota
 * @author Manuel López
 *
 */
public class Utilidades {

	/**
	 * Método que nos devuelve la nota del alumno
	 * @param nota nota del alumno
	 * @return String con la calificación alumno
	 */

	public String devuelveNota(double nota) {
		String descripcion = "Matrícula";
		
		if (nota<0.0 || nota >10) {
			throw new ArithmeticException("La nota debe estar entre 0.0 y 10");
		} else if (nota<5.0) {
			descripcion="Suspenso";
		} else if (nota <6.5) {
			descripcion = "Bien";
		} else if (nota<8.5) {
			descripcion ="Notable";
		} else if (nota<10) {
			descripcion ="Sobresaliente";
		} else {
			descripcion = "Matrícula";
		}
		return descripcion;
	}
}