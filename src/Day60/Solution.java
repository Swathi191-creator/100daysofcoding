package Day60;

class Solution {
    public void printNos(int N) {
        printNosRecursive(1, N);
    }

    private void printNosRecursive(int i, int N) {
        if (i <= N) {
            System.out.print(i + " ");
            printNosRecursive(i + 1, N);
        }
    }
}
