package org.example.Head02_ObjectOrientedProgramming.example19;

public class LocalClassDemo {
    public void execute(){
        final int taskId = 999;
        class LocalWorker{
            public void run(){
                System.out.println("LocalWorker started with taskId = " + taskId);
            }
        }

        LocalWorker localWorker = new LocalWorker();
        localWorker.run();
    }
    public static void main(String[] args){
        LocalClassDemo demo = new LocalClassDemo();
        demo.execute();
    }
}
