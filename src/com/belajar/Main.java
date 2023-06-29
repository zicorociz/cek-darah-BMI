package com.belajar;
import java.util.Scanner;
public class Main {

            public static void main(String[] args) {
                task1();
            }

            public static void task1() {
                System.out.println("===========================================");
                System.out.println("<b> Alpro Medical Diagnostic Centre</b>");
                System.out.println("-------------------------------------------");

                // Getting user input
                Scanner read = new Scanner(System.in);
                System.out.print("Please input your name : ");
                String name = read.nextLine();

                System.out.print("Please input your sex ( m / f ) : ");
                char sex = read.nextLine().charAt(0);

                System.out.print("Please input your height ( cm ) : ");
                int height = read.nextInt();
                read.nextLine();

                System.out.print("Please input your weight ( kg ) : ");
                int weight = read.nextInt();
                read.nextLine();

                // Generating output
                System.out.println("-------------------------------------------");

                String salutation;
                if (sex == 'm') {
                    salutation = "Mr";
                } else {
                    salutation = "Ms";
                }

                // Computing Body Mass Index (BMI)
                double heightInMeter = height / 100.0;
                double bmi = weight / (heightInMeter * heightInMeter);
                String bmiCategory;

                // Based on https://www.siloamhospitals.com/en/informasi-siloam/artikel/cara-menghitung-bmi
                if (bmi < 18.5) {
                    bmiCategory = "underweight";
                } else if (bmi < 25) {
                    bmiCategory = "normal";
                } else if (bmi < 30) {
                    bmiCategory = "overweight";
                } else {
                    bmiCategory = "obese";
                }

                System.out.println("Customer Name\t: " + salutation + " " + name);
                System.out.println("BMI\t\t: " + bmi);
                System.out.println("Category\t: " + bmiCategory);
                System.out.println("===========================================");
            }
        }