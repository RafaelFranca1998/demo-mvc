package com.mballem.curso.boot.web.error;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Component
public class MyErrorView implements ErrorViewResolver{

	@Override
	public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> map) {
		
		ModelAndView model =  new  ModelAndView("/error");
		model.addObject("status", status.value());
		switch (status.value()) {
		case 404:
			model.addObject("error", "página não encontrada." );
			model.addObject("message", "A url para a página'"+map.get("path")+"'não existe");
			break;
		case 500:
			model.addObject("error", "Ocorreu um erro Interno no servidor." );
			model.addObject("message", "Ocorreu um erro Inesperado, tente mais tarde");
			break;
		default:
			model.addObject("error", map.get("error") );
			model.addObject("message","Ocorreu um erro Inesperado, tente mais tarde");
			break;
		}
		return model;
	}

}
