package test;
public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    void cambiarRegistro(int reg){
        registro=reg;
    }
    void asignarTipo(String t){
        switch(t){
            case "gasolina":
                tipo=t;
                break;
            case "electrico":
                tipo=t;
                break;
            default:
                break;
        }
    }
}

