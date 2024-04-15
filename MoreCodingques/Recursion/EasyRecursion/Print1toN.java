package Recursion.EasyRecursion;
class Print1toN {
    // Prints numbers from 1 to n
    static void printNos(int n)
    {
        if (n > 0) {
            printNos(n - 1);
            System.out.print(n + " ");
        }
        return;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int n = 10;
        printNos(n);
    }
}