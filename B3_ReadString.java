import java.util.Scanner;

public class B3_ReadString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� �Է�: ");
		String str1 = sc.nextLine();

		System.out.print("���ڿ� �Է�: ");
		String str2 = sc.nextLine();

		System.out.printf("�Էµ� ���ڿ� 1: %s \n", str1);
		System.out.printf("�Էµ� ���ڿ� 2: %s \n", str2);

		sc.close();
	}

}

//int nextInt()
//byte nextByte()
//String nextLine()
//double nextDouble()
//boolean nextBoolean()