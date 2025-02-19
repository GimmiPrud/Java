package com.spring.universita.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.universita.DTO.ProfessoreDTO;
import com.spring.universita.Service.ProfessoriService;

@RestController
@RequestMapping(path = "/professori")
public class professori_controller {
	
		
		private ProfessoriService service = new ProfessoriService();
		
		@GetMapping(path = "/registraProf", consumes = "application/json")
		public boolean registra(@RequestBody ProfessoreDTO pdto) {
			
			return service.registra(pdto);
		}
		
		@GetMapping(path = "/cerca/{id}", produces = "application/Json")
		public ProfessoreDTO cercaPerId(@PathVariable int id) {
			
			return service.cercaPerId(id);
		}
		
		@GetMapping(path = "/mostraProf", produces= "application/Json" )
		public List<ProfessoreDTO> mostraProf(){
			return service.mostraTuttiProf();
		}
		
		@GetMapping(path = "/cancella/{id}", produces = "application/Json")
		public ProfessoreDTO cancellaProf(@PathVariable int id) {
			return service.cancella(id);
		}
		
		@GetMapping(path = "/modificaMateria/{id}", produces = "application/Json")
		public ProfessoreDTO modificaMateria(@PathVariable int id, String materia) {
			return service.updateMateria(id, materia);
		}
}
