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
    public JTextField getNameText() {
        return nameText;
    }

    public JTextField getNationalityText() {
        return nationalityText;
    }

    public JTextField getAgeText() {
        return ageText;
    }
    private JButton ok, cancel;

    public JButton getOk() {
        return ok;
    }
    JPanel pane, pane2, pName,pAge,pNationality;

    public FillOut() {
        pane = new JPanel();
        pane2 = new JPanel();
        pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));
        pAge = new JPanel();
        pName = new JPanel();
        pNationality = new JPanel();
        
        startNr = new JLabel("Startnr 1");
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
        ok = new JButton("Spara");
        pane2.add(ok);
        cancel = new JButton("Avbryt");

        pane2.add(cancel);
        pane.add(pane2);
        
        add(pane);
        setLayout(new FlowLayout());
      //  setTitle("Ny tävlande");
      //  setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
    //    setLocationRelativeTo(null);
    }

 
}