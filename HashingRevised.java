
import java.util.Random;
import java.lang.Math;
import java.util.*;
public class HashingRevised {


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
		int mCollisions1 = 0;
        int mCollisions2 = 0;
        int mCollisions3 = 0;
        int mCollisions4 = 0;
        int mCollisions5 = 0;
        int mCollisions6 = 0;
        int mCollisions7 = 0;
        int mCollisions8 = 0;
        int mCollisions9 = 0;
		int mCollisions10 = 0;

        int dCollisions1 = 0;
        int dCollisions2 = 0;
        int dCollisions3 = 0;
        int dCollisions4 = 0;
        int dCollisions5 = 0;
        int dCollisions6 = 0;
        int dCollisions7 = 0;
        int dCollisions8 = 0;
        int dCollisions9 = 0;
        int dCollisions10 = 0;

		Random rand = new Random();

		int [] x = new int[100];

        int [] m1 = new int[10];
        int [] m2 = new int[10];
        int [] m3 = new int[10];
        int [] m4 = new int[10];
        int [] m5 = new int[10];
        int [] m6 = new int[10];
        int [] m7 = new int[10];
        int [] m8 = new int[10];
        int [] m9 = new int[10];
        int [] m10 = new int[10];

        int [] d1 = new int[10];
        int [] d2 = new int[10];
        int [] d3 = new int[10];
        int [] d4 = new int[10];
        int [] d5 = new int[10];
        int [] d6 = new int[10];
        int [] d7 = new int[10];
        int [] d8 = new int[10];
        int [] d9 = new int[10];
        int [] d10 = new int[10];





 		for (int i =0; i<100; i++){
			x[i] = rand.nextInt(1000) + 1;
		}
        for (int j=0; j<10; j++){
        for (int i =0; i<10; i++){
            // 10 sets of randomly selected keys for multiplication
            m1[j]=HashFunctionMultiplication(x[i]);
            // 10 sets of randomly selected keys for division
            d1[j]=HashFunctionDivision(x[i]);

        }
    }
    for (int j=0; j<10; j++){
        for (int i=10; i<20; i++){
            // 10 sets of randomly selected keys for multiplication
            m2[j]=HashFunctionMultiplication(x[i]);
            // 10 sets of randomly selected keys for division
            d2[j]=HashFunctionDivision(x[i]);


        }
    }
    for (int j=0; j<10; j++){
        for (int i=20; i<30; i++){
            // 10 sets of randomly selected keys for multiplication
            m3[j]=HashFunctionMultiplication(x[i]);
            // 10 sets of randomly selected keys for division
            d3[j]=HashFunctionDivision(x[i]);


        }
    }
    for (int j=0; j<10; j++){
        for (int i=30; i<40; i++){
             // 10 sets of randomly selected keys for multiplication
            m4[j]=HashFunctionMultiplication(x[i]);
            // 10 sets of randomly selected keys for division
            d4[j]=HashFunctionDivision(x[i]);

        }
    }
    for (int j=0; j<10; j++){
        for (int i=40; i<50; i++){
            // 10 sets of randomly selected keys for multiplication
            m5[j]=HashFunctionMultiplication(x[i]);
            // 10 sets of randomly selected keys for division
            d5[j]=HashFunctionDivision(x[i]);


        }
    }
    for (int j=0; j<10; j++){
        for (int i=50; i<60; i++){
             // 10 sets of randomly selected keys for multiplication
            m6[j]=HashFunctionMultiplication(x[i]);
            // 10 sets of randomly selected keys for division
            d6[j]=HashFunctionDivision(x[i]);

        }
    }
    for (int j=0; j<10; j++){
        for (int i=60; i<70; i++){
            // 10 sets of randomly selected keys for multiplication
            m7[j]=HashFunctionMultiplication(x[i]);
            // 10 sets of randomly selected keys for division
            d7[j]=HashFunctionDivision(x[i]);

        }
    }
    for (int j=0; j<10; j++){
        for (int i=70; i<80; i++){
            // 10 sets of randomly selected keys for multiplication
            m8[j]=HashFunctionMultiplication(x[i]);
            // 10 sets of randomly selected keys for division
            d8[j]=HashFunctionDivision(x[i]);
        }
    }
    for (int j=0; j<10; j++){
        for (int i=80; i<90; i++){
            // 10 sets of randomly selected keys for multiplication
            m9[j]=HashFunctionMultiplication(x[i]);
            // 10 sets of randomly selected keys for division
            d9[j]=HashFunctionDivision(x[i]);

        }
    }
    for (int j=0; j<10; j++){
        for (int i=90; i<100; i++){
            // 10 sets of randomly selected keys for multiplication
            m10[j]=HashFunctionMultiplication(x[i]);
            // 10 sets of randomly selected keys for division
            d10[j]=HashFunctionDivision(x[i]);

        }
    }
        // Test 1 
		// Hash Function using multiplication method 
		HashSet<Integer> uniqueM1 = new HashSet<>();
        for (int i=0; i<m1.length; i++){
            if (!uniqueM1.contains(m1[i])){
                uniqueM1.add(m1[i]);
            }
        }
        int [] mUnique1 = new int [uniqueM1.size()];
        int i = 0;
        for (Integer val : uniqueM1){
        	mUnique1[i++]=val;
        }
        System.out.println("Test 1");
        System.out.println("Hash Function (Multiplication Method)");
    	int emptySlotsm1 = 0;
    	
