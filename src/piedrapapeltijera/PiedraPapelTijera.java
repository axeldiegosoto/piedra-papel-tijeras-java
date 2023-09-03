package piedrapapeltijera;

import java.util.Scanner;

public class PiedraPapelTijera {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String jugador, bot;
        int aleatorio;
        boolean bandera = true;
        
        do {
            if(!bandera){
                System.out.println("Elija una opción válida");
            }
            
            System.out.println("Elija una opción [piedra, papel o tijeras]:");
            jugador = tec.nextLine();
            
            if(jugador.equals("piedra") || jugador.equals("papel") || jugador.equals("tijeras")){
               bandera = true; 
            }else {
                bandera = false;
            }
        }while(!bandera);
        
        aleatorio = (int) (Math.random() * 3 + 1);
        
        if(aleatorio == 1){
            bot = "piedra";
        }else if(aleatorio == 2){
            bot = "papel";
        }else {
            bot = "tijeras";
        }
        
        System.out.println("Tu: " + jugador + "\nBot: " + bot);
        
        if(jugador.equals("piedra")){
            
            if(bot.equals("tijeras")){
                System.out.println("Ganaste!!");
            }
            
            else if(bot.equals("papel")){
                System.out.println("Perdiste.");
            }
            
            else {
                System.out.println("Empate!");
            }
            
        }else if(jugador.equals("papel")){
            
            if(bot.equals("tijeras")){
                System.out.println("Perdiste.");
            }
            
            else if(bot.equals("papel")){
                System.out.println("Empate!");
            }
            
            else {
                System.out.println("Ganaste!!");
            }
            
        }else {
            
            if(bot.equals("tijeras")){
                System.out.println("Empate!");
            }
            
            else if(bot.equals("papel")){
                System.out.println("Ganaste!!");
            }
            
            else {
                System.out.println("Perdiste.");
            }
            
        }
    }
    
}
