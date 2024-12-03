import java.util.Scanner;

public class boj1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        int[] countA = new int[26];
        int[] countB = new int[26];
        for(int i = 0; i < a.length(); i++){
            countA[a.charAt(i) - 'a']++;
        }
        for(int i = 0; i < b.length(); i++){
            countA[b.charAt(i) - 'b']++;
        }
        int ans = 0;
        for(int i = 0; i < 26; i++){
            if(countA[i] > countB[i])
                ans += countA[i] - countB[i];
            else if (countA[i] < countB[i])
                ans += countB[i] - countA[i];
        }
        System.out.println(ans);
    }
}
