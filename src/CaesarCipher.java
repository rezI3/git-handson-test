import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //暗号文を入力すると、1文字シフトから26文字シフトまでの全てのパターンが表示される
        //その中から平文として最もらしいものが、暗号文から解読された平文である。

        System.out.println("暗号文を入力してください。");
        String text = scanner.next();

        for (int i = 1; i < 26; i++) {

            StringBuilder plainText = new StringBuilder();
            for (int j = 0; j < text.length(); j++) {

                //暗号文のj文字目のi文字シフトをtmpに格納
                char tmp = (char) (text.charAt(j) + i);

                //Zよりアスキーコードが大きくなったら、Aまで戻す処理
                if (tmp > 'Z') {
                    tmp = (char) (tmp - 26);
                }

                //tmpを平文に追加
                plainText.append(tmp);

            }
            System.out.println(i + "文字シフト　=> " + plainText);
        }
    }
}
