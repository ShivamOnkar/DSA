package patterns;

public class inRHPyr {
    //inverted & Roated half Pyramid 
//       *
//      **
//     ***
//    ****
//   *****
//  ******
// *******
    public static void pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Inverted Half-Pyramid with number
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6
// 1 2 3 4 5 6 7
     public static void pyramidh(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //Floayd's Triangle
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20 21
// 22 23 24 25 26 27 28
    public static void floyd(int n){
        int count = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                   System.out.print(count + " ");
                   count++;
            }
            System.out.println();
        }
    }

    //0-1 Triangle
// 1
// 01
// 101
// 0101
// 10101
// 010101
    public static void triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        // pyramid(7);
        //   pyramidh(5);
        // floyd(7);
        triangle(6);
    }
}
