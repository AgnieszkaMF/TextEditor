
package editor;

import javax.swing.JFrame;


public class Editor {

    
    public static void main(String[] args) {
        
        editorJF obj = new editorJF();
        
        obj.setSize(640, 490);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setTitle("TextEditor");
        obj.setVisible(true);
        obj.setResizable(false);
        
        
        
    }
    
}
