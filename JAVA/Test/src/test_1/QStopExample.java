package test_1;

import java.io.IOException;

public class QStopExample {
    public static void main(String args[]) {
        int keyCode;

        try {
            while (true) {
                keyCode = System.in.read();
                System.out.println("keyCode : " + keyCode);
                if (keyCode == 113) {  // 113 is the ASCII code for 'q'
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("종료");
    }
}