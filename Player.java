import java.util.*;
import java.util.Scanner;
public class Player {
    //Name
     public String Name(String N){
            System.out.println("First I need to know how old you are?");
            Scanner scan = new Scanner(System.in);
            int age = scan.nextInt();

            //Age Algorithm
            if(age < 18){
                System.out.println("Sorry, You're too young to play");
            }
            if(age > 17){
                System.out.println("Old enough, so what's your name?");
                Scanner scan1 = new Scanner(System.in);
                N = scan1.nextLine();
                System.out.println("Welcome " + N + ". Let's start your adventure!" );
            }
            return N;
    }

    public int ClassChooser(int choose){
         String[] choices = {"Warrior", "Knight", "Dancer"};
        for(int i = 0; i < 3; i++){
           System.out.println(choices[i]);
        }

         return choose;
    }


    //Classes
    public void Warrior(){
            //Standard Class of fighter
            int attack = 3;
            int defense = 2;
            int envasion = 2;
        }
        public int Knight(int Attack, int Defense, int Envasion){
            Attack = 2;
            Defense = 5;
            Envasion = 1;
            return Attack;
        } //Defense character

        public int  Dancer(int Attack, int Defense, int Envasion){
            Attack = 2;
            Defense = 2;
            Envasion = 6;
            return Attack;
        } //Invasive character


    }
