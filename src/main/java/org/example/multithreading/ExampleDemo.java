package org.example.multithreading;

// custom Exception --> extends Exception

// If you want to make our class as Thread , means if you want to add custom thread
// extends from Thread class , and override run
// implements directly runnable interface and override run method


// extedns ArrayList - implemts List

// extends Thread - implements Runnable

class Suhas extends  Thread {

    public void run(){
        for(int i=1;i<=5;i++){

            System.out.println("My name is suhas");

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Exception handled is : "+e.getMessage());
            }

        }
    }

}


class Mahendra extends Thread {

    public void run(){
        for(int i=1;i<=5;i++){

            System.out.println("My name is Mahendra");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Exception handled is : "+e.getMessage());
            }


        }
    }
}




public class ExampleDemo {


    public static void main(String[] args) throws InterruptedException  {

        Suhas suhas = new Suhas();
        Mahendra mahendra = new Mahendra();

        long execuetionStarted  = System.currentTimeMillis();


        suhas.start();
        mahendra.start();

        //suhas.printName();
        //mahendra.printName();


        suhas.join();
        mahendra.join();

        long executionFinished  = System.currentTimeMillis();

        long totalExecutionTime = executionFinished - execuetionStarted;

        System.out.println("Total execution time is : "+totalExecutionTime/1000.0);

    }


}

/*
// Lifecycle of Thread
 1. creating Thread object  - NEW ->  Thread thread = new Thread();
  2. start that thread ->        thread.start();
     Running state  / runnable state

  3. again it will pause , WAITING state

  4. execute the remaining code , once all execution complete , go in TERMINATE state
 */
