import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class AttendanceManagementGUI extends JFrame {
    private Map<String, Boolean> attendanceMap;

    public AttendanceManagementGUI() {
        attendanceMap = new HashMap<>();

        setTitle("Attendance Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JButton markAttendanceButton = new JButton("Mark Attendance");
        JButton displayAttendanceButton = new JButton("Display Attendance");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(markAttendanceButton);
        buttonPanel.add(displayAttendanceButton);

        JTextArea attendanceTextArea = new JTextArea();
        attendanceTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(attendanceTextArea);

        add(buttonPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        markAttendanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentId = JOptionPane.showInputDialog("Enter Student ID:");
                markAttendance(studentId);
            }
        });

        displayAttendanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayAttendance(attendanceTextArea);
            }
        });
    }

    private void markAttendance(String studentId) {
        if (attendanceMap.containsKey(studentId)) {
            JOptionPane.showMessageDialog(this, "Attendance already marked for student with ID: " + studentId);
        } else {
            attendanceMap.put(studentId, true);
            JOptionPane.showMessageDialog(this, "Attendance marked for student with ID: " + studentId);
        }
    }

    private void displayAttendance(JTextArea attendanceTextArea) {
        attendanceTextArea.setText("Attendance List:\n");
        for (Map.Entry<String, Boolean> entry : attendanceMap.entrySet()) {
            attendanceTextArea.append("Student ID: " + entry.getKey() + ", Present: " + entry.getValue() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AttendanceManagementGUI().setVisible(true);
            }
        });
    }
}
