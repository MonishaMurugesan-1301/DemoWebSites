package smpl;

import java.util.Scanner;

public class Firstprog {

	public static void main(String[] args) {
//		for (int i = 5;i>=1;i--) {
//			for(int j = 0; j<i; j++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}

//		for (int i = 7; i>=1; i--) {
//			for(int j = 0; j<i; j++) {
//				System.out.print(i+ " ");
//			}
//			System.out.println();
//		}

		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = in.nextLine();
		System.out.println("Name is: " + name);
		in.close();
	}
}
