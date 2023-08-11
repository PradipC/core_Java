package org.example.multithreading;


class Counter {
    int count ;
    public synchronized void incrementCount (){
        count++;
    }

}


public class SynchonizedDemo {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i=1;i<=5000;i++){
                    counter.incrementCount();
                }



            }
        });



        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i=1;i<=5000;i++){
                    counter.incrementCount();
                }

            }
        });


        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();


        System.out.println("Count count is : "+counter.count);





    }



}

// Java 8 features

// servlet + jsp + jdbc


