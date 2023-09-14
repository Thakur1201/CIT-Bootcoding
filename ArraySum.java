public class ArraySum {
    public static void main(String[] args){
        int num[], sum=0;
        num=new int[]{2, 43, 12, 65, 98};
        for(int i=0;i<num.length;i++)
        {
            sum=sum+num[i];
        }
        System.out.println("Addition="+sum);
    }
}
