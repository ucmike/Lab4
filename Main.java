
/*
Lab 4
Partners: Michael Seitz and Zachary Preszler
Date: Feb 9, 2021
*/

import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int randomNum = r.nextInt(50)+1;
    int num = randomNum;

    System.out.println("The Random number is: " +randomNum);

      while (num >=0){ //this is the countdown
        System.out.println(num);
        num --;
      } 
    if (randomNum <= 15) {
      System.out.println("Ahoy Mateys!");
    }
       else if (randomNum < 42 && randomNum > 20) {
      System.out.println("Cannonball!");
    }
      else {
        System.out.println("Look, a sea shanty!");
      }

  
  //System.out.println("Blast Off!"); //put this here from last time but not sure it is needed.
  }
}
