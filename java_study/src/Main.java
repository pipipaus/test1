import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		클래스명 변수 = new 클래스명();
//		}
//	
//		public static int add(int a, int b) {
//		int result = 0;
//		result = a + b;
//		return a + b;

//		int o = 0;
//		String ax = "";

//		for (int a = 0; a < 5; a++) { // int a는 0이고 5보다 작고 1씩 더해진다
//			for (int b = 0; b <= a; b++) { // int b는 0이고 a보다 작거나 같고 1씩 더해진다
//				System.out.print("*"); // *을 일렬로
//			}
//			System.out.println(""); // 한 줄로
//		}

// 20 10 35 30 7
// 7 35

//		int array[] = {7, 10, 20, 30, 35};
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
//
//		for (int i = 0; i < array.length; i++) {
//			if (max < array[i]) { // max의 값이 array[i]보다 작으면
//				max = array[i]; // max = array[i]
//			}
//			if (min > array[i]) { // min의 값이 array[i]보다 크면
//				min = array[i]; // min = array[i]
//			}
//		
//		}
//		System.out.println(min + " " + max);

//		int array[] = {7, 10, 20, 30, 35};
//		int max = array[0];
//		int min = array[0];
//		
//		for (int idx = 0; idx < array.length; idx++) {
//			if (max < array[idx]) { // max의 값이 array[i]보다 작으면
//				max = array[idx]; // max = array[i]
//			}
//			if (min > array[idx]) { // min의 값이 array[i]보다 크면
//				min = array[idx]; // min = array[i]
//			}
//		}
//		System.out.println(min + " " + max);

		Scanner scan = new Scanner(System.in);
		
		int[] score = {40, 80, 60};

//		각각의 값을 최대값으로 나누고
//		곱하기 100 해서
//		각각 값을 구한 다음에
//		개수로 나눠야 한대..

//		1. 점수의 합(ageSum) 구하기
//		int scoreSum = 0;
//		int count = score.length;
//
//		for (int n = 0; n < count; n++) {
//			scoreSum = scoreSum + score[n];
//		}
//		System.out.println(scoreSum);

		// 2. 점수의 최대값 구하기
		int max = 0;
		for (int idx = 0; idx < score.length; idx++) {
			if (max < score[idx]) { // max의 값이 score[idx]보다 작으면
				max = score[idx]; // max = score[idx]
			}
		}
		System.out.println(max); // max의 값
		
		double grade = 0;
		for (int idx = 0; idx < score.length; idx++) {
			grade += (double)score[idx] / max * 100;
		}
		System.out.println(grade / 3); // grade의 값

//		3. 평균 점수(scoreAvg) 구하기
//		float scoreAvg = scoreSum / count;
//		System.out.println(scoreAvg);

	}
}
