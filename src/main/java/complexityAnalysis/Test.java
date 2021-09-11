package complexityAnalysis;

public class Test {
  public static void main(String[] args) {
    Test test = new Test();
    test.rootNComplexity(37);
  }

  /**
   * Complexity example of O(1) Takes two number a and b and return the sum of a and b
   *
   * @param a first number
   * @param b second number
   * @return sum
   */
  public int add(int a, int b) {
    int sum;
    sum = a + b;
    return sum;
  }

  /**
   * Complexity example O(1) Calculate the area of a triangle using Heron's formula.
   *
   * @param a first arm of the triangle
   * @param b second arm of the triangle
   * @param c third arm of the triangle
   * @return area of the triangle
   */
  public double areaOfTriangle(double a, double b, double c) {
    // calculate semi perimeter
    double s;
    s = (a + b + c) / 2;

    // calculate the area using Herons formula
    double area;
    area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    return area;
  }

  /**
   * Complexity example (n) Print the values from 1 to n
   *
   * @param n positive integer
   */
  public void printUpToN(int n) {
    for (int i = 1; i <= n; i++) {
      System.out.println(n);
    }
  }

  /**
   * Complexity example O(n) Print values from 1 to n recursively
   *
   * @param n limit to print
   */
  public void printRec(int n) {
    if (n == 0) return;
    printRec(n - 1);
    System.out.println(n);
  }

  /**
   * Complexity example of (n) Print the elements of an integer array
   *
   * @param array integer array
   */
  public void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  /**
   * Complexity example of O(√n)
   *
   * @param n positive integer
   */
  public void rootNComplexity(int n) {
    int p = 0;
    for (int i = 1; p < n; i++) {
      p = p + i;
      System.out.println("Count of i: " + i + " , value of p: " + p);
    }
  }

  /**
   * Complexity example O(√n) Check if a number is prime or not
   *
   * @param n number to be checked
   * @return true if n is prime
   */
  public boolean isPrime(int n) {
    if (n < 2) return false;
    if (n == 2 || n == 3) return true;
    if (n % 2 == 0) return false;
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
      if (n % i == 0) return false;
    }
    return true;
  }

  /**
   * Complexity example of O(n^2)
   *
   * @param n positive integer
   */
  public void printIJ(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.println("Value of i: " + i + " , Value of j: " + j);
      }
    }
  }
}
