package twodArray;

public class TestD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="findnitianhere";
		System.out.println("Original string is:   findnitianhere ")   ;                                                   //Sysou cltr + space bar for shortcut
		System.out.println("The largest palindromic is: "+ twodarray(s));
		twodarray(s);
	}public static String twodarray(String s){
		int y=s.length(),n=y-1,n1=0,t=0,x=0,p=0,h=0,num=0;String f="";
		int check=0,k=0,j=0;
		char store [] = new char [100];
		char store1 [] = new char [100];
		char store2 [] = new char [100];
		for( x=0;x<y;x++) {
			store[x]=s.charAt(n-x);
			store2[x]=s.charAt(x);
					}
		for( x=0;x<y;x++) {
			for( t=0;t<y;t++) {
				if(store2[x]==store[t]) {                         //finds the 1st instance where it is equal
					 h=x;
					for( num=t;num<y;num++) {                   //compares until it is no longer equal
						 if(store2[h]==store[num]&&h<y) {     
							 x=h;h++;p++;n1++;                  //counter variables x before h and u before p
						 }
					} t=num;
				    if(n1>check){
				    	check=n1;j=x;
				    	for(k=0;k<n1;k++) {
				    		store1[k]=store2[j];                    //store the largest substring
				    		j--;
				    	}
				    }n1=0;
			} 
		}
		} 
		for( t=0;t<y;t++) {
				f+=store1[t];				                  
		}            
	return f;
	}

}

/*if(n1==1) {
	 store1[u]='.';                               //needs work p can work but
}n1=0;u=0;*/