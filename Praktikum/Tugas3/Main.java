package Tugas3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hero p1 = new Hero();
        Scanner sc = new Scanner(System.in);
        System.out.println("Permainan adu hero");
        System.out.println("Player 1 : Silahkan masukkan hero Anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
        System.out.println("=============================================================");

        System.out.print("Nama Hero      : ");
        String nama1 = sc.nextLine();
        p1.setName(nama1);
        System.out.print("Health Point   : ");
        double hp1 = sc.nextDouble();
        p1.setHp(hp1);
        System.out.print("Attack         : ");
        double atk1 = sc.nextDouble();
        p1.setAttack(atk1);
        System.out.print("Defense        : ");
        double def1 = sc.nextDouble();
        p1.setDefense(def1);
        if (hp1 > 500 || atk1 > 500 || def1 > 500){
            System.out.println("Player 1 curang, program selesai");
            sc.close();
            return;
        } else if (hp1 < 0 || atk1 < 0 || def1 < 0){
            System.out.println("Input tidak Valid, program selesai");
            sc.close();
            return;
        } 
        System.out.println("\nPermainan adu hero");
        System.out.println("Player 2 : Silahkan masukkan hero Anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
        System.out.println("=============================================================");

        System.out.print("Nama Hero      : ");
        sc.nextLine();
        String nama2 = sc.next();
        System.out.print("Health Point   : ");
        Double hp2 = sc.nextDouble();
        System.out.print("Attack         : ");
        Double atk2 = sc.nextDouble();
        System.out.print("Defense        : ");
        Double def2 = sc.nextDouble();
        Hero p2 = new Hero(nama2,hp2,atk2,def2);

        
        if (hp2 > 500 || atk2 > 500 || def2 > 500) {
            System.out.println("Player 2 curang, program selesai");
            sc.close();
            return;
        } else if (hp2 < 0 || atk2 < 0 || def2 < 0){
            System.out.println("Input tidak Valid, program selesai");
            sc.close();
            return;
        }
        
        int round = 1;
        while (p1.getHp() > 0 || p2.getHp() > 0) {
            System.out.println("=============================================================");
            System.out.println("Ronde " + round);
            round++;
            System.out.println("=============================================================");

            System.out.println(p1.getName() + " menyerang " + p2.getName());
            System.out.println();
            System.out.println(p1.getName() + " menyerang sebesar " + p1.getAttack());
            System.out.println(p2.getName() + " memiliki pertahanan sebesar " + p2.getDefense());
            p2.setHp(p2.getHp() + p2.getDefense() - p1.getAttack());
            System.out.println( "Health" + p2.getName() + " saat ini " + p2.getHp());

            if (p2.getHp() < 0) {
                break;
            }

            System.out.println();

            System.out.println(p2.getName() + " menyerang " + p1.getName());
            System.out.println();
            System.out.println(p2.getName() + " menyerang sebesar " + p2.getAttack());
            System.out.println(p1.getName() + " memiliki pertahanan sebesar " + p1.getDefense());
            p1.setHp(p1.getHp() + p1.getDefense() - p2.getAttack());
            System.out.println( "Health" + p1.getName() + " saat ini " + p1.getHp());

        }

        System.out.println("\nPertarungan telah usai!");

        if(p1.getHp() < 0){
            System.out.println(p1.getName() + " telah kalah");
            System.out.println("=============================================================");
            System.out.println(p2.getName() + " adalah pemenangnya");
        } else if(p2.getHp() < 0){
            System.out.println(p2.getName() + " telah kalah");
            System.out.println("=============================================================");
            System.out.println(p1.getName() + " adalah pemenangnya");
        }
        sc.close();
    }
}
