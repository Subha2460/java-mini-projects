package todolist;
public class TaskManager {
    private String[] tasks=new String[50];
	private int count;
	
	public String[] getTasks()
	{
		return tasks;
	}
	
	public void setTasks(String[] tasks)
	{
		this.tasks = tasks;
	}
	
	public int getCount() 
	{
		return count;
	}
	
	public void setCount(int count)
	{
		this.count = count;
	}
	
	public void addTask(String task)
	{
		if(count<50)
		{
			tasks[count]=task;
			count++;
			System.out.println("Task added successfully !!....");
		}
		else
		{
			System.out.println("Maximum of 50 task can only can be added");
		}
	}
	
	public void deleteTask(String task)
	{
		boolean found=false;
		for(int i=0;i<count;i++)
		{
			if(tasks[i].equalsIgnoreCase(task))
			{
				found=true;
				for(int j=i;j<count-1;j++)
				{
					
					tasks[j]=tasks[j+1];
				}
				count--;
			}
		}
		if(found)
		System.out.println("Task removed successfully...");
		else
			System.out.println("The task is not present in TO DO List....");

	}
	

	public void viewTask()
	{
		if(count==0)
		{
			System.out.println("No task added....");
		}
		else
		{
			for(int i=0;i<count;i++)
			{
				System.out.println((i+1)+". " +tasks[i]);
			}
			
		}
	}
    
}
