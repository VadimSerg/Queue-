package com.company;

public class Main {

    public static void main(String[] args) {
        Queue bigQ = new Queue(35);
        Queue smallQ = new Queue(4);
        int i;
        char ch;
        System.out.println("For the big alphabet");
        for (i = 0 ; i < 26; i ++){
            bigQ.put((char)('A' +i));
        }
        System.out.println("Contents of the big alphabet");
        for ( i = 0; i < 26;  i ++)
        {
//            ch =bigQ.get();
//            System.out.print(ch +" ");
            System.out.print(bigQ.get() +" ");
        }
        System.out.println();
        System.out.println("\n");
        System.out.println("Errors");
        for (i = 0; i < 5 ; i ++)
        {

            System.out.print(" Attempt to store : "+(char)('Z'-i) );
            smallQ.put((char)('Z'-i));
            System.out.println();

        }
        System.out.println();
        System.out.println("For the small queue");

        for (i = 0 ; i < 5 ; i ++)
        {
          ch=smallQ.get();                       //если "отключить" 37 и 38 строку
          if (ch!=(char)0) System.out.print(ch); //то результат после компиляции будет таким: (верный вариант по Шилдту


//            Errors
//            Attempt to store : Z
//            Attempt to store : Y
//            Attempt to store : X
//            Attempt to store : W
//            Attempt to store : V--Queue is full
//
//            For the small queue
//            ZYXW--Queue is empty



//            if (smallQ.get()!=(char)0) System.out.print(smallQ.get());// если "отключить" эту строку, то результат будет
            // таким, а почему так как в строках 65-67

//            Errors
//            Attempt to store : Z
//            Attempt to store : Y
//            Attempt to store : X
//            Attempt to store : W
//            Attempt to store : V--Queue is full
//
//            For the small queue
//            YW--Queue is empty
//                --Queue is empty
//                --Queue is empty





        }
        System.out.println();





    }
}














//      Main ob =new Main();
//      ob.test();
//        System.out.println();
//      test1();
//        System.out.println();
//        System.out.println(recurs(5));
//        System.out.println(recurs(10));
//
//	// write your code here
//    }
//     public  void test(){
//        int i;
//        for (i = 1 ; i < 14 ; i++)
//        {
//            if (i==5) return;//Организовать немедленное завершение метода типа void и возврат из него можно с помощью
//            // следующей формы оператора return: return ;
//           // При выполнении этого оператора управление будет возвращено вызывающей части программы, а оставшийся в мето
//            // -де код будет проигнорирован.
//            System.out.println(i);
//        }
//      }
//       public static void test1(){
//           int i;
//           for (i = 1 ; i < 14 ; i++)
//           {
//               if (i==10) return;
//               System.out.println(i);
//           }
//       }
//
//
//       public  static  int recurs (int n){
//        if (n == 1) return 1;
//        return recurs(n-1)*n;
//
