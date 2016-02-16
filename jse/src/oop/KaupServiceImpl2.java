package oop;

public class KaupServiceImpl2 implements KaupService{

	@Override
	public String getState(double height, double weight) {
		int index = (int) ((weight / (height * height)) * 10000);
		String state = "";
		if (index > 60) {
			state = "비만";
		} else if (index > 50) {
			state = "과체중";
		} else if (index > 20) {
			state = "정상";
		} else if (index > 15) {
			state = "저체중";
		} else if (index > 13) {
			state = "마름";
		} else if (index > 10) {
			state = "영양실조";
		} else {
			state = "소모증";
		}
		return state;
	}

}
