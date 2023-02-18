public class binary_search {
    public static int binary(int number[], int Key){
        int start =0, end= number.length-1;
        while(start <= end){
            int mid = (start + end) / 2;

            //comparsion
            if(number[mid] == Key){
                return mid;
            }

            if(number[mid] < Key){
                start = mid +1;
            }else{
                end = mid-1;
            }

        }
        return end;
    }
    public static void main(String args[]){
        int number[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int Key = 0;
        System.out.print("your index is :" + binary(number, Key));
    }
}
