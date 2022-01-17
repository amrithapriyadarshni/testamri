package activity2;

import java.util.*;

public class amrihashmap {

	 public static void main(String args[]){  
	
	
	   HashMap<String,String> map=new HashMap<String,String>();//Creating HashMap    
	   map.put("name","amritha");  //Put elements in Map  
	   map.put("roll no","1");    
	   map.put("age","21");   
	   map.put("address","kolathur");
	   map.put("gender","female");
	   map.put("dep","maths");
	   map.put("class","A");
	   map.put("YOJ","2015");
	 

	 
	  
	    HashMap<String,String> map2=new HashMap<String,String>();//Creating HashMap    
		   map2.put("name","ritha");  //Put elements in Map  
		   map2.put("roll no","2");    
		   map2.put("age","23");   
		   map2.put("address","chennai");
		   map2.put("gender","female");
		   map2.put("dep","BCA");
		   map2.put("class","C");
		   map2.put("YOJ","2017");
		
		   HashMap<String,String> map3=new HashMap<String,String>();//Creating HashMap    
		   map3.put("name","priya");  //Put elements in Map  
		   map3.put("roll no","3");    
		   map3.put("age","21");   
		   map3.put("address","tambaram");
		   map3.put("gender","female");
		   map3.put("dep","maths");
		   map3.put("class","A");
		   map3.put("YOJ","2015");
		 
		 
		   HashMap<String,String> map4=new HashMap<String,String>();//Creating HashMap    
		   map4.put("name","darshni");  //Put elements in Map  
		   map4.put("roll no","4");    
		   map4.put("age","17");   
		   map4.put("address","madurai");
		   map4.put("gender","female");
		   map4.put("dep","english");
		   map4.put("class","A");
		   map4.put("YOJ","2015");
		 
		  
		   HashMap<String,String> map5=new HashMap<String,String>();//Creating HashMap    
		   map5.put("name","ridha");  //Put elements in Map  
		   map5.put("roll no","5");    
		   map5.put("age","21");   
		   map5.put("address","kolathur");
		   map5.put("gender","male");
		   map5.put("dep","science");
		   map5.put("class","A");
		   map5.put("YOJ","2015");
		 
		  
		   HashMap<String,String> map6=new HashMap<String,String>();//Creating HashMap    
		   map6.put("name","swetha");  //Put elements in Map  
		   map6.put("roll no","6");    
		   map6.put("age","24");   
		   map6.put("address","tuticorin");
		   map6.put("gender","female");
		   map6.put("dep","tamil");
		   map6.put("class","A");
		   map6.put("YOJ","2015");
		 
	
		   HashMap<String,String> map7=new HashMap<String,String>();//Creating HashMap    
		   map7.put("name","mani");  //Put elements in Map  
		   map7.put("roll no","7");    
		   map7.put("age","21");   
		   map7.put("address","kolathur");
		   map7.put("gender","male");
		   map7.put("dep","english");
		   map7.put("class","A");
		   map7.put("YOJ","2015");
		 
	
		   HashMap<String,String> map8=new HashMap<String,String>();//Creating HashMap    
		   map8.put("name","laxmi");  //Put elements in Map  
		   map8.put("roll no","8");    
		   map8.put("age","17");   
		   map8.put("address","madurai");
		   map8.put("gender","female");
		   map8.put("dep","tamil");
		   map8.put("class","A");
		   map8.put("YOJ","2015");
		 
		   HashMap<String,String> map9=new HashMap<String,String>();//Creating HashMap    
		   map9.put("name","preetha");  //Put elements in Map  
		   map9.put("roll no","9");    
		   map9.put("age","21");   
		   map9.put("address","kolathur");
		   map9.put("gender","female");
		   map9.put("dep","maths");
		   map9.put("class","A");
		   map9.put("YOJ","2015");
		 
		
		   HashMap<String,String> map10=new HashMap<String,String>();//Creating HashMap    
		   map10.put("name","sneha");  //Put elements in Map  
		   map10.put("roll no","10");    
		   map10.put("age","17");   
		   map10.put("address","kolathur");
		   map10.put("gender","female");
		   map10.put("dep","tamil");
		   map10.put("class","A");
		   map10.put("YOJ","2015");
		 
		
			 ArrayList<HashMap> s1=new ArrayList<HashMap>();  
			  s1.add(map);
			  s1.add(map2);
			  s1.add(map3);
			  s1.add(map4);
			  s1.add(map5);
			  s1.add(map6);
			  s1.add(map7);
			  s1.add(map8);
			  s1.add(map9);
			  s1.add(map10);
			 
			 
			  for(HashMap student:s1) {
		            System.out.println(student);
			  }}}	   
	
	


