<<<<<<< HEAD
package Arrays;

public class linearS {
    public static int linearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
       int index = linearSearch(number, key);
       if(index == -1){
        System.out.println("NOT Found");
       }else{
        System.out.println("key is at index :"+index);
       }
    }
}
=======
package Arrays;

public class linearS {
    public static int linearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
       int index = linearSearch(number, key);
       if(index == -1){
        System.out.println("NOT Found");
       }else{
        System.out.println("key is at index :"+index);
       }
    }
}
>>>>>>> 2ed70a9902f3bf953b20f82399c81d632496623a
