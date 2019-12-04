package jp.edodai.i17811lj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTest {
    public static void main(String[] args) {
        String local, remote;	// 自分の数字，相手の数字（今回は文字列として扱う）
        int port = 8888;		// サーバー側ポート番号（この科目では8888を使う）
        BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));

        //━━━━━━━━━━━━━━━━━━━━
        //クライアント側では次の1行を生かしてサーバーのIPアドレスを指定する
        String ipaddress = "10.235.142.17";			// ←高田研究室サーバー
        //━━━━━━━━━━━━━━━━━━━━

        try {
            //━━━━━━━━━━━━━━━━━━━━
            //サーバー側では次の1行を生かす（この行は最初に1回だけ実行すればよい）
            ServerSocket ss = new ServerSocket(port);	// 待ち受けポートを設ける
            //━━━━━━━━━━━━━━━━━━━━

            // 人間のキー入力には時間がかかるのでネットワーク接続の前に済ませておく
            System.out.println("自分の数字（0～2）を入力してください");
            local = keyin.readLine();

            // ソケット接続開始
            //━━━━━━━━━━━━━━━━━━━━
            //クライアント側では次の1行を生かす
            Socket server = new Socket(ipaddress, port);	// サーバーへ接続要求する
            //━━━━━━━━━━━━━━━━━━━━
            //サーバー側では次の1行を生かす
            Socket s = ss.accept();						// 接続要求を待って接続する
            //━━━━━━━━━━━━━━━━━━━━

            BufferedReader netin = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintStream netout = new PrintStream(s.getOutputStream());
            netout.println(local);						// ネットへ自分の数字を出力
            netout.flush();								// 貯まった出力を送信する
            remote = netin.readLine();					// ネットから相手の数字を入力
            System.out.println("相手の数字は " + remote + " でした");
            s.close();									// 接続はなるべく早く閉じる

            //━━━━━━━━━━━━━━━━━━━━
            //サーバー側では次の1行を生かす（この行は最後に1回だけ実行すればよい）
            ss.close();									// 待ち受けポートを閉じる
            //━━━━━━━━━━━━━━━━━━━━
            // ソケット接続終了

        } catch (Exception e) {
            System.out.println("エラー：" + e);
        }
    }
}
