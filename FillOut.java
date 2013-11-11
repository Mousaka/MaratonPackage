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
public class FillOut extends JPanel{

    private JLabel startNr, name, nationality, age;
    private JTextField nameText, nationalityText, ageText;
    private static int stNr = 1;
    public void emptyFields(){
        nameText.setText("");
        nationalityText.setText("");
        ageText.setText("");
    }
    public String getNameText() {
        return nameText.getText();
    }
    
    public void addOneStartNr(){
        stNr++;
    }
    
    public int getStartNr(){
        return stNr;
    }

    public String getNationalityText() {
        return nationalityText.getText();
    }

    public int getAgeText() {
        System.out.println("ageText: "+ageText.getText());
        int i;
        try{
         i = Integer.parseInt(ageText.getText());
        }catch(NumberFormatException e){
         i = -1;   
        }
        return i;
    }


    JPanel pane, pane2, pName,pAge,pNationality;

    public FillOut() {
        pane = new JPanel();
        pane2 = new JPanel();
        pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));
        pAge = new JPanel();
        pName = new JPanel();
        pNationality = new JPanel();
        
        startNr = new JLabel("Startnr "+ stNr);
        pane.add(startNr);
        name = new JLabel("Namn: ");
        pName.add(name);
               
        nameText = new JTextField(15);
        pName.add(nameText);
        pane.add(pName);
     
        nationality = new JLabel("Land: ");
        pNationality.add(nationality);

        nationalityText = new JTextField(15);
        pNationality.add(nationalityText);
        pane.add(pNationality);
        
        age = new JLabel("Ålder: ");
        pAge.add(age);

        ageText = new JTextField(5);
        pAge.add(ageText);
        pane.add(pAge);
       
        
        add(pane);
        setLayout(new FlowLayout());
      //  setTitle("Ny tävlande");
      //  setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
    //    setLocationRelativeTo(null);
        
        System.out.println("Nametext: "+ getNameText());
    }

    
}