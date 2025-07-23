package Turnos;

import java.util.Random;

public class Turno_Trabajador {

	public static void main(String[] args) {


		//nombres para días (5) y turnos (3)
		String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        String[] turnos = {"Mañana", "Tarde", "Noche"};
        
        
      //-----------------------------------------------------------------------
        //armando matriz 5x3 (dias x turnos)
        int[][] turnosSemana = new int[5][3];
        Random azar = new Random();
        
        //llenando matriz con datos aleatorios 1 al 100
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                turnosSemana[i][j] = azar.nextInt(100) + 1;
            }
        }
        
        //-----------------------------------------------------------------------
        //matriz traspuesta 3x5
        int[][] matrizTraspuesta = new int[3][5];
        
        //llenando matriz traspuesta
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTraspuesta[j][i] = turnosSemana[i][j];
            }
        }
        
        //-----------------------------------------------------------------------
        
        //Mostrando ambas matrices con etiquetas - desde aca ambas
        
        //-----------------------------------------------------------------------
        System.out.println("📋 MATRIZ ORIGINAL (Días x Turnos):");
        mostrarMatrizConEtiquetas(turnosSemana, dias, turnos);

        System.out.println("\n🔄 MATRIZ TRASPUESTA (Turnos x Días):");
        mostrarMatrizConEtiquetas(matrizTraspuesta, turnos, dias); // se invierten días y turnos
	}
	//----- fin creando y mostrando matrices ------------------------------------
	
	//----- inicio imprimir en consola ------------------------------------------
	public static void mostrarMatrizConEtiquetas(int[][] matriz, String[] filas, String[] columnas) {
        System.out.printf("%12s", "");
        
        for (String col : columnas) {
            System.out.printf("%10s", col);
        }
        System.out.println();

        for (int i = 0; i < filas.length; i++) {
            System.out.printf("%12s", filas[i]);
            for (int j = 0; j < columnas.length; j++) {
                System.out.printf("%10d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
