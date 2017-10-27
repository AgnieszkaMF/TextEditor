package editor;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import javax.swing.text.StyledEditorKit;


public class editorJF extends javax.swing.JFrame {

       String filename;
       JComboBox styleBox;
       
       
    public editorJF() {
        
        JButton boldButton = new JButton();
        boldButton.setSize(50,20);
        boldButton.setLocation(120,20);
        add(boldButton);
        boldButton.setAction(new StyledEditorKit.BoldAction());
        boldButton.setText("<html><b>B</html>");
        
        JButton italicButton = new JButton();
        italicButton.setSize(50,20);
        italicButton.setLocation(180,20);
        add(italicButton);
        italicButton.setAction(new StyledEditorKit.ItalicAction());
        italicButton.setText("<html><i>I</html>");
       
        
        JButton underlineButton = new JButton();
        underlineButton.setSize(50,20);
        underlineButton.setLocation(240,20);
        add(underlineButton);
        underlineButton.setAction(new StyledEditorKit.UnderlineAction());
        underlineButton.setText("<html><u>U</html>");
        
        
        
        
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        colorButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPane = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newMenu = new javax.swing.JMenuItem();
        openMenu = new javax.swing.JMenuItem();
        saveMenu = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenu = new javax.swing.JMenuItem();
        copyMenu = new javax.swing.JMenuItem();
        pasteMenu = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        colorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/color.png"))); // NOI18N
        colorButton.setBorderPainted(false);
        colorButton.setContentAreaFilled(false);
        colorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButtonActionPerformed(evt);
            }
        });

        textPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(textPane);

        fileMenu.setText("File");

        newMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/new.png"))); // NOI18N
        newMenu.setText("New");
        newMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuActionPerformed(evt);
            }
        });
        fileMenu.add(newMenu);

        openMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/open.png"))); // NOI18N
        openMenu.setText("Open");
        openMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuActionPerformed(evt);
            }
        });
        fileMenu.add(openMenu);

        saveMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/save.png"))); // NOI18N
        saveMenu.setText("Save");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenu);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");

        cutMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cutMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/cut.png"))); // NOI18N
        cutMenu.setText("Cut");
        cutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuActionPerformed(evt);
            }
        });
        editMenu.add(cutMenu);

        copyMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copyMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/copy.png"))); // NOI18N
        copyMenu.setText("Copy");
        copyMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuActionPerformed(evt);
            }
        });
        editMenu.add(copyMenu);

        pasteMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pasteMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/paste.png"))); // NOI18N
        pasteMenu.setText("Paste");
        pasteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuActionPerformed(evt);
            }
        });
        editMenu.add(pasteMenu);

        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colorButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorButton)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void newMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuActionPerformed
        
        textPane.setText("");
        setTitle(filename);
        
    }//GEN-LAST:event_newMenuActionPerformed

    private void openMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuActionPerformed
        openMenu = new JMenuItem();
        
        FileDialog fd = new FileDialog(editorJF.this, "Choose a file", FileDialog.LOAD);
        fd.setVisible(true);
        
          if (fd.getFile() !=null) {
            filename = fd.getDirectory() + fd.getFile();
            setTitle(filename);
        }
        
          try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            String line = null;
            
            while((line=br.readLine()) != null)
            {
                sb.append(line + "\n");
                textPane.setText(sb.toString());
            }
              br.close();
              
        } catch (IOException e) {
            System.out.println("Not found");
        }
           
    }//GEN-LAST:event_openMenuActionPerformed

    private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed
        
        saveMenu = new JMenuItem();
        
        FileDialog fd = new FileDialog(editorJF.this, "Save a file", FileDialog.SAVE);
        fd.setVisible(true);
        
        if (fd.getFile() !=null) {
            filename = fd.getDirectory() + fd.getFile();
            setTitle(filename);
        }
        
        try {
            FileWriter fw = new FileWriter(filename);
            fw.write(textPane.getText());
            setTitle(filename);
            fw.close();
                        
        } catch (IOException e) {
            System.out.println("Not save");
        }
        
    }//GEN-LAST:event_saveMenuActionPerformed

    private void colorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButtonActionPerformed
        
        JColorChooser jcc = new JColorChooser();
        Color c = jcc.showDialog(null, "Color", Color.yellow);
        textPane.setForeground(c);
        
    }//GEN-LAST:event_colorButtonActionPerformed

    private void pasteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuActionPerformed

        pasteMenu = new JMenuItem (new DefaultEditorKit.PasteAction());
        textPane.paste();

    }//GEN-LAST:event_pasteMenuActionPerformed

    private void copyMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuActionPerformed

        copyMenu = new JMenuItem (new DefaultEditorKit.CopyAction());
        textPane.copy();

    }//GEN-LAST:event_copyMenuActionPerformed

    private void cutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuActionPerformed

        cutMenu = new JMenuItem(new DefaultEditorKit.CutAction());
        textPane.cut();

    }//GEN-LAST:event_cutMenuActionPerformed
       
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editorJF().setVisible(true);
            }
        });
    }

    void getTitle(String editor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton colorButton;
    private javax.swing.JMenuItem copyMenu;
    private javax.swing.JMenuItem cutMenu;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem newMenu;
    private javax.swing.JMenuItem openMenu;
    private javax.swing.JMenuItem pasteMenu;
    private javax.swing.JMenuItem saveMenu;
    private javax.swing.JTextPane textPane;
    // End of variables declaration//GEN-END:variables
}