    	for(int y =0; y<89; y++){
    	if(!(uniqueM1.contains(y))){
    		emptySlotsm1++;
    	}
    	}
    	System.out.println("Empty slots on the hash table: " + emptySlotsm1);
    	List<Integer> mHash1 = new ArrayList<Integer>(m1.length);
		for (int g : m1) mHash1.add(g);
			int moreThanTwo1 = 0;
		for (int k=0; k<89; k++){
			int count = 0;
		for (int test : mHash1){
			if(test == k){
				count++;
				if (count>1){
					mCollisions1++;
				}
			}
			if(count>2){
				moreThanTwo1++;
				count=0;
			}
		}
		}

    	System.out.println("# of slots with more than two elements: " + moreThanTwo1);
    	// System.out.println("");
    	System.out.println("Total collisions for multiplication function: " + mCollisions1);
    	System.out.println("");

		// Hash Function using division method 
		HashSet<Integer> uniqueD1 = new HashSet<>();
        for (i=0; i<d1.length; i++){
            if (!uniqueD1.contains(d1[i])){
                uniqueD1.add(d1[i]);
            }
        }
        int [] dUnique1 = new int [uniqueD1.size()];
        i = 0;
        for (Integer val : uniqueD1){
        	dUnique1[i++]=val;
        }
        System.out.println("Hash Function (Division Method)");
       
    	int emptySlotsd1 = 0;

    	for(int y =0; y<89; y++){
    	if(!(uniqueD1.contains(y))){
    		emptySlotsd1++;
    	}
    	}

    	System.out.println("Empty slots on the hash table: " + emptySlotsd1);
    	List<Integer> dHash1 = new ArrayList<Integer>(d1.length);
		for (int g : d1) dHash1.add(g);
			int moreThanTwoD1 = 0;
		for (int k=0; k<89; k++){
			int count = 0;
		for (int test : dHash1){
			if(test == k){
				count++;
				if (count>1){
					dCollisions1++;
				}
			}
			if(count>2){
				moreThanTwoD1++;
				count=0;
			}
		}
		}

    	System.out.println("# of slots with more than two elements: " + moreThanTwoD1);

    	System.out.println("Total collisions for division function: " + dCollisions1);

        System.out.println("");
        // Test 2
        // Hash Function using multiplication method 
        HashSet<Integer> uniqueM2 = new HashSet<>();
        for (i=0; i<m2.length; i++){
            if (!uniqueM2.contains(m2[i])){
                uniqueM2.add(m2[i]);
            }
        }
        int [] mUnique2 = new int [uniqueM2.size()];
        i = 0;
        for (Integer val : uniqueM2){
            mUnique2[i++]=val;
        }
        System.out.println("Test 2");
        System.out.println("Hash Function (Multiplication Method)");
        int emptySlotsm2 = 0;
        
