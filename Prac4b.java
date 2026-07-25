
package aafiya;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Collections;
import java.util.Scanner;

public class Prac4b {
    public static void main(String[] args) {

        // a. List Interface
        try (Scanner input = new Scanner(System.in)) {
            // a. List Interface
            System.out.println("--- Demonstrating List Interface (Numbers) ---");
            
            List<Double> numbersList = new ArrayList<>();
            
            System.out.println("Enter 5 numbers for the list:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbersList.add(input.nextDouble());
            }
            
            System.out.println("Initial List: " + numbersList);
            
            double sumList = 0;
            sumList = numbersList.stream().map((num) -> num).reduce(sumList, (accumulator, _item) -> accumulator + _item);
            
            System.out.println("Sum of list elements: " + sumList);
            
            if (!numbersList.isEmpty()) {
                System.out.println("Average of list elements: " + (sumList / numbersList.size()));
                System.out.println("Minimum element: " + Collections.min(numbersList));
                System.out.println("Maximum element: " + Collections.max(numbersList));
            }
            
            System.out.print("Enter a number to remove from the list: ");
            double numToRemove = input.nextDouble();
            
            if (numbersList.remove(numToRemove)) {
                System.out.println(numToRemove + " removed.");
            } else {
                System.out.println(numToRemove + " not found.");
            }
            
            System.out.println("Updated List: " + numbersList);
            
            sumList = 0;
            sumList = numbersList.stream().map((num) -> num).reduce(sumList, (accumulator, _item) -> accumulator + _item);
            
            System.out.println("New Sum: " + sumList);
            
            if (!numbersList.isEmpty()) {
                System.out.println("New Average: " + (sumList / numbersList.size()));
            }
            
            numbersList.clear();
            System.out.println("List cleared.");
            
            // b. Set Interface
            System.out.println("\n--- Demonstrating Set Interface (Unique Numbers) ---");
            
            Set<Integer> uniqueNumbers = new HashSet<>();
            
            System.out.println("Enter 5 integers:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter integer " + (i + 1) + ": ");
                uniqueNumbers.add(input.nextInt());
            }
            
            System.out.println("Initial Set: " + uniqueNumbers);
            
            int sumSet = 0;
            sumSet = uniqueNumbers.stream().map((num) -> num).reduce(sumSet, Integer::sum);
            
            System.out.println("Sum of Set: " + sumSet);
            
            Set<Integer> squaredNumbers = new HashSet<>();
            
            uniqueNumbers.forEach((num) -> {
                squaredNumbers.add(num * num);
            });
            
            System.out.println("Squared Numbers: " + squaredNumbers);
            
            System.out.print("Enter an integer to remove: ");
            int intToRemove = input.nextInt();
            
            if (uniqueNumbers.remove(intToRemove)) {
                System.out.println(intToRemove + " removed.");
            } else {
                System.out.println(intToRemove + " not found.");
            }
            
            System.out.println("Updated Set: " + uniqueNumbers);
            
            sumSet = 0;
            sumSet = uniqueNumbers.stream().map((num) -> num).reduce(sumSet, Integer::sum);
            
            System.out.println("New Sum of Set: " + sumSet);
            
            // c. Map Interface
            System.out.println("\n--- Demonstrating Map Interface (Product Scores) ---");
            
            Map<String, Double> productScores = new HashMap<>();
            
            System.out.println("Enter details for 3 products:");
            
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter product name: ");
                String productName = input.next();
                
                System.out.print("Enter score: ");
                double score = input.nextDouble();
                
                productScores.put(productName, score);
            }
            
            System.out.println("Initial Map: " + productScores);
            
            double totalScore = 0;
            
            for (Double score : productScores.values()) {
                totalScore += score;
            }
            
            System.out.println("Total Score: " + totalScore);
            
            System.out.print("Enter product name to update: ");
            String productToUpdate = input.next();
            
            if (productScores.containsKey(productToUpdate)) {
                
                System.out.print("Enter new score: ");
                double newScore = input.nextDouble();
                
                productScores.put(productToUpdate, newScore);
                
                System.out.println("Updated Map: " + productScores);
                
            } else {
                System.out.println("Product not found.");
            }
            
            totalScore = 0;
            totalScore = productScores.values().stream().map((score) -> score).reduce(totalScore, (accumulator, _item) -> accumulator + _item);
            
            System.out.println("New Total Score: " + totalScore);
            
            System.out.print("Enter product name to remove: ");
            String productToRemove = input.next();
            
            if (productScores.remove(productToRemove) != null) {
                System.out.println(productToRemove + " removed.");
            } else {
                System.out.println("Product not found.");
            }
            
            System.out.println("Final Map: " + productScores);
        }
    }
}
