package codigos;

public class InverteString {
	public static void main(String[] args) {}
		
		
		private String str = "StringInvertida";


		public StringBuilder getStr() {
			
			
			StringBuilder dest = new StringBuilder();
			
			for (int i = (str.length() - 1); i >= 0; i--){
				dest.append(str.charAt(i));
				
				
			}
			System.out.println(str);
			
			return dest;
		}


	
		
		
	
}


