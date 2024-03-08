package recursion_Shraddha;

public class StringReverse {
	public static void Reverse(String s,int indx) {
		if(indx==0) {
			System.out.print(s.charAt(indx));
			return;
		}
		System.out.print(s.charAt(indx));
		Reverse(s,indx-1);
	}
	public static void main(String[] args) {
		String str="mahesh";
		Reverse(str,str.length()-1);
		
		
	}

}
