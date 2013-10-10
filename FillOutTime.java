/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MaratonPackage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author krille
 */
public class FillOutTime extends JPanel{

    private JLabel startNr, time;
    private JTextField startNrText, timeText;
    
    
    public void emptyFields(){
        startNrText.setText("");
        timeText.setText("");
    }
    public int getStartNrText() {
        return Integer.parseInt(startNrText.getText());
    }

    public double getTimeText() {
        System.out.println("TimeText: "+timeText.getText());
        return Double.parseDouble(timeText.getText());
    }


    JPanel pane, pane2, pStartnr,pTime,pNationality;

    public FillOutTime() {
        pane = new JPanel();
        pane2 = new JPanel();
        pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));
        pTime = new JPanel();
        pStartnr = new JPanel();
        
        
        startNr = new JLabel("Startnr: ");
        pStartnr.add(startNr);
                       
        startNrText = new JTextField(6);
        pStartnr.add(startNrText);
        pane.add(pStartnr);
             
        time = new JLabel("Tid: ");
        pTime.add(time);

        timeText = new JTextField(5);
        pTime.add(timeText);
        pane.add(pTime);
       
        
        add(pane);
        setLayout(new FlowLayout());
      //  setTitle("Ny tävlande");
      //  setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
    //    setLocationRelativeTo(null);
    }

 
}