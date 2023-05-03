package BaseballGame;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class BaseballGame {

    public static void main(String [] args) throws IOException {
        String result = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println("숫자 야구 게임을 시작합니다.");

        while(!result.equals("3스트라이크")){
            System.out.println("숫자를 입력해주세요 : ");
            String value = br.readLine();
            String array[] = value.
        }
    }
}