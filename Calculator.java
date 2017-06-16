
package calculator;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;


/**
 *
 * @author ptam
 */

public class Calculator extends JFrame  
 {

    JButton numBtn0, numBtn1, numBtn2, numBtn3, numBtn4, numBtn5, numBtn6, numBtn7, numBtn8, numBtn9, cancelBtn, addBtn, subBtn, divideBtn, mulBtn;
    JTextField text;
    private static int num = 0;
    private static int sum = 0;
    
    
    public Calculator()
    {
        guiLogistics();
    }
          
    private void guiLogistics()
    {
        numBtn0 = new JButton("0");
        numBtn1 = new JButton("1");
        numBtn2 = new JButton("2");
        numBtn3 = new JButton("3");
        numBtn4 = new JButton("4");
        numBtn5 = new JButton("5");
        numBtn6 = new JButton("6");
        numBtn7 = new JButton("7");  
        numBtn8 = new JButton("8");
        numBtn9 = new JButton("9");
        cancelBtn = new JButton("C");
        addBtn = new JButton("+");
        subBtn = new JButton("-");
        divideBtn = new JButton("÷");
        mulBtn = new JButton("X"); 
        
        text = new JTextField("");
        text.setEditable(false);
        text.setFont(new Font("Times New Roman", Font.BOLD, 22));
      
         calculate();
        
          cancelBtn.addActionListener(new ActionListener()
      {
      @Override 
      public void actionPerformed(ActionEvent e)
      {
         num = 0;
         sum = 0;
         text.setText("");
      }
      });  
     
       createGUI(numBtn0,numBtn1, numBtn2, numBtn3, numBtn4, numBtn5, numBtn6, numBtn7, numBtn8, numBtn9, addBtn, subBtn, mulBtn, divideBtn);
    }
    
  
 private void calculate()
 {
     
       JButton button[] = {numBtn0,numBtn1, numBtn2, numBtn3, numBtn4, numBtn5, numBtn6, numBtn7, numBtn8, numBtn9};
       for(int i =0; i < button.length; i++)
         {
             num = Integer.parseInt(button[i].getText());
             String showNum = button[i].getText();
             button[i].addActionListener(new ActionListener()
      {
      @Override 
      public void actionPerformed(ActionEvent e)
      {
         text.setText(showNum);
      }
      });
             
         }
 }

    
       /*
      
           
            
            
            button[i].addActionListener(new ActionListener()
        { 
        @Override
        public void actionPerformed(ActionEvent e)
        {
         text.setText(Double.toString(num)); 
        }
        });
       }
           
            else if(addBtn.isSelected())
           {
               sum += num; 
               addBtn.addActionListener(new ActionListener()
        { 
        @Override
        public void actionPerformed(ActionEvent e)
        {
         text.setText(Double.toString(sum)); 
        }
        });
        }
            else if(subBtn.isSelected())
           {
               sum -= num;
               subBtn.addActionListener(new ActionListener()
        { 
        @Override
        public void actionPerformed(ActionEvent e)
        {
         text.setText(Double.toString(sum)); 
        }
        });
        }
            else if(mulBtn.isSelected())
            {
               sum *= num;
               text.setText(Double.toString(sum));
            }
            else if(divideBtn.isSelected())
            {
               sum /= num;
               text.setText(Double.toString(sum));
            } */
           
       
    
    
    


       
               
    public void createGUI(JComponent... arg)
    {
       
        JFrame frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 400));
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
       
      
        
        Container panel = frame.getContentPane();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
            
layout.setHorizontalGroup(layout.createSequentialGroup()
              
   // .addGroup(layout.createSequentialGroup()
   // .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
             .addComponent(text)
  .addGroup(layout.createSequentialGroup()
  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
               .addComponent(numBtn0)
               .addComponent(numBtn3)
               .addComponent(numBtn6)
               .addComponent(numBtn9)))
    .addGroup(layout.createSequentialGroup()
     .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
               .addComponent(numBtn1)
               .addComponent(numBtn4)
               .addComponent(numBtn7)))
             //  .addComponent(dotBtn)))
    .addGroup(layout.createSequentialGroup()
     .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING) 
              .addComponent(numBtn2)
              .addComponent(numBtn5)
              .addComponent(numBtn8)
              .addComponent(mulBtn)))
     .addGroup(layout.createSequentialGroup()
     .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING) 
             //.addComponent(entrBtn)
             .addComponent(addBtn)
             .addComponent(subBtn)
             .addComponent(numBtn8)
             .addComponent(divideBtn)))
    );

layout.setVerticalGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(text))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
    .addGroup(layout.createSequentialGroup()
         .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(numBtn0)
            .addComponent(numBtn1)
            .addComponent(numBtn2))
          //  .addComponent(entrBtn))
         .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(numBtn3)
            .addComponent(numBtn4)
            .addComponent(numBtn5)
            .addComponent(addBtn))   
         .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(numBtn6)
            .addComponent(numBtn7)
            .addComponent(numBtn8)
            .addComponent(subBtn))
         .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(numBtn9)
         //   .addComponent(dotBtn)
            .addComponent(mulBtn)
            .addComponent(divideBtn))))
              
        
);

        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String args[]) 
    {
             Calculator calc = new Calculator();
             calc.pack();
             calc.setVisible(true);
       
    }
   }
    

