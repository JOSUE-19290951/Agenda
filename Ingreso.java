/*
   Programa Realizado por:
   Garcia Briseno Jose Carlos
   Torres Santos Josue Daniel
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ingreso extends JPanel implements ActionListener{

  private JButton btnIngresar, btnCancelar;
  private JTextField txtUser;
  private JPasswordField contra;
  
  public Ingreso(){
    setLayout(new GridLayout(3,3,2,2));
    JLabel lblUser = new JLabel("Usuario");
    lblUser.setBounds(30,30,200,20);
    txtUser = new JTextField(20);
    txtUser.setBounds(200,30,150,20);
    add(lblUser);
    add(txtUser);
    
    JLabel lblContra = new JLabel("Contraseña");
    lblContra.setBounds(30,80,200,20);
    contra = new JPasswordField(20);
    contra.setBounds(200,80,150,20);
    contra.setToolTipText("Ingrese Contraseña");
    add(lblContra);
    add(contra);
    
    btnIngresar = new JButton ("Ingresar");
    btnIngresar.addActionListener(this);
    btnIngresar.setBackground(java.awt.Color.cyan);
    btnCancelar = new JButton ("Cancelar");
    btnCancelar.addActionListener(this);
    
    add(btnIngresar);
    add(btnCancelar);
  }
  
  public void actionPerformed(ActionEvent e){
     String usuario = txtUser.getText();
     String password = new String(contra.getPassword());
     
     if(e.getSource() == btnIngresar){
       if(usuario.isEmpty() && password.isEmpty()){
          JOptionPane.showMessageDialog(null, "Ingrese su nombre de usuario y password");
          txtUser.requestFocus();
        }else{
           if(usuario.equals("Usuario") && password.equals("1234")){
             JOptionPane.showMessageDialog(null, "Bienvenido a la Agenda");
             this.setVisible(false);
             Inicio Inicio= new Inicio();
             Inicio.setVisible(true);
             
             Inicio.setDefaultCloseOperation(3);
               Inicio.setSize(800,310);
               Inicio.setLocationRelativeTo(null);
               Inicio.setResizable(false);
               Inicio.setTitle("Agenda de contactos");
            }else{
              JOptionPane.showMessageDialog(null, "Usuario o Password Incorrecto", 
              "Warning", JOptionPane.WARNING_MESSAGE);
              txtUser.setText(null);
              contra.setText(null);
              txtUser.requestFocus();
           }
        }//else
     }//if botón Aceptar
    
   if(e.getSource()==btnCancelar){
      System.exit(0);
    }
  }//ActionPerformed
}

