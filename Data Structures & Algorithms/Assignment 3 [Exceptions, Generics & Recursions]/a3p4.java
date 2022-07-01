
public class a3p4
{

	public static void main(String[] args)
	{
		box<String> s=new box<String>("ITER","SOA");
		box<Integer> i=new box<Integer>(12,34);
		box<Object> o=new box<Object>("ITER",45);
		s.display();
		i.display();
		o.display();

	}

}
class box<T>
{
	T a;
	T b;
	box(T x,T y)
	{
		a=x;
		b=y;
	}
	void display()
	{
		System.out.println(a+","+b);
	}
}
