package Sem5;

class ABC {
    void print(int b){
        System.out.println("Print");
    }
    void print(float a){
        System.out.println("Display");
    }

    
}
public class Polymorphism {
    public static void main(String[] args) {

        // basic example of operator overloading

        // int a= 10;
        // int b= 20;
        // System.out.println(a+b);
        // System.out.println("Sum of Numbers is :"+ a+b);

        // System.out.println('a' + 'b');   // these are characters so it add ascii values if in""" it will concatenate

        // System.out.println("a" + 'b');       // if there is a string before + then it will auto take other as string

        // System.out.println('a' + "b");   // but string is a string it will give output as concat of ab

        // System.out.println('a' + 'b' + "c");   // 195c

       ABC obj = new ABC();
       obj.print(10.0);



    }
    
}
