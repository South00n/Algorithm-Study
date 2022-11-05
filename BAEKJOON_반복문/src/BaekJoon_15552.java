/*
입력
첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.

출력
각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.IOException;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_15552 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int A, B;
		
		for (int i = 1; i <= T; i++) {
			String st = br.readLine();
			
			A = Integer.parseInt(st.split(" ")[0]);
			B = Integer.parseInt(st.split(" ")[1]);
			
			bw.write(A + B + "\n");
		}
		
		bw.flush();
	}

}
