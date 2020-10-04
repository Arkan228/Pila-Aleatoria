package abecedario.aleatorio;

import java.util.Scanner;

public class AbecedarioAleatorio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0, tope = 0, comparador = 0, tamaño = 26, cautomatico = 0;;
        char pila[] = new char[tamaño], dato;
        do {
            System.out.println("\nSeleccione una opción:\n");
            System.out.println("1.- Agregar dato...");
            System.out.println("2.- Llenar Pila automaticamente...");
            System.out.println("3.- Mostrar Pila...");
            System.out.println("4.- Elimiar ultimo dato...");
            System.out.println("5.- Vaciar Pila...");
            System.out.println("6.- Ordena Pila...");
            System.out.println("7.- Salir...");
            op = sc.nextInt();
            switch (op) {
                case 1: {
                    if (tope == tamaño) {
                        System.out.println("\nLa pilla esta llena...");
                    } else {
                        System.out.println("\nInserte dato:");
                        dato = sc.next().charAt(0);
                        for (int x = 0; x <= tope; x++) {
                            comparador = 0;
                            if (dato == pila[x]) {
                                System.out.println("Ese dato ya se escribio");
                                x = tope + 1;
                                comparador = 1;
                            }
                        }
                        if (comparador == 0) {
                            pila[tope] = dato;
                            tope++;
                            System.out.println("Dato agregado...");
                        }
                    }
                }
                break;
                case 2:
                    if (tope == tamaño) {
                        System.out.println("\nLa Pila esta llena...");
                    } else {
                        System.out.println("\nPila llenada automaticamente");
                        do {
                            dato = (char) ((char) (Math.random() * 26) + 65);
                            for (int x = 0; x <= tope; x++) {
                                comparador = 0;
                                if (dato == pila[x]) {
                                    x = tamaño + 1;
                                    comparador = 1;
                                }
                            }
                            if (comparador == 0) {
                                pila[tope] = dato;
                                tope++;
                            }
                            if (tope == tamaño) {
                                cautomatico = 1;
                            }
                        } while (cautomatico == 0);
                    }
                    break;
                case 3: {
                    if (tope == 0) {
                        System.out.println("\nLa Pila esta vacia...");
                    } else {
                        System.out.println("\nMostrando pila...\n");
                        for (int x = tope - 1; x >= 0; x--) {
                            System.out.print(pila[x] + " ");
                        }
                        System.out.print("\n");
                    }
                }
                break;
                case 4: {
                    if (tope == 0) {
                        System.out.println("\nNingun dato que eliminar...");
                    } else {
                        tope--;
                        System.out.println("\nUltimo dato eliminado...");
                    }
                }
                break;
                case 5: {
                    if (tope == 0) {
                        System.out.println("\nLa Pila ya esta vacia...");
                    } else {
                        System.out.println("\nTodos los datos eliminados...");
                        tope = 0;
                    }
                }
                break;
                case 6: {
                    if (tope == 0) {
                        System.out.println("\nNingun dato que orenar...");
                    } else {
                        System.out.println("\nPila ordenada...");
                        int aux;
                        for (int x = 0; x < tope; x++) {
                            for (int y = 0; y < tope - 1; y++) {
                                if (pila[y] < pila[y + 1]) {
                                    aux = pila[y];
                                    pila[y] = pila[y + 1];
                                    pila[y + 1] = (char) aux;
                                }
                            }
                        }
                    }
                }
                break;
            }

        } while (op
                != 7);
    }

}
