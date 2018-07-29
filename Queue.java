package com.company;

public class Queue {
    int putloc,getloc;
    char q[];

   Queue (int  size){
    q =new char[size +1];
    putloc= getloc=0;
}
public void put (char ch){
       if (putloc==q.length-1){
           System.out.print("--Queue is full ");
           return;// используется return для выводв сообщения и обрыва (точки возврата по достижении условия когда
           // индекс вставки будет равен длине массива очереди
       }
       q[putloc++]=ch;
     }
public  char get () {
       if (getloc==putloc){ System.out.println("--Queue is empty");return (char) 0;}

       return  q [getloc ++];
}



}



