package week6.day1.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
                              public static void main(String[] args) {
								int[] num = {2,3,5,6,4,7,3,6};
								
								Set <Integer> val = new TreeSet <Integer> ();
								for (int i = 0; i < num.length; i++) {
									val.add(num[i]);
									//System.out.println(val);
								}
								
								List <Integer> name = new ArrayList <Integer> (val);
								System.out.println(name);
							}
}
