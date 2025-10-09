package UT2;

	public class CuentaBancaria {
	   
	    private String titular;
	    private double saldo;

	   
	    public CuentaBancaria(String titular, double saldoInicial) {
	        this.titular = titular;
	        this.saldo = saldoInicial;
	    }

	   
	    public void ingresar(double cantidad) {
	        if (cantidad > 0) {
	            saldo += cantidad;
	            System.out.println("Has ingresado $" + cantidad + ". Saldo actual: $" + saldo);
	        } else {
	            System.out.println("La cantidad a ingresar debe ser positiva.");
	        }
	    }

	  
	    public void retirar(double cantidad) {
	        if (cantidad > 0) {
	            if (cantidad <= saldo) {
	                saldo -= cantidad;
	                System.out.println("Has retirado $" + cantidad + ". Saldo actual: $" + saldo);
	            } else {
	                System.out.println("Saldo insuficiente. Tu saldo es $" + saldo);
	            }
	        } else {
	            System.out.println("La cantidad a retirar debe ser positiva.");
	        }
	    }

	    
	    public double getSaldo() {
	        return saldo;
	    }

	 
	    public String getTitular() {
	        return titular;
	    }

	   
	    @Override
	    public String toString() {
	        return "Cuenta de " + titular + " - Saldo: $" + saldo;
	    }

	 
	    public static void main(String[] args) {
	   
	        CuentaBancaria cuenta = new CuentaBancaria("Julian Alvarez", 500.0);

	      
	        System.out.println(cuenta);

	       
	        cuenta.ingresar(200.0);

	       
	        cuenta.retirar(100.0);

	     
	        cuenta.retirar(700.0);

	      
	        System.out.println("Estado final: " + cuenta);
	    }
	}



