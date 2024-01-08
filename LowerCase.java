/** String processing exercise 1. */
public class lowercase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
  

    }

    public static String lowerCase(String s) {

        String newS = "";
        
        for (int i = 0; i < s.length(); i++){

            char c = s.charAt(i);
                
            if ((c >= 65) && (c <= 90)){

                c += 32; 
            
            }

             newS += c;

        }

        return newS;
    }
}
