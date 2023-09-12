package com.project.consorcio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.consorcio.services.MedicamentoServices;
import com.project.consorcio.services.TipoMedicamentoServices;

//Controller, permite que la vista envie un Request y pueda acceder
//a las direntes direcciones URL's
@Controller
//RequestMapping, permite crear direcciones URL para que el cliente acceda
@RequestMapping("/medicamento")
public class MedicamentoController {
	@Autowired
	private MedicamentoServices servicioMed;
	
	@Autowired
	private TipoMedicamentoServices servicioTipo;
	
	
	//crear dirección URL para mostrar la página "medicamento.html"
	@RequestMapping("/lista")
	public String index(Model model){
		//crear atributo
		model.addAttribute("medicamentos",servicioMed.listarTodos());
		model.addAttribute("tipos",servicioTipo.listarTodos());
		return "medicamento";
	}
	
}
