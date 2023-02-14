public class Frequency{
public static int Frequency(String str1,String word)
{
int count = 0;
String str[] = str1.split(" ");
for (int i = 0; i < str.length; i++)
{
if(word.equals(str[i]))
{
count++;
}
}
return count;
}
}