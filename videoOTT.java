import java.util.Scanner;

public class videoOTT extends OTT {
	
	private static String[][] v_OTT;
	
	videoOTT(String n, float u, int p) {
		super(n, u, p);
	}
	
	public static String[][] getV_OTT() {
		videoMenu();
		if (v_OTT == null)
			v_OTT[0][1] = "no use";
		return v_OTT;
	}

	public static void videoMenu() {
		Scanner sc = new Scanner(System.in);
		String videoOTTList = "[Video OTT List] -> 0 : �Է� ���\n"
				+ "1 : ���ø���\n2 : ��í\n3 : Ƽ��\n4 : ����� �÷���";
		
		System.out.print("�� ������ ���� OTT ���񽺸� �̿��Ͻʴϱ�?(0 ~ 4) : ");
		int n = sc.nextInt();
		if(n == 0) return;
		
		int cnt= 0;
		v_OTT = new String[n][3];
		
		for(int i = 0; i < n; i++) {
			System.out.println(videoOTTList);
			int order = sc.nextInt();
			switch(order) {
			case 0 :
				System.out.println("�Է��� ��ҵǾ����ϴ�.\n���α׷��� �ٽ� ������ �ֽʽÿ�.");
				System.exit(0);
			case 1 :
				System.out.println("Netflix �� ���ð��� (�Ҽ��� ���ڸ�����) �Է����ּ���.");
				float n_time = sc.nextFloat();
				int n_price = 9500;
				videoOTT Netflix = new videoOTT("Netflix", n_time, n_price);
				Netflix.setUsingAmount(n_time);
				v_OTT[cnt][0] = "Netflix";
				v_OTT[cnt][1] = String.valueOf(n_time);
				v_OTT[cnt++][2] = String.valueOf(n_price);
				break;
			case 2 :
				System.out.println("��í �� ���ð��� (�Ҽ��� ���ڸ�����) �Է����ּ���.");
				float w_time = sc.nextFloat();
				int w_price = 7900;
				videoOTT Watcha = new videoOTT("��í", w_time, w_price);
				Watcha.setUsingAmount(w_time);
				v_OTT[cnt][0] = "��í";
				v_OTT[cnt][1] = String.valueOf(w_time);
				v_OTT[cnt++][2] = String.valueOf(w_price);
				break;
			case 3 :
				System.out.println("Ƽ�� �� ���ð��� (�Ҽ��� ���ڸ�����) �Է����ּ���.");
				float t_time = sc.nextFloat();
				int t_price = 7900;
				videoOTT Tving = new videoOTT("Ƽ��", t_time, t_price);
				Tving.setUsingAmount(t_time);
				v_OTT[cnt][0] = "Ƽ��";
				v_OTT[cnt][1] = String.valueOf(t_time);
				v_OTT[cnt++][2] = String.valueOf(t_price);
				break;
			case 4 :
				System.out.println("DisneyPlus �� ��� �ð��� (�Ҽ��� ���ڸ�����) �Է����ּ���.");
				float d_time = sc.nextFloat();
				int d_price = 9900;
				videoOTT DisneyPlus = new videoOTT("Disney+", d_time, d_price);
				DisneyPlus.setUsingAmount(d_time);
				v_OTT[cnt][0] = "Disney+";
				v_OTT[cnt][1] = String.valueOf(d_time);
				v_OTT[cnt++][2] = String.valueOf(d_price);
				break;
			}
		}
	}
}
