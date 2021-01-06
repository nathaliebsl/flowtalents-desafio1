package model;

//import java.text.SimpleDateFormat;
//import java.util.Date;

public class Utilities {

	public static boolean validaCnh(String cnh) {
		if(cnh.matches("A") || cnh.matches("B") || cnh.matches("C") || cnh.matches("D") || String.valueOf(cnh).matches("^null|$")) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static boolean validaCelular(String celular) {
		if(celular.matches("\\d{11}") || String.valueOf(celular).matches("^null|$")) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static boolean validarPlaca(String placa){
		
		if (placa.matches("[A-Za-z]{3}\\d{4}")){
			return true;
		}
		
		return false;
	}
	
//	public static String formataData(Date data){
//		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		String dataFormatada = fmt.format(data);
//		
//		return dataFormatada;
//	}
//	
//	public static String formataDataDia(Date data){
//		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
//		String dataFormatada = fmt.format(data);
//		
//		return dataFormatada;
//	}
	
}
