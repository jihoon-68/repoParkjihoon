package org.example.Head04_JavaProgrammingStart.example04;

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
