import java.util.*;
import java.io.*;
public class MultiCatch{
public static void main(String[] args){
try{
int Array[]=new int[5];
System.out.println("Array element 10:" +Array[10]);
Array[5]=10/0;
}
catch(ArithmeticException e)
{
System.out.println("Arithmetic Exception:" +e);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexOutOfBoundsException:" +e);
}
catch(Exception e)
{
System.out.println("Exception:" +e);
}
}
}