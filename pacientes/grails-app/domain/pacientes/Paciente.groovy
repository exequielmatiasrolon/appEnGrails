package pacientes

class Paciente {

	BigInteger nroDocumento;
	String apellido;
	String nombre;
	String sexo;
	Date fechaNacimiento;
    String telefono;
	String email;


    static hasMany = [consultas: Consulta, practicas : Practica]
   


    static constraints = {

    	nroDocumento (blank: false, unique:true)
    	apellido (blank: false,maxSize:100)
        nombre (blank: false,maxSize:100)

    	sexo (nullable:true, inList:['F','M'])
    	fechaNacimiento (nullable:true)
    	telefono(maxSize:9, nullable:true)
    	email(email:true, nullable:true)


    }
}
