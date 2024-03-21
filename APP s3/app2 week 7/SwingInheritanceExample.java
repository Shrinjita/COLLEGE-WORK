import javax.swing.*;

public class SwingInheritanceExample extends JFrame {
    public SwingInheritanceExample() {
        // Set the title of the window
        setTitle("Swing Inheritance Example");
        
        // Set the size of the window
        setSize(400, 300);
        
        // Specify what happens when you close the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a label
        JLabel label = new JLabel("Hello, Swing!");
        
        // Add the label to the content pane of the window
        getContentPane().add(label);
        
        // Make the window visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the SwingInheritanceExample class
        SwingInheritanceExample example = new SwingInheritanceExample();
    }
}
