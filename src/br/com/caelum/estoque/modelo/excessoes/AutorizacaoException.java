package br.com.caelum.estoque.modelo.excessoes;

import java.util.Date;

import javax.xml.ws.WebFault;

import br.com.caelum.estoque.modelo.xml.InfoFault;



@WebFault(name="AutorizacaoFault")
public class AutorizacaoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public AutorizacaoException(String msg){
		super(msg);
	}
	
	public InfoFault getFaultInfo(){
		return new InfoFault("Token invalido" , new Date());
	}
}
