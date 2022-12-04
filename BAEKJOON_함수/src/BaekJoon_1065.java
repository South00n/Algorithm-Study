import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
N이 주어졌을 때, 1보다 크거나 같고, 
N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 */
public class BaekJoon_1065 {
	
	public static int hansu(int N) {
		int cnt = 0;
		
		if(N < 100) {
			return N;
		} else {
			cnt = 99;
			
			for(int i = 100; i <= N; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int units = i % 10;
				
				if ((ten - hun) == (units - ten)) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(hansu(N));
	}

}
