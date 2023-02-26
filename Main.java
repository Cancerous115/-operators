class Main{
  public static void main(String[]args){
    boolean isStudent=true;
    boolean isLibrarystudent=false;
    //if there is a true anywhere in our boolen, we will get true.
     //We can get false by adding "!" meaning not. So our answer would change to false after the change from "isStudent" to "!isStudent"
   System.out.print(isStudent || isLibrarystudent); 
  }

}