Exersise07_08{
double[] list2 = new double[10];
System.out.print("Enter 10 values")
int i = 0
while (i< list2.length) {
list2[i] = input.nextDouble();
i++;
}
System.out.println(average(list2));
}

public static int average(int[] array) {
int sum = 0;
for (int i = 0; i<