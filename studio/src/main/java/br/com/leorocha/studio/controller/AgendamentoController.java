package br.com.leorocha.studio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.leorocha.studio.entity.Agendamento;

@Controller
@RequestMapping(path="agendamento")
public class AgendamentoController {

	@RequestMapping(method=RequestMethod.POST,path="salvar")
	public void salvar(Agendamento agendamento) {
		
	}
}
