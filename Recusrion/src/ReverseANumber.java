
public class ReverseANumber {

	public static void main(String[] args) {
		String s= "5476231";
		int i=0;
		int j=s.length()-1;
		
		while(i<=j)
		{
			char Temp=s.charAt(i);
			s.charAt(i)=s.charAt(j);
			s.charAt(j)=temp;
			i++;
			j--;
		}
		System.out.println(s);

	}

}
