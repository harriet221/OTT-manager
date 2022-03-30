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
		String videoOTTList = "[Video OTT List] -> 0 : 입력 취소\n"
				+ "1 : 넷플릭스\n2 : 왓챠\n3 : 티빙\n4 : 디즈니 플러스";
		
		System.out.print("몇 가지의 영상 OTT 서비스를 이용하십니까?(0 ~ 4) : ");
		int n = sc.nextInt();
		if(n == 0) return;
		
		int cnt= 0;
		v_OTT = new String[n][3];
		
		for(int i = 0; i < n; i++) {
			System.out.println(videoOTTList);
			int order = sc.nextInt();
			switch(order) {
			case 0 :
				System.out.println("입력이 취소되었습니다.\n프로그램을 다시 실행해 주십시오.");
				System.exit(0);
			case 1 :
				System.out.println("Netflix 월 사용시간을 (소수점 한자리까지) 입력해주세요.");
				float n_time = sc.nextFloat();
				int n_price = 9500;
				videoOTT Netflix = new videoOTT("Netflix", n_time, n_price);
				Netflix.setUsingAmount(n_time);
				v_OTT[cnt][0] = "Netflix";
				v_OTT[cnt][1] = String.valueOf(n_time);
				v_OTT[cnt++][2] = String.valueOf(n_price);
				break;
			case 2 :
				System.out.println("왓챠 월 사용시간을 (소수점 한자리까지) 입력해주세요.");
				float w_time = sc.nextFloat();
				int w_price = 7900;
				videoOTT Watcha = new videoOTT("왓챠", w_time, w_price);
				Watcha.setUsingAmount(w_time);
				v_OTT[cnt][0] = "왓챠";
				v_OTT[cnt][1] = String.valueOf(w_time);
				v_OTT[cnt++][2] = String.valueOf(w_price);
				break;
			case 3 :
				System.out.println("티빙 월 사용시간을 (소수점 한자리까지) 입력해주세요.");
				float t_time = sc.nextFloat();
				int t_price = 7900;
				videoOTT Tving = new videoOTT("티빙", t_time, t_price);
				Tving.setUsingAmount(t_time);
				v_OTT[cnt][0] = "티빙";
				v_OTT[cnt][1] = String.valueOf(t_time);
				v_OTT[cnt++][2] = String.valueOf(t_price);
				break;
			case 4 :
				System.out.println("DisneyPlus 월 사용 시간을 (소수점 한자리까지) 입력해주세요.");
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
