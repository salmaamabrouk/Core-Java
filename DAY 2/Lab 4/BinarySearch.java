public class BinarySearch{
public static int BinarySearch (int[] arr, int item)
{
int l = arr.length;
int midIndex = (l - 1) / 2;
int minIndex = 0;
int maxIndex = l - 1;
while(minIndex <= maxIndex)
{
int temp = arr[midIndex];
if (item == temp)
{
return temp;
}
if (item > temp)
{
minIndex = midIndex + 1;
midIndex = (minIndex + maxIndex) / 2;
}
else
{
maxIndex = midIndex - 1;
midIndex = (minIndex + maxIndex) / 2;
}
}
return -1;
}
}