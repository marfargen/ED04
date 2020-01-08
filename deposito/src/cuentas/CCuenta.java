package cuentas;

/**
 * Esta clase define las cuentas que contendran el dinero
 * @author Marcelo Farace
 * @version 1.0
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
/**
 * Metodo get
 * @return. nombre del propietario de la cuenta
 */
    private String getNombre() {
		return nombre;
	}
/**
 * Metodo Set
 * @param nombre. nuevo nombre para el propietario de la cuenta
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * Metodo get
 * @return. nombre de la cuenta
 */
	private String getCuenta() {
		return cuenta;
	}
/**
 * Metodo Set
 * @param cuenta nuevo nombre para la cuenta
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * Metodo Get
 * @return. Devuelve el daldo disponible en la cuenta
 */
	private double getSaldo() {
		return saldo;
	}
/**
 * Metodo Set
 * @param saldo. Nueva cantidad a establecer como saldo disponible en la cuenta
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * Metodo Get
 * @return. Devuelve el tipo de interes actual
 */
	private double getTipoInterés() {
		return tipoInterés;
	}
/**
 * Metodo Set
 * @param tipoInterés. Tipo de interes a establecer para la cuenta
 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
/**
 * Metodo por definir...
 */
	public CCuenta()
    {
    }
	/**
	 * Metodo que se utiliza para definir una cuenta
	 * @param nom. nombre para el propiedario de la cuenta
	 * @param cue. nombre para la cuenta
	 * @param sal. saldo inicial disponible en la cuenta
	 * @param tipo. tipo de interes de la cuenta
	 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
/**
 * Metodo para obtener el valor de saldo actual en la cuenta
 * @return. devuelve el valor de saldo
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * Metodo para ingresar dinero en la cuenta
 * @param cantidad. Dinero a ingresar
 * @throws Exception
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Metodo para retirar dinero de la cuenta
 * @param cantidad. Cantidad a retirar
 * @throws Exception
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
