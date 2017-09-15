package eg.edu.alexu.csd.datastructure.maze.cs55;
import java.io.File;
/**
 * @author Shiko.
 *
 */
public class Ssssssss {
	/**
	 * @param arr the.
	 */
	static void print(final int[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i][0]);
			System.out.print(arr[i][1]);
			System.out.println();
		}
	}
	/**
	 * @param args the.
	 */
	public static void main(final String[] args) {
		final File file;
		file = new File("fred.file");
		Maze ss = new Maze();
		int [][]arr = ss.solveBFS(file);
		print(arr);
	}
}
