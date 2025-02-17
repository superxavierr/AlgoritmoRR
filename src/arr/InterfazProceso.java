/*
ALUMNO: Cazares Godínez Brian Xavier
FECHA: 06 de Abril de 2022
DESCRIPCIÓN: Interfaz de programa del algoritmo de planificación round robin (RR)
 */
package arr;

import arr.AcercaDe;
import arr.InicioSesion;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JOptionPane;
import static java.lang.Integer.parseInt;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.table.DefaultTableModel;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author brianxavier
 */
public class InterfazProceso extends javax.swing.JFrame {

    int contador; //Contador del total de procesos que se van ingresando
    int nProceso; //Carga el número de procesos ejecutándose
    int rafaga = 0; //Carga la ráfaga en ejecución
    int quantum = 0; //Carga el quantum en ejecución
    int residuo = 0; //Carga el residuo en ejecución
    int tiempo = 0; //Carga el tiempo que se dura procesando
    int barra; //Carga el progreso de la Barra
    int cantidad; //Número de procesos terminados

    FondoPanel fondo = new FondoPanel();

    public InterfazProceso() {

        //EXPLICAR CÓDIGO (Insertar imagen de fondo)
        this.setContentPane(fondo);

        initComponents();

        //EXPLICAR CÓDIGO (Ajustar la imagen a un botón)
        btn1.setIcon(setIcono("/imagenes/Agregar.png", btn1));
        btn1.setPressedIcon(setIconoPresionado("/imagenes/Agregar.png", btn1, 5, 5));

        btn2.setIcon(setIcono("/imagenes/Iniciar.png", btn2));
        btn2.setPressedIcon(setIconoPresionado("/imagenes/Iniciar.png", btn2, 5, 5));

        btn3.setIcon(setIcono("/imagenes/Limpiar.png", btn3));
        btn3.setPressedIcon(setIconoPresionado("/imagenes/Limpiar.png", btn3, 5, 5));

        btn4.setIcon(setIcono("/imagenes/Acerca.png", btn4));
        btn4.setPressedIcon(setIconoPresionado("/imagenes/Acerca.png", btn4, 5, 5));

        btn5.setIcon(setIcono("/imagenes/Cerrar.png", btn5));
        btn5.setPressedIcon(setIconoPresionado("/imagenes/Cerrar.png", btn5, 5, 5));

        btn6.setIcon(setIcono("/imagenes/Ayuda.png", btn6));
        btn6.setPressedIcon(setIconoPresionado("/imagenes/Ayuda.png", btn6, 5, 5));

        btn7.setIcon(setIcono("/imagenes/Recargar.png", btn7));
        btn7.setPressedIcon(setIconoPresionado("/imagenes/Recargar.png", btn7, 5, 5));

        //EXPLICAR CÓDIGO (Quitar borde a un botón)
        transparenciaButton();

        //EXPLICAR CÓDIGO (colores de los valores de las tablas)
        tbl1.setBackground(Color.CYAN);
        tbl1.setForeground(Color.BLUE);
        tbl2.setBackground(Color.GREEN);
        tbl2.setForeground(Color.BLUE);
        Quantum.grabFocus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Quantum = new javax.swing.JTextField();
        Rafaga = new javax.swing.JTextField();
        btn3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        Estado = new javax.swing.JProgressBar();
        DPorcentaje = new javax.swing.JTextField();
        DProceso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        Tiempo = new javax.swing.JTextField();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btn7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Quantum de tiempo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 130, 140, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Rafaga");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 200, 60, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Cantidad del proceso");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 410, 160, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Tiempo del proceso");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(320, 410, 140, 17);

        btn1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn1KeyTyped(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(250, 170, 50, 50);

        btn2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(410, 170, 50, 50);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Historial de procesos");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(780, 360, 170, 19);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Agregar");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(250, 230, 50, 15);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Iniciar");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(420, 230, 41, 15);

