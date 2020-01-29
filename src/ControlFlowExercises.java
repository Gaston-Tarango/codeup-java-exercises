public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//         int i = 0;
//           do {
//             System.out.println(i+=2);
//         } while (i <= 98);

//           int i = 100;
//        do {
//            System.out.println(i-=5);
//        } while (i >= -5);

//        int i = 2;
//        do {
//            System.out.println(i*i);
//            i += 1;
//        } while (i < 1000000);

//        for(int i = 5; i <= 15; i++) {
//            if(i-15 == i) {
//                continue;
//            }
//            System.out.println(i);
//        }

//        for(int i = 2; i <= 1000000; i++) {
//            if(i*i == i) {
//                continue;
//            }
//            System.out.println(i);
//        }

//        for (var i = 1; i <= 100; i++){
//            if (i % 15 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            }else if (i % 3 == 0){
//                System.out.println("Fizz");
//            }else System.out.println(i);
//        }

        for (int i = 1; i <= 5; i++)
        {
            System.out.println("number  | squared | cubed ");
            System.out.println("--------------------------");
            System.out.print(i + "       | ");

            for (int j = 1; j <=25; j++)
                System.out.print(j*j + " ");

            System.out.print("| ");

            for (int k = 15; k <= 30; k += 3)
                System.out.print(k + " ");


            System.out.println("");
        }







    }
}

