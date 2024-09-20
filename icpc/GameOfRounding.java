import java.util.Scanner;

public class GameOfRounding {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        StringBuilder finalOutput = new StringBuilder(); 
        StringBuilder inputBuilder = new StringBuilder();
        inputBuilder.append(t).append("\n");
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            inputBuilder.append(n).append("\n");
            for (int j = 0; j < n; j++) {
                inputBuilder.append(scanner.nextInt()).append(" ");
            }
            inputBuilder.append("\n");
        }
 
        String[] inputs = inputBuilder.toString().split("\n");
        int index = 0;

        while (index < inputs.length) {
            if (index == 0) { 
                index++;
                continue;
            }
            
            int n = Integer.parseInt(inputs[index].trim());
            index++;
            int[] points = new int[n];
            String[] pointStrings = inputs[index].trim().split(" ");
            for (int j = 0; j < n; j++) {
                points[j] = Integer.parseInt(pointStrings[j]);
            }
            index++;

            int[] prefixSums = new int[n + 1];
            for (int i = 0; i < n; i++) {
                prefixSums[i + 1] = prefixSums[i] + points[i];
            }
            
            StringBuilder result = new StringBuilder();
           
            for (int l = 0; l < n; l++) {
                int maxScore = -1;
                int minLevels = n;
                
                for (int r = l; r < n; r++) {
                    int totalPoints = prefixSums[r + 1] - prefixSums[l];
                    int numLevels = r - l + 1;
                    double avg = (double) totalPoints / numLevels;
                    int roundedScore = (int) Math.round(avg);
                    
                    if (roundedScore > maxScore) {
                        maxScore = roundedScore;
                        minLevels = numLevels;
                    } else if (roundedScore == maxScore) {
                        minLevels = Math.min(minLevels, numLevels);
                    }
                }
                
                result.append(minLevels).append(" ");
            }
            
            
            finalOutput.append(result.toString().trim()).append("\n"); 
        }
        

        System.out.println();
        System.out.print(finalOutput.toString().trim()); 
        scanner.close();
    }
}