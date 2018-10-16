package pacientes

class TipoPractica {

	String codigo;
	String nombre;

	static hasOne=[practicas : Practica]



    static constraints = {

    		codigo(blank:false,maxSize: 6 ,unique:true)
    		nombre(blank:false, maxSize:100 )

    }
}