        for(int y =0; y<89; y++){
        if(!(uniqueM2.contains(y))){
            emptySlotsm2++;
        }
        }
        System.out.println("Empty slots on the hash table: " + emptySlotsm2);
        List<Integer> mHash2 = new ArrayList<Integer>(m2.length);
        for (int g : m2) mHash2.add(g);
            int moreThanTwo2 = 0;
        for (int k=0; k<89; k++){
            int count = 0;
        for (int test : mHash2){
            if(test == k){
                count++;
                if (count>1){
                    mCollisions2++;
                }
            }
            if(count>2){
                moreThanTwo2++;
                count=0;
            }
        }
        }

        System.out.println("# of slots with more than two elements: " + moreThanTwo2);
        // System.out.println("");
        System.out.println("Total collisions for multiplication function: " + mCollisions2);
        System.out.println("");

        // Hash Function using division method 
        HashSet<Integer> uniqueD2 = new HashSet<>();
        for (i=0; i<d2.length; i++){
            if (!uniqueD2.contains(d2[i])){
                uniqueD2.add(d2[i]);
            }
        }
        int [] dUnique2 = new int [uniqueD2.size()];
        i = 0;
        for (Integer val : uniqueD2){
            dUnique2[i++]=val;
        }
        System.out.println("Hash Function (Division Method)");
       
        int emptySlotsd2 = 0;

        for(int y =0; y<89; y++){
        if(!(uniqueD2.contains(y))){
            emptySlotsd2++;
        }
        }

        System.out.println("Empty slots on the hash table: " + emptySlotsd2);
        List<Integer> dHash2 = new ArrayList<Integer>(d2.length);
        for (int g : d2) dHash2.add(g);
            int moreThanTwoD2 = 0;
        for (int k=0; k<89; k++){
            int count = 0;
        for (int test : dHash2){
            if(test == k){
                count++;
                if (count>1){
                    dCollisions2++;
                }
            }
            if(count>2){
                moreThanTwoD2++;
                count=0;
            }
        }
        }

        System.out.println("# of slots with more than two elements: " + moreThanTwoD2);

        System.out.println("Total collisions for division function: " + dCollisions2);

        // Test 3 
        // Hash Function using multiplication method 
        HashSet<Integer> uniqueM3 = new HashSet<>();
        for (i=0; i<m3.length; i++){
            if (!uniqueM3.contains(m3[i])){
                uniqueM3.add(m3[i]);
            }
        }
        int [] mUnique3 = new int [uniqueM3.size()];
        i = 0;
        for (Integer val : uniqueM3){
            mUnique3[i++]=val;
        }
        System.out.println("Test 3");
        System.out.println("Hash Function (Multiplication Method)");
        int emptySlotsm3 = 0;
        
        for(int y =0; y<89; y++){
        if(!(uniqueM3.contains(y))){
            emptySlotsm3++;
        }
        }
        System.out.println("Empty slots on the hash table: " + emptySlotsm3);
        List<Integer> mHash3 = new ArrayList<Integer>(m3.length);
        for (int g : m3) mHash3.add(g);
            int moreThanTwo3 = 0;
        for (int k=0; k<89; k++){
            int count = 0;
        for (int test : mHash3){
            if(test == k){
                count++;
                if (count>1){
                    mCollisions3++;
                }
            }
            if(count>2){
                moreThanTwo3++;
                count=0;
            }
        }
        }

        System.out.println("# of slots with more than two elements: " + moreThanTwo3);
        // System.out.println("");
        System.out.println("Total collisions for multiplication function: " + mCollisions3);
        System.out.println("");

        // Hash Function using division method 
        HashSet<Integer> uniqueD3 = new HashSet<>();
        for (i=0; i<d3.length; i++){
            if (!uniqueD3.contains(d3[i])){
                uniqueD3.add(d3[i]);
            }
        }
        int [] dUnique3 = new int [uniqueD3.size()];
        i = 0;
        for (Integer val : uniqueD3){
            dUnique3[i++]=val;
        }
        System.out.println("Hash Function (Division Method)");
       
