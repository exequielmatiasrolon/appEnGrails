package pacientes

class Consulta {

		Date fecha;
		String hora;
		String motivo;
		String diagnostico;
		String tratamiento;

        static belongsTo = [pacientes : Paciente]


    static constraints = {

    		fecha(nullable:true)
    		hora(nullable:true)
    		motivo(nullable:true, maxSize:500)
    		diagnostico(nullable:true, maxSize:500)
    		tratamiento(nullable:true, maxSize:500)

    }
}
