import java.util.*;
import java.io.*;
public class Exception2{
public static void main(String[] args){
int i=6;
int j=0;
int data;
try{
data = i/j;
System.out.println(data);
}
catch(Exception e){
System.out.println(i/(j+3));
}
}
}