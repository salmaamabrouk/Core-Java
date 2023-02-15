import java.lang.Math.*;
import java.util.function.Function;
public class QuadraticEquation implements Function <float [],Void>  
{  
@Override
public Void apply(float [] arr)
{
float a=arr[0];
float b=arr[1];
float c=arr[2];
float d = b * b - 4 * a * c; 
double sqrtval = Math.sqrt(Math.abs(d)); 
if (a == 0)   
{  
System.out.println("The value of a cannot be 0.");       
}  
if (d > 0)   
{  
System.out.println("The roots of the equation are real and different. \n");  
System.out.println((double)(-b + sqrtval) / (2 * a) + "\n"+ (double)(-b - sqrtval) / (2 * a));  
}  
else if (d == 0)   
{  
System.out.println("The roots of the equation are real and same. \n");  
System.out.println(-(double)b / (2 * a) + "\n"+ -(double)b / (2 * a));  
}  
else   
{  
System.out.println("The roots of the equation are complex and different. \n");  
System.out.println(-(double)b / (2 * a) + " + i"+ sqrtval + "\n"+ -(double)b / (2 * a)+ " - i" + sqrtval);  
}
return null;  
}
}