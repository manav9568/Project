import java.util.*;
public class two {
    public static void main(String[] args) {
        int a[]={7,-3,8,2,-5,10,12,24,32};
        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                list.add(a[i]);
            }
        }
        int size=list.size();
        int mid=(size-1)/2;

        System.out.println(list.get(mid));
    }
}
