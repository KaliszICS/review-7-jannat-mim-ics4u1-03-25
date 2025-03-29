import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
 		q2();
 		q3();
 		q4();
 		q5();
 		q6();
 		q7();
	}

	public static void q1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		String result = evenOrOdd(num);
		System.out.println(result);
    }

    public static String evenOrOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

	public static void q2() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = scanner.nextLine();

		System.out.println(teacherOrstudent(name));
		}

		public static String teacherOrstudent(String name) {
		if (name.equals("Kalisz")) {
			return "Teacher";
		} else {
			return "Student";
		}
	}

	public static void q3() {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		int result = fartherFromZero(num);
		System.out.println(result);
	}
	public static int fartherFromZero(int num) {
		if (num >0) {
			return num + 5;
		} else if (num < 0) {
			return num - 5;
		} else {
			return 0;
		}
	}

	public static void q4() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		String result = isFive(num);
		System.out.println(result);
	  }
	  public static String isFive(int num) {
	  if (num ==5){
	  return "The number is Five";
		} else {
	  return "The number is not Five";
	  }
	}

	public static void q5() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter a number: ");
		double num = scanner.nextDouble();

		String result = positiveOrNegative(num);
		System.out.println(result);
	}
		public static String positiveOrNegative (double num){
		if (num > 0) {
			return "Positive"; }
			else {
				return "Negative";
			}
		}

	public static void q6() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();

		String result = highOrLow(num);
		System.out.println(result);
	}
		public static String highOrLow (double num){
		if (num > 100) {
			return "High"; }
			else {
				return "Low";
			}
		}

	public static void q7() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = scanner.nextLine();

		String result = isHello(word);
		System.out.println(result);
	  }
	  public static String isHello(String word) {
	  if (word.equals("Hello")) {
	  return "The word is Hello";
		} else {
	  return "The word is not Hello";
	  }
	}
}