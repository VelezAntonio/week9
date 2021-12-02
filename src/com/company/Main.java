package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class Main {


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Vector<Integer> vector = new Vector<>();
        Vector<Integer> vectorTemp = new Vector<>();

        int userChoice = 0;
        boolean error;

        System.out.println("Please enter amount of numbers you would like to sort :");

        do {
            error = false;
            try {
                userChoice = userInput.nextInt();
                if (userChoice <= 0) {
                    System.out.println("Please enter an integer greater than 1!");
                    error=true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer greater than 1!");
                error = true;
                userInput.next();
            }

        }while(error);

        System.out.println("BUBBLE SORT");
        for (int i = 0; i < userChoice; i++) {
            vector.add((int) ((Math.random() * (1000 - 1)) + 1));
        }
        System.out.println("Unsorted Vector: "+vector);
        System.out.println("");

        //clone vectors to use algorithms on.
        vectorTemp = (Vector)vector.clone();

        int count=0,j = 0,i,comp=0;
        int swap = 0;
        for (i = 0; i < vectorTemp.size()-1; i++) {
            for (j = 0; j < vectorTemp.size()-1; j++) {
                comp++;
                if(vectorTemp.get(j).compareTo(vectorTemp.get(j+1))>0){
                    swap = vectorTemp.get(j);
                    vectorTemp.set(j, vectorTemp.get(j + 1));
                    vectorTemp.set(j+1,swap);
                    count++;
                }

            }

        }
        System.out.println("Times Swapped: "+ count+" Comparison: "+comp);
        System.out.println("Sorted Vector: " + vectorTemp+"\n");

        vectorTemp = (Vector)vector.clone();
        comp=0;
        count=0;
        i=0;
        j=0;
        int temp;

        System.out.println("INSERTION SORT");
        System.out.println("Unsorted Vector: "+ vectorTemp+"\n");
        for(i = 1;i<vectorTemp.size();i++){
            j=i;
            comp++;
            while((j>0) && vectorTemp.get(j).compareTo(vectorTemp.get(j-1))<0){
                temp= vectorTemp.get(j);
                vectorTemp.set(j, vectorTemp.get(j - 1));
                vectorTemp.set(j-1,temp);
                count++;
                j--;
            }
        }
        System.out.println("Times Swapped: "+ count+" Comparison: "+comp);
        System.out.println("Sorted Vector: "+vectorTemp);



        Vector<String>stringVector = new Vector<>();
        Vector<String>tempStringVector= new Vector<>();
        boolean done;
        String add;
        userInput.nextLine();
        System.out.println("String Binary Search");
        do {
            done = false;
            System.out.println("Enter a string to add to Vector: (enter -1 to exit)");
            add= userInput.nextLine();
            stringVector.add(add);

            if (add.equals("-1")){
                done=true;
                stringVector.remove(add);
            }

        }while(!done);
        System.out.println(stringVector);


    }



}
