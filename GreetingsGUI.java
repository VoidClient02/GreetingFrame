/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.a.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Mpho M
 */
public class GreetingsGUI extends JFrame{
     //panels
     private JPanel namePl;
     private JPanel suNamePl;
     private JPanel nameAndSurnamePl;
     private JPanel greetingsPl;
     private JPanel btnPl;
     private JPanel mainPl;
     private JPanel headingPl;
     //labels
     private JLabel greetingsLb;
     private JLabel nameLb;
     private JLabel surNameLb;
     //text fields
     private JTextField nameTf;
     private JTextField surNameTf;
     //text area
     private JTextArea greetingsTextArea; 
     //buttons
     private JButton greetBtn;
     private JButton clearBtn;
     private JButton exitBtn;
     
    public GreetingsGUI (){
      //create the frame
        //title
        setTitle("Greeting UI");
        //make it not resizable
        setResizable(false);
        //set the size
        setSize(350,400); //width, height
        //exit when i close
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //set background color
        setForeground(Color.YELLOW);
       
        //PANELS
        //name panel
        JPanel namePl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //surname panel
        JPanel surNamePl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //name&surname panel
        JPanel nameAndSurnamePl = new JPanel(new GridLayout(2, 1));
        JPanel greetingsPl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        //button panel
        JPanel btnPl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        //mainPl
        JPanel mainPl = new JPanel();
        //heading
        JPanel headingPl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        //we use [.setBorder(new BevelBorder(BevelBorder.__)
        //it is used to create a TWO-LINE BORDER
        headingPl.setBorder(new BevelBorder(BevelBorder.RAISED));
        //LABELS 
        //greetings 
        JLabel greetingsLb = new JLabel("Greetings App");
        //name
        JLabel nameLb = new JLabel("Name:       ");
        //surname
        JLabel surNameLb = new JLabel("Surname:  ");
        
        //TEXT FIELDS
        JTextField nameTf = new JTextField(20);
        JTextField surNameTf = new JTextField(20);
        
        //TEXT AREA
        JTextArea greetingsTextArea = new JTextArea(10, 30);
        //allows the area to either be editable or not
        greetingsTextArea.setEditable(false);
        //SET a grey-out set text
        greetingsTextArea.setText("Hello [name] [surname]");
        
        //BUTTONS
        JButton greetBtn = new JButton("Greet");
        JButton clearBtn = new JButton("Clear");
        JButton exitBtn = new JButton("Exits");
    
        //add name [label & textfield] to name panel
        namePl.add(nameLb);
        namePl.add(nameTf);
        
        //add surname [label & textfield] to surname panel
        surNamePl.add(surNameLb);
        surNamePl.add(surNameTf);
        
        //add the name nd surname panels to the nameAndSurname panel
        nameAndSurnamePl.add(namePl);
        nameAndSurnamePl.add(surNamePl);
        
        //add the greetings text area to panel
        greetingsPl.add(greetingsTextArea);
        /*to add a border title we use 
                .setBorder(new TitleBorder(
                   new LineBorder(Color.color, 1), "text")); 
        OR 
             .setBorder(new TitleBordeer("text));
        */
        greetingsPl.setBorder(new TitledBorder("Greetings Text"));
        //add buttons to panel
        btnPl.add(greetBtn);
        btnPl.add(clearBtn);
        btnPl.add(exitBtn);
        
        //add heading to panel
        headingPl.add(greetingsLb);
        
        //add all panels to main panel
        //Use borderLayout to navigate the COMPASS LAYOUT
        mainPl.add(nameAndSurnamePl, BorderLayout.NORTH);
        mainPl.add(greetingsPl, BorderLayout.CENTER);
        mainPl.add(btnPl, BorderLayout.SOUTH);
        
        //add the main panel to the frame panel
        add(headingPl, BorderLayout.NORTH);
        add(mainPl, BorderLayout.CENTER);
        
        //set visible
        setVisible(true);
    }  
   
}
