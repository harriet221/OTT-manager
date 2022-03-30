import java.util.Scanner;

public class Manager { // ������ Ŭ����
	public static String[][] text_OTT;
	public static String[][] video_OTT;
	public static String[][] all_OTT;
	
	Manager(){}
	
	public static void show_info(int check) {
		System.out.print("����� ���� ");
		if(check == 0) {
			t_info();
			v_info();
		}
		else if(check == 1)
			t_info();
		else
			v_info();
		
		System.out.print("���� �� ���� ���� ���Դϴ�.\n");
	}
	public static void t_info() {
		for(int i = 0; i < text_OTT.length; i++) {
			System.out.print("["+text_OTT[i][0]+"] ");
		}
	}
	public static void v_info() {
		for(int i = 0; i < video_OTT.length; i++) {
			System.out.print("["+video_OTT[i][0]+"] ");
		}
	}
	
	public static void show_suggestion(boolean TF, String name) {
		if(TF == true) {
			System.out.println("\n����� ���� ���� �ݾ��� ���� ������ �ʰ��Ͽ����ϴ�.");
			System.out.println("����, "+name+" ���� ��Ҹ� �����帳�ϴ�.");
		}
		else {
			System.out.println("\n���� ���ؿ��� ���� ���� �̿����Դϴ�. ��ſ� �ð� �Ǽ���!");
		}
	}
	
	public static void gettingT_OTTinfo() {
		text_OTT = textOTT.getT_OTT();
	}
	public static void gettingV_OTTinfo() {
		video_OTT = videoOTT.getV_OTT();
	}
	
	public static String findWaste(String[][] a_OTT, int n) {
		float max = 0;
		int index = 0;
		max = Integer.valueOf(a_OTT[0][2]) / Float.valueOf(a_OTT[0][1]);
		for(int i = 1; i < n; i++) {
			float ch = Integer.valueOf(a_OTT[i][2]) / Float.valueOf(a_OTT[i][1]);
			if(max < ch) {
				max = ch;
				index = i;
			}
		}
		return a_OTT[index][0];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account mywallet = new Account();
		float income = mywallet.getIncome(); // get
		float expense = mywallet.getExpense(); // get
		
		boolean much = false;
		int cnt = 0;
		all_OTT = new String[7][3]; // �ִ� 7���� ���� ���
		
		int t_payments = 0;
		int v_payments = 0;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("���� OTT ���񽺸� �ϳ� �̻� �̿��Ͻʴϱ�? (Y/N) : ");
		String t_use = sc1.next();
		System.out.print("���� OTT ���񽺸� �ϳ� �̻� �̿��Ͻʴϱ�? (Y/N) : ");
		String v_use = sc1.next();
		
		if(t_use.equals("Y") && v_use.equals("Y")) {
			gettingT_OTTinfo();
			gettingV_OTTinfo();
			for(int i = 0; i < text_OTT.length; i++) {
				String str = text_OTT[i][2];
				t_payments += Integer.valueOf(str);
				all_OTT[cnt][0] = text_OTT[i][0];
				all_OTT[cnt][1] = text_OTT[i][1];
				all_OTT[cnt++][2] = text_OTT[i][2];
			}
			for(int i = 0; i < video_OTT.length; i++) {
				String str = video_OTT[i][2];
				v_payments += Integer.valueOf(str);
				all_OTT[cnt][0] = video_OTT[i][0];
				all_OTT[cnt][1] = video_OTT[i][1];
				all_OTT[cnt++][2] = video_OTT[i][2];
			}
			show_info(0);
		}
		else if(t_use.equals("Y") && v_use.equals("N")) {
			gettingT_OTTinfo();
			for(int i = 0; i < text_OTT.length; i++) {
				String str = text_OTT[i][2];
				t_payments += Integer.valueOf(str);
				all_OTT[cnt][0] = text_OTT[i][0];
				all_OTT[cnt][1] = text_OTT[i][1];
				all_OTT[cnt++][2] = text_OTT[i][2];
			}
			show_info(1);
		}
		else if(t_use.equals("N") && v_use.equals("Y")) {
			gettingV_OTTinfo();
			for(int i = 0; i < video_OTT.length; i++) {
				String str = video_OTT[i][2];
				v_payments += Integer.valueOf(str);
				all_OTT[cnt][0] = video_OTT[i][0];
				all_OTT[cnt][1] = video_OTT[i][1];
				all_OTT[cnt++][2] = video_OTT[i][2];
			}
			show_info(2);
		}
		else if(t_use.equals("N") && v_use.equals("N")){
			System.out.println("���� ���� �̿����� �ƴϹǷ� �����ڰ� ���ʿ� �մϴ�.");
			System.exit(0);
		}
		else {
			System.out.println("�Է��� �߸��Ǿ����ϴ�. �ٽ� �������ּ���.");
			System.exit(0);
		}

		int payments = t_payments + v_payments;
		String waste = "";
		
		// ���� �� ���� / ���� �� �Ѽҵ� >= 1 �Ǵ� (���� ���� ���� / �� ����) * 100 >= 4(%) -> ���Һ�� �Ǵ�
		if(expense/income >= 1 || (payments/expense)*100 >= 4) {
			much = true;
			if(cnt >= 2)
				waste = findWaste(all_OTT, cnt);
			else
				waste = all_OTT[0][0];
		}
		else {
			much = false;
		}
		
		show_suggestion(much, waste);
	}

}
