import java.util.Scanner;

public class B1_ScanningString {

	public static void main(String[] args) {
		String source = "ȫ �� ��";
		// ��Ʈ�� ������ �б�
		Scanner sc = new Scanner(source);
		
		int num1 =sc.next();
		int num2 =sc.next();
		int num3 =sc.next();
		
		int sum = num1 + num2+ num3;
		System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, sum);
		
		sc.close();

	}

}
//Scanner Ŭ����
//Scanner(File source), Scanner(String source), Scanner(InputStream source)