class Main {
  public static void main(String[] args) {
    String[]names{"Seraph","Naruto","ichigo","Senpai", "Kanye","Mikasa","lil pump","boku","Corona"};

    for (int i = 0; i<7; i++){
    System.out.println(names[i]);
   }
    
 
   names [6] = "big pump"; 
  
   System.out.println("\n Here is our updated array: ");

    for (int i = 0; i<7; i++){
    System.out.println(names[i]);
   }
    
   
   
   System.out.ptintln("\n Looping backwards through array:");
   for (int i = 8; i>0; i--)
   {
     System.out.println(names[i]);
   }
  }
}