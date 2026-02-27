package todolist;

import java.util.Scanner;

public class User {
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TaskManager t1=new TaskManager();
		int choice;
		String task;
		do
		{
			System.out.println("Choose");
			System.out.println("1. Add Task");
			System.out.println("2. Delete Task");
			System.out.println("3. View Task");
		    choice=sc.nextInt();
			sc.nextLine();
		switch(choice)
		{
		case 1:
			System.out.println("Enter task name:");
		    task=sc.nextLine();
			t1.addTask(task);
			break;
			
		case 2:
			System.out.println("Enter task name:");
			task=sc.nextLine();
			t1.deleteTask(task);
			break;
		
		case 3:
			t1.viewTask();
			break;
		
		case 4:
			System.out.println("Exiting...");
			break;
			
		default:
			System.out.println("Enter a valid number...");
			break;
		}

	}while(choice!=4);
	}
    
}