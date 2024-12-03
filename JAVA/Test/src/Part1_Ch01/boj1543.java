import java.util.Scanner;

public class boj1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String doc = sc.nextLine();
        String word = sc.nextLine();

        char[] doc_ch = new char[2500];
        for(int i = 0;i < doc.length(); i++){
            doc_ch[i] = doc.charAt(i);
        }
        char[] word_ch = new char[50];
        for(int i = 0;i < word.length(); i++){
            word_ch[i] = word.charAt(i);
        }

        int count = 0;
        for(int i = 0; i < doc.length(); i++){
            for(int j = 0;j < word.length();j++){
                if(doc_ch[j] == word_ch[j]){
                    
                }
            }
        }
        //단어 인덱스와 문서 인덱스가 같으면 카운트
    }
}
