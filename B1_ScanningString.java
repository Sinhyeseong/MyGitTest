import java.util.Scanner;

public class B1_ScanningString {

	public static void main(String[] args) {
		String source = "1 3 5";
		// ��Ʈ�� ������ �б�
		Scanner sc = new Scanner(source);
		
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		int num3 =sc.nextInt();
		
		int sum = num1 + num2+ num3;
		System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, sum);
		
		sc.close();

	}

}
//Scanner Ŭ����
//Scanner(File source), Scanner(String source), Scanner(InputStream source)