/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autocompletecombo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Noman
 */
public class AutocompleteCombo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {

                List<Model> myWords = new ArrayList<Model>();

                myWords.add(new Model("1","bike"));
                myWords.add(new Model("2","car"));
                myWords.add(new Model("3","cap"));
                myWords.add(new Model("4","cape"));
                myWords.add(new Model("5","canadian"));
                myWords.add(new Model("6","caprecious"));
                myWords.add(new Model("7","catepult"));
                

//                myWords.add("car");
//
//                myWords.add("cap");
//
//                myWords.add("cape");
//
//                myWords.add("canadian");
//
//                myWords.add("caprecious");
//
//                myWords.add("catepult");



                StringSearchable searchable = new StringSearchable(myWords);

                AutocompleteJComboBox combo = new AutocompleteJComboBox(searchable);



                JFrame frame = new JFrame();

                frame.add(combo);

                frame.pack();

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setVisible(true);

            }
        });

    }
    
    
    
}
