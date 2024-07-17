package Sem5;

public class StringFirst {
    public static void main(String[] args) {
        String str1=new String("Hello");
        String str2=new String("Hello");   // comparison of two objects both are different instances of same class , output == different
        // String str1="Hello";  // just assigning value   output = same 
        // String str2="Hello";  // just assigning value


        if (str1 == str2) {
            System.out.println("Same");
            
        }
        else{
            System.out.println("Different");
        }

        // String str2= new String("World");



// String(byte[] name)
// String(char[] name)
// srting str =" jjogj" its not vhangable 

// to change
// String(StringBuffer sbuffer)
//String(StringBuilder sbuilder)


    }
    
}
