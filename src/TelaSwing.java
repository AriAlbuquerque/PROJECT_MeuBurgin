import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class TelaSwing extends JFrame{

    public static void main(String[] args) {

        TelaSwing meuBurguin = new TelaSwing();
        meuBurguin.setSize(420,250);
        meuBurguin.show();

        public TelaSwing(){
            try{
                inicie();
            }

            catch (Exception e){
                e.printStackTrace();
            }
        }

        private void inicie() throw Exception{
            this.setLayout(null);
            this.setDefaultCloseOperation(3);
            this.setResizable(false);
            this.setTitle("Meu Burguin");
            JButton JButtonSalvar = new JButton();
        }
    }
}