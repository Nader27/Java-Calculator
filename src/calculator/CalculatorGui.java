/*
 * Copyright (C) 2015 nader
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package calculator;
import javax.swing.*;
import java.awt.event.*;
import java.math.*;
import java.util.Random;
/**
 * @author Nader Alaa
 */

public class CalculatorGui extends JFrame implements KeyListener{
     public static void main(String[] args) {
        // TODO code application logic here
         Random r = new Random();
         System.out.println(r.nextInt());
        CalculatorGui gui = new CalculatorGui();
        gui.setVisible(true);
    }
    static String Fscreen = "0";
    static String Sscreen = "";
    static double value1 = 0;
    static double value2 = 0;
    static char signal = '?';
    static boolean error = false;
    BigDecimal view;
    ImageIcon img = new ImageIcon("calculator.png");
    JButton sign = new JButton("±");
    JButton zero = new JButton("0");
    JButton dot = new JButton(".");
    JButton equal = new JButton("=");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton plus = new JButton("+");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton minus = new JButton("-");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton multiply = new JButton("X");
    JButton clean_entry = new JButton("CE");
    JButton clean = new JButton("C");
    JButton back = new JButton("«");
    JButton divide = new JButton("÷");
    JTextField screen1 = new JTextField();
    JTextField screen2 = new JTextField();
            @Override
        public void keyTyped(KeyEvent e) {
        }
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch( keyCode ) {
                case KeyEvent.VK_1:
                   one.doClick();
                break;
                case KeyEvent.VK_NUMPAD1:
                    one.doClick();
                break;
                case KeyEvent.VK_2:
                    two.doClick();
                break;
                case KeyEvent.VK_NUMPAD2:
                    two.doClick();
                break;
                case KeyEvent.VK_3:
                    three.doClick();
                break;
                case KeyEvent.VK_NUMPAD3:
                    three.doClick();
                break;
                case KeyEvent.VK_4 :
                    four.doClick();
                break;
                case KeyEvent.VK_NUMPAD4:
                    four.doClick();
                break;
                case KeyEvent.VK_5 :
                    five.doClick();
                break;
                case KeyEvent.VK_NUMPAD5:
                    five.doClick();
                break;
                case KeyEvent.VK_6 :
                    six.doClick();
                break;
                case KeyEvent.VK_NUMPAD6:
                    six.doClick();
                break;
                case KeyEvent.VK_7 :
                    seven.doClick();
                break;
                case KeyEvent.VK_NUMPAD7:
                    seven.doClick();
                break;
                case KeyEvent.VK_8 :
                    eight.doClick();
                break;
                case KeyEvent.VK_NUMPAD8:
                    eight.doClick();
                break;
                case KeyEvent.VK_9 :
                    nine.doClick();
                break;
                case KeyEvent.VK_NUMPAD9:
                    nine.doClick();
                break;
                case KeyEvent.VK_0 :
                    zero.doClick();
                break;
                case KeyEvent.VK_NUMPAD0:
                    zero.doClick();
                break;
                case KeyEvent.VK_BACK_SPACE :
                    back.doClick();
                break;
                case KeyEvent.VK_PLUS :
                    plus.doClick();
                break;
                case KeyEvent.VK_ADD :
                    plus.doClick();
                break;
                case KeyEvent.VK_MINUS :
                    minus.doClick();
                break;
                case KeyEvent.VK_SUBTRACT :
                    minus.doClick();
                break;
                case KeyEvent.VK_DIVIDE :
                    divide.doClick();
                break;
                case KeyEvent.VK_SLASH :
                    divide.doClick();
                break;
                case KeyEvent.VK_PERIOD :
                    dot.doClick();
                break;
                case KeyEvent.VK_DECIMAL :
                    dot.doClick();
                break;
                case KeyEvent.VK_EQUALS :
                    equal.doClick();
                break;
                case KeyEvent.VK_MULTIPLY :
                    multiply.doClick();
                break;
                case KeyEvent.VK_DELETE :
                    clean_entry.doClick();
                break;
                case KeyEvent.VK_ESCAPE :
                    clean.doClick();
                break;
                case KeyEvent.VK_ENTER :
                    equal.doClick();
                break;
            }
        }
        @Override
        public void keyReleased(KeyEvent e) {
        }
    public CalculatorGui(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);
        setIconImage(img.getImage());
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        one.setFocusable(false);
        two.setFocusable(false);
        three.setFocusable(false);
        four.setFocusable(false);
        five.setFocusable(false);
        six.setFocusable(false);
        seven.setFocusable(false);
        eight.setFocusable(false);
        nine.setFocusable(false);
        zero.setFocusable(false);
        plus.setFocusable(false);
        minus.setFocusable(false);
        multiply.setFocusable(false);
        dot.setFocusable(false);
        sign.setFocusable(false);
        back.setFocusable(false);
        divide.setFocusable(false);
        equal.setFocusable(false);
        clean.setFocusable(false);
        clean_entry.setFocusable(false);
        screen1.setEditable(false);
        screen1.setBorder(null);
        screen1.setFocusable(false);
        screen2.setEditable(false);
        screen2.setBorder(null);
        screen2.setText(Fscreen);
        screen2.setFont(new java.awt.Font("Tahoma", 1, 25));
        screen2.setFocusable(false);
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(screen2, GroupLayout.Alignment.TRAILING)
                    .addComponent(screen1, GroupLayout.Alignment.TRAILING)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(sign, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(one, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(four, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clean_entry, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seven, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(zero, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(two, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(five, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eight, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clean, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(dot, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(three, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(six, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nine, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(back, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(divide, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(minus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(plus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(equal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(multiply, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(screen1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(screen2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(clean_entry)
                    .addComponent(clean, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(divide, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(eight)
                    .addComponent(nine)
                    .addComponent(multiply)
                    .addComponent(seven))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(four)
                    .addComponent(five)
                    .addComponent(six)
                    .addComponent(minus))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(one)
                    .addComponent(two)
                    .addComponent(three)
                    .addComponent(plus))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(sign)
                    .addComponent(zero)
                    .addComponent(dot)
                    .addComponent(equal))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
        one.addActionListener((ActionEvent e) -> {
            if("0".equals(Fscreen))
                Fscreen = "";
            if(Fscreen.length() == 12 || error)
                return;
            Fscreen += "1";
            screen2.setText(Fscreen);
        });
        two.addActionListener((ActionEvent e) -> {
            if("0".equals(Fscreen))
                Fscreen = "";
            if(Fscreen.length() == 12 || error)
                return;
            Fscreen += "2";
            screen2.setText(Fscreen);
        });
        three.addActionListener((ActionEvent e) -> {
            if("0".equals(Fscreen))
                Fscreen = "";
            if(Fscreen.length() == 12 || error)
                return;
            Fscreen += "3";
            screen2.setText(Fscreen);
        });
        four.addActionListener((ActionEvent e) -> {
            if("0".equals(Fscreen))
                Fscreen = "";
            if(Fscreen.length() == 12 || error)
                return;
            Fscreen += "4";
            screen2.setText(Fscreen);
        });
        five.addActionListener((ActionEvent e) -> {
            if("0".equals(Fscreen))
                Fscreen = "";
            if(Fscreen.length() == 12 || error)
                return;
            Fscreen += "5";
            screen2.setText(Fscreen);
        });
        six.addActionListener((ActionEvent e) -> {
            if("0".equals(Fscreen))
                Fscreen = "";
            if(Fscreen.length() == 12 || error)
                return;
            Fscreen += "6";
            screen2.setText(Fscreen);
        });
        seven.addActionListener((ActionEvent e) -> {
            if("0".equals(Fscreen))
                Fscreen = "";
            if(Fscreen.length() == 12 || error)
                return;
            Fscreen += "7";
            screen2.setText(Fscreen);
        });
        eight.addActionListener((ActionEvent e) -> {
            if("0".equals(Fscreen))
                Fscreen = "";
            if(Fscreen.length() == 12 || error)
                return;
            Fscreen += "8";
            screen2.setText(Fscreen);
        });
        nine.addActionListener((ActionEvent e) -> {
            if("0".equals(Fscreen))
                Fscreen = "";
            if(Fscreen.length() == 12 || error)
                return;
            Fscreen += "9";
            screen2.setText(Fscreen);
        });
        zero.addActionListener((ActionEvent e) -> {
            if("0".equals(Fscreen))
                Fscreen = "";
            if(Fscreen.length() == 12 || error)
                return;
            Fscreen += "0";
            screen2.setText(Fscreen);
        });
        back.addActionListener((ActionEvent e) -> {
            if(error) return;
            if(Fscreen.length() <= 1 || (Fscreen.length() == 2 && Fscreen.contains("-"))){
                Fscreen = "0";
                screen2.setText(Fscreen);
            }
            else{
                Fscreen = Fscreen.substring(0, Fscreen.length()-1);
                screen2.setText(Fscreen);
            }
        });
        clean.addActionListener((ActionEvent e) -> {
            error = false;
            Fscreen = "0";
            Sscreen = "";
            value1 = 0;
            value2 = 0;
            signal = '?';
            screen2.setText(Fscreen);
            screen1.setText(Sscreen);
        });
        clean_entry.addActionListener((ActionEvent e) -> {
            if(error) return;
            Fscreen = "0";
            screen2.setText(Fscreen);
        });
        dot.addActionListener((ActionEvent e) -> {
            if(Fscreen.length() == 12 || Fscreen.contains(".") || error)
                return;
            Fscreen += ".";
            screen2.setText(Fscreen);
        });
        sign.addActionListener((ActionEvent e) -> {
            if(Fscreen.length() == 12 || "0".equals(Fscreen) || error)
                return;
            else if(Fscreen.contains("-")){
                Fscreen = Fscreen.substring(1);
                screen2.setText(Fscreen);
                return;
            }
            Fscreen = "-"+Fscreen;
            screen2.setText(Fscreen);
        });
        plus.addActionListener((ActionEvent e) -> {
            if((signal == '?'&&"0".equals(Fscreen)) || error)
                return;
            if("0".equals(Fscreen)){
                Sscreen = Sscreen.substring(0, Sscreen.length()-3);
                Sscreen += " + ";
            }
            else{
            if("".equals(Sscreen)){
                value1 = Double.parseDouble(Fscreen);
                Sscreen += Fscreen+" + ";
            }
            else{
                value2 = Double.parseDouble(Fscreen);
                value1 = Calculate();
                if(error) return;
                Sscreen += Fscreen+" + ";
                Fscreen = (new BigDecimal(Double.toString(value1)).stripTrailingZeros().toPlainString());
                screen2.setText(Fscreen);
            }
            }
            signal = '+';
            Fscreen = "0";
            screen1.setText(Sscreen);
        });
        minus.addActionListener((ActionEvent e) -> {
            if((signal == '?'&&"0".equals(Fscreen)) || error)
                return;
            if("0".equals(Fscreen)){
                Sscreen = Sscreen.substring(0, Sscreen.length()-3);
                Sscreen += " - ";
            }
            else{
            if("".equals(Sscreen)){
                value1 = Double.parseDouble(Fscreen);
                Sscreen += Fscreen+" - ";
            }
            else{
                value2 = Double.parseDouble(Fscreen);
                value1 = Calculate();
                if(error) return;
                Sscreen += Fscreen+" - ";
                Fscreen = (new BigDecimal(Double.toString(value1)).stripTrailingZeros().toPlainString());
                screen2.setText(Fscreen);
            }
            }
            signal = '-';
            Fscreen = "0";
            screen1.setText(Sscreen);
        });
        multiply.addActionListener((ActionEvent e) -> {
            if((signal == '?'&&"0".equals(Fscreen)) || error)
                return;
            if("0".equals(Fscreen)){
                Sscreen = Sscreen.substring(0, Sscreen.length()-3);
                Sscreen += " x ";
            }
            else{
            if("".equals(Sscreen)){
                value1 = Double.parseDouble(Fscreen);
                Sscreen += Fscreen+" x ";
            }
            else{
                value2 = Double.parseDouble(Fscreen);
                value1 = Calculate();
                if(error) return;
                Sscreen += Fscreen+" x ";
                Fscreen = (new BigDecimal(Double.toString(value1)).stripTrailingZeros().toPlainString());
                screen2.setText(Fscreen);
            }
            }
            signal = 'x';
            Fscreen = "0";
            screen1.setText(Sscreen);
        });
        divide.addActionListener((ActionEvent e) -> {
        if((signal == '?'&&"0".equals(Fscreen)) || error)
                return;
            if("0".equals(Fscreen)){
                Sscreen = Sscreen.substring(0, Sscreen.length()-3);
                Sscreen += " ÷ ";
            }
            else{
            if("".equals(Sscreen)){
                value1 = Double.parseDouble(Fscreen);
                Sscreen += Fscreen+" ÷ ";
            }
            else{
                value2 = Double.parseDouble(Fscreen);
                value1 = Calculate();
                if(error) return;
                Sscreen += Fscreen+" ÷ ";
                Fscreen = (new BigDecimal(Double.toString(value1)).stripTrailingZeros().toPlainString());
                screen2.setText(Fscreen);
            }
            }
            signal = '÷';
            Fscreen = "0";
            screen1.setText(Sscreen);
        });
        equal.addActionListener((ActionEvent e) -> {
            if(signal == '?' || error)
                return;
            value2 = Double.parseDouble(Fscreen);
            value1 = Calculate();
            if(error) return;
            Fscreen = (new BigDecimal(Double.toString(value1)).stripTrailingZeros().toPlainString());
            Sscreen = "";
            screen2.setText(Fscreen);
            screen1.setText(Sscreen);
            signal = '?';
        });
        one.addKeyListener(null);
    }
    private double Calculate(){
     if(signal == '+')
         return value1 + value2;
     else if(signal == '-')
         return value1 - value2;
     else if(signal == 'x')
         return value1 * value2;
     else if(signal == '÷'){
         if (value2 == 0)
         {
            Fscreen = "Error";
            error = true;
            screen2.setText(Fscreen);
            return 0;
         }
         else
         return value1 / value2;
     }
     else return 0;
    }

}
