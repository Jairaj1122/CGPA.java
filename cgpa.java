public class cgpa {
    public static void main(String[] args) {
        System.out.print("Score in English! = ");
        int English = sc.nextInt();
        System.out.print("Score in Computer Science! = ");
        int ComputerScience = sc.nextInt();
        System.out.print("Score in Maths2! = ");
        int Maths2 = sc.nextInt();
        float cgpa = (English + ComputerScience + Maths2) / 30f;
        System.out.println("Total cgpa = " + cgpa + '%');
    }
}
