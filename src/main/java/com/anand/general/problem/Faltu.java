package com.anand.general.problem;



public class Faltu {
	
	public static void main(String[] args) {
	
		String array[] = {"ContactBusinessAddressCollection","ContactBusinessPostalAddressCollection","ContactPersonalAddressCollection","ContactPersonalPostalAddressCollection","AccountSalesGroupNameCollection","AccountSalesOfficeNameCollection","AccountSalesOrganisationNameCollection"};
		for(int i=0;i<array.length;++i){
			System.out.println(checkIdentifierLenForTable(array[i]));
		}
	}
	
	public static String checkIdentifierLenForTable(String identifier){
		identifier = identifier.replaceAll("Collection", "");
		
		int len = identifier.length();
		System.out.println(identifier+":"+len);
		if(len>26){
			identifier = "C4C_".concat(identifier.substring(0, 12).concat(identifier.substring(len-14, len)));
		}else {
			identifier = "C4C_".concat(identifier);
		}
	return identifier;
	}

}
