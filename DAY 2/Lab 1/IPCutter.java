import java.util.StringTokenizer;
public class IPCutter
{
public static void IPCutter(String mainString)
{
String[] IP = mainString.split("\\.");
for (int x = 0; x < IP.length; x++)
{
System.out.println(IP[x]);
}
}
}