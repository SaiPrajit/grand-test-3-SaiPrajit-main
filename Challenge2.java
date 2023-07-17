import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the size of the array: ");
    int size = scanner.nextInt();

    // Create the array
    int[] array = new int[size];

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
      System.out.print("Element " + (i + 1) + ": ");
      array[i] = scanner.nextInt();
    }

    int evenCount = 0;
    int oddCount = 0;
    int primeCount = 0;
    int palindromeCount = 0;

    for (int element : array) {
      if (element % 2 == 0) {
        evenCount++;
      } else {
        oddCount++;
      }

      if (isPrime(element)) {
        primeCount++;
      }

      if (isPalindrome(element)) {
        palindromeCount++;
      }
    }

    System.out.println("Number of even elements: " + evenCount);
    System.out.println("Number of odd elements: " + oddCount);
    System.out.println("Number of prime elements: " + primeCount);
    System.out.println("Number of palindrome elements: " + palindromeCount);

    scanner.close();
  }

  private static boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }

    return true;
  }

  private static boolean isPalindrome(int number) {
    String numberStr = Integer.toString(number);
    int i = 0;
    int j = numberStr.length() - 1;

    while (i < j) {
      if (numberStr.charAt(i) != numberStr.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }

    return true;
  }
}