        int emptySlotsd3 = 0;

        for(int y =0; y<89; y++){
        if(!(uniqueD3.contains(y))){
            emptySlotsd3++;
        }
        }

        System.out.println("Empty slots on the hash table: " + emptySlotsd3);
        List<Integer> dHash3 = new ArrayList<Integer>(d3.length);
        for (int g : d3) dHash3.add(g);
            int moreThanTwoD3 = 0;
        for (int k=0; k<89; k++){
            int count = 0;
        for (int test : dHash3){
            if(test == k){
                count++;
                if (count>1){
                    dCollisions3++;
                }
            }
            if(count>2){
                moreThanTwoD3++;
                count=0;
            }
        }
        }

        System.out.println("# of slots with more than two elements: " + moreThanTwoD3);

        System.out.println("Total collisions for division function: " + dCollisions3);

        System.out.println("");
        // Test 4
        // Hash Function using multiplication method 
        HashSet<Integer> uniqueM4 = new HashSet<>();
        for (i=0; i<m4.length; i++){
            if (!uniqueM4.contains(m4[i])){
                uniqueM4.add(m4[i]);
            }
        }
        int [] mUnique4 = new int [uniqueM4.size()];
        i = 0;
        for (Integer val : uniqueM4){
            mUnique4[i++]=val;
        }
        System.out.println("Test 4");
        System.out.println("Hash Function (Multiplication Method)");
        int emptySlotsm4 = 0;
        
        for(int y =0; y<89; y++){
        if(!(uniqueM4.contains(y))){
            emptySlotsm4++;
        }
        }
        System.out.println("Empty slots on the hash table: " + emptySlotsm4);
        List<Integer> mHash4 = new ArrayList<Integer>(m4.length);
        for (int g : m4) mHash4.add(g);
            int moreThanTwo4 = 0;
        for (int k=0; k<89; k++){
            int count = 0;
        for (int test : mHash4){
            if(test == k){
                count++;
                if (count>1){
                    mCollisions4++;
                }
            }
            if(count>2){
                moreThanTwo4++;
                count=0;
            }
        }
        }

        System.out.println("# of slots with more than two elements: " + moreThanTwo4);
        // System.out.println("");
        System.out.println("Total collisions for multiplication function: " + mCollisions4);
        System.out.println("");

        // Hash Function using division method 
        HashSet<Integer> uniqueD4 = new HashSet<>();
        for (i=0; i<d4.length; i++){
            if (!uniqueD4.contains(d4[i])){
                uniqueD4.add(d4[i]);
            }
        }
        int [] dUnique4 = new int [uniqueD4.size()];
        i = 0;
        for (Integer val : uniqueD4){
            dUnique4[i++]=val;
        }
        System.out.println("Hash Function (Division Method)");
       
        int emptySlotsd4 = 0;

        for(int y =0; y<89; y++){
        if(!(uniqueD4.contains(y))){
            emptySlotsd4++;
        }
        }

        System.out.println("Empty slots on the hash table: " + emptySlotsd4);
        List<Integer> dHash4 = new ArrayList<Integer>(d4.length);
        for (int g : d4) dHash4.add(g);
            int moreThanTwoD4 = 0;
        for (int k=0; k<89; k++){
            int count = 0;
        for (int test : dHash4){
            if(test == k){
                count++;
                if (count>1){
                    dCollisions4++;
                }
            }
            if(count>2){
                moreThanTwoD4++;
                count=0;
            }
        }
        }

        System.out.println("# of slots with more than two elements: " + moreThanTwoD4);

        System.out.println("Total collisions for division function: " + dCollisions4);


        // Test 5 
        // Hash Function using multiplication method 
        HashSet<Integer> uniqueM5 = new HashSet<>();
        for (i=0; i<m5.length; i++){
            if (!uniqueM5.contains(m5[i])){
                uniqueM5.add(m5[i]);
            }
        }
        int [] mUnique5 = new int [uniqueM5.size()];
        i = 0;
        for (Integer val : uniqueM5){
            mUnique5[i++]=val;
        }
        System.out.println("Test 5");
        System.out.println("Hash Function (Multiplication Method)");
        int emptySlotsm5 = 0;
        
