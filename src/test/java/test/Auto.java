package test;
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;
    
    int cantidadAsientos(){
        int conttas=0;
        for (Object as:asientos){
            if (as instanceof Asiento ){
                ++conttas;
            }
        }
        return conttas;
    }
    String verificarIntegridad(){
        for (Asiento as:asientos){
            if ((as instanceof Asiento)&&((as.registro!=motor.registro)|(motor.registro!=registro))){
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }

}
