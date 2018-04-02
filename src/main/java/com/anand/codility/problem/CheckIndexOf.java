/**
 * 
 */
package com.anand.codility.problem;

/**
 * @author U45999
 *
 */
public class CheckIndexOf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String timestring = "DD/MM/YY";//12/31/99 5:30 AM
		//String timestring = "12/31/99 5:30 AM";
		System.out.println(timestring.matches(".*\\d+.*"));
		System.out.println(timestring.indexOf("/", 0));
		System.out.println(timestring.indexOf("/", timestring.indexOf("/", 0)));
		//int occurance = StringUtils.countOccurrencesOf("a.b.c.d", ".");	
		/*String s = "  languageCode@EN@  content@Healthy Solutions@ languageCode@EN@  content@Healthy$ Solutions";
		String[] st = s.split("@");
		StringBuffer valueOdd = new StringBuffer();
		int len = st.length;
		System.out.println(len);
		/*while(len>0){
			valueOdd.append(st[len-1]).append(" ").append(st[len-3]).append(" ");
			len=len-4;
		}*/
		/*for( int i=0; i<st.length; i++ ) {
			if(i%2==0){
				System.out.print(st[i]);
				
			}else if(i%2!=0){
				System.out.println(st[i]);
				//valueOdd.append(st[i]).append(st[i-1]);
			}
		}
		System.out.println("VALUE "+valueOdd);
		int[] counterArr =new int[10];
		int counter = 0;
		for( int i=0; i<s.length(); i++ ) {
		    if( s.charAt(i) == ':' ) {
		        counter++;
		        System.out.println("At Position : "+i);
		    } 
		}
		System.out.println(counter);
*/
	}
		

}
