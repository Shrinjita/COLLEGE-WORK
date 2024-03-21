import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Simple GUI Example");

        // Create a label
        JLabel label = new JLabel("Hello, Java Swing!");

        // Add the label to the frame
        frame.add(label);

        // Set the size of the frame
        frame.setSize(300, 100);

        // Specify how the frame should be closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
