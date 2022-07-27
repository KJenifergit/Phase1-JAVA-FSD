package practiceproject1;

import java.util.ArrayList;

public class searchElement {

    public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("jeni0511@gmail.com");
        emailID.add("prasanna@gmail.com");
        emailID.add("snehakanniyappan@gmail.com");
        emailID.add("jabasunitha@gmail.com");
        emailID.add("jeniprasanna@gmail.com");
        emailID.add("katem02@gmail.com");
        emailID.add("thirisha@gmail.com");
    
        
         // new code to search emailid
         String searchElement = "katem02@gmail.com";
        
           
                 for(int i=0; i<emailID.size(); i++) {
                    
                    System.out.println(emailID.get(i));
                    
                    if(searchElement==emailID.get(i)) {
                        
                        System.out.println("\n");
                        
                        System.out.println("email ID"  + " " + searchElement +" "+ "found");
                        
                        break;
                        
                    }
                }

    }

}
