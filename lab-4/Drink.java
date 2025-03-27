/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

******************************************************************************/
public class Drink {
    private void pour() {
        System.out.println("pour ");
    }

    private void water() {
        System.out.println("water ");
    }

    private void ice() {
        System.out.println("add ice");
    }

    private void shake() {
        System.out.println("drink");
    }

    public static void main(String[] args) {
        Drink d = new Drink();
        d.pour();
        d.water();
        d.ice();
        d.shake();
    }
}
