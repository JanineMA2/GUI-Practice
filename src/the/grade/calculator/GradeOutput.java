/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package the.grade.calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


/**
 *
 * @author janin
 */
public class GradeOutput extends JFrame{
    // Declare private variables for the Swing components
    private JLabel lblStudentName, lblStudentNo, lblQuiz1, lblQuiz2, lblQuiz3, lblAveGrade;
    private JTextField txtStudentName, txtStudentNo, txtQuiz1, txtQuiz2, txtQuiz3, txtAveGrade;
    private JButton closeButton;
    
    // Declare private variables for the Swing components
    public GradeOutput(Student stud){ 
        JFrame frame = new JFrame();
        
        stud.computeAverage();
        
        // Create the components
        // Create labels
        lblStudentName = new JLabel("Student Name:");
        lblStudentNo = new JLabel("Student No:");
        lblQuiz1 = new JLabel("Quiz 1:");
        lblQuiz2 = new JLabel("Quiz 2:");
        lblQuiz3 = new JLabel("Quiz 3:");
        lblAveGrade = new JLabel("Average Grade:");
        
         // Create Student Name textfield
        txtStudentName = new JTextField(30);
        txtStudentName.setEnabled(false);
        txtStudentName.setText(stud.getStudentName());
       
        // Create Student Number textfield
        txtStudentNo = new JTextField(30);
        txtStudentNo.setEnabled(false);
        txtStudentNo.setText(stud.getStudentNumber());
       
        // Create Quiz 1 textfield
        txtQuiz1 = new JTextField(10);
        txtQuiz1.setEnabled(false);
        txtQuiz1.setText(stud.getQuiz1());
       
        // Create Quiz 2 textfield
        txtQuiz2 = new JTextField(10);
        txtQuiz2.setEnabled(false);
        txtQuiz2.setText(stud.getQuiz2());
       
        // Create Quiz 3 textfield
        txtQuiz3 = new JTextField(10);
        txtQuiz3.setEnabled(false);
        txtQuiz3.setText(stud.getQuiz3());
       
        // Create Average Grade textfield
        txtAveGrade = new JTextField(10);
        txtAveGrade.setEnabled(false);
        txtAveGrade.setText(stud.getAveGrade());

        
        
        
        
        
        
//        // Define the panel to hold the components  
//        JPanel panel = new JPanel();
//        SpringLayout layout = new SpringLayout();
//        panel.setSize(300, 300);
//        panel.setLayout(layout);
       
        
        
        
        
        
        
        
        
        
        
        
        
//        frame.add(panel);
        frame.setTitle("Grade Summary- Home Page");
        frame.pack();
        frame.setVisible(true);
    
    
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
//        new GradeOutput();
    }  
}
