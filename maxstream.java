public class maxstream {
    public static void main(String[] args) {
        int arr[]={5,3,2, 10, 12, 9, 11, 17, 21, 15};
        int max=arr[0];
        for(int i=0;i<10;i++){
           if(max<arr[i]){
                max=arr[i];
            }
            System.out.print(max + " ");
        }  
    }
}
