class multi
{
	int x=49;
	void show()
	{
		System.out.println("in parent class:");
	}
}
class level extends multi //level is child of multi
{
	void disp()
	{
		System.out.println("in child class");
	}
	public static void main(String[] args) {

		level l = new level();
		l.show();
		System.out.println(l.x);
		l.disp();
		
	}
}