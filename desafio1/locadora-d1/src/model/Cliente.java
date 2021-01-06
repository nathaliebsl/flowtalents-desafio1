package model;

import java.util.ArrayList;
import java.lang.Exception;

public class Cliente {
	
	private String celular;
	private ArrayList<String> classeCnh = new ArrayList<String>();
	private ArrayList<Locacao> locacoes = new ArrayList<Locacao>();
	
	
	public Cliente(String celular, String cnh) {
		
//		if(!Utilities.validaCelular(celular)) {
//			throw new IllegalArgumentException("Celular deve ser válido - Formato: DDNNNNNNNNN");
//		} else {
//			this.celular = celular;
//		}
//		
//		if(!Utilities.validaCnh(cnh)) {
//			throw new IllegalArgumentException("Classe deve ser válida - A, B, C ou D");
//		}else {
//			this.classeCnh.add(cnh);
//			}
	}
	
	@Override
	public String toString() {
		return "Cliente [WhatsApp=" + celular + ", Classe da CNH=" + classeCnh + ", Locações= " + locacoes.size() + "]";
	}
	
	public String getCelular() {
		return celular;
	}
	
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public ArrayList<String> getCnh() {
		return classeCnh;
	}
	
	public void addCnh(String cnh) {
		if(!Utilities.validaCnh(String.valueOf(cnh))) {
			throw new IllegalArgumentException("Classe deve ser válida - A, B, C ou D");
		} 
		if(Utilities.validaCnh(String.valueOf(cnh)) && (!classeCnh.contains(cnh))) {	
			classeCnh.add(cnh);
		} 

	}

	
	public ArrayList<Locacao> getLocacoes() {
		return locacoes;
	}
	
	public void setLocacoes(ArrayList<Locacao> loc) {
		this.locacoes = loc;
	}
	
	public void addLocacao(Locacao loc){
		try{
			locacoes.add(loc);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
	
//	public Locacao localizarLocacao(int id) { //throws ModelException
//		
//		for(Locacao locacao: locacoes){
//			if(locacao.getId() == id)
//				return locacao;
//		} throw (err)
//		
//		//throw new ModelException("Aluguel não cadastrado!");
//	}


}
