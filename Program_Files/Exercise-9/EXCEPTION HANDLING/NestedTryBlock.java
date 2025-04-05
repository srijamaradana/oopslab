public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            int[] nums = {1, 2, 3};
            try {
                int result = nums[2] / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Divide by zero error.");
            }
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer block: Array index issue.");
        }
    }
}
