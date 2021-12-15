// 13 de Diciembre 2021
package principal;

public class Principal {
     public static void main(String[] args) {
        try {
           
            int i,resp,n,b = 0;
            String nombre = null;
            int m = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el Tamaño de la Tabla"));
            Hash[] h = new Hash[m];
            for (i = 0; i < m; i++) {
                h[i] = new Hash();
                h[i].estado = 0;
            }
            do {
                resp = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("***MENU PRINCIPAL***\n"
                        + "Insertar N.Control(1)\n Buscar(2)\n Eliminar(3)\n Salir(4)"));
                switch (resp) {
                    case 1:
                        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el Numero de Control:"));
                        nombre = javax.swing.JOptionPane.showInputDialog("Ingrese el Nombre del Alumno:");
                        b = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el Promedio:"));
                        Hash.insertaHash(h, m,n);
                        break;
                    case 2:
                        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el Número de Control:"));
                        i = Hash.buscaHash(h, m, n);
                        if (i == -1) {
                            javax.swing.JOptionPane.showMessageDialog(null, "Numero NO Encontrado");
                        } else {
                            javax.swing.JOptionPane.showMessageDialog(null, "Número de Control: "+n+"\n"
                                    +"Nombre Completo: "+nombre+"\n"+"Promedio: "+b);
                        }
                        break;
                    case 3:
                        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el Número de Control a Eliminar:"));
                        i = Hash.eliminaHash(h, m, n);
                        if (i == -1) {
                            javax.swing.JOptionPane.showMessageDialog(null, "Número no encontrado");
                        } else {
                            javax.swing.JOptionPane.showMessageDialog(null, "Número de Control Eliminado");
                        }
                        break;
                    case 4:
                        System.exit(0);
                    default:
                }
            } while (resp != 4);
        } catch (NumberFormatException nfe) {
            javax.swing.JOptionPane.showMessageDialog(null, "Está Saliendo del Programa");
        } catch (OutOfMemoryError ome) {
            javax.swing.JOptionPane.showMessageDialog(null, "No Hay Espacio");
        }
    }
}
