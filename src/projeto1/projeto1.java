 package projeto1;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class projeto1 extends JFrame implements ActionListener {
    JLabel lblarg, lblprof, lblcomp, lblresult;
    JTextField txtlarg, txtprof, txtini, txtresult, txtcomp;
    JButton btncalculo, btnlimpar;
    

    
      public static void main(String[] args) 
    {        
        JFrame janela = new projeto1();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
      projeto1()
      {
        setTitle("Calculador de piscina");
        setBounds(500,50,350,90);
        getContentPane().setBackground(new Color(91,78,110));
        getContentPane().setLayout(new GridLayout(5,2));
        
   
        lblarg = new JLabel("Largura");
        lblarg.setForeground(Color.white);
        lblarg.setFont(new Font("",Font.BOLD,14));
                
        lblresult = new JLabel("Resultado");
        lblresult.setForeground(Color.white);
        lblresult.setFont(new Font("",Font.BOLD,14));
        
        lblcomp = new JLabel("comprimento");
        lblcomp.setForeground(Color.white); 
        lblcomp.setFont(new Font("",Font.BOLD,14));
        
        lblprof = new JLabel("profundidade");
        lblprof.setForeground(Color.white);
        lblprof.setFont(new Font("",Font.BOLD,14));


         btncalculo = new JButton("caulcular"); btncalculo.addActionListener(this);
         btnlimpar = new JButton("limpar");  btnlimpar.addActionListener(this);
         
         txtlarg = new JTextField();
         txtprof = new JTextField();
         txtcomp = new JTextField();
         txtresult = new JTextField();
         txtresult.setEditable(false);
         
          getContentPane().add(btncalculo);

         getContentPane().add(btnlimpar);
         getContentPane().add(lblprof);  getContentPane().add(txtprof);
         getContentPane().add(lblcomp);  getContentPane().add(txtcomp);
         getContentPane().add(lblarg); 
         getContentPane().add(txtlarg);          getContentPane().add(lblresult);
         getContentPane().add(txtresult);
       
     }
      public void actionPerformed(ActionEvent e)
      {
          if (e.getSource()==btnlimpar){
              txtlarg.setText("");
              txtprof.setText("");
              txtcomp.setText("");
              txtresult.setText("");
              return;
          }
          double comp=0, larg=0, prof=0, result=0;
          try
          {
              comp = Double.parseDouble(txtcomp.getText());
              larg = Double.parseDouble(txtlarg.getText());
              prof = Double.parseDouble(txtprof.getText());
              
          }
          catch(NumberFormatException erro)
          {
              txtresult.setText("Só números");
                      return;
          } 
          if(e.getSource()==btncalculo) result = (prof*comp*larg)*300;
           txtresult.setText(" " + result);


   }
}

