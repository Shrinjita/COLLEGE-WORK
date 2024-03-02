import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the class name: ");
        String className = scanner.nextLine();

        System.out.print("Enter the number of fields: ");
        int numFields = scanner.nextInt();

        // Consume the newline character left by nextInt()
        scanner.nextLine();

        String[] fieldNames = new String[numFields];
        String[] fieldTypes = new String[numFields];

        for (int i = 0; i < numFields; i++) {
            System.out.print("Enter the name for field " + (i + 1) + ": ");
            fieldNames[i] = scanner.nextLine();

            System.out.print("Enter the type for field " + (i + 1) + ": ");
            fieldTypes[i] = scanner.nextLine();
        }

        generateClassFile(className, fieldNames, fieldTypes);

        scanner.close();
    }

    public static void generateClassFile(String className, String[] fieldNames, String[] fieldTypes) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(className + ".java"))) {
            writer.println("public class " + className + " {");
            
            for (int i = 0; i < fieldNames.length; i++) {
                writer.println("    private " + fieldTypes[i] + " " + fieldNames[i] + ";");
            }

            writer.println();

            // Generate default constructor
            writer.println("    public " + className + "() {");
            writer.println("        // Constructor code here");
            writer.println("    }");
            writer.println();

            // Generate getter and setter methods for each field
            for (int i = 0; i < fieldNames.length; i++) {
                String capitalizedFieldName = fieldNames[i].substring(0, 1).toUpperCase() + fieldNames[i].substring(1);
                
                writer.println("    public " + fieldTypes[i] + " get" + capitalizedFieldName + "() {");
                writer.println("        return " + fieldNames[i] + ";");
                writer.println("    }");
                writer.println();

                writer.println("    public void set" + capitalizedFieldName + "(" + fieldTypes[i] + " " + fieldNames[i] + ") {");
                writer.println("        this." + fieldNames[i] + " = " + fieldNames[i] + ";");
                writer.println("    }");
                writer.println();
            }

            writer.println("}");
            System.out.println("Class " + className + " generated successfully!");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
