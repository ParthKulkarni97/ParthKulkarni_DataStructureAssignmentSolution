package com.SkyscraperAnalysis.Assignment;

import java.util.Scanner;
import java.util.*; 


public class MainAnalysis {
	static int NoOfFloors = 0;
	
	static void Analysis(int[] nums, int n) {
		
        LinkedList<Integer> link = new LinkedList<>(); 
        for(int i = 0; i < nums.length; i++) {
            link.add(i, nums[i]);
       }
       
        int j = n;
        boolean flag;
        System.out.println("The order of construction is as follows ");
        for(int i = 1; i <= n; i++){
            flag=false;
            System.out.println("Day: " + (i));
            while(j >= 1 && link.get(j) <= i){
                flag=true;
                System.out.print(j +" ");
                j--;
            }
            if(flag == true){
                System.out.println();
            }
        }

	} 
	
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the total no of floors in the building");
			 NoOfFloors = sc.nextInt();
			 int[] nums  = new int[NoOfFloors+1];
			 
			 for(int i = 1; i < NoOfFloors + 1; i++) {
				 System.out.println("Enter the floor size given on day : " + (i));	    	 
//	    	 nums[i] = sc.nextInt();
				 int x = sc.nextInt();
				 nums[x] = i;
				 
			 }
			 
			 Analysis(nums, NoOfFloors);
		}



	}

}
