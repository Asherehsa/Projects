//Chapter 8 Notes
public class Ch8 {
public static void main(String args[]){
//elementType[][] arrayRefVar;
double[][] array = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9},
{10, 11, 12}
};

int[][] matrix;
matrix = new int[5][5];
matrix[2][1] = 7;

System.out.print("Array line 1 length: " + array[0].length);
System.out.println("Matrix line 1 length: " + matrix[0].length);

int[][] triangleArray = {
{1, 2, 3, 4, 5},
{2, 3, 4, 5},
{3, 4, 5},
{4, 5},
{5}
};

print(triangleArray);

triangleArray[0][3] = 50;
triangleArray[4][0] = 45;

print(triangleArray);

//8.3 Processing
int[][] matrix83 = new int[10][10];
}
public static void print(int[][] matrix){
for (int row = 0; row < matrix.length; row++){
	for (int column = 0; column < matrix[row].length; column++) {
		System.out.print(matrix[row][column] + " ");
		}
	System.out.println();

}}

}