//import java.awt.Color;
import java.io.File;
import java.util.*;
import javax.swing.JFileChooser;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class MainFrame extends javax.swing.JFrame {
    
    private int slc=1, crv=1, mtn=1;
    private File file;
    private String filename = "graf.txt";
    

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        fileChooser = new javax.swing.JFileChooser();
        selection1 = new javax.swing.JRadioButton();
        selection2 = new javax.swing.JRadioButton();
        crossover1 = new javax.swing.JRadioButton();
        crossover2 = new javax.swing.JRadioButton();
        mutation1 = new javax.swing.JRadioButton();
        gotoweButton = new javax.swing.JButton();
        selectionLabel = new javax.swing.JLabel();
        crossoverLabel = new javax.swing.JLabel();
        mutationLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        plikButton = new javax.swing.JButton();

        fileChooser.setFileFilter(new FileFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(selection1);
        selection1.setSelected(true);
        selection1.setText("Random");
        selection1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selection1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(selection2);
        selection2.setText("Best Parent");
        selection2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selection2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(crossover1);
        crossover1.setSelected(true);
        crossover1.setText("One Point");
        crossover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crossover1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(crossover2);
        crossover2.setText("Two Point");
        crossover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crossover2ActionPerformed(evt);
            }
        });

        buttonGroup3.add(mutation1);
        mutation1.setSelected(true);
        mutation1.setText("Jedyna możliwa iksde");
        mutation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutation1ActionPerformed(evt);
            }
        });

        gotoweButton.setText("Gotowe");
        gotoweButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                gotoweButtonMouseReleased(evt);
            }
        });

        selectionLabel.setLabelFor(selection1);
        selectionLabel.setText("Metoda selection:");

        crossoverLabel.setLabelFor(crossover1);
        crossoverLabel.setText("Metoda crossover:");

        mutationLabel.setLabelFor(mutation1);
        mutationLabel.setText("Metoda mutacji:");

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        plikButton.setText("Wczytaj plik");
        plikButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                plikButtonMouseReleased(evt);
            }
        });
        plikButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plikButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectionLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selection2)
                            .addComponent(selection1))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(crossover2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(crossover1)
                                    .addComponent(crossoverLabel))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mutationLabel)
                                    .addComponent(mutation1))))
                        .addContainerGap(239, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plikButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gotoweButton))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectionLabel)
                    .addComponent(crossoverLabel)
                    .addComponent(mutationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selection1)
                    .addComponent(crossover1)
                    .addComponent(mutation1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selection2)
                    .addComponent(crossover2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plikButton)
                    .addComponent(gotoweButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void crossover1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        crv=1;
    }                                          

    private void selection1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        slc=1;
    }                                          

    private void selection2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        slc=2;
    }                                          

    private void crossover2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        crv=2;
    }                                          

    private void mutation1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        mtn=1;
    }                                         
    /*    */
    private void gotoweButtonMouseReleased(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
        textArea.setText("lalala");
        Graph g = new Graph(filename);
        Vector<Vertex> chromosom;
        chromosom = g.load();
        Parent p1 = new Parent();
        
        for (int p = 0; p < 1300; p++) {
            
            if(slc == 1)
            {
                Map.Entry<Integer,Integer> parent = p1.random(chromosom);

                if(crv == 1)
                {
                    if(mtn == 1) Mutation.one(Crossover.onePoint(parent, chromosom), 15);
                    //else if(mtn == 2) Mutation.two...
                    textArea.setText("Selection - Random\nCrossover - One Point");
                }

                else if(crv == 2)
                {
                    if(mtn == 1) Mutation.one(Crossover.twoPoint(parent, chromosom), 15);
                    textArea.setText("Selection - Random\nCrossover - Two Point");
                }
            }

            else if(slc == 2)
            {
                Map.Entry<Integer,Integer> parent=p1.bestparent(chromosom);

                if(crv == 1)
                {
                    if(mtn == 1) Mutation.one(Crossover.onePoint(parent, chromosom), 15);
                    //else if(mtn == 2) Mutation.two...
                    textArea.setText("Selection - Best Parent\nCrossover - One Point");
                }

                else if(crv == 2)
                {
                    if(mtn == 1) Mutation.one(Crossover.twoPoint(parent, chromosom), 15);
                    textArea.setText("Selection - Best Parent\nCrossover - Two Point");
                }
            }
        }
        
       
        
        /*for (int j = 0; j < chromosom.size(); j++) {
            if (chromosom.get(j).id != 150) {
                textArea.setText("poczatek wierzchołka");
                textArea.setText("ID: " + chromosom.get(j).id);
                textArea.setText("Kolor: " + chromosom.get(j).kolor);
                textArea.setText("Sąsiedzi:");
                for (int d = 0; d < chromosom.get(j).sasiedzi.size(); d++) {
                    textArea.setText(String.valueOf(chromosom.get(j).sasiedzi.get(d)));
                    textArea.setText(" kolor: " + chromosom.get(d).kolor);
                }
                textArea.setText("koniec wierzchołka");
                textArea.setText("\n");
            }
        }
        
        for (int j = 0; j < chromosom.size(); j++) {
            if (chromosom.get(j).id != 150) {
//                textArea.setText("poczatek wierzchołka");
                textArea.setText("ID: " + chromosom.get(j).id);
                textArea.setText("Kolor: " + chromosom.get(j).kolor);
//                textArea.setText("koniec wierzchołka");
                textArea.setText("\n");
            }
        }*/
        
        Display d = new Display();

        d.graph(chromosom);
        d.goodNeighbour(chromosom);
    }                                          

    private void plikButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void plikButtonMouseReleased(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(this);
        
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            file = fileChooser.getSelectedFile();
            filename = file.toString();
            
        }

    }                                        
/**/
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    class FileFilter extends javax.swing.filechooser.FileFilter {
        @Override
        public boolean accept(File file) {
            // Allow only directories, or files with ".txt" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
        }
        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "Text documents (*.txt)";
        }
    } 

    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton crossover1;
    private javax.swing.JRadioButton crossover2;
    private javax.swing.JLabel crossoverLabel;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton gotoweButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton mutation1;
    private javax.swing.JLabel mutationLabel;
    private javax.swing.JButton plikButton;
    private javax.swing.JRadioButton selection1;
    private javax.swing.JRadioButton selection2;
    private javax.swing.JLabel selectionLabel;
    private javax.swing.JTextArea textArea;
    // End of variables declaration                   
}