        Quantum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantumActionPerformed(evt);
            }
        });
        Quantum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                QuantumKeyTyped(evt);
            }
        });
        getContentPane().add(Quantum);
        Quantum.setBounds(50, 160, 140, 24);

        Rafaga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RafagaKeyTyped(evt);
            }
        });
        getContentPane().add(Rafaga);
        Rafaga.setBounds(50, 230, 140, 24);

        btn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        btn3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn3KeyTyped(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(330, 170, 50, 50);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Proceso");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(580, 280, 50, 16);

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso #", "Rafaga", "Quantum", "Residuo", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tbl1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(570, 140, 600, 110);

        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso #", "Rafaga", "Quantum", "Tiempo final", "Estado"
            }
        ));
        jScrollPane2.setViewportView(tbl2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(570, 410, 600, 110);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setText("Lista de procesos");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(800, 90, 140, 19);
        getContentPane().add(Estado);
        Estado.setBounds(800, 280, 370, 20);

        DPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DPorcentajeActionPerformed(evt);
            }
        });
        getContentPane().add(DPorcentaje);
        DPorcentaje.setBounds(730, 274, 60, 30);
        getContentPane().add(DProceso);
        DProceso.setBounds(650, 274, 60, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Limpiar");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(330, 230, 50, 16);
        getContentPane().add(Cantidad);
        Cantidad.setBounds(100, 440, 150, 24);
        getContentPane().add(Tiempo);
        Tiempo.setBounds(320, 440, 140, 24);

        btn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(1220, 20, 40, 40);

        btn5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(1070, 20, 40, 40);

        btn6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(1170, 20, 40, 40);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 33)); // NOI18N
        jLabel11.setText("BIENVENIDO AL ALGORITMO DE PLANIFICACIÓN ROUND ROBIN");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 20, 1020, 39);

        btn7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(1120, 20, 40, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //CÓDIGO A EXPLICAR (Ajustar imagen a un botón)
    public Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    //CÓDIGO A EXPLICAR (Ajustar imagen a un botón)
    public Icon setIconoPresionado(String url, JButton boton, int ancho, int altura) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int width = boton.getWidth() - ancho;
        int height = boton.getHeight() - altura;
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        return icono;
    }

    //CÓDIGO A EXPLICAR (Quitar borde a un botón)
    public void transparenciaButton() {
        btn1.setOpaque(false);
        btn1.setContentAreaFilled(false);
        btn1.setBorderPainted(false);
        btn2.setOpaque(false);
        btn2.setContentAreaFilled(false);
        btn2.setBorderPainted(false);
        btn3.setOpaque(false);
        btn3.setContentAreaFilled(false);
        btn3.setBorderPainted(false);
        btn4.setOpaque(false);
        btn4.setContentAreaFilled(false);
        btn4.setBorderPainted(false);
        btn5.setOpaque(false);
        btn5.setContentAreaFilled(false);
        btn5.setBorderPainted(false);
        btn6.setOpaque(false);
        btn6.setContentAreaFilled(false);
        btn6.setBorderPainted(false);
        btn7.setOpaque(false);
        btn7.setContentAreaFilled(false);
        btn7.setBorderPainted(false);

    }

    //CÓDIGO LIMPIAR TEXTOS (Limpia los textos ya escritos en los paneles)
    private void LimpiarTextos() {
        Quantum.setText(null);
        Rafaga.setText(null);
        Cantidad.setText(null);
        Tiempo.setText(null);
        DProceso.setText(null);
        DPorcentaje.setText(null);
    }

    //CÓDIGO INSERTAR IMAGEN DE FONDO (Inserta una imagen de fondo)
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/Naranja.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    private class Pila implements Runnable { //EXPLICAR CÓDIGO (Objeto de tipo pila con extension ejectubale)

        @Override
        public void run() {
            int estado = 1; //Estado de while que indica si se puede seguir o no
            int i = 0; // contador de while

            while (estado != 0) {
                while (i < contador) { //Recorrer las filas
                    Cargar(i);
                    if (residuo != 0 && residuo > quantum) { //Ejecutando Procesos
                        for (int c = 1; c <= quantum; c++) {
                            tbl1.setValueAt("Procesando", i, 4);
                            residuo--;
                            Barra(rafaga, residuo);
                            Evaluar();
                            tbl1.setValueAt(String.valueOf(residuo), i, 3);
                            tiempo++;
                            Suspender();
                        }
                        tbl1.setValueAt("Espera", i, 4);
                        if (residuo == 0) {
                            tbl1.setValueAt("Terminado", i, 4);
                            Evaluar();
                            Informe(i);
                            Borrar(i);
                            Estado.setValue(0);
                        }
                    } else {
                        if (residuo > 0 && quantum != 0) {
                            while (residuo > 0) {
                                tbl1.setValueAt("Procesando", i, 4);
                                residuo--;
                                Barra(rafaga, residuo);
                                Evaluar();
                                tbl1.setValueAt(String.valueOf(residuo), i, 3);
                                tiempo++;
                                Suspender();
                            }
                            tbl1.setValueAt("Espera", i, 4);
                            if (residuo == 0 && quantum != 0) {
                                tbl1.setValueAt("Terminado", i, 4);
                                Evaluar();
                                Informe(i);
                                Borrar(i);
                                Estado.setValue(0);
                            }
                        } else {
                            if (residuo == 0 && quantum != 0) {
                                tbl1.setValueAt("Terminado", i, 4);
                                Evaluar();
                                Informe(i);
                                Borrar(i);
                                Estado.setValue(0);
                            }
                        }
                    }
                    DProceso.setText(String.valueOf("")); //Borrar contenido
                    DPorcentaje.setText(String.valueOf(""));
                    i++;
                }
                i = 0;
                DProceso.setText(String.valueOf("")); //Borrar contenido
                DPorcentaje.setText(String.valueOf(""));

            }

        }
    }

    public void Suspender() {
        try {
            Thread.sleep(700); //Suspende sistema
        } catch (InterruptedException ex) {
            Logger.getLogger(InterfazProceso.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Cargar(int i) { //Carga los valores de la Tabla
        nProceso = (int) tbl1.getValueAt(i, 0);
        rafaga = parseInt((String) (tbl1.getValueAt(i, 1)));
        quantum = parseInt((String) (tbl1.getValueAt(i, 2)));
        residuo = parseInt((String) (tbl1.getValueAt(i, 3)));
        if (nProceso > 0) {
            DProceso.setText(String.valueOf(nProceso));
        }
    }

    //EXPLICAR CÓDIGO (Tabla de ingreso)
    public void Ingresar() {
        DefaultTableModel modelo = (DefaultTableModel) tbl1.getModel();
        contador++;
        Object[] miTabla = new Object[5];
        miTabla[0] = contador;
        miTabla[1] = Rafaga.getText();
        miTabla[2] = Quantum.getText();
        miTabla[3] = Rafaga.getText();
        miTabla[4] = "Listo";
        modelo.addRow(miTabla);
        tbl1.setModel(modelo);
        Rafaga.setText(null);
        Rafaga.grabFocus();

    }

    public void Informe(int c) {
        DefaultTableModel modelo2 = (DefaultTableModel) tbl2.getModel();

        Object[] miTabla = new Object[5];
        miTabla[0] = c + 1;
        miTabla[1] = rafaga;
        miTabla[2] = quantum;
        miTabla[3] = tiempo + " Segundos";
        miTabla[4] = "Terminado";
        modelo2.addRow(miTabla);
        tbl2.setModel(modelo2);

        cantidad++;
        Cantidad.setText(String.valueOf(cantidad + " Terminados"));
        Tiempo.setText(String.valueOf(tiempo + " Segundos"));
    }

    public void Borrar(int c) { //Elimina los registros de la tabla procesos
        tbl1.setValueAt(0, c, 0);
        tbl1.setValueAt("0", c, 1);
        tbl1.setValueAt("0", c, 2);
        tbl1.setValueAt("0", c, 3);
        tbl1.setValueAt("******", c, 4);
    }

    public void Barra(int rafaga, int residuo) { //Calcula porcentaje de la barra y su progreso
        int Rafaga = rafaga;
        int valor = 100 / rafaga;
        int porcentaje = 100 - (valor * residuo);
        barra = porcentaje;
        DPorcentaje.setText(String.valueOf(barra + "%"));
    }

    public void Evaluar() { //Muestra gráficamente la carga de la barra
        Estado.setValue(barra);
        Estado.repaint();
    }

    public void Iniciar() { //Inicia la secuencia de procesos
        jLabel2.setVisible(true);
        jLabel1.setVisible(true);
        Rafaga.setVisible(true);
        Quantum.setVisible(true);
        btn1.setVisible(true);
        btn2.setVisible(true);
    }

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if ((Integer.parseInt(Rafaga.getText())) <= 100) {
            Ingresar();
            Quantum.setEditable(false);
        } else {
            JOptionPane.showMessageDialog(null, "Las rafagas no pueden ser mayores de 100");
            Rafaga.setText(null);
            Rafaga.grabFocus();
        }

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn1KeyTyped

    }//GEN-LAST:event_btn1KeyTyped

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        new Thread(new Pila()).start(); //Crea una nueva pila
        Iniciar();
    }//GEN-LAST:event_btn2ActionPerformed

    private void QuantumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantumActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        LimpiarTextos();
    }//GEN-LAST:event_btn3ActionPerformed

    private void DPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DPorcentajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DPorcentajeActionPerformed

    private void btn3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btn3KeyTyped

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        AcercaDe regresar = new AcercaDe();
        regresar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        InicioSesion regresar = new InicioSesion();
        regresar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        Instrucciones regresar = new Instrucciones();
        regresar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        InterfazProceso regresar = new InterfazProceso();
        regresar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn7ActionPerformed

    private void QuantumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantumKeyTyped
        if (evt.getKeyChar() >= 32 && evt.getKeyChar() <= 47
                || evt.getKeyChar() >= 58 && evt.getKeyChar() <= 255) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "No se permiten letras ni caracteres especiales");
        }
    }//GEN-LAST:event_QuantumKeyTyped

    private void RafagaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RafagaKeyTyped
        if (evt.getKeyChar() >= 32 && evt.getKeyChar() <= 47
                || evt.getKeyChar() >= 58 && evt.getKeyChar() <= 255) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "No se permiten letras ni caracteres especiales");
        }
    }//GEN-LAST:event_RafagaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazProceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazProceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazProceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazProceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazProceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField DPorcentaje;
    private javax.swing.JTextField DProceso;
    private javax.swing.JProgressBar Estado;
    private javax.swing.JTextField Quantum;
    private javax.swing.JTextField Rafaga;
    private javax.swing.JTextField Tiempo;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl1;
    private javax.swing.JTable tbl2;
    // End of variables declaration//GEN-END:variables
}
