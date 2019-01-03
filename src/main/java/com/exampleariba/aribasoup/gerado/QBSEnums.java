package com.exampleariba.aribasoup.gerado;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.5.2.0
//
// Created by Quasar Development 
//
//---------------------------------------------------





public class QBSEnums
{

    public enum GenericCustomFieldType
    {
        
        Code(0),
        
        Date(1),
        
        Decimal(2),
        
        Indicator(3),
        
        Text(4);
        
        private int code;
        
        GenericCustomFieldType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static GenericCustomFieldType fromString(String str)
        {
            if (str.equals("Code"))
                return Code;
            if (str.equals("Date"))
                return Date;
            if (str.equals("Decimal"))
                return Decimal;
            if (str.equals("Indicator"))
                return Indicator;
            if (str.equals("Text"))
                return Text;
		    return null;
        }
    }

}