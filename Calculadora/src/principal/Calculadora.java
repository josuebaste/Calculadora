package principal;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.SimpleFormatter;

import menu.Menu;
import operaciones.Operaciones;
/**
 * Clase del programa.
 */
public class Calculadora{
	/**
	 * Clase Main. 
	 */
	private static final Logger Logger = Logger.getLogger(Calculadora.class.getName());
	static {
		try {
			LogManager.getLogManager().reset();
			FileHandler filehandler=new FileHandler("operaciones.log", true);
			filehandler.setFormatter(new SimpleFormatter());
			Logger.addHandler(consoleHandler);
			Logger.addHandler(filehandler);
		} catch (IOException e) {
			System.err.println("Fallo en la operacion.");
		}
	}
    public static void main(String[] args) {
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
        
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
        
        do{
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();
            try {
            	if (operacion.equalsIgnoreCase("+")){
                    resultado = operaciones.sumar(operandos[0], operandos[1]);
                    System.out.println ("Resultado: " + resultado);
                    logManager.readConfiguration(new FileInputStream("./logs/operaciones.log"));
                } else if (operacion.equalsIgnoreCase("-")){
                    resultado = operaciones.restar(operandos[0], operandos[1]);
                    System.out.println ("Resultado: " + resultado);
                    
                } else if (operacion.equalsIgnoreCase("*")){
                    resultado = operaciones.multiplicar(operandos[0], operandos[1]);
                    System.out.println ("Resultado: " + resultado);
                    
                } else if (operacion.equalsIgnoreCase("/")){
                    resultado = operaciones.dividir(operandos[0], operandos[1]);
                    System.out.println ("Resultado: " + resultado);
                    
                } else if (operacion.equalsIgnoreCase("%")){
                    resultado = operaciones.resto(operandos[0], operandos[1]);
                    System.out.println ("Resultado: " + resultado);
                    
                } else {
                    System.out.println ("Operaci�n no v�lida");
                }
			} catch (Exception e) {
				Logger.log(Level.SEVERE, "error",e);
			}
            
            
        }   while (menu.repetir());
    }
}