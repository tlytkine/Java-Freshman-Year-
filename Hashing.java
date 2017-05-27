/*
2. Hashing: Consider a universe of integer keys U such that |U|=1000. You want to use a hash 
table to store the keys, with chaining, of size no more than 100. So you use a hash table of 
size 89 (prime number). Your goal is to verify which of the two methods (division or 
multiplication) better distributes, on average, a randomly selected set of 100 keys from 
the universe U, among the 89 slots of the has table. Ideally, you should have at least 
one element on all the 89 slots and the remaining 11 elements divided evenly on the table.
 So, 78 slots with 1 element and 11 slots with 2 elements. Implement both methods, 
 using the constant A of you choice for the multiplication method, and comment on the 
 distribution of the keys, after 10 random selections of keys. For instance, you could 
 count, for each of the 10 sets of randomly selected 100 keys from the Universe,
a. how many empty slots you have on the hash table and
b. how many slots with more than 2 elements, and, obviously,
c. how many collisions you have in all
Note: you do not have to implement the linked list and the chaining method. 
Just study the distribution of keys among the different slots.

*/
import java.util.Random;
import java.lang.Math;
import java.util.*;
import java.lang.Object;
import java.util.Dictionary;
import java.util.Hashtable;

public class Hashing {
	public static int HashFunctionMultiplication(int k){
		double A = (Math.sqrt(5.0) - 1.0) / 2.0; 
		double m = 89.0;
		int hm = (int)Math.floor(m*((k*A)%1));
		return hm;

	}
	public static int HashFunctionDivision(int k){
		int m = 89;
		int hd = k % 89;
		return hd;
	}

	public static void main(String[]args){
		Random rand = new Random();
		int [] x = new int[100];
		int [] m = new int[100];
		int [] d = new int[100];




         Hashtable<Integer,Integer> testM = new Hashtable<Integer,Integer>();
         Hashtable<Integer,Integer> testD = new Hashtable<Integer,Integer>();

 		for (int i =0; i<100; i++){
			x[i] = rand.nextInt(1000) + 1;
		}
		for (int i =0; i<100; i++){
			m[i]=HashFunctionMultiplication(x[i]);
			d[i]=HashFunctionDivision(x[i]);
		}
        for (int i=0; i<100; i++){
            testM.put(m[i],x[i]);
            testD.put(d[i],x[i]);
        }
         System.out.println("Set 1 HFM");
         List<Integer> list1m = new ArrayList<Integer>();
         int collisions1m = 0;
        for (int j=0; j<10; j++){
            if (list1m.contains(m[j])){
                collisions1m++;
            }
            list1m.add(m[j]);
         System.out.print(m[j]+ " ");
         }
         int emptySlots1m = 89 - (10 - collisions1m);
         int mtt1m = collisions1m / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots1m);
         System.out.println("Slots with more than 2 elements: " + mtt1m);
         System.out.println("Total collisions: " + collisions1m);
         System.out.println("");


