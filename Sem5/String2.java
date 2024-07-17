package Sem5;

public class String2 {
    public static void main(String[] args) {
        String str1="Hello";
        String str2= new String("World");

        // str1.concat(str2);   //not immutable
        // String str3 =str1.concat(str2);  // HelloWorld
        String str3 = str1 + " " + str2;  // Hello World
        System.out.println(str3);

        // length of string
        System.out.println("Length of String "+ str3.length());


        // char at index
        char c= str3.charAt(7);
        System.out.println("Character at 7th index: " + c);


        //index of char
        System.out.println(str3.indexOf('o'));  // output= first index of that element
        System.out.println(str3.lastIndexOf('o'));  // gives the last index of particular character

        // substring
        String sub = str3.substring(2, 7);
        System.out.println("substring: "+ sub);

        // replace ons char with other
        String rep = str3.replace('o', '0');
        System.out.println("Replace: "+ rep);

        //tolower
        String low = str3.toLowerCase();
        System.out.println("Lowercase: "+ low);
    }
    
}
