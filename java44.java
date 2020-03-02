

public class Main
{
    int  fun(String s,int c){
        if(c==s.length()-1){
            int as=s.charAt(c);
            return as;
        }
       
        else{
  
            return s.charAt(c)+fun(s,++c);
            
        }
        
        
        
    }
	public static void main(String[] args) {
		String s="zars";
		int c=0;
		Main m=new Main();
	   System.out.println(m.fun(s,c))	;
	}
}
