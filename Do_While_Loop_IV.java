package do_while_loop_iv;

public class Do_While_Loop_IV {

    public static void main(String[] args) {
int n;

    for(n=99; n>=0; n--) { 
        
    if (n==0)    
    {    
      System.out.println("No more bottles of beer on the wall, no more bottles of beer.\n" +
"Go to the store and buy some more, 99 bottles of beer on the wall.");
        
    }  
    else {
        
        System.out.println(n+" bottles of beer on the wall,\n" +
    +n+" bottles of beer.");
   
       System.out.println("Take one down and pass it around, "+(n-1)+" bottles of beer on the wall.");
       System.out.println();  
     }
  
    }
    }
            
    }
    

