package list;

import java.util.Comparator;

public class DescTotal implements Comparator<GradeBean>{

	@Override
	public int compare(GradeBean front, GradeBean back) {
		// 점수를 비교하여 큰 점수를 앞으로 보내는 정렬
		return (front.getTotal() > back.getTotal()) ? -1
		:(front.getTotal() < back.getTotal()) ?1:0; 
	}
}
