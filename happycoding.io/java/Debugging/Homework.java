import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.awt.Point;

import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;

import java.io.File;

public class Homework {

	// write 100 random points on a file
	static void writeOnFile(File fileName) {
		try {
			PrintWriter w = new PrintWriter(fileName);
			for (int i = 0; i < 100; i++) {
				// change this 2 -> 100 later.
				Point p = new Point((int) (Math.random() * 10 + 0), (int) (Math.random() * 10 + 0));
				w.write(p.x + " " + p.y);
				w.println();
			}
			w.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
	}

	static ArrayList<Point> readFromFile(File fileName) {
		ArrayList<Point> points = new ArrayList<Point>();
		try {
			Scanner sc = new Scanner(fileName);// sc => fileReader
			while (sc.hasNextInt()) {
				// String line = sc.nextLine();
				int x = sc.nextInt();
				int y = sc.nextInt();
				// System.out.println(x + " " + y);
				points.add(new Point(x, y));
				// System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		}
		return points;
	}

	static Point findCentre(ArrayList<Point> points) {
		double sumX = 0, sumY = 0;
		for (int i = 0; i < points.size(); i++) {
			sumX += points.get(i).x;
			sumY += points.get(i).y;
		}
		return new Point((int) sumX / points.size(), (int) sumY / points.size());
	}

	public static void main(String[] args) {
		File fileName = new File("pointFile.txt");
		writeOnFile(fileName);
		ArrayList<Point> points = readFromFile(fileName);
		Point centre = findCentre(points);
		System.out.println("The centre point is = " + centre.x + " " + centre.y);
	}
}