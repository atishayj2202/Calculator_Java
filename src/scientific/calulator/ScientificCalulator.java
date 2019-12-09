import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ScientificCalulator {
    static int num1 = 0;
    static int num2 = 0;
    static int symb = 0;
    static int chan = 0;
    JFrame mainFrame;
    JLabel Wspace;
    Font f1;
    public ScientificCalulator(){
        mainFrame = new JFrame("Calculator");
        f1 = new Font(Font.SERIF, Font.BOLD, 30);
        mainFrame.setSize(350,400);
        mainFrame.setLayout(new GridLayout(6,1));
        mainFrame.getContentPane().setBackground(Color.black);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void Create_Top(){
        Wspace = new JLabel("00",JLabel.CENTER);
        Wspace.setSize(300,100);
        Wspace.setFont(new Font(Font.SERIF,Font.BOLD, 55));
        Wspace.setForeground(Color.WHITE);
        mainFrame.add(Wspace);
    }
    private class ButtonClickListener implements ActionListener{
      @Override
      public void actionPerformed(ActionEvent e) {
         String command = e.getActionCommand();  
         
          switch (command) {
              case "AC":
                  Wspace.setText("00");
                  num1 = 0;
                  num2 = 0;
                  symb= 0;
                  chan = 0;
                  break;
                  //divide  = 1; multiply = 2; plus = 3; subtract = 4;
              case "/":
                  if(chan == 0){
                      chan = 1;
                      symb = 1;
                  }
                  else{
                      if(symb == 1){
                          num1 = num1 / num2;
                      }
                      else if(2 == symb){
                          num1 = num1 * num2;
                      }
                      else if(3 == symb){
                          num1 = num1 + num2;
                      }
                      else if(4 == symb){
                          num1 = num1 - num2;
                      }
                      num2 = 0;
                      symb = 1;
                      Wspace.setText(Integer.toString(num1));
                  }
                  break;  
                  //divide  = 1; multiply = 2; plus = 3; subtract = 4;
              case "X":
                  if(chan == 0){
                      chan = 1;
                      symb = 2;
                  }
                  else{
                      if(symb == 1){
                          num1 = num1 / num2;
                      }
                      else if(2 == symb){
                          num1 = num1 * num2;
                      }
                      else if(3 == symb){
                          num1 = num1 + num2;
                      }
                      else if(4 == symb){
                          num1 = num1 - num2;
                      }
                      num2 = 0;
                      symb = 2;
                      Wspace.setText(Integer.toString(num1));
                  }
                  break;   
              case "Back":
                  if (chan == 0){
                      num1 = (num1 / 10);
                      Wspace.setText(Integer.toString(num1));
                  }
                  else{
                      num2 = (num2 / 10);
                      Wspace.setText(Integer.toString(num2));
                  }
                  break;  
              case "1":
                  if (chan == 0){
                      num1 = (num1 *10) + 1;
                      Wspace.setText(Integer.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 1;
                      Wspace.setText(Integer.toString(num2));
                  }
                  break;  
              case "2":
                  if (chan == 0){
                      num1 = (num1 *10) + 2;
                      Wspace.setText(Integer.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 2;
                      Wspace.setText(Integer.toString(num2));
                  }
                  break;  
              case "3":
                  if (chan == 0){
                      num1 = (num1 *10) + 3;
                      Wspace.setText(Integer.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 3;
                      Wspace.setText(Integer.toString(num2));
                  }
                  break;  
                  //divide  = 1; multiply = 2; plus = 3; subtract = 4;
              case "+":
                  if(chan == 0){
                      chan = 1;
                      symb = 3;
                  }
                  else{
                      if(symb == 1){
                          num1 = num1 / num2;
                      }
                      else if(2 == symb){
                          num1 = num1 * num2;
                      }
                      else if(3 == symb){
                          num1 = num1 + num2;
                      }
                      else if(4 == symb){
                          num1 = num1 - num2;
                      }
                      num2 = 0;
                      symb = 3;
                      Wspace.setText(Integer.toString(num1));
                  }
                  break;  
              case "4":
                  if (chan == 0){
                      num1 = (num1 *10) + 4;
                      Wspace.setText(Integer.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 4;
                      Wspace.setText(Integer.toString(num2));
                  }
                  break;  
              case "5":
                  if (chan == 0){
                      num1 = (num1 *10) + 5;
                      Wspace.setText(Integer.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 5;
                      Wspace.setText(Integer.toString(num2));
                  }
                  break;  
              case "6":
                  if (chan == 0){
                      num1 = (num1 *10) + 6;
                      Wspace.setText(Integer.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 6;
                      Wspace.setText(Integer.toString(num2));
                  }
                  break;  
              case "-":
                  if(chan == 0){
                      chan = 1;
                      symb = 4;
                  }
                  else{
                      if(symb == 1){
                          num1 = num1 / num2;
                      }
                      else if(2 == symb){
                          num1 = num1 * num2;
                      }
                      else if(3 == symb){
                          num1 = num1 + num2;
                      }
                      else if(4 == symb){
                          num1 = num1 - num2;
                      }
                      num2 = 0;
                      symb = 4;
                      Wspace.setText(Integer.toString(num1));
                  }
                  break;  
                  //divide  = 1; multiply = 2; plus = 3; subtract = 4;
              case "7":
                  if (chan == 0){
                      num1 = (num1 *10) + 7;
                      Wspace.setText(Integer.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 7;
                      Wspace.setText(Integer.toString(num2));
                  }
                  break;  
              case "8":
                  if (chan == 0){
                      num1 = (num1 *10) + 8;
                      Wspace.setText(Integer.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 8;
                      Wspace.setText(Integer.toString(num2));
                  }
                  break;  	
              case "9":
                  if (chan == 0){
                      num1 = (num1 *10) + 9;
                      Wspace.setText(Integer.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 9;
                      Wspace.setText(Integer.toString(num2));
                  }
                  break;  
              case "=":
                  if(chan == 0){
                      chan = 1;
                      symb = 3;
                  }
                  else{
                      if(symb == 1){
                          num1 = num1 / num2;
                      }
                      else if(2 == symb){
                          num1 = num1 * num2;
                      }
                      else if(3 == symb){
                          num1 = num1 + num2;
                      }
                      else if(4 == symb){
                          num1 = num1 - num2;
                      }
                      num2 = 0;
                      symb = 3;
                      Wspace.setText(Integer.toString(num1));
                  }
                  break;  
              default:
                  if (chan == 0){
                      num1 = (num1 *10) + 0;
                      Wspace.setText(Integer.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 0;
                      Wspace.setText(Integer.toString(num2));
                  }
                  break;
          }
      }		

   }
    private void Create_r1(){
        JPanel r1;
        r1 = new JPanel();
        r1.setLayout(new GridLayout());
        r1.setBackground(Color.yellow);
        
        JButton b3;
        b3 = new JButton("X");
        b3.setForeground(Color.white);
        b3.setBackground(Color.DARK_GRAY.brighter());
        
        JButton b1;
        b1 = new JButton("AC");
        b1.setForeground(Color.white);
        b1.setBackground(Color.DARK_GRAY.brighter());
        
        JButton b2;
        b2 = new JButton("/");
        b2.setForeground(Color.white);
        b2.setBackground(Color.DARK_GRAY.brighter());
        
        JButton b4;
        b4 = new JButton("<=");
        b4.setForeground(Color.white);
        b4.setBackground(Color.DARK_GRAY.brighter());
        
        b1.setFont(f1);
        b2.setFont(f1);
        b3.setFont(f1);
        b4.setFont(f1);
        
        b1.setActionCommand("AC");
        b2.setActionCommand("/");
        b3.setActionCommand("X");
        b4.setActionCommand("Back");
        
        b1.addActionListener(new ButtonClickListener());
        b2.addActionListener(new ButtonClickListener());
        b3.addActionListener(new ButtonClickListener());
        b4.addActionListener(new ButtonClickListener());
        
        r1.add(b1);
        r1.add(b2);
        r1.add(b3);
        r1.add(b4);
        mainFrame.add(r1);
    }
    private void Create_r2(){
        JPanel r1;
        r1 = new JPanel();
        r1.setLayout(new GridLayout());
        r1.setBackground(Color.yellow);
        
        JButton b3;
        b3 = new JButton("3");
        b3.setForeground(Color.white);
        b3.setBackground(Color.BLUE);
        
        JButton b1;
        b1 = new JButton("1");
        b1.setForeground(Color.white);
        b1.setBackground(Color.BLUE);
        
        JButton b2;
        b2 = new JButton("2");
        b2.setForeground(Color.white);
        b2.setBackground(Color.BLUE);
        
        JButton b4;
        b4 = new JButton("+");
        b4.setForeground(Color.white);
        b4.setBackground(Color.DARK_GRAY.brighter());
        
        b1.setFont(f1);
        b2.setFont(f1);
        b3.setFont(f1);
        b4.setFont(f1);
        
        b1.setActionCommand("1");
        b2.setActionCommand("2");
        b3.setActionCommand("3");
        b4.setActionCommand("+");
        
        b1.addActionListener(new ButtonClickListener());
        b2.addActionListener(new ButtonClickListener());
        b3.addActionListener(new ButtonClickListener());
        b4.addActionListener(new ButtonClickListener());
        
        r1.add(b1);
        r1.add(b2);
        r1.add(b3);
        r1.add(b4);
        mainFrame.add(r1);
    }
    private void Create_r3(){
        JPanel r1;
        r1 = new JPanel();
        r1.setLayout(new GridLayout());
        r1.setBackground(Color.yellow);
        
        JButton b3;
        b3 = new JButton("6");
        b3.setForeground(Color.white);
        b3.setBackground(Color.BLUE);
        
        JButton b1;
        b1 = new JButton("4");
        b1.setForeground(Color.white);
        b1.setBackground(Color.BLUE);
        
        JButton b2;
        b2 = new JButton("5");
        b2.setForeground(Color.white);
        b2.setBackground(Color.BLUE);
        
        JButton b4;
        b4 = new JButton("-");
        b4.setForeground(Color.white);
        b4.setBackground(Color.DARK_GRAY.brighter());
        
        b1.setFont(f1);
        b2.setFont(f1);
        b3.setFont(f1);
        b4.setFont(f1);
        
        b1.setActionCommand("4");
        b2.setActionCommand("5");
        b3.setActionCommand("6");
        b4.setActionCommand("-");
        
        b1.addActionListener(new ButtonClickListener());
        b2.addActionListener(new ButtonClickListener());
        b3.addActionListener(new ButtonClickListener());
        b4.addActionListener(new ButtonClickListener());
        
        r1.add(b1);
        r1.add(b2);
        r1.add(b3);
        r1.add(b4);
        mainFrame.add(r1);
    }
    private void Create_r4(){
        JPanel r1;
        r1 = new JPanel();
        r1.setLayout(new GridLayout());
        r1.setBackground(Color.yellow);
        
        JButton b3;
        b3 = new JButton("9");
        b3.setForeground(Color.white);
        b3.setBackground(Color.BLUE);
        
        JButton b1;
        b1 = new JButton("7");
        b1.setForeground(Color.white);
        b1.setBackground(Color.BLUE);
        
        JButton b2;
        b2 = new JButton("8");
        b2.setForeground(Color.white);
        b2.setBackground(Color.BLUE);
        
        JButton b4;
        b4 = new JButton("=");
        b4.setForeground(Color.white);
        b4.setBackground(Color.DARK_GRAY.brighter());
        
        b1.setFont(f1);
        b2.setFont(f1);
        b3.setFont(f1);
        b4.setFont(f1);
        
        b1.setActionCommand("7");
        b2.setActionCommand("8");
        b3.setActionCommand("9");
        b4.setActionCommand("=");
        
        b1.addActionListener(new ButtonClickListener());
        b2.addActionListener(new ButtonClickListener());
        b3.addActionListener(new ButtonClickListener());
        b4.addActionListener(new ButtonClickListener());
        
        r1.add(b1);
        r1.add(b2);
        r1.add(b3);
        r1.add(b4);
        mainFrame.add(r1);
    }
    private void Create_r5(){
        JPanel r1;
        r1 = new JPanel();
        r1.setLayout(new GridLayout());
        r1.setBackground(Color.yellow);
        
        JButton b3;
        b3 = new JButton("0");
        b3.setForeground(Color.white);
        b3.setBackground(Color.DARK_GRAY.brighter());
        b3.setFont(f1);
        
        b3.setActionCommand("0");
        
        b3.addActionListener(new ButtonClickListener());
        
        r1.add(b3);
        mainFrame.add(r1);
    }
    
    void prepareGUI(){
        Create_Top();
        Create_r1();
        Create_r2();
        Create_r3();
        Create_r4();
        Create_r5();
        mainFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
        ScientificCalulator calc = new ScientificCalulator();
        calc.prepareGUI();
    }
    
}