
public class Account {
				// case : 	적절한 소비   /  지출 대비 소득 부적절 / 총지출 대비 구독서비스 이용 부적절 (4개 이상의 서비스 사용 가정)
	private float income = 2000000; 	//  2000000       /  2000000  : 지난달 총소득
	private float expense = 1800000; 	//  2200000       /  800000   : 지난달 총지출
	
	public float getIncome() {
		return income;
	}
	public float getExpense() {
		return expense;
	}

}
