
public class uniquechars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    public static String uniqueChars(String s) {

        String newS = "";
        

        for (int i = 0; i < s.length(); i++){
            

           if ((newS.indexOf(s.charAt(i)) == -1) || (s.charAt(i) == ' ')){ 
                
                newS += s.charAt(i);

            }

        }
        
        return newS;
    }
}
