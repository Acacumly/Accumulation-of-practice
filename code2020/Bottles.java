package month_11_23;

import java.util.Scanner;

/**
 * 智力题，汽水瓶
 */

public class Bottles{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while(sc.hasNextLine()) {
            n = sc.nextInt();
            int total = 0;
            if(n > 0 && n <= 100) {
                //只有一个瓶子时
                if(n == 1) {
                    total = 0;
                } else if(n == 2) {
                    total = 1;
                }

                while(n > 2) {
                    total += n/3;
                    n = n/3 + n%3;
                    if(n == 2) {
                        total++;
                    }
                }

            }
            System.out.println(total);
        }

    }
}

/*
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while(sc.hasNext()) {
            n = sc.nextInt();
            System.out.println(drink(n));
        }
    }

    public static int drink(int n) {
        int total = 0;

        while(n > 2) {
            total += n/3; //之前喝的以及当前可以对换的瓶子
            n = n/3 + n%3;//喝完之后的空瓶数
        }
        if(n==2) {
            total = total + 1;
        }
        return total;
    }
}*/

