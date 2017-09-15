package eg.edu.alexu.csd.datastructure.maze.cs55;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import eg.edu.alexu.csd.datastructure.linkedList.cs59_55.SinglyLinkedList;
import eg.edu.alexu.csd.datastructure.maze.IMazeSolver;
import eg.edu.alexu.csd.datastructure.queue.cs55.QueueLinkedList;
import eg.edu.alexu.csd.datastructure.stack.cs55.Stack;
/**
 * @author Shiko.
 *
 */
public class Maze implements IMazeSolver {
	/**
	 */
	final boolean flag1111111 = false;

	@Override
	public int[][] solveBFS(final File maze) {
		char [][]arr = null;
		try {
			arr = filereader(maze);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if (arr == null) {
			throw null;
		}
		QueueLinkedList queue = new QueueLinkedList();
		SinglyLinkedList [][]path =
		new SinglyLinkedList[arr.length][arr[0].length];
		int row = 0; int column = 0; boolean[][] visitied =
		new boolean[arr.length][arr[0].length];
		boolean found = false; int countS = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 'S' || arr[i][j] == 's') {
					row = i; column = j; found = true;
					countS++;
				}
			} }
		if (!found || countS > 1) {
			throw null;
		}
		sss(flag1111111, arr);
		visitied[row][column] = true;
		for (int i = row - 1; i <= row + 1; i++) {
			for (int j = column - 1; j <= column + 1; j++) {
				if (i >= arr.length || i < 0 || j < 0
						|| j >= arr[0].length
						|| (i == row + 1
						&& j == column + 1)
						|| (i == row + 1
						&& j == column - 1)
						|| (i == row - 1
						&& j == column + 1)
						|| (i == row - 1
						&& j == column - 1)) {
					continue;
				} else if (visitied[i][j]
						|| arr[i][j] == '#') {
					continue;
				} else if (arr[i][j] == 'e'
						|| arr[i][j] == 'E') {
					if (path[i][j] == null) {
						path[i][j] =
						new SinglyLinkedList();
					}
					path[i][j].add(row);
					path[i][j].add(column);
					path[i][j].add(i);
					path[i][j].add(j);
					visitied[i][j] = true; int count = 0;
					int [][]answer = new int
					[path[i][j].size() / 2][2];
					for (int k = 0; k < path[i][j].size();
						k += 2) {
						answer[count][0] = (Integer)
						path[i][j].get(k);
						answer[count++][1] = (Integer)
						path[i][j].get(k + 1);
					}
					return answer;
				} else if (arr[i][j] == '.') {
					if (path[i][j] == null) { path[i][j]
						= new SinglyLinkedList();
					}
					path[i][j].add(row);
					path[i][j].add(column);
					visitied[i][j] = true;
					queue.enqueue(i);
					queue.enqueue(j);
				} else {
					throw null;
				}
			} }
		while (!queue.isEmpty()) {
			row = (Integer) queue.dequeue();
			column = (Integer) queue.dequeue();
			for (int i = row - 1; i <= row + 1; i++) {
				for (int j = column - 1;
				j <= column + 1; j++) {
					if (i >= arr.length || i < 0 || j < 0
							|| j >= arr[0].length
							|| (i == row + 1
							&& j == column + 1)
							|| (i == row + 1
							&& j == column - 1)
							|| (i == row - 1
							&& j == column + 1)
							|| (i == row - 1
							&& j == column - 1)) {
						continue;
					} else if (visitied[i][j]
						|| arr[i][j] == '#') {
						continue;
					} else if (arr[i][j] == 'e'
							|| arr[i][j] == 'E') {
						if (path[i][j] == null) {
							path[i][j] =
							new SinglyLinkedList();
						}
						for (int k = 0; k < path[row]
							[column].size(); k++) {
							path[i][j].add(path[row]
							[column].get(k));
						}
						path[i][j].add(row);
						path[i][j].add(column);
						path[i][j].add(i);
						path[i][j].add(j);
						visitied[i][j] = true;
						int count = 0; int [][]answer =
						new int[path[i][j].size()
						/ 2][2];
						for (int k = 0;
							k < path[i][j].size();
							k += 2) {
							answer[count][0] =
							(Integer)
							path[i][j].get(k);
							answer[count++][1]
							= (Integer)
							path[i][j].get(k + 1);
						}
						return answer;
					} else if (arr[i][j] == '.') {
						if (path[i][j] == null) {
							path[i][j] =
							new SinglyLinkedList();
						}
						for (int k = 0; k < path[row]
							[column].size(); k++) {
							path[i][j].add(path[row]
							[column].get(k));
						}
						path[i][j].add(row);
						path[i][j].add(column);
						visitied[i][j] = true;
						queue.enqueue(i);
						queue.enqueue(j);
					} else {
						throw null;
					}
				}
			} }
		return null;
	}
	/**
	 * @param flag11211111 the.
	 * @param arr the.
	 */
	void sss(final boolean flag11211111, final char [][]arr) {
		boolean flag = flag11211111;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 'E' || arr[i][j] == 'e') {
					flag = true;
				}
			} }
		if (!flag) {
			throw null;
		}
	}
	@Override
	public int[][] solveDFS(final File maze) {

		Stack stack = new Stack();
		char [][]arr = null;
		try {
			arr = filereader(maze);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if (arr == null) {
			throw null;
		}
		SinglyLinkedList path = new SinglyLinkedList();
		int row = 0;
		int column = 0;
		boolean[][] visitied =
		new boolean[arr.length]
		[arr[0].length];
		boolean found = false;
		int countS = 0;
		for (int i = 0;
			i < arr.length;
			i++) {
			for (int j = 0;
				j < arr[0].length;
				j++) {
				if (arr[i][j] == 'S'
					|| arr[i][j] == 's') {
					row = i;
					column = j;
					found = true;
					countS++;
				}
			}
		}
		if (!found || countS > 1) {
			throw null;
		}
		boolean flag11111111 = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 'E' || arr[i][j] == 'e') {
					flag11111111 = true;
				}
			}
		}
		if (!flag11111111) {
			throw null;
		}
		stack.push(row);
		stack.push(column);
		while (!stack.isEmpty()) {

			column = (Integer) stack.pop();
			row = (Integer) stack.pop();
			path.add(row);
			path.add(column);
			visitied[row][column] = true;

			if (arr[row][column] == 'e'
				|| arr[row]
				[column] == 'E') {
				visitied[row][column] = true;
				int count = 0;
				int [][]answer =
					new int[path.size()
					/ 2][2];
				for (int k = 0;
					k < path.size();
					k += 2) {
					answer[count][0] =
					(Integer) path.get(k);
					answer[count++][1] =
					(Integer) path.get(k + 1);
				}
				return answer;
			} //else if (arr[row][column] == '.') {
			//} // else
				// throw null;

			for (int i = row - 1;
				i <= row + 1;
				i++) {
				for (int j = column - 1;
					j <= column + 1;
					j++) {
					if (i >= arr.length
							|| i < 0
							|| j < 0
							|| j >= arr[0].length
							|| (i == row + 1
							&& j == column + 1)
							|| (i == row + 1
							&& j == column - 1)
							|| (i == row - 1
							&& j == column + 1)
							|| (i == row - 1
							&& j == column - 1)
							|| visitied[i][j]
							) {
						continue;
					} else if (arr[i][j] == '#') {
						visitied[i][j] = true;
						continue;
					} else {
						visitied[i][j] = true;
						stack.push(i);
						stack.push(j);
					}
				}
			}
		}
		return null;
	}
	/**
	 * @param maze the.
	 * @return answer the.
	 * @throws FileNotFoundException the.
	 */
	char[][] filereader(final File maze)
		throws FileNotFoundException {
		char [][]arr = null;
		FileReader ssss = new FileReader(maze);
		try {
			boolean cover = false;
			boolean flag = false;
			BufferedReader br =
			new BufferedReader(ssss);
			String sssssss;
			int row = 0;
			int column = 0;
			String rows = "";
			boolean flag1111 = false;
			sssssss = br.readLine();
			for (int i = 0;
				i < sssssss.length(); i++) {
				rows = "";
				while (i < sssssss.length()
						&& Character.isDigit(
						sssssss.charAt(i))) {
					rows += sssssss.charAt(i);
					i++;
					flag1111 = true;
				}
				if (flag1111) {
					if (!cover) {
						row =
						Integer.parseInt(rows);
						cover = true;
					} else {
						column =
						Integer.parseInt(rows);

						if (flag) {
							throw null;
						}
						flag = true;
					}
					flag1111 = false;
				}
			}
			arr = new char[row][column];
			if (!cover) {
				throw null;
			}
			int countrows = 0;
			while ((sssssss
					= br.readLine())
					!= null) {
				if (countrows >= row) {
					throw null;
				} else if (sssssss.length()
					!= column) {
					throw null;
				} else {
					for (int i = 0;
						i < sssssss.length();
						i++) {
						arr[countrows][i] =
						sssssss.charAt(i);
					}
				}
				countrows++;
			}
			if (countrows < row) {
				throw null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arr;
	}
}
