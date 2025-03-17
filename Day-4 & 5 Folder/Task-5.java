// INNER AND ANNONYMOUS CLASSES

public class Computer 
{
    public class Processor 
    {
        public void displayDetails() 
      {
            System.out.println("Processor details...");
      }
    }
    public void performTask() 
  {
        class Task 
        {
            public void execute() 
          {
                System.out.println("Executing task...");
          }
        }
        Task task = new Task();
        task.execute();
    }
    public static void main(String[] args) 
  {
        Computer computer = new Computer();
        Computer.Processor processor = computer.new Processor();
        processor.displayDetails();
        computer.performTask();
        Runnable runnable = new Runnable() 
        {
            @Override
            public void run() 
          {
                System.out.println("Running in a separate thread...");
          }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
