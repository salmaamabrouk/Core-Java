public class ConvertTempMain
{
public static void main(String[] args){
float a = 24;
System.out.println("Temprature = " + a + " C " + new ConvertTemp().apply(a) + " F");
}
}