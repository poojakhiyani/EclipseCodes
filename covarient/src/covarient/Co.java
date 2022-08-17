package covarient;

class EmpCovariant
{
	final static String comp="pok";
	final int id;
	EmpCovariant()
	{
		id=121;
		System.out.println(id);
	}
	EmpCovariant(int i)
	{
		id=45;
		System.out.println(i);
		}
	
	public EmpCovariant getRecord()
	{
		return null;
	}
}
/*class Hr extends EmpCovariant
{
	public Hr getRecord()
	{
		System.out.println("jdhgdh");
		return this;
	}
}
		
			
		class Hrvp extends Hr
		{
			public Hrvp getRecord()
			{
				System.out.println("hjk");
				return this;
			}
		}*/
		class Result
		{
			public static void main(String []args)
			{
				//Hrvp h=new Hrvp();
				//h.getRecord();
				EmpCovariant e = new EmpCovariant();
				EmpCovariant e1 = new EmpCovariant(123);
				//System.out.println(e);
				
				//System.out.println(e1);
				
				
			}
		}

