import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			func(new File("input.txt"), 0);
		}

		catch (FileNotFoundException e) {
			System.out.println("File is not found");
		} catch (InputMismatchException e) {
			System.out.println("Input is not an integer");
		} catch (IOException e) {
			System.out.println("The network connection is broken");
		} catch (Exception e) {
			System.out.println("Exception happens. ");
			System.out.println(e);
			e.printStackTrace();
		} 
		System.out.println("End");
		
		try {
			int i = parseInteger("Error");
			System.out.println(i);
		} catch (MyException e) {
			System.out.println("MyException happens");
		}
		

	}

	private static int parseInteger(String s) throws MyException {
		// TODO Auto-generated method stub
		

		for (int i=0;i<s.length();i++) {
			if (!Character.isDigit(s.charAt(i))) {
				throw new MyException();
			}
		}
		return Integer.parseInt(s);

	}

	private static int func(File file, int a) throws FileNotFoundException, IOException, InputMismatchException {
		// TODO Auto-generated method stub
		Scanner sc = null;

		int ret = 2 / a;
		sc = new Scanner(file);

		System.out.println("Before read");
		int n = sc.nextInt();

		return ret;

	}

}


class MyException extends Exception {
	public MyException() {
		super();
	}
}
