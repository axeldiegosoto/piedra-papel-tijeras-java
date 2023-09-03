# Tutorial para hacer el programa

### Preparar el programa

Para este programa estaremos utilizando el IDE llamado netbeans y crearemos un nuevo proyecto java llamado **PiedraPapelYTijeras**.

![Desktop View](/assets/img/posts/2023-08-27-piedra-papel-tijeras-java/screenshot_006.png){: width="972" height="589"}
![Desktop View](/assets/img/posts/2023-08-27-piedra-papel-tijeras-java/screenshot_007.png){: width="972" height="589"}

Una vez teniendo un proyecto nuevo y limpio podemos empezar con lo básico, que sería definir nuestras variables del programa.

Como primer caso podríamos crear dos variables que serían el jugador y el bot, ambas variables serán objetos de tipo String ya que alamacenarán las opciones `"piedra"`, `"papel"` y `"tijeras"`.

```java
package piedrapapelytijeras;

public class PiedraPapelYTijeras {

    public static void main(String[] args) {
        // Nuestras variables
        String jugador, bot;
    }
    
}
```

Para darles valor a nuestras variables usaremos el modulo `Scanner` para los datos del jugador que serán ingresador por el usuario.

```java
package piedrapapelytijeras;

// Importamos el modulo
import java.util.Scanner;

public class PiedraPapelYTijeras {

    public static void main(String[] args) {
        // Y agregamos la variable de esta forma
        Scanner tec = new Scanner(System.in);
        String jugador, bot;
    }
    
}
```

### Ingresar datos del jugador

Si bien podemos tan solo pedir los datos del jugador de esta forma:

```java
public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    String jugador, bot;
    
    // Almacenamos los datos mediante el Scanner
    System.out.println("Elija una opción [piedra, papel o tijeras]:");
    jugador = tec.nextLine();
}
```

De esta forma así nada más, los datos se guardarían sin problemas, el único problema es que podemos ingresar cualquier dato que sea un `String`, y nosotros tan solo estamos buscando que el jugador ingrese los datos `"piedra"`, `"papel"` y `"tijeras"`. Entonces tendríamos que validar los datos.

### Validar los datos

Para validar los datos necesitaremos un bucle `do while` y dentro de este bucle estarán las instrucciones para almacenar los datos del jugador, también necesitaremos definir una variable de tipo `boolean` que se llamará `bandera` para poder decirle al programa si los datos son validos, de esta forma:

| Boolean | `true`   | `false`  |
|:--------|---------|--------|
|`bandera`    | Los datos son válidos| Los datos son inválidos|

```java
public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    String jugador, bot;
    // Agregamos 'bandera' a nuestras variables
    // (Importante inicializarla a true)
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
}
```

### Asignar valor aleatorio al Bot

Para asignar el valor de forma aleatoria necesitaremos la clase `Math`(que es la librería matemática de Java) para tener un número aleatoria que va del 1 al 3:

| 1 | 2 | 3 |
|:---:|:---:|:---:|
|`"piedra"`|`"papel"`|`"tijeras"`|

El código quedaría de la siguiente forma:

```java
public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    String jugador, bot;
    boolean bandera = true;
    // Añadimos 'aleatorio' a nuestras variables
    int aleatorio;

    // Código restante    
    [...]....

    // El 3 es el número máximo de valores posibles
    // Y el 1 es el mínimo
    aleatorio = (int) (Math.random() * 3 + 1);
        
    if(aleatorio == 1){
        bot = "piedra";
    }else if(aleatorio == 2){
        bot = "papel";
    }else {
        bot = "tijeras";
    }
}
```

### Definir el resultado

Una vez que ya tenemos ambos datos, el jugador y el bot, solo queda definir una serie de sentencias `if` que definan cada caso posible que exista entre los resultados, de esta forma:

```java
public static void main(String[] args) {
    // Código restante    
    [...]....

    // Mostramos ambos datos
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
```

### Código final

Puedes mirar el código final en este [enlace](https://github.com/axeldiegosoto/piedra-papel-tijeras-java/blob/main/src/piedrapapeltijera/PiedraPapelTijera.java).
