import java.util.Scanner;

public class textOTT extends OTT {

	private static String[][] t_OTT;
	
	textOTT(String n, int u, int p) {
		super(n, u, p);
	}
	
	public static String[][] getT_OTT() {
		textMenu();
		if (t_OTT == null) 
			t_OTT[0][1] = "no use";
		return t_OTT;
	}

	public static void textMenu() {
		Scanner sc = new Scanner(System.in);
		String textOTTList = "[Text OTT List] -> 0 : �Է� ���\n"
				+ "1 : �и��� ����\n2 : ���� ����Ʈ\n3 : ����24��Ŭ��";
		
		System.out.print("�� ������ ���� OTT ���񽺸� �̿��Ͻʴϱ�?(0 ~ 3) : ");
		int n = sc.nextInt();
		if(n == 0) return;
		
		int cnt= 0;
		t_OTT = new String[n][3];
		
		for(int i = 0; i < n; i++) {
			System.out.println(textOTTList);
			int order = sc.nextInt();
			switch(order) {
			case 0 :
				System.out.println("�Է��� ��ҵǾ����ϴ�.\n���α׷��� �ٽ� ������ �ֽʽÿ�.");
				System.exit(0);
			case 1 :
				System.out.println("�и��� ���� �� �̿� �Ǽ��� (������) �Է����ּ���.");
				int m_books = sc.nextInt();
				int m_price = 9900;
				textOTT Millie = new textOTT("�и��� ����", m_books, m_price);
				Millie.setUsingAmount(m_books);
				t_OTT[cnt][0] = "�и��� ����";
				t_OTT[cnt][1] = String.valueOf(m_books);
				t_OTT[cnt++][2] = String.valueOf(m_price);
				break;
			case 2 :
				System.out.println("���� ����Ʈ �� �̿� �Ǽ��� (������) �Է����ּ���.");
				int l_books = sc.nextInt();
				int l_price = 7900;
				textOTT Lidi = new textOTT("���� ����Ʈ", l_books, l_price);
				Lidi.setUsingAmount(l_books);
				t_OTT[cnt][0] = "���� ����Ʈ";
				t_OTT[cnt][1] = String.valueOf(l_books);
				t_OTT[cnt++][2] = String.valueOf(l_price);
				break;
			case 3 :
				System.out.println("����24��Ŭ�� �� �̿� �Ǽ��� (������) �Է����ּ���.");
				int y_books  = sc.nextInt();
				int y_price = 5500;
				textOTT Yes24 = new textOTT("����24��Ŭ��", y_books, y_price);
				Yes24.setUsingAmount(y_books);
				t_OTT[cnt][0] = "����24��Ŭ��";
				t_OTT[cnt][1] = String.valueOf(y_books);
				t_OTT[cnt++][2] = String.valueOf(y_price);
				break;
			}
		}
	}
	
}
