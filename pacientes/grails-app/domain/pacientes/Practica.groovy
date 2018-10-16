package pacientes

class Practica {

	//String fechaPrescripcion
	//String  fechaRealizacion
	String resultado
	
    TipoPractica tipopractica 


	static belongsTo = [pacientes: Paciente]

	



    static constraints = {

    		//fechaRealizacion(blank:false,nullable:true)
    	//	fechaRealizacion(blank:false,nullable:true)
    		resultado(maxSize:500, blank:false,nullable:true)
    		
    			


    }
}
