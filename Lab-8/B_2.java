public class B_2{
    public static void main(String[] args) {
        int[] nums = new int[args.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            try {
                if(Integer.parseInt(args[i])<0){
                    throw new Exception();
                }
                if(Integer.parseInt(args[i])%10 == 0){
                    throw new Exception();
                }
                if(Integer.parseInt(args[i])>1000 && Integer.parseInt(args[i])<2000){
                    throw new Exception();
                }
                if(Integer.parseInt(args[i])>7000){
                    throw new Exception();
                }
                nums[i] = Integer.parseInt(args[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                continue;
            }
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum is = "+sum);    
    }
        
}