        for(int y =0; y<89; y++){
        if(!(uniqueM5.contains(y))){
            emptySlotsm5++;
        }
        }
        System.out.println("Empty slots on the hash table: " + emptySlotsm5);
        List<Integer> mHash5 = new ArrayList<Integer>(m5.length);
        for (int g : m5) mHash5.add(g);
            int moreThanTwo5 = 0;
        for (int k=0; k<89; k++){
            int count = 0;
        for (int test : mHash5){
            if(test == k){
                count++;
                if (count>1){
                    mCollisions5++;
                }
            }
            if(count>2){
                moreThanTwo5++;
                count=0;
            }
        }
        }

        System.out.println("# of slots with more than two elements: " + moreThanTwo5);
        // System.out.println("");
        System.out.println("Total collisions for multiplication function: " + mCollisions5);
        System.out.println("");

        // Hash Function using division method 
        HashSet<Integer> uniqueD5 = new HashSet<>();
        for (i=0; i<d5.length; i++){
            if (!uniqueD5.contains(d5[i])){
                uniqueD5.add(d5[i]);
            }
        }
        int [] dUnique5 = new int [uniqueD5.size()];
        i = 0;
        for (Integer val : uniqueD5){
            dUnique5[i++]=val;
        }
        System.out.println("Hash Function (Division Method)");
       
        int emptySlotsd5 = 0;

        for(int y =0; y<89; y++){
        if(!(uniqueD5.contains(y))){
            emptySlotsd5++;
        }
        }

        System.out.println("Empty slots on the hash table: " + emptySlotsd5);
        List<Integer> dHash5 = new ArrayList<Integer>(d5.length);
        for (int g : d5) dHash5.add(g);
            int moreThanTwoD5 = 0;
        for (int k=0; k<89; k++){
            int count = 0;
        for (int test : dHash5){
            if(test == k){
                count++;
                if (count>1){
                    dCollisions5++;
                }
            }
            if(count>2){
                moreThanTwoD5++;
                count=0;
            }
        }
        }

        System.out.println("# of slots with more than two elements: " + moreThanTwoD5);

        System.out.println("Total collisions for division function: " + dCollisions5);

        System.out.println("");
        // Test 6
        // Hash Function using multiplication method 
        HashSet<Integer> uniqueM6 = new HashSet<>();
        for (i=0; i<m6.length; i++){
            if (!uniqueM6.contains(m6[i])){
                uniqueM6.add(m6[i]);
            }
        }
        int [] mUnique6 = new int [uniqueM6.size()];
        i = 0;
        for (Integer val : uniqueM6){
            mUnique6[i++]=val;
        }
        System.out.println("Test 6");
        System.out.println("Hash Function (Multiplication Method)");
        int emptySlotsm6 = 0;
        
        for(int y =0; y<89; y++){
        if(!(uniqueM6.contains(y))){
            emptySlotsm6++;
        }
        }
        System.out.println("Empty slots on the hash table: " + emptySlotsm6);
        List<Integer> mHash6 = new ArrayList<Integer>(m6.length);
        for (int g : m6) mHash6.add(g);
            int moreThanTwo6 = 0;
        for (int k=0; k<89; k++){
            int count = 0;
        for (int test : mHash6){
            if(test == k){
                count++;
                if (count>1){
                    mCollisions6++;
                }
            }
            if(count>2){
                moreThanTwo6++;
                count=0;
            }
        }
        }

        System.out.println("# of slots with more than two elements: " + moreThanTwo6);
        // System.out.println("");
        System.out.println("Total collisions for multiplication function: " + mCollisions6);
        System.out.println("");

