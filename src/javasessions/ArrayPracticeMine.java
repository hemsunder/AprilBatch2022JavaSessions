package javasessions;

import java.util.Arrays;

public class ArrayPracticeMine {

	public static void main(String[] args) {
		
		//1. Static Array
		//int array
		int h[] = new int[4];
		int l = h.length;
		System.out.println(l);
		
		h[0] = 10;
		h[2] = 20;
		System.out.println(Arrays.toString(h));
		h[3] = 40;
		h[1] = 30;
		h[2] = 50; 
		System.out.println(h[2]);
		System.out.println(Arrays.toString(h));
		System.out.println(h[4-1]);
		
		//for loop:
		for(byte b=0; b<h.length; b++) {
			System.out.println(h[b]);
		}
		
		System.out.println("----------");
		for(int i:h) {
			System.out.println(i);
		}
		
		
		//String array
		
		String names[] = new String[3];
		names[0] = "hem";
		names[1] = "bheema";
		names[2] = "creamstone";
		
		System.out.println("----------");
		
		//for each
		for(String s : names) {
			System.out.println(s);
		}
		
		//System.out.println(names[3]); //IOB
		
		//names[3] = "eclipse";
		//System.out.println(Arrays.toString(names)); //IOB
		
	
		
	}

}
