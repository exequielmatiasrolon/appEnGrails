package pacientes

class BootStrap {

    def init = { servletContext ->

    

    Paciente paciente1 = new Paciente(nroDocumento:39016816, apellido:"HEREDIA",nombre:"ROGER")

    Paciente paciente2 = new Paciente(nroDocumento:39016815, apellido:"2HEREDIA2",nombre:"2ROGER2")

    paciente2.save(flush: true)

   	

   	 	def consulta1 = new Consulta (diagnostico:"probando consulta", tratamiento:"tratamientoprueba") 
   	 	def consulta2 = new Consulta (diagnostico:"2 probando consulta", tratamiento:"2 tratamientoprueba") 
   	 	// DEFINO DOS  TIPO PRACTICAS
   	 	def tipopractica1 = new TipoPractica(codigo:"231265", nombre:"practica1")
   	 	def tipopractica2 = new TipoPractica(codigo:"1", nombre:"practica2")

   	 	// defino 3 practicas
   	 	def practica1 = new Practica(resultado:"resultado1", tipopractica:tipopractica1) 
   	 	def practica2 = new Practica(resultado:"resultado2", tipopractica:tipopractica1)
   	 	def practica3 = new Practica(resultado:"resultado3", tipopractica:tipopractica1) 





   	 	paciente1.addToConsultas(consulta1)
   	 	paciente1.addToConsultas(consulta2)
   	 	paciente1.addToPracticas(practica1)



   	    //practica1.addToTipopracticas(tipopractica1)



   	 	paciente1.save(flush: true)   

   	 	tipopractica1.save(flush: true)
   	 	tipopractica2.save(flush: true)		
   	 	//practica1.save(flush: true)
   	 	//practica2.save(flush: true)
   	 	//practica3.save(flush: true)
 



   	 /*	Paciente.addToConsultas(diagnostico:"probando consulta2", tratamiento:"tratamientoprueba2") */




    def listapacientes= Paciente.list(order: "asc")
    def listaconsultas= Consulta.list(order:"asc")
    def listatipopractica = TipoPractica.list(order:"asc")
    def listapractica = Practica.list(order:"asc")
   // def listaConsultasPaciente = Consulta.findAll("from paciente as pa,tipopractica as pra, practica as pract  where pa.id = 1 and pra.codigo=231265 
    //											and pra.	")

    println listapacientes
    println listaconsultas
    println listatipopractica
    println listapractica
    println listaConsultasPaciente







    }
    def destroy = {
    }
}
