/**
 * 
 */
package com.anand.general.problem;

import java.util.HashMap;
import java.util.Map;

/**
 * @author U45999
 *
 */
public class StringLowerCaseExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "anandtest";
		String strLower = str.toLowerCase();
		System.out.println("Lower CAse first time :: "+strLower);
		String strLowerOneMoretime = strLower.toLowerCase();
		System.out.println("Lower CAse second time :: "+strLowerOneMoretime);
		System.out.println(returnString());

	}
	
	private static Object returnString(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("atom", "testme");
		return map;
	}

}
