package clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RegresionLineal {

    public static void main(String[] args) {

        // X es la variable independiente
        ArrayList<Double> X = new ArrayList<>();
        X.add(1.0);
        X.add(1.2);
        X.add(1.3);
        X.add(1.4);
        X.add(1.6);
        X.add(1.7);
        X.add(1.8);
        X.add(2.0);
        X.add(2.2);
        X.add(2.3);
        X.add(2.4);
        X.add(2.6);
        X.add(2.8);
        X.add(3.0);
        X.add(3.2);
        X.add(3.4);
        X.add(3.6);
        X.add(3.8);
        X.add(4.0);
        X.add(4.2);
        X.add(4.4);
        X.add(4.5);
        X.add(4.6);
        X.add(4.8);
        X.add(5.0);
        X.add(5.2);
        X.add(5.4);
        X.add(5.6);
        X.add(5.8);
        X.add(6.0);

        // Y es la variable dependiente
        ArrayList<Double> Y = new ArrayList<>();
        Y.add(20.0);
        Y.add(24.0);
        Y.add(18.0);
        Y.add(27.0);
        Y.add(23.0);
        Y.add(25.0);
        Y.add(21.0);
        Y.add(29.0);
        Y.add(26.0);
        Y.add(34.0);
        Y.add(31.0);
        Y.add(27.0);
        Y.add(27.0);
        Y.add(30.0);
        Y.add(36.0);
        Y.add(32.0);
        Y.add(30.0);
        Y.add(40.0);
        Y.add(43.0);
        Y.add(35.0);
        Y.add(33.0);
        Y.add(39.0);
        Y.add(46.0);
        Y.add(48.0);
        Y.add(39.0);
        Y.add(41.0);
        Y.add(48.0);
        Y.add(43.0);
        Y.add(48.0);
        Y.add(49.0);

        // N = es el numero de datos que hay en Y
        Double N = Double.parseDouble(""+Y.size());

        // Inicializamos las siguintes variables     
        Double sumX2 = 0.0;
        Double sumY2 = 0.0;
        Double sumXY = 0.0;
        Double SumX = 0.0;
        Double SumY = 0.0;
        Double ProX;
        Double ProY;

        for (int i = 0; i < N; i++) {
            // Sumatorias XY, X2, Y2 
            // Media X, Y
            sumX2 = sumX2 + Math.pow(X.get(i),2);
            sumY2 = sumY2 + Math.pow(Y.get(i),2);
            sumXY = sumXY + X.get(i)*Y.get(i);
            SumX = (SumX + X.get(i));
            SumY = (SumY + Y.get(i)); 
        }
            ProX=SumX/N;
            ProY=SumY/N;
            
        // Calcular Pendiente
        //     Z(x).(y) - n.(x°).(y°)
        // b = -------------------------
        //     Z(x)^2 - n.(x°)^2	

        Double b; 
        b = ((sumXY) - (N *(ProX * ProY))) / (sumX2 - N * (Math.pow(ProX,2)));
 
        // Calcular Ordenada en el origen
        // a = y° - b.(x°)
        
        Double a;
        a = ProY - b * ProX;

        // Calcular Coeficiente de relación
        //               Z(x).(y) - n.(x°).(y°)
        // r = ----------------------------------------
        //     ________________________________________
        //    √(Z(x)^2 - n.(x°)^2).(Z(y)^2 - n.(y°)^2)

        Double n;	// numerator
        Double d;	// denominator
        Double r;	// Coeficiente de relación
        n = (sumXY) - (N *(ProX * ProY));
        d = (sumX2 - N * (Math.pow(ProX,2))) * (sumY2 - N * (Math.pow(ProY,2)));
        r = (n) / Math.sqrt(d);
        
        // Error estandar
        //     (Zy2 - a*n -b*Zxy) -->numerador           
        // d = ------------------                          numerador
        //         (n-2)          -->denominador    e = √ -------------
        //                                                 denominador
        
        Double e;
        Double div;
        
        div = (sumY2-(a*N)-(b*sumXY)) / (N - 2);
        e = Math.sqrt(div);

        // Resultados
        System.out.println("Número de datos: " + N);
        System.out.println("Ecuación de la recta de mejor ajuste");
        System.out.println("y = " + b + "x + " + a);
        System.out.println("Coeficiente de relación: " + r);
        System.out.println("Error estandar: " + e);
        
        //Formula lineal
        double y;
        double x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor independiente"));
        y = b * x + a;
        System.out.println("El % de valor dependiente recomendado es: " + y);
    }

}