        // Hash Function using division method 
        HashSet<Integer> uniqueD6 = new HashSet<>();
        for (i=0; i<d6.length; i++){
            if (!uniqueD6.contains(d6[i])){
                uniqueD6.add(d6[i]);
            }
        }
        int [] dUnique6 = new int [uniqueD6.size()];
        i = 0;
        for (Integer val : uniqueD6){
            dUnique6[i++]=val;
        }
        System.out.println("Hash Function (Division Method)");
       
        int emptySlotsd6 = 0;

        for(int y =0; y<89; y++){
        if(!(uniqueD6.contains(y))){
            emptySlotsd6++;
        }
        }

        System.out.println("Empty slots on the hash table: " + emptySlotsd6);
        List<Integer> dHash6 = new ArrayList<Integer>(d6.length);
        for (int g : d6) dHash6.add(g);
            int moreThanTwoD6 = 0;
        for (int k=0; k<89; k++){
            int count = 0;
        for (int test : dHash6){
            if(test == k){
                count++;
                if (count>1){
                    dCollisions6++;
                }
            }
            if(count>2){
                moreThanTwoD6++;
                count=0;
            }
        }
        }

        System.out.println("# of slots with more than two elements: " + moreThanTwoD6);

        System.out.println("Total collisions for division function: " + dCollisions6);

        // Test 7
        // Hash Function using multiplication method 
        HashSet<Integer> uniqueM7 = new HashSet<>();
        for (i=0; i<m7.length; i++){
            if (!uniqueM7.contains(m7[i])){
                uniqueM7.add(m7[i]);
            }
        }
        int [] mUnique7 = new int [uniqueM7.size()];
        i = 0;
        for (Integer val : uniqueM7){
            mUnique7[i++]=val;
        }
        System.out.println("Test 7");
        System.out.println("Hash Function (Multiplication Method)");
        int emptySlotsm7 = 0;
        
        for(int y =0; y<89; y++){
        if(!(uniqueM7.contains(y))){
            emptySlotsm7++;
        }
        }
        System.out.println("Empty slots on the hash table: " + emptySlotsm7);
        List<Integer> mHash7 = new ArrayList<Integer>(m7.length);
        for (int g : m7) mHash7.add(g);
            int moreThanTwo7 = 0;
        for (int k=0; k<89; k++){
            int count = 0;
        for (int test : mHash7){
            if(test == k){
                count++;
                if (count>1){
                    mCollisions7++;
                }
            }
            if(count>2){
                moreThanTwo7++;
                count=0;
            }
        }
        }

        System.out.println("# of slots with more than two elements: " + moreThanTwo7);
        // System.out.println("");
        System.out.println("Total collisions for multiplication function: " + mCollisions7);
        System.out.println("");

        // Hash Function using division method 
        HashSet<Integer> uniqueD7 = new HashSet<>();
        for (i=0; i<d7.length; i++){
            if (!uniqueD7.contains(d7[i])){
                uniqueD7.add(d7[i]);
            }
        }
        int [] dUnique7 = new int [uniqueD7.size()];
        i = 0;
        for (Integer val : uniqueD7){
            dUnique7[i++]=val;
        }
        System.out.println("Hash Function (Division Method)");
       
        int emptySlotsd7 = 0;

        for(int y =0; y<89; y++){
        if(!(uniqueD7.contains(y))){
            emptySlotsd7++;
        }
        }

        System.out.println("Empty slots on the hash table: " + emptySlotsd7);
        List<Integer> dHash7 = new ArrayList<Integer>(d7.length);
        for (int g : d7) dHash7.add(g);
            int moreThanTwoD7 = 0;
        for (int k=0; k<89; k++){
            int count = 0;
        for (int test : dHash7){
            if(test == k){
                count++;
                if (count>1){
                    dCollisions7++;
                }
            }
            if(count>2){
                moreThanTwoD7++;
                count=0;
            }
        }
        }

        System.out.println("# of slots with more than two elements: " + moreThanTwoD7);

        System.out.println("Total collisions for division function: " + dCollisions7);

        System.out.println("");
    
