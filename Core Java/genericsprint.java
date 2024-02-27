package JAVA;



class Printer
{
   public <E> void printArray(E[] elements){

for(E element: elements){
    System.out.println(element);
}

   }
 
}

public class genericsprint{


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
       

        
    }
}