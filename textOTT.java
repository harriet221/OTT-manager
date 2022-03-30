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
		String textOTTList = "[Text OTT List] -> 0 : 입력 취소\n"
				+ "1 : 밀리의 서재\n2 : 리디 셀렉트\n3 : 예스24북클럽";
		
		System.out.print("몇 가지의 독서 OTT 서비스를 이용하십니까?(0 ~ 3) : ");
		int n = sc.nextInt();
		if(n == 0) return;
		
		int cnt= 0;
		t_OTT = new String[n][3];
		
		for(int i = 0; i < n; i++) {
			System.out.println(textOTTList);
			int order = sc.nextInt();
			switch(order) {
			case 0 :
				System.out.println("입력이 취소되었습니다.\n프로그램을 다시 실행해 주십시오.");
				System.exit(0);
			case 1 :
				System.out.println("밀리의 서재 월 이용 권수를 (정수로) 입력해주세요.");
				int m_books = sc.nextInt();
				int m_price = 9900;
				textOTT Millie = new textOTT("밀리의 서재", m_books, m_price);
				Millie.setUsingAmount(m_books);
				t_OTT[cnt][0] = "밀리의 서재";
				t_OTT[cnt][1] = String.valueOf(m_books);
				t_OTT[cnt++][2] = String.valueOf(m_price);
				break;
			case 2 :
				System.out.println("리디 셀렉트 월 이용 권수를 (정수로) 입력해주세요.");
				int l_books = sc.nextInt();
				int l_price = 7900;
				textOTT Lidi = new textOTT("리디 셀렉트", l_books, l_price);
				Lidi.setUsingAmount(l_books);
				t_OTT[cnt][0] = "리디 셀렉트";
				t_OTT[cnt][1] = String.valueOf(l_books);
				t_OTT[cnt++][2] = String.valueOf(l_price);
				break;
			case 3 :
				System.out.println("예스24북클럽 월 이용 권수를 (정수로) 입력해주세요.");
				int y_books  = sc.nextInt();
				int y_price = 5500;
				textOTT Yes24 = new textOTT("예스24북클럽", y_books, y_price);
				Yes24.setUsingAmount(y_books);
				t_OTT[cnt][0] = "예스24북클럽";
				t_OTT[cnt][1] = String.valueOf(y_books);
				t_OTT[cnt++][2] = String.valueOf(y_price);
				break;
			}
		}
	}
	
}