        // Test 8
        // Hash Function using multiplication method 
        HashSet<Integer> uniqueM8 = new HashSet<>();
        for (i=0; i<m8.length; i++){
            if (!uniqueM8.contains(m8[i])){
                uniqueM8.add(m8[i]);
            }
        }
        int [] mUnique8 = new int [uniqueM8.size()];
        i = 0;
        for (Integer val : uniqueM8){
            mUnique8[i++]=val;
        }
        System.out.println("Test 8");
        System.out.println("Hash Function (Multiplication Method)");
        int emptySlotsm8 = 0;
        
        for(int y =0; y<89; y++){
        if(!(uniqueM8.contains(y))){
            emptySlotsm8++;
        }
        }
        System.out.println("Empty slots on the hash table: " + emptySlotsm8);
        List<Integer> mHash8 = new ArrayList<Integer>(m8.length);
        for (int g : m8) mHash8.add(g);
            int moreThanTwo8 = 0;
        for (int k=0; k<89; k++){
            int count = 0;
        for (int test : mHash8){
            if(test == k){
                count++;
                if (count>1){
                    mCollisions8++;
                }
            }
            if(count>2){
                moreThanTwo8++;
                count=0;
            }
        }
        }

        System.out.println("# of slots with more than two elements: " + moreThanTwo8);
        // System.out.println("");
        System.out.println("Total collisions for multiplication function: " + mCollisions8);
        System.out.println("");

        // Hash Function using division method 
        HashSet<Integer> uniqueD8 = new HashSet<>();
        for (i=0; i<d8.length; i++){
            if (!uniqueD8.contains(d8[i])){
                uniqueD8.add(d8[i]);
            }
        }
        int [] dUnique8 = new int [uniqueD8.size()];
        i = 0;
        for (Integer val : uniqueD8){
            dUnique8[i++]=val;
        }
        System.out.println("Hash Function (Division Method)");
       
        int emptySlotsd8 = 0;

        for(int y =0; y<89; y++){
        if(!(uniqueD8.contains(y))){
            emptySlotsd8++;
        }
        }

        System.out.println("Empty slots on the hash table: " + emptySlotsd8);
        List<Integer> dHash8 = new ArrayList<Integer>(d8.length);
        for (int g : d8) dHash8.add(g);
            int moreThanTwoD8 = 0;
        for (int k=0; k<89; k++){
            int count = 0;
        for (int test : dHash8){
            if(test == k){
                count++;
                if (count>1){
                    dCollisions8++;
                }
            }
            if(count>2){
                moreThanTwoD8++;
                count=0;
            }
        }
        }

        System.out.println("# of slots with more than two elements: " + moreThanTwoD8);

        System.out.println("Total collisions for division function: " + dCollisions8);

        System.out.println("");

        // Test 9
        // Hash Function using multiplication method 
        HashSet<Integer> uniqueM9 = new HashSet<>();
        for (i=0; i<m9.length; i++){
            if (!uniqueM9.contains(m9[i])){
                uniqueM9.add(m9[i]);
            }
        }
        int [] mUnique9 = new int [uniqueM9.size()];
        i = 0;
        for (Integer val : uniqueM9){
            mUnique9[i++]=val;
        }
        System.out.println("Test 9");
        System.out.println("Hash Function (Multiplication Method)");
        int emptySlotsm9 = 0;
        
        for(int y =0; y<89; y++){
        if(!(uniqueM9.contains(y))){
            emptySlotsm9++;
        }
        }
        System.out.println("Empty slots on the hash table: " + emptySlotsm9);
        List<Integer> mHash9 = new ArrayList<Integer>(m9.length);
        for (int g : m9) mHash9.add(g);
            int moreThanTwo9 = 0;
        for (int k=0; k<89; k++){
            int count = 0;
        for (int test : mHash9){
            if(test == k){
                count++;
                if (count>1){
                    mCollisions9++;
                }
            }
            if(count>2){
                moreThanTwo9++;
                count=0;
            }
        }
        }

        System.out.println("# of slots with more than two elements: " + moreThanTwo9);
        // System.out.println("");
        System.out.println("Total collisions for multiplication function: " + mCollisions9);
        System.out.println("");

