/*
   Programa Realizado por:
   Garcia Briseno Jose Carlos
   Torres Santos Josue Daniel
*/
import javax.swing.*;
import java.awt.*;

public class JFrameIngreso extends JFrame{
  Ingreso ingreso = new Ingreso();
  
  public JFrameIngreso(){  
      initComponents();
   }
   private void initComponents(){
      setSize(300, 200);
      setTitle("Usuario y contraseña");
      this.setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setResizable(false);
      setContentPane(ingreso);
      setVisible(true);
      this.getContentPane().setBackground(Color.orange);       
   }   
}

