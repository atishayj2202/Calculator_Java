package scientific.calulator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.lang.Math.cbrt;
import static java.lang.Math.sqrt;
public class ScientificCalulator {
    static double num1 = 0;
    static double num2 = 0;
    static int symb = 0;
    static int chan = 0;
    static double mem = 0;
    JFrame mainFrame;
    JLabel Wspace;
    Font f1;
    public ScientificCalulator(){
        mainFrame = new JFrame("Calculator");
        f1 = new Font(Font.SERIF, Font.BOLD, 30);
        mainFrame.setSize(500,550);
        mainFrame.setLayout(new GridLayout(10,1));
        mainFrame.getContentPane().setBackground(Color.black);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void Create_Top(){
        Wspace = new JLabel("00",JLabel.CENTER);
        Wspace.setSize(300,100);
        Wspace.setFont(new Font(Font.SERIF,Font.BOLD, 55));
        Wspace.setForeground(Color.white);
        mainFrame.add(Wspace);
    }
    private class ButtonClickListener implements ActionListener{
      @Override
      public void actionPerformed(ActionEvent e) {
         String command = e.getActionCommand();  
         
          switch (command) {
              case "C":
                  mem = 0;
                  Wspace.setText("Cleared");
                  break;
                  
                  
              case "S":
                  if(chan == 0){
                      mem = num1;
                      symb = 3;
                        chan = 1;
                      Wspace.setText("Stored: " + Double.toString(num1));
                  }
                  else {
                      if(num2 == 0){
                          mem = num1;
                          Wspace.setText("Stored: " + Double.toString(num1));
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
                      mem = num1;
                      symb = 3;
                      Wspace.setText("Stored: " + Double.toString(num1));
                      }
                  }
                  break;
              case "R":
                  if(chan == 0){
                      if (num1 == 0){
                        num1 = mem;
                        symb = 3;
                        chan = 1;
                          Wspace.setText("Memory" + Double.toString(num1));
                      }
                      else{
                          symb = 3;
                          num2 = mem;
                          Wspace.setText("Memory" + Double.toString(num2));
                      }
                  }
                  else {
                      if(num2 == 0){
                          num2 = mem;
                          Wspace.setText("Memory" + Double.toString(num1));
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
                      }
                      num2 = mem;
                      symb = 3;
                      chan = 1;
                      Wspace.setText("Memory" + Double.toString(num2));
                  }
                  break;
              case "sin":
                  if(chan == 0){
                      num1 = Math.sin(Math.toRadians(num1));
                      symb = 3;
                      chan = 1;
                      Wspace.setText(Double.toString(num1));
                  }
                  else {
                      if(num2 == 0){
                          num1 = Math.sin(Math.toRadians(num1));
                          Wspace.setText(Double.toString(num1));
                      }
                      else{
                          if(num2 == 0){
                                num1 = Math.sin(Math.toRadians(num1));
                                symb = 3;
                                chan = 1;
                                Wspace.setText(Double.toString(num1));
                          }
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
                      num1 = Math.sin(Math.toRadians(num1));
                      symb = 3;
                      chan = 1;
                      Wspace.setText(Double.toString(num1));
                      }
                  }
                  break;
              case "cos":
                  if(chan == 0){
                      num1 = Math.cos(Math.toRadians(num1));
                      symb = 3;
                      chan = 1;
                      Wspace.setText(Double.toString(num1));
                  }
                  else {
                      if(num2 == 0){
                          num1 = Math.cos(Math.toRadians(num1));
                          Wspace.setText(Double.toString(num1));
                      }
                      else{
                          if(num2 == 0){
                                num1 = Math.cos(Math.toRadians(num1));
                                symb = 3;
                                chan = 1;
                                Wspace.setText(Double.toString(num1));
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
                      num1 = Math.cos(Math.toRadians(num1));
                      symb = 3;
                      chan = 1;
                      Wspace.setText(Double.toString(num1));
                          }
                      }
                  }
                  break;
              case "tan":
                  if(chan == 0){
                      num1 = Math.tan(Math.toRadians(num1));
                      symb = 3;
                      chan = 1;
                      Wspace.setText(Double.toString(num1));
                  }
                  else {
                      if(num2 == 0){
                          num1 = Math.tan(Math.toRadians(num1));
                          Wspace.setText(Double.toString(num1));
                      }
                      else{
                          if(num2 == 0){
                                num1 = Math.tan(Math.toRadians(num1));
                                symb = 3;
                                chan = 1;
                                Wspace.setText(Double.toString(num1));
                          }
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
                      num1 = Math.tan(Math.toRadians(num1));
                      symb = 3;
                      chan = 1;
                      Wspace.setText(Double.toString(num1));
                      }
                  }
                  break;
                  case "ln":
                  if(chan == 0){
                      num1 = Math.log((num1));
                      symb = 3;
                      chan = 1;
                      Wspace.setText(Double.toString(num1));
                  }
                  else {
                      if(num2 == 0){
                          num1 = Math.log((num1));
                          Wspace.setText(Double.toString(num1));
                      }
                      else{
                          if(num2 == 0){
                                num1 = Math.log((num1));
                                symb = 3;
                                chan = 1;
                                Wspace.setText(Double.toString(num1));
                          }
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
                      num1 = Math.log((num1));
                      symb = 3;
                      chan = 1;
                      Wspace.setText(Double.toString(num1));
                      }
                  }
                  break;
                  
                  case "log":
                  if(chan == 0){
                      num1 = Math.log10((num1));
                      symb = 3;
                      chan = 1;
                      Wspace.setText(Double.toString(num1));
                  }
                  else {
                      if(num2 == 0){
                          num1 = Math.log10((num1));
                          Wspace.setText(Double.toString(num1));
                      }
                      else{
                          if(num2 == 0){
                                num1 = Math.log10((num1));
                                symb = 3;
                                chan = 1;
                                Wspace.setText(Double.toString(num1));
                          }
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
                      num1 = Math.log10((num1));
                      symb = 3;
                      chan = 1;
                      Wspace.setText(Double.toString(num1));
                      }
                  }
                  break;
              case "MP":
                  if(chan == 0){
                      mem = mem + num1;
                      symb = 3;
                        chan = 1;
                      Wspace.setText("After Adding: " + Double.toString(mem));
                  }
                  else {
                      if(num2 == 0){
                          mem = mem + num1;
                          Wspace.setText("After Adding: " + Double.toString(mem));
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
                      mem = mem + num1;
                      symb = 3;
                        chan = 1;
                      Wspace.setText("After Adding: " + Double.toString(mem));
                      }
                  }
                  break;
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
                      Wspace.setText(Double.toString(num1));
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
                      Wspace.setText(Double.toString(num1));
                  }
                  break;   
              case "Back":
                  if (chan == 0){
                      num1 = num1 - (num1 % 10); 
                      num1 = (num1 / 10);
                      Wspace.setText(Double.toString(num1));
                  }
                  else{
                      num1 = num1 - (num1 % 10); 
                      num2 = (num2 / 10);
                      Wspace.setText(Double.toString(num2));
                  }
                  break;  
              case "1":
                  if (chan == 0){
                      num1 = (num1 *10) + 1;
                      Wspace.setText(Double.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 1;
                      Wspace.setText(Double.toString(num2));
                  }
                  break;  
              case "2":
                  if (chan == 0){
                      num1 = (num1 *10) + 2;
                      Wspace.setText(Double.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 2;
                      Wspace.setText(Double.toString(num2));
                  }
                  break;  
              case "3":
                  if (chan == 0){
                      num1 = (num1 *10) + 3;
                      Wspace.setText(Double.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 3;
                      Wspace.setText(Double.toString(num2));
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
                      Wspace.setText(Double.toString(num1));
                  }
                  break;  
              case "4":
                  if (chan == 0){
                      num1 = (num1 *10) + 4;
                      Wspace.setText(Double.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 4;
                      Wspace.setText(Double.toString(num2));
                  }
                  break;  
              case "5":
                  if (chan == 0){
                      num1 = (num1 *10) + 5;
                      Wspace.setText(Double.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 5;
                      Wspace.setText(Double.toString(num2));
                  }
                  break;  
              case "6":
                  if (chan == 0){
                      num1 = (num1 *10) + 6;
                      Wspace.setText(Double.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 6;
                      Wspace.setText(Double.toString(num2));
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
                      Wspace.setText(Double.toString(num1));
                  }
                  break;  
                  //divide  = 1; multiply = 2; plus = 3; subtract = 4;
              case "7":
                  if (chan == 0){
                      num1 = (num1 *10) + 7;
                      Wspace.setText(Double.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 7;
                      Wspace.setText(Double.toString(num2));
                  }
                  break;  
              case "8":
                  if (chan == 0){
                      num1 = (num1 *10) + 8;
                      Wspace.setText(Double.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 8;
                      Wspace.setText(Double.toString(num2));
                  }
                  break;  	
              case "9":
                  if (chan == 0){
                      num1 = (num1 *10) + 9;
                      Wspace.setText(Double.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 9;
                      Wspace.setText(Double.toString(num2));
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
                      Wspace.setText(Double.toString(num1));
                  }
                  break;  
              case "0":
                  if (chan == 0){
                      num1 = (num1 *10) + 0;
                      Wspace.setText(Double.toString(num1));
                  }
                  else{
                      num2 = (num2 * 10) + 0;
                      Wspace.setText(Double.toString(num2));
                  }
                  break;
              case "^2":
                  if (chan == 0){
                      num1 = num1 * num1;
                      Wspace.setText(Double.toString(num1));
                  }
                  else{
                      if (num2 == 0){
                        num1 = num1 * num1;
                        Wspace.setText(Double.toString(num1));
                      }
                      else{
                        num2 = num2 * num2;
                        Wspace.setText(Double.toString(num2));
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
                        Wspace.setText(Double.toString(num1));
                      }
                  }
                  symb = 3;
                  break;
                  
              case "^3":
                  if (chan == 0){
                      num1 = num1 * num1 * num1;
                      Wspace.setText(Double.toString(num1));
                  }
                  else{
                      if (num2 == 0){
                        num1 = num1 * num1 * num1;
                        Wspace.setText(Double.toString(num1));
                      }
                      else{
                        num2 = num2 * num2 * num2;
                        Wspace.setText(Double.toString(num2));
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
                        Wspace.setText(Double.toString(num1));
                      }
                  }
                  symb = 3;
                  break;  
              case "^.5":
                  if (chan == 0){
                      num1 = (int) sqrt(num1);
                      Wspace.setText(Double.toString(num1));
                  }
                  else{
                      if(num2 == 0){
                          num1 = (int) sqrt(num1);
                          Wspace.setText(Double.toString(num1));
                      }
                      else{
                      num2 = (int) sqrt(num2);
                      Wspace.setText(Double.toString(num2));
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
                      Wspace.setText(Double.toString(num1));
                      }
                  }
                  symb = 3;
                  break; 
                  
              case "^.3":
                  if (chan == 0){
                      num1 = (int) cbrt(num1);
                      Wspace.setText(Double.toString(num1));
                  }
                  else{
                      if(num2 == 0){
                          num1 = (int) cbrt(num1);
                          Wspace.setText(Double.toString(num1));
                      }
                      else{
                      num2 = (int) cbrt(num2);
                      Wspace.setText(Double.toString(num2));
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
                      Wspace.setText(Double.toString(num1));
                      }
                  }
                  symb = 3;
                  break; 
              case "-ve":
                  if (chan == 0){
                      num1 = num1 * (-1);
                      Wspace.setText(Double.toString(num1));
                  }
                  else{
                      num2 = num2 * (-1);
                      Wspace.setText(Double.toString(num2));
                  }
                  break;  
              case "x!":
                  if (chan == 0){
                      double x=1;
                      while(num1>0){
                          x = x * num1;
                          num1--;
                      }
                      num1 = x;
                      Wspace.setText(Double.toString(num1));
                  }
                  else{
                      if (num2 == 0){
                        double x=1;
                        while(num1>0){
                            x = x * num1;
                            num1--;
                        }
                        num1 = x;
                        Wspace.setText(Double.toString(num1));
                      }
                      else{
                        double x = 1;
                        while(num2 > 0){
                            x = x* num2;
                            num2--;
                        }
                        num2 = x;
                        Wspace.setText(Double.toString(num2));
                      }
                  }
                  break;
              default:
                  Wspace.setText("Error");
          }
      }		

        private int pow(int num11, double par) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

   }
    private void Create_r1(){
        JPanel r1;
        r1 = new JPanel();
        r1.setLayout(new GridLayout());
        r1.setBackground(Color.yellow);
        
        JButton b3;
        b3 = new JButton("X");
        b3.setForeground(Color.black);
        b3.setBackground(Color.GREEN.darker());
        
        JButton b1;
        b1 = new JButton("AC");
        b1.setForeground(Color.black);
        b1.setBackground(Color.GREEN.darker());
        
        JButton b2;
        b2 = new JButton("/");
        b2.setForeground(Color.black);
        b2.setBackground(Color.GREEN.darker());
        
        JButton b4;
        b4 = new JButton("<=");
        b4.setForeground(Color.black);
        b4.setBackground(Color.GREEN.darker());
        
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
        b3.setForeground(Color.black);
        b3.setBackground(Color.BLUE.darker());
        
        JButton b1;
        b1 = new JButton("1");
        b1.setForeground(Color.black);
        b1.setBackground(Color.BLUE.darker());
        
        JButton b2;
        b2 = new JButton("2");
        b2.setForeground(Color.black);
        b2.setBackground(Color.BLUE.darker());
        
        JButton b4;
        b4 = new JButton("+");
        b4.setForeground(Color.black);
        b4.setBackground(Color.GREEN.darker());
        
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
        b3.setForeground(Color.black);
        b3.setBackground(Color.BLUE.darker());
        
        JButton b1;
        b1 = new JButton("4");
        b1.setForeground(Color.black);
        b1.setBackground(Color.blue.darker());
        
        JButton b2;
        b2 = new JButton("5");
        b2.setForeground(Color.black);
        b2.setBackground(Color.BLUE.darker());
        
        JButton b4;
        b4 = new JButton("-");
        b4.setForeground(Color.black);
        b4.setBackground(Color.GREEN.darker());
        
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
        b3.setForeground(Color.black);
        b3.setBackground(Color.BLUE.darker());
        
        JButton b1;
        b1 = new JButton("7");
        b1.setForeground(Color.black);
        b1.setBackground(Color.BLUE.darker());
        
        JButton b2;
        b2 = new JButton("8");
        b2.setForeground(Color.black);
        b2.setBackground(Color.BLUE.darker());
        
        JButton b4;
        b4 = new JButton("=");
        b4.setForeground(Color.black);
        b4.setBackground(Color.GREEN.darker());
        
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
        b3.setForeground(Color.black);
        b3.setBackground(Color.BLUE.darker());
        b3.setFont(f1);
        b3.setActionCommand("0");
        b3.addActionListener(new ButtonClickListener());
        
        r1.add(b3);
        mainFrame.add(r1);
    }
    private void Create_r6(){
        JPanel r1;
        r1 = new JPanel();
        r1.setLayout(new GridLayout());
        r1.setBackground(Color.yellow);
        
        JButton b3;
        b3 = new JButton("x!");
        b3.setForeground(Color.black);
        b3.setBackground(Color.GREEN.darker());
        
        JButton b2;
        b2 = new JButton("log()");
        b2.setForeground(Color.black);
        b2.setBackground(Color.GREEN.darker());
        
        JButton b1;
        b1 = new JButton("+/-");
        b1.setForeground(Color.black);
        b1.setBackground(Color.GREEN.darker());
        
        b1.setFont(f1);
        b2.setFont(f1);
        b3.setFont(f1);
        
        b1.setActionCommand("-ve");
        b2.setActionCommand("log");
        b3.setActionCommand("x!");
        
        b1.addActionListener(new ButtonClickListener());
        b2.addActionListener(new ButtonClickListener());
        b3.addActionListener(new ButtonClickListener());
        
        r1.add(b3);
        r1.add(b1);
        r1.add(b2);
        mainFrame.add(r1);
    }
    private void Create_r7(){
        JPanel r1;
        r1 = new JPanel();
        r1.setLayout(new GridLayout());
        r1.setBackground(Color.yellow);
        
        JButton b3;
        b3 = new JButton("x^3");
        b3.setForeground(Color.black);
        b3.setBackground(Color.GREEN.darker());
        
        JButton b1;
        b1 = new JButton("x^2");
        b1.setForeground(Color.black);
        b1.setBackground(Color.GREEN.darker());
        
        JButton b2;
        b2 = new JButton("x^1/2");
        b2.setForeground(Color.black);
        b2.setBackground(Color.GREEN.darker());
        
        JButton b4;
        b4 = new JButton("x^1/3");
        b4.setForeground(Color.black);
        b4.setBackground(Color.GREEN.darker());
        
        b1.setFont(f1);
        b2.setFont(f1);
        b3.setFont(f1);
        b4.setFont(f1);
        
        b1.setActionCommand("^2");
        b2.setActionCommand("^.5");
        b3.setActionCommand("^3");
        b4.setActionCommand("^.3");
        
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
    private void Create_r8(){
        JPanel r1;
        r1 = new JPanel();
        r1.setLayout(new GridLayout());
        r1.setBackground(Color.yellow);
        
        JButton b3;
        b3 = new JButton("MC");
        b3.setForeground(Color.black);
        b3.setBackground(Color.RED.darker());
        
        JButton b1;
        b1 = new JButton("MR");
        b1.setForeground(Color.black);
        b1.setBackground(Color.RED.darker());
        
        JButton b2;
        b2 = new JButton("MS");
        b2.setForeground(Color.black);
        b2.setBackground(Color.RED.darker());
        
        JButton b4;
        b4 = new JButton("M+");
        b4.setForeground(Color.black);
        b4.setBackground(Color.RED.darker());
        
        b1.setFont(f1);
        b2.setFont(f1);
        b3.setFont(f1);
        b4.setFont(f1);
        
        b1.setActionCommand("R");
        b2.setActionCommand("S");
        b3.setActionCommand("C");
        b4.setActionCommand("MP");
        
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
    private void Create_r9(){
        JPanel r1;
        r1 = new JPanel();
        r1.setLayout(new GridLayout());
        r1.setBackground(Color.yellow);
        
        JButton b3;
        b3 = new JButton("tan()");
        b3.setForeground(Color.black);
        b3.setBackground(Color.GREEN.darker());
        
        JButton b1;
        b1 = new JButton("sin()");
        b1.setForeground(Color.black);
        b1.setBackground(Color.GREEN.darker());
        
        JButton b2;
        b2 = new JButton("cos()");
        b2.setForeground(Color.black);
        b2.setBackground(Color.GREEN.darker());
        
        JButton b4;
        b4 = new JButton("ln()");
        b4.setForeground(Color.black);
        b4.setBackground(Color.GREEN.darker());
        
        b1.setFont(f1);
        b2.setFont(f1);
        b3.setFont(f1);
        b4.setFont(f1);
        
        b1.setActionCommand("sin");
        b2.setActionCommand("cos");
        b3.setActionCommand("tan");
        b4.setActionCommand("ln");
        
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
    
    void prepareGUI(){
        Create_Top();
        Create_r8();
        Create_r1();
        Create_r2();
        Create_r3();
        Create_r4();
        Create_r5();
        Create_r6();
        Create_r7();
        Create_r9();
        mainFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
        ScientificCalulator calc = new ScientificCalulator();
        calc.prepareGUI();
    }
    
}
