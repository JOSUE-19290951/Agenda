/*
   Programa Realizado por:
   Garcia Briseno Jose Carlos
   Torres Santos Josue Daniel
*/
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.*;
import javax.swing.WindowConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.util.*;

public class Inicio extends JFrame {
   // Declaracion de Variables Principales                   
   private JLabel Mensaje;
   private JLabel MensajeC;
   private JButton btnBuscar;
   private JButton btnEliminar;
   private JButton btnGuardar;
   private JButton btnModificar;
   private JButton btnMostar;
   private JScrollPane jScrollPane1;
   private JTable jTable1;
   private JLabel lblApellidos;
   private JLabel lblCorreo;
   private JLabel lblBirthDay;
   private JLabel lblNombres;
   private JTextField txtApellidos;
   private JTextField txtCorreo;
   private JTextField txtBirthDay;
   private JTextField txtNombres;
   private JTextField txtBuscar;
   // Termina Declaracion de variables Principales  
   String Nombres = "";
   String Apellidos = "";
   String Correo = "";
   String BirthDay = "";
   ArrayList  Agenda = new ArrayList();
   ArrayList <Contactos> Busqueda = new ArrayList<Contactos>();
 
   
   public Inicio() {
      initComponents();
      CrearModelo();       
   }

   @SuppressWarnings("unchecked")
   private void initComponents() {
   
      Mensaje = new JLabel();
      lblNombres = new JLabel();
      lblApellidos = new JLabel();
      lblBirthDay = new JLabel();
      lblCorreo = new JLabel();
      txtNombres = new JTextField();
      txtApellidos = new JTextField();
      txtCorreo = new JTextField();
      Mensaje = new JLabel();
      btnGuardar = new JButton();
      jScrollPane1 = new JScrollPane();
      jTable1 = new JTable();
      btnMostar = new JButton();
      btnBuscar = new JButton();
      btnEliminar = new JButton();
      btnModificar = new JButton();
      txtBuscar = new JTextField();
      
      setBackground(new java.awt.Color(51, 51, 255));
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         
          
      this.setLayout(null);
      
      Mensaje.setFont(new Font("Lucida Grande", 1, 13));
      Mensaje.setText("Agenda De Contactos");
      Mensaje.setBounds(80,15,200,30);
      this.add(Mensaje);
   
      
      lblNombres.setText("Nombre(s)");
      lblNombres.setBounds(30,50,200,40);
      lblNombres.setForeground(Color.BLUE);
      this.add(lblNombres);
      
      txtNombres = new JTextField();
      txtNombres.setToolTipText("Ingrese el Nombre");
      txtNombres.setBounds(120,60,130,20);
      this.add(txtNombres);
      
      lblApellidos.setText("Apellido(s)");
      lblApellidos.setBounds(30,90,200,40);
      lblApellidos.setForeground(Color.BLUE);
      this.add(lblApellidos);
      
      txtApellidos = new JTextField();
      txtApellidos.setToolTipText("Ingrese los Apellidos");
      txtApellidos.setBounds(120,100,130,20);
      this.add(txtApellidos);
      
      lblCorreo.setText("Correo");
      lblCorreo.setBounds(30,130,200,40);
      lblCorreo.setForeground(Color.BLUE);
      this.add(lblCorreo);
      
      txtCorreo = new JTextField();
      txtCorreo.setToolTipText("Ingrese el Correo");
      txtCorreo.setBounds(120,140,130,20);
      this.add(txtCorreo);
      
      lblBirthDay.setText("BirthDay");
      lblBirthDay.setBounds(30,170,200,40);
      lblBirthDay.setForeground(Color.BLUE);
      this.add(lblBirthDay);
      
      txtBirthDay = new JTextField();
      txtBirthDay.setToolTipText("Ingrese el BirthDay");
      txtBirthDay.setBounds(120,180,130,20);
      this.add(txtBirthDay);
      
      this.add(btnGuardar);
      btnGuardar.setText("Guardar");
      btnGuardar.setToolTipText("Guardar Datos");
      btnGuardar.setBounds(120,210,130,25);
      btnGuardar.setBackground(java.awt.Color.pink);
      btnGuardar.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               btnGuardarActionPerformed(evt);
            }
         });
      
      MensajeC = new JLabel("Mabe by Garcia Briseño and Torres Santos");
      MensajeC.setBounds(10,250,300,30);
      this.add(MensajeC);
      
      
      //Botones de la tabla
      this.add(btnMostar);
      btnMostar.setText("Mostrar");
      btnMostar.setToolTipText("Mostrar Contactos");
      btnMostar.setBounds(250,20,100,25);
      btnMostar.setForeground(Color.WHITE);
      btnMostar.setBackground(Color.darkGray);
      btnMostar.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               btnMostarActionPerformed(evt);
            }
         });
      
      this.add(btnBuscar);
      btnBuscar.setText("Buscar");
      btnBuscar.setToolTipText("Buscar Contacto");
      btnBuscar.setBounds(550,20,100,25);
      btnBuscar.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               btnBuscarActionPerformed(evt);
            }
         });
         
      txtBuscar = new JTextField();
      txtBuscar.setToolTipText("Busqueda");
      txtBuscar.setBounds(650,20,130,20);
      this.add(txtBuscar);   
      
      
      this.add(btnEliminar);
      btnEliminar.setText("Eliminar");
      btnEliminar.setToolTipText("Eliminar Contacto");
      btnEliminar.setBounds(350,20,100,25);
      btnEliminar.setForeground(Color.WHITE);
      btnEliminar.setBackground(Color.red);
      btnEliminar.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               btnEliminarActionPerformed(evt);
            }
         });
      
      this.add(btnModificar);
      btnModificar.setText("Modificar");
      btnModificar.setToolTipText("Modificar Contacto");
      btnModificar.setBounds(450,20,100,25);
      btnModificar.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               btnModificarActionPerformed(evt);
            }
         });
      
      jTable1.setToolTipText("Tabla de Contacto");
      jTable1.setBounds(260,50,506,195);
      this.add(jTable1);
   
   }                      

   private void btnGuardarActionPerformed(ActionEvent evt) {                                           
      String n = txtNombres.getText();
      String a = txtApellidos.getText();
      String c = txtCorreo.getText();
      String cu = txtBirthDay.getText();
      
      if(!n.isEmpty()){
         if(!a.isEmpty()){
            if(!c.isEmpty()){
               if(!cu.isEmpty()){
                  
                  Contactos con = new Contactos(n,a,c,cu);
                  Agenda.add(con);
                  JOptionPane.showMessageDialog(null, "Contacto Correctamente Guardado!");
                  txtNombres.setText("");
                  txtApellidos.setText("");
                  txtCorreo.setText("");
                  txtBirthDay.setText("");
                  
               }else{
                  JOptionPane.showMessageDialog(null, "El campo BirthDay se encuentra vacio",
                     "WARNING_BIRTHDAY_INCOMPLETO", JOptionPane.WARNING_MESSAGE);
               }
            }else{
               JOptionPane.showMessageDialog(null, "El campo Correo se encuentra vacio",
                  "WARNING_CORREO_INCOMPLETO", JOptionPane.WARNING_MESSAGE);
            }
         }else{
            JOptionPane.showMessageDialog(null, "El campo Apellidos se encuentra vacio",
               "WARNING_APELLIDOS_INCOMPLETO", JOptionPane.WARNING_MESSAGE);
         }
      }else{
         JOptionPane.showMessageDialog(null, "El campo Nombres se encuentra vacio",
            "WARNING_NOMBRES_INCOMPLETO", JOptionPane.WARNING_MESSAGE);
      }
   }                                          
                                        
   //Accion del boton Mostar
   private void btnMostarActionPerformed(ActionEvent evt) {                                          
      Object o[]= null;
      for(int i = 0;i<Agenda.size();i++){
         Contactos c = (Contactos) Agenda.get(i);
         M.addRow(o);
         M.setValueAt(c.getNombres(), i, 0);
         M.setValueAt(c.getApellidos(), i, 1);
         M.setValueAt(c.getCorreo(), i, 2);
         M.setValueAt(c.getBirthDay(), i, 3);
      }
   }                                         
   
   //Accion del boton Eliminar
   private void btnEliminarActionPerformed(ActionEvent evt) {                                            
      int fila = jTable1.getSelectedRow();
      if(fila>=0){
         M.removeRow(fila);
         Agenda.remove(fila);
         JOptionPane.showMessageDialog(null, "Eliminando registro...\nDespues de precionar 'OK'\nNo podra acceder a los datos elimindados con anterioridad.",
            "ELIMINANDO REGISTRO...", JOptionPane.ERROR_MESSAGE);
      }else{
         JOptionPane.showMessageDialog(null, "Selecione Fila");
      }  
   }
   
   private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        int FilaSelec = jTable1.getSelectedRow();
        if(FilaSelec>=0){
            txtNombres.setText(jTable1.getValueAt(FilaSelec, 0).toString());
            txtApellidos.setText(jTable1.getValueAt(FilaSelec, 1).toString());
            txtCorreo.setText(jTable1.getValueAt(FilaSelec, 2).toString());
            txtBirthDay.setText(jTable1.getValueAt(FilaSelec, 3).toString());
            M.removeRow(FilaSelec);
            Agenda.remove(FilaSelec);
        }else{
            JOptionPane.showMessageDialog(this, "Fila No Seleccioanda");
        }
    }
    
    //Accion del boton Buscar
   private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                          
      Busqueda = Agenda;
      String Dato = txtBuscar.getText();
      for(int i=0;i<Busqueda.size();i++){
         if(Dato.equals(Busqueda.get(i).getNombres())){
            JOptionPane.showMessageDialog(null, "Si existe");
            txtBuscar.setText("");
            break;
         }else{
            JOptionPane.showMessageDialog(null, "El dato no existe");
            txtBuscar.setText("");
            break;
         }
      }
      JOptionPane.showMessageDialog(null, "No hay datos registrados");
      txtBuscar.setText("");
   }                                         

   public static void main(String args[]) {
      EventQueue.invokeLater(
         new Runnable() {
            public void run() {
            }
         });
   }
   
   DefaultTableModel M;
   
   private void CrearModelo(){
      try{
         M =(new DefaultTableModel(
                null, new String[]{
                    "Nombres","Apellidos","Correo","BirthDay"}));
         jTable1.setModel(M);
         
      } catch (Exception e){
         JOptionPane.showMessageDialog(null,"Error");
      }
   }                 
}