         System.out.println("Set 1 HFD");
         List<Integer> list1d = new ArrayList<Integer>();
         int collisions1d = 0;
        for (int j=0; j<10; j++){
            if (list1d.contains(d[j])){
                collisions1d++;
            }
            list1m.add(d[j]);
         System.out.print(d[j]+ " ");
         }
         int emptySlots1d = 89 - (10 - collisions1d);
         int mtt1d = collisions1d / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots1d);
         System.out.println("Slots with more than 2 elements: " + mtt1d);
         System.out.println("Total collisions: " + collisions1d);
         System.out.println("");
         System.out.println("");


         System.out.println("Set 2 HFM");
         List<Integer> list2m = new ArrayList<Integer>();
         int collisions2m = 0;
        for (int j=10; j<20; j++){
            if (list2m.contains(m[j])){
            collisions2m++;
            }
            list1m.add(m[j]);
         System.out.print(m[j]+ " ");
         }
         int emptySlots2m = 89 - (10 - collisions2m);
         int mtt2m = collisions2m / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots2m);
         System.out.println("Slots with more than 2 elements: " + mtt2m);
         System.out.println("Total collisions: " + collisions2m);
         System.out.println("");


         System.out.println("Set 2 HFD");
         List<Integer> list2d = new ArrayList<Integer>();
         int collisions2d = 0;
        for (int j=10; j<20; j++){
         System.out.print(d[j]+ " ");
         if (list2d.contains(d[j])){
            collisions2d++;
            }
            list1m.add(d[j]);
         }
         int emptySlots2d = 89 - (10 - collisions2d);
         int mtt2d = collisions2d / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots2d);
         System.out.println("Slots with more than 2 elements: " + mtt2d);
         System.out.println("Total collisions: " + collisions2d);
         System.out.println("");
         System.out.println("");


          System.out.println("Set 3 HFM");
         List<Integer> list3m = new ArrayList<Integer>();
         int collisions3m = 0;
        for (int j=20; j<30; j++){
            if (list3m.contains(m[j])){
                collisions3m++;
            }
            list3m.add(m[j]);
         System.out.print(m[j]+ " ");
         }
         int emptySlots3m = 89 - (10 - collisions3m);
         int mtt3m = collisions3m / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots3m);
         System.out.println("Slots with more than 2 elements: " + mtt3m);
         System.out.println("Total collisions: " + collisions3m);
         System.out.println("");


         System.out.println("Set 3 HFD");
         List<Integer> list3d = new ArrayList<Integer>();
         int collisions3d = 0;
        for (int j=20; j<30; j++){
            if (list3d.contains(d[j])){
                collisions3d++;
            }
            list3d.add(d[j]);
         System.out.print(d[j]+ " ");
         }
         int emptySlots3d = 89 - (10 - collisions3d);
         int mtt3d = collisions3d / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots3d);
         System.out.println("Slots with more than 2 elements: " + mtt3d);
         System.out.println("Total collisions: " + collisions3d);
         System.out.println("");
         System.out.println("");


         System.out.println("Set 4 HFM");
         List<Integer> list4m = new ArrayList<Integer>();
         int collisions4m = 0;
        for (int j=30; j<40; j++){
            if (list4m.contains(m[j])){
                collisions4m++;
            }
            list4m.add(m[j]);
         System.out.print(m[j]+ " ");
         }
         int emptySlots4m = 89 - (10 - collisions4m);
         int mtt4m = collisions4m / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots4m);
         System.out.println("Slots with more than 2 elements: " + mtt4m);
         System.out.println("Total collisions: " + collisions4m);
         System.out.println("");


         System.out.println("Set 4 HFD");
         List<Integer> list4d = new ArrayList<Integer>();
         int collisions4d = 0;
        for (int j=30; j<40; j++){
            if (list4d.contains(d[j])){
                collisions4d++;
            }
            list4d.add(d[j]);
         System.out.print(d[j]+ " ");
         }
         int emptySlots4d = 89 - (10 - collisions4d);
         int mtt4d = collisions4d / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots4d);
         System.out.println("Slots with more than 2 elements: " + mtt4d);
         System.out.println("Total collisions: " + collisions4d);
         System.out.println("");
         System.out.println("");


        System.out.println("Set 5 HFM");
         List<Integer> list5m = new ArrayList<Integer>();
         int collisions5m = 0;
        for (int j=40; j<50; j++){
            if (list5m.contains(m[j])){
                collisions5m++;
            }
            list5m.add(m[j]);
         System.out.print(m[j]+ " ");
         }
         int emptySlots5m = 89 - (10 - collisions5m);
         int mtt5m = collisions5m / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots5m);
         System.out.println("Slots with more than 2 elements: " + mtt5m);
         System.out.println("Total collisions: " + collisions5m);
         System.out.println("");


        System.out.println("Set 5 HFD");
         List<Integer> list5d = new ArrayList<Integer>();
         int collisions5d = 0;
        for (int j=40; j<50; j++){
            if (list5d.contains(d[j])){
                collisions5d++;
            }
            list5d.add(d[j]);
         System.out.print(d[j]+ " ");
         }
         int emptySlots5d = 89 - (10 - collisions5d);
         int mtt5d = collisions5d / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots5d);
         System.out.println("Slots with more than 2 elements: " + mtt5d);
         System.out.println("Total collisions: " + collisions5d);
         System.out.println("");


        System.out.println("Set 6 HFM");
         List<Integer> list6m = new ArrayList<Integer>();
         int collisions6m = 0;
        for (int j=50; j<60; j++){
            if (list6m.contains(m[j])){
                collisions6m++;
            }
            list6m.add(m[j]);
         System.out.print(m[j]+ " ");
         }
         int emptySlots6m = 89 - (10 - collisions6m);
         int mtt6m = collisions6m / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots6m);
         System.out.println("Slots with more than 2 elements: " + mtt6m);
         System.out.println("Total collisions: " + collisions6m);
         System.out.println("");


        System.out.println("Set 6 HFD");
         List<Integer> list6d = new ArrayList<Integer>();
         int collisions6d = 0;
        for (int j=50; j<60; j++){
            if (list6d.contains(d[j])){
                collisions6d++;
            }
            list6d.add(d[j]);
         System.out.print(d[j]+ " ");
         }
         int emptySlots6d = 89 - (10 - collisions6d);
         int mtt6d = collisions6d / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots6d);
         System.out.println("Slots with more than 2 elements: " + mtt6d);
         System.out.println("Total collisions: " + collisions6d);
         System.out.println("");


         System.out.println("Set 7 HFM");
         List<Integer> list7m = new ArrayList<Integer>();
         int collisions7m = 0;
        for (int j=60; j<70; j++){
            if (list7m.contains(m[j])){
                collisions7m++;
            }
            list7m.add(m[j]);
         System.out.print(m[j]+ " ");
         }
         int emptySlots7m = 89 - (10 - collisions7m);
         int mtt7m = collisions7m / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots7m);
         System.out.println("Slots with more than 2 elements: " + mtt7m);
         System.out.println("Total collisions: " + collisions7m);
         System.out.println("");


         System.out.println("Set 7 HFD");
         List<Integer> list7d = new ArrayList<Integer>();
         int collisions7d = 0;
        for (int j=60; j<70; j++){
            if (list7d.contains(d[j])){
                collisions7d++;
            }
            list7d.add(d[j]);
         System.out.print(d[j]+ " ");
         }
         int emptySlots7d = 89 - (10 - collisions7d);
         int mtt7d = collisions7d / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots7d);
         System.out.println("Slots with more than 2 elements: " + mtt7d);
         System.out.println("Total collisions: " + collisions7d);
         System.out.println("");
         System.out.println("");


         System.out.println("Set 8 HFM");
         List<Integer> list8m = new ArrayList<Integer>();
         int collisions8m = 0;
        for (int j=70; j<80; j++){
            if (list8m.contains(m[j])){
                collisions8m++;
            }
            list8m.add(m[j]);
         System.out.print(m[j]+ " ");
         }
         int emptySlots8m = 89 - (10 - collisions8m);
         int mtt8m = collisions8m / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots8m);
         System.out.println("Slots with more than 2 elements: " + mtt8m);
         System.out.println("Total collisions: " + collisions8m);
         System.out.println("");


         System.out.println("Set 8 HFD");
         List<Integer> list8d = new ArrayList<Integer>();
         int collisions8d = 0;
        for (int j=70; j<80; j++){
            if (list8d.contains(d[j])){
                collisions8d++;
            }
            list8d.add(d[j]);
         System.out.print(d[j]+ " ");
         }
         int emptySlots8d = 89 - (10 - collisions8d);
         int mtt8d = collisions8d / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots8d);
         System.out.println("Slots with more than 2 elements: " + mtt8d);
         System.out.println("Total collisions: " + collisions8d);
         System.out.println("");
         System.out.println("");


        System.out.println("Set 9 HFM");
         List<Integer> list9m = new ArrayList<Integer>();
         int collisions9m = 0;
        for (int j=80; j<90; j++){
            if (list9m.contains(m[j])){
                collisions9m++;
            }
            list9m.add(m[j]);
         System.out.print(m[j]+ " ");
         }
         int emptySlots9m = 89 - (10 - collisions9m);
         int mtt9m = collisions9m / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots9m);
         System.out.println("Slots with more than 2 elements: " + mtt9m);
         System.out.println("Total collisions: " + collisions9m);
         System.out.println("");


        System.out.println("Set 9 HFD");
         List<Integer> list9d = new ArrayList<Integer>();
         int collisions9d = 0;
        for (int j=80; j<90; j++){
            if (list9d.contains(d[j])){
                collisions9d++;
            }
            list9d.add(d[j]);
         System.out.print(d[j]+ " ");
         }
         int emptySlots9d = 89 - (10 - collisions9d);
         int mtt9d = collisions9d / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots9d);
         System.out.println("Slots with more than 2 elements: " + mtt9d);
         System.out.println("Total collisions: " + collisions9d);
         System.out.println("");


        System.out.println("Set 10 HFM");
         List<Integer> list10m = new ArrayList<Integer>();
         int collisions10m = 0;
        for (int j=90; j<100; j++){
            if (list10m.contains(m[j])){
                collisions10m++;
            }
            list1m.add(m[j]);
         System.out.print(m[j]+ " ");
         }
         int emptySlots10m = 89 - (10 - collisions10m);
         int mtt10m = collisions10m / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots10m);
         System.out.println("Slots with more than 2 elements: " + mtt10m);
         System.out.println("Total collisions: " + collisions10m);
         System.out.println("");


        System.out.println("Set 10 HFD");
         List<Integer> list10d = new ArrayList<Integer>();
         int collisions10d = 0;
        for (int j=90; j<100; j++){
            if (list10d.contains(d[j])){
                collisions10d++;
            }
            list1m.add(d[j]);
         System.out.print(d[j]+ " ");
         }
         int emptySlots10d = 89 - (10 - collisions10d);
         int mtt10d = collisions10d / 2;
         System.out.println("");
         System.out.println("Empty slots on hash table: " + emptySlots10d);
         System.out.println("Slots with more than 2 elements: " + mtt10d);
         System.out.println("Total collisions: " + collisions10d);
         System.out.println("");


         System.out.println("Multiplication Method Hash Function");
         int totalcollisionsM = collisions1m + collisions2m + collisions3m + collisions4m + collisions5m + collisions6m + collisions7m + collisions8m + collisions9m + collisions10m;
         System.out.println("Total collisions for 10 random sets: " + totalcollisionsM);
         System.out.println("");
         System.out.println("Division Method Hash Function");
         int totalcollisionsD = collisions1d + collisions2d + collisions3d + collisions4d + collisions5d + collisions6d + collisions7d + collisions8d + collisions9d + collisions10d;
         System.out.println("Total collisions for 10 random sets: " + totalcollisionsD);
         System.out.println("");

         System.out.println("On average the division method and multiplication method used both efficiently and evenly distributed the 100 randomly keys into a hash table with.");
         System.out.println("There was no significant difference in the number of average number of collisions, empty slots or slots with more than 2 elements.");
         System.out.println("");
        System.out.println("Hashtable: ");
        System.out.println("Division Method");
        int emptyDM = 0;
        int emptyMM = 0;
            for(int i =0; i<89;i++){
            System.out.print(testD.get(i) + " ");
            if (testD.get(i)==null){
                emptyDM++;
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("# of Empty slots for Division Method: " + emptyDM);
        System.out.println("");
            System.out.println("Multiplication Method");
            for(int i =0; i<89;i++){
            System.out.print(testM.get(i) + " ");
            if (testM.get(i)==null){
                emptyMM++;
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("# of Empty slots for Multiplication Method: " + emptyMM);



        





    }
		



	}
