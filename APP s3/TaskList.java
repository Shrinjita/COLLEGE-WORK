import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskList {
    private List<String> tasks;
String a[];
    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            String removedTask = tasks.remove(index);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid index. No task removed.");
        }
    }

    public void markTaskCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            String task = tasks.get(index);
            tasks.set(index, "[Completed] " + task);
            System.out.println("Task marked as completed: " + task);
        } else {
            System.out.println("Invalid index. No task marked as completed.");
        }
    }

    public void displayTasks() {
        System.out.println("Task List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList();

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the task to add: ");
                    String taskToAdd = scanner.nextLine();
                    taskList.addTask(taskToAdd);
                    break;
                case 2:
                    System.out.print("Enter the index of the task to remove: ");
                    int indexToRemove = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    taskList.removeTask(indexToRemove - 1);
                    break;
                case 3:
                    System.out.print("Enter the index of the task to mark as completed: ");
                    int indexToMarkCompleted = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    taskList.markTaskCompleted(indexToMarkCompleted - 1);
                    break;
                case 4:
                    taskList.displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
