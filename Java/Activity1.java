public class Activity1{
    public static void main(String[] args){
        int sum = 0;
        int[] array ={10,77,10,54,-11,10};
        for(int i:array){
            if( i== 10){
                sum=sum+i;
            }
        }
        if(sum==30){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }
    }
}