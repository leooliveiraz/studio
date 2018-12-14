package br.com.leorocha.studio;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="sessao")
public class SessaoController {
	

	@RequestMapping(path="validaToken", method=RequestMethod.GET)
	public String validaToken() {
		return "{\"status\":\"true\"}";
	}
}
