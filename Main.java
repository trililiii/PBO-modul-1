import java.util.Scanner;

class Main {
    private static String[] mahasiswa = { "123456789", "202310370311120" };
    private static String[] mahasiswapass = { "infor123", "infor456" };
    private static String adminLogin = "admin";
    private static String adminPassword = "admin123";
    private static int studentIndex = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("====== Library System ======");
            System.out.println("1. Login Mahasiswa");
            System.out.println("2. Login Admin");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda (1-3): ");
            int pilihan = scanner.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan NIM : ");
                String nim = scanner.next();
                System.out.print("Masukkan Password : ");
                String pass = scanner.next();
                if (loginStudent(nim, pass)) {
                    System.out.println("Berhasil login sebagai Mahasiswa");
                } else {
                    System.out.println("Data tidak ditemukan");
                }
            } else if (pilihan == 2) {
                System.out.print("Masukkan username (admin): ");
                String username = scanner.next();
                System.out.print("Masukkan password (admin): ");
                String password = scanner.next();
                if (loginAdmin(username, password)) {
                    System.out.println("Berhasl login sebagai Admin");
                } else {
                    System.out.println("Data Admin tidak ditemukan");
                }
            } else if (pilihan == 3) {
                System.out.println("Successfuly access");
                break;
            }
        }
    }

    private static boolean loginStudent(String nim, String pass) {
        for (int i = 0; i < mahasiswa.length; i++) {
            if (mahasiswa[i].equals(nim)) {
                studentIndex = i;
                return true;
            }
        }
        return false;
    }

    private static boolean loginAdmin(String username, String password) {
        return adminLogin.equals(username) && adminPassword.equals(password);
    }
}