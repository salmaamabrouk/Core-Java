public class ArrayMinMax{
public static void ArrayMinMax(int[]args){
int[] arr = new int[1000];
for (int i = 0; i < arr.length; i++) {
arr[i] = (int) (Math.random() * 1000);
}
long startTime = System.nanoTime();
int min = arr[0];
int max = arr[0];
for (int i = 1; i < arr.length; i++) {
if (arr[i] < min) {
min = arr[i];
}
if (arr[i] > max) {
max = arr[i];
}
}
long endTime = System.nanoTime();
long duration = endTime - startTime;
System.out.println("Minimum value: " + min);
System.out.println("Maximum value: " + max);
System.out.println("Search running time: " + duration + " nanoseconds");
}
}