        // Hash Function using division method 
        HashSet<Integer> uniqueD9 = new HashSet<>();
        for (i=0; i<d9.length; i++){
            if (!uniqueD9.contains(d9[i])){
                uniqueD9.add(d9[i]);
            }
        }
        int [] dUnique9 = new int [uniqueD9.size()];
        i = 0;
        for (Integer val : uniqueD9){
            dUnique9[i++]=val;
        }
        System.out.println("Hash Function (Division Method)");
       
        int emptySlotsd9 = 0;

        for(int y =0; y<89; y++){
        if(!(uniqueD9.contains(y))){
            emptySlotsd9++;
        }
        }

        System.out.println("Empty slots on the hash table: " + emptySlotsd9);
        List<Integer> dHash9 = new ArrayList<Integer>(d9.length);
        for (int g : d9) dHash9.add(g);
            int moreThanTwoD9 = 0;
        for (int k=0; k<89; k++){
            int count = 0;
        for (int test : dHash9){
            if(test == k){
                count++;
                if (count>1){
                    dCollisions9++;
                }
            }
            if(count>2){
                moreThanTwoD9++;
                count=0;
            }
        }
        }

        System.out.println("# of slots with more than two elements: " + moreThanTwoD9);

        System.out.println("Total collisions for division function: " + dCollisions9);

        System.out.println("");

        // Test 10
        // Hash Function using multiplication method 
        HashSet<Integer> uniqueM10 = new HashSet<>();
        for (i=0; i<m10.length; i++){
            if (!uniqueM10.contains(m10[i])){
                uniqueM10.add(m10[i]);
            }
        }
        int [] mUnique10 = new int [uniqueM10.size()];
        i = 0;
        for (Integer val : uniqueM10){
            mUnique10[i++]=val;
        }
        System.out.println("Test 10");
        System.out.println("Hash Function (Multiplication Method)");
        int emptySlotsm10 = 0;
        
        for(int y =0; y<89; y++){
        if(!(uniqueM10.contains(y))){
            emptySlotsm10++;
        }
        }
        System.out.println("Empty slots on the hash table: " + emptySlotsm10);
        List<Integer> mHash10 = new ArrayList<Integer>(m10.length);
        for (int g : m10) mHash10.add(g);
            int moreThanTwo10 = 0;
        for (int k=0; k<89; k++){
            int count = 0;
        for (int test : mHash10){
            if(test == k){
                count++;
                if (count>1){
                    mCollisions10++;
                }
            }
            if(count>2){
                moreThanTwo10++;
                count=0;
            }
        }
        }

        System.out.println("# of slots with more than two elements: " + moreThanTwo10);
        // System.out.println("");
        System.out.println("Total collisions for multiplication function: " + mCollisions10);
        System.out.println("");

        // Hash Function using division method 
        HashSet<Integer> uniqueD10 = new HashSet<>();
        for (i=0; i<d10.length; i++){
            if (!uniqueD10.contains(d10[i])){
                uniqueD10.add(d10[i]);
            }
        }
        int [] dUnique10 = new int [uniqueD10.size()];
        i = 0;
        for (Integer val : uniqueD10){
            dUnique10[i++]=val;
        }
        System.out.println("Hash Function (Division Method)");
       
        int emptySlotsd10 = 0;

        for(int y =0; y<89; y++){
        if(!(uniqueD10.contains(y))){
            emptySlotsd10++;
        }
        }

        System.out.println("Empty slots on the hash table: " + emptySlotsd10);
        List<Integer> dHash10 = new ArrayList<Integer>(d10.length);
        for (int g : d10) dHash10.add(g);
            int moreThanTwoD10 = 0;
        for (int k=0; k<89; k++){
            int count = 0;
        for (int test : dHash10){
            if(test == k){
                count++;
                if (count>1){
                    dCollisions10++;
                }
            }
            if(count>2){
                moreThanTwoD10++;
                count=0;
            }
        }
        }

        System.out.println("# of slots with more than two elements: " + moreThanTwoD10);

        System.out.println("Total collisions for division function: " + dCollisions10);

        System.out.println("");

        }
		



	}
