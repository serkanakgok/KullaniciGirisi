import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String psw = "patika123", answer, yes = "e", no = "h";

        System.out.print("Lütfen şifrenizi giriniz :");
        Scanner check = new Scanner(System.in);
        answer = check.nextLine();

        if (!answer.equals(psw)) {
            System.out.print("Şifrenizi sıfırlamak istiyor musunuz e/h :");
            answer = check.nextLine();
            if (answer.equals(yes)) {
                System.out.print("Lütfen yeni şifrenizi giriniz :");
                answer = check.nextLine();
                if (!answer.equals(psw)) {
                    System.out.println();
                    System.out.println("Şifre oluşturuldu");
                } else {
                    System.out.println();
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            } else if (answer.equals(no)) {
                System.out.println();
                System.out.println("Şifre yenileme işlemi iptal edilmiştir.");
            }
        } else {
            System.out.println();
            System.out.println("Giriş başarılı.");
        }
    }
}
