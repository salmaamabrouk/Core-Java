public class Assignment3
{
public static void main(String[]args)
{
if (args.length!=0)
{
if (args.length==2)
{
int number = Integer.parseInt(args[0]);
for (int i = 0; i < number; i++)
{
System.out.println(args[1]);
}
}
}
else
{
System.out.println("invalid input");
}
}
}