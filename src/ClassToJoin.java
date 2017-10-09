
public class ClassToJoin 
{

	public static void main(String[] args) 
	{
		Thread t1=new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					try
					{
					Thread.sleep(1000);
					System.out.println("Hello");
					}
					catch(InterruptedException ie)
					{
						
					}
				}
			}
		});
		
		Thread t2=new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					try
					{
					Thread.sleep(1000);
					System.out.println("world");
					}
					catch(InterruptedException ie)
					{
						
					}
				}
			}
		});
		
		
		try
		{
			t1.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("After First Thread");
		t1.start();
		t2.start();
//		try
//		{
//			t2.join();
//		}
//		catch(InterruptedException e)
//		{
//			e.printStackTrace();
//		}
		System.out.println("After second Thread hello world");
	}

}
