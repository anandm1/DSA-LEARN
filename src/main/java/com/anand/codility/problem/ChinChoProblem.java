/**
 * 
 */
package com.anand.codility.problem;

/**
 * @author U45999
 *
 */
public class ChinChoProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] X = {0, 3, 5, 1, 6};
		int[] Y = {4, 1, 3, 3, 8};
		String  T = "pXpqp";
		ChinChoProblem chinChoProblem = new ChinChoProblem();
		System.out.println(chinChoProblem.solution(X, Y, T));
	}
	
	private int solution(int[] X, int[] Y, String T) {
		int points =0;
		char[] array = T.toCharArray();
		int j=-1;
		for(int i=0;i<array.length;++i){
			if(array[i]=='X'){
				//Chin queen coordinate
				j=i;
			}
			if(array[i]=='p'){
				//Chow pawn coordinate
			}
			if(array[i]=='q'){
				//Chow queen coordinate
			}
		}
		int rowCoord = Y[j];
		int colCoord = X[j];
		//move in up right direction
		int leftPoints = moveUpLeft(rowCoord,colCoord,array,points,X,Y);
		//move in up left direction
		int rightPoints = moveUpRight(rowCoord,colCoord,array,points,X,Y);
		if(leftPoints>rightPoints){
			points=leftPoints;
		}else{
			points=leftPoints;
		}
		
		return points;
        // write your code in Java SE 8
    }
	
	private int moveUpRight(int rowCoord,int colCoord,char[] array,int points,int[] X,int[] Y){
		boolean isFound=false;
		while(rowCoord<=9 && colCoord <=9){
			for(int i=0;i<array.length;++i){
				if(array[i]=='p'){
					//Chow pawn
					if(rowCoord==Y[i] && colCoord==X[i]){
						points+=1;isFound=true;
					}
				}
				if(array[i]=='q'){
					//Chow queen
					if(rowCoord==Y[i] && colCoord==X[i]){
						points+=10;isFound=true;
					}
				}
			}
		rowCoord++;
		colCoord++;
		if(isFound)break;
		}
		//System.out.println(rowCoord+"::"+colCoord);
		
		return points;
	}
	
	private int moveUpLeft(int rowCoord,int colCoord,char[] array,int points,int[] X,int[] Y){
		boolean isfound=false;
		while(rowCoord<=9 && colCoord >=0){
			for(int i=0;i<array.length;++i){
				if(array[i]=='p'){
					//Chow pawn
					if(rowCoord==Y[i] && colCoord==X[i]){
						points+=1;isfound=true;
					}
				}
				if(array[i]=='q'){
					//Chow queen
					if(rowCoord==Y[i] && colCoord==X[i]){
						points+=10;isfound=true;
					}
				}
			}
		rowCoord++;
		colCoord--;
		if(isfound)break;
		}
		//System.out.println(rowCoord+"::"+colCoord);
		
		return points;
	}

}
