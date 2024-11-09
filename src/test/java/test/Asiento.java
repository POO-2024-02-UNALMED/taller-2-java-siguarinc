package test;
public class Asiento {
    String color;
    int precio;
    int registro;
    
    void cambiarColor(String col){
        switch(col){
            case "rojo":
                color=col;
                break;
            case "verde":
                color=col;
                break;
            case "amarillo":
                color=col;
                break;
            case "negro":
                color=col;
                break;
            case "blanco":
                color=col;
                break;
            default:
                break;
        }
    }
}

