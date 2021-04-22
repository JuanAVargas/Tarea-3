public class MatematicoMejorado{
    public String indicarNumeros(double num1, double num2, double num3){
        double Mayor = 0;
        double Medio = 0;
        double Menor = 0;

        if(num1 > num2 && num1 > num3){
            Mayor = num1;
            if(num2 > num3){
                Medio = num2;
                Menor = num3;
            }
            if(num3 > num2){
                Medio = num3;
                Menor = num2;
            }
        }
        if(num2 > num1 && num2 > num3){
            Mayor = num2;
            if(num1 > num3){
                Medio = num1;
                Menor = num3;
            }
            if(num3 > num1){
                Medio = num3;
                Menor = num1;
            }
        }
        if(num3 > num1 && num3 > num2){
            Mayor = num3;
            if(num1 > num2){
                Medio = num1;
                Menor = num2;
            }
            if(num2 > num1){
                Medio = num2;
                Menor = num1;
            }
        }
        return "El numero mayor es:" + Mayor         + "El numero del medio es:" + Medio             + "El numero menor es:" + Menor;
    }
    public double calcularAreaCuadrado(double base, double altura){
       double area = base * altura;
       return area;
    }
    public double calcularDistanciaPuntos(Punto punt1, Punto punt2){
        double distancia = Math.sqrt(Math.pow((punt2.getCoordenadaX() - punt1.getCoordenadaX()), 2) + Math.pow((punt2.getCoordenadaY() - punt1.getCoordenadaY()), 2));
        return distancia;
    }
    public String ubicarCuadrante(Punto p){
        String conclusion= null;
        if(p.getCoordenadaX() > 0 && p.getCoordenadaY() > 0){
            conclusion = "El punto esta en el 1er cuadrante";
        }
        if(p.getCoordenadaX() < 0 && p.getCoordenadaY() > 0){
            conclusion = "El punto esta en el 2do cuadrante";
        }
        if(p.getCoordenadaX() < 0 && p.getCoordenadaY() < 0){
            conclusion = "El punto esta en el 3er cuadrante";
        }
        if(p.getCoordenadaX() > 0 && p.getCoordenadaY() < 0){
            conclusion = "El punto esta en el 4to cuadrante";
        }
        return conclusion;
    }
    public String resolverEcuacion(double coeficienteA, double coeficienteB, double coeficienteC){
        double resp1 = (-(coeficienteB) + Math.sqrt(Math.pow(coeficienteB, 2) - 4 * coeficienteA * coeficienteC)) / 2 * coeficienteA;
        double resp2 = (-(coeficienteB) - Math.sqrt(Math.pow(coeficienteB, 2) - 4 * coeficienteA * coeficienteC)) / 2 * coeficienteA;
        
        return "Las respuestas son:" + resp1 + "y" + resp2;
    }
    public String ecuacionDeRecta(Punto punt1, Punto punt2){
        double m = (punt2.getCoordenadaY() - punt1.getCoordenadaY())/(punt2.getCoordenadaX() - punt1.getCoordenadaX());
        return "La ecuacion de la recta es:(y - " + punt1.getCoordenadaY() + ") = " + m + "(x - " + punt1.getCoordenadaX() + ")";
    }
    public double encontrarCatetoAdyacente(double h, double co){
        double hipotenusa = h;
        double catetoOpuesto = co;
        double ca = Math.sqrt(Math.pow(h, 2) - Math.pow(co, 2));
        return ca;
    }
    public double encontrarCatetoOpuesto(double h, double ca){
        double hipotenusa = h;
        double catetiAdyacente = ca;
        double co = Math.sqrt(Math.pow(h, 2) - Math.pow(ca, 2));
        return co;
    }
}

