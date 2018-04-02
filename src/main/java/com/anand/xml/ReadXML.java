/**
 * 
 */
package com.anand.xml;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author U45999
 *
 */
public class ReadXML {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// read the file
		//ByteArrayOutputStream out = new ByteArrayOutputStream(10000);
		InputStream in = null;
		try {
			in = new BufferedInputStream(new FileInputStream("D:\\projects\\PDB2017.06.27\\AlgorithmAndDataStructure\\src\\main\\resources\\PCMPORTAL-STAGE-metadata.xml"));
			int c;
			try {
				while ((c = in.read()) != -1){
				   System.out.println(c);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			in.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}
		

		// debug as string
		//if (debug) {
		//   System.out.println(new String(out.toBytes(), Charset.forName("utf-8"));
		//}


		// forward to client through response
		/*response.setContentType("text/xml");
		response.setCharacterEncoding("UTF-8");
		response.getOutputStream().write(out.toBytes());*/

	}

}
