public class ArrayProgram {
    public static void main(String[] args) {
       int numArray[] = new int[5];
       // int numArray[]={10,20,30,40,50};

//        numArray[0] = 10;
//        numArray[1] = 20;
//        numArray[2] = 30;
//        numArray[3] = 40;
//        numArray[4] = 50;
       // System.out.println(numArray[10]);
        System.out.println(numArray.length);
//        for(int i =0; i<numArray.length;i++){
//            System.out.println("elements are:"+ numArray[i]);
//        }

        for (int i : numArray) {
           System.out.println("elements are:"+ i);
        }
        }
    }


