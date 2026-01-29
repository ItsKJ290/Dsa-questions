import java.util.*;
public class Twosum {
    public static int[] twoSum(int[] arr,int target){
        int n=arr.length;
        int[][] numswithindex=new int[n][2];
        //putting values in nums with  index
        for(int i=0;i<n;i++){
            //values
            numswithindex[i][0]=arr[i];
            //keys
            numswithindex[i][1]=i;

        }
        Arrays.sort(numswithindex,(a,b)->Integer.compare(a[0],b[0]));
        int left=0,right=n-1;
        while(left<right){
            if(numswithindex[left][0]+numswithindex[right][0]==target){
                return new int[]{numswithindex[left][1],numswithindex[right][1]};
            }else if(numswithindex[left][0]+numswithindex[right][0]<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};

    }
    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        int[] res=twoSum(arr, 6);
        System.out.print("["+res[1]+","+res[0]+"]");
    }
}
