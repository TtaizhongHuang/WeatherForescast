package ui;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import data.*;
import analyze.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
;public class test {

   

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	forcast f = new forcast(0);
                JFrame frame = new JFrame("339");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel panel = new JPanel(new GridLayout(0,1));
                frame.getContentPane().add(panel);
                JLabel label = new JLabel("");
                JLabel l1 = new JLabel("Temprature:");
                JTextField f1 = new JTextField("0");
                JLabel l2 = new JLabel("Humidity:");
                JTextField f2 = new JTextField("0");
                JLabel l3 = new JLabel("adjust value(¡À5):");
                JTextField f3 = new JTextField("0");
                JButton b =  new JButton("set");
                

                panel.add(label);
                panel.add(l1);
                panel.add(f1);
                panel.add(l2);
                panel.add(f2);
                panel.add(l3);
                panel.add(f3);
                panel.add(b);


                frame.pack();
                frame.setVisible(true);
                
                senser s = new senser();
                Timer timer = new Timer();
                timer.scheduleAtFixedRate(new TimerTask() {

                    @Override
                    public void run() {
                    	label.setText(f.getForcast(s.getData()));
                    	System.out.println(s.getData().temp());//This line is only for testing, its not a good piece of code.
                    }
                }, 1000,5000);
                
                b.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						
						try{
						testSenser t = new testSenser(Integer.parseInt(f1.getText()),Integer.parseInt(f2.getText()));
						label.setText(f.getForcast(t.getData()));
						}catch(Exception exc){
							label.setText("error");
						}
	                	
					}
                	
                });
            }
       });
    }
}
