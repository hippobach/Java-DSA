package array;

public class _1295_leetcode {
    //    Find Numbers with Even Number of Digits
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int a : nums) {
//            Kiểm tra số chữ số của a. Nếu là chẵn thì tăng biến đếm + 1
            if(tinhSoChuSo(a) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int tinhSoChuSo(int a) {
        int count = 0;
        int res = a;
        while (res != 0) {
            res = a / 10;
            a = res;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
