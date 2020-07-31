import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

	public class PracticeAssessment {

		public static void main(String[] args) {
			
			System.out.println(catchThis("1","2","3"));
			System.out.println(Arrays.toString(getFirstWords("if you","and iei","but don't")));
			int[] nums = new int[3];
			nums[0] = 3;
			nums[1]= 2;
			nums[2]= 4;
			System.out.println(neverTellMeTheOdds(nums));
			ArrayList<String> lifts = new ArrayList<>();
			lifts.add("hi");
			lifts.add("dont");
			System.out.println(lifts);
			System.out.println(lift(lifts));
			System.out.println(lifts);
			
			Map<String, String> map = new HashMap<>();
			map.put("Pea", "Green");
			map.put("Cherry", "Red");
			map.put("Plumb", "Purple");
			
			System.out.println(takeItAway(map, "Cherry"));
			System.out.println(map);
			
			List<String> lisa = new ArrayList<>();
			lisa.add("a");
			lisa.add("b");
			lisa.add("c");
			System.out.println(listToSet(lisa));
			
		}
		
		public static HashMap<Integer, String> espanol(){
			HashMap <Integer, String> espanol = new HashMap<>();
			espanol.put(1, "Uno");
			espanol.put(2, "Dos");
			espanol.put(3, "Tres");
			return espanol;
		}
		
		public static int lift(List<String> liftee) {
			//List<String> lifter = new ArrayList<>();
			int i = 0;
			for (String s : liftee) {
				s = s.toUpperCase();
				liftee.set(i, s);
				i++;
			}
			return i;
		} 
				
		public static boolean takeItAway(Map<String, String> map, String s) {
			
			if (map.containsKey(s)) {
				map.remove(s);
				return true;
			} else return false;
		}
		 
		public static Set<String> listToSet(List<String> lisa){
			Set<String> mona= new HashSet<>();
			for(String s : lisa) {
				mona.add(s);
			}
			return mona;
		}
		
		public static int howFarApart(List<String> list, String i1, String i2) {
			int num1=0;
			int num2=0;
			try {
			if (list.indexOf(i1)==-1) {
			throw new IllegalArgumentException();
			} else if (list.indexOf(i2)==-1) {
				throw new IllegalArgumentException();
			}
			num1 = list.indexOf(i1);
			num2 = list.indexOf(i2);
			return num2-num1;
		} catch (IllegalArgumentException e){ 
			return 0;
		}
	
		}
		public static double makeADifference(double[] dub, int index, int index2) {
			
			try {
			double d1 = dub[index];
			double d2 = dub[index2];
			return d1-d2;
			} catch (Exception e) {
				System.out.println(e);
				return 0;
			}
		}
		
		public static int fleeZero(int[] charles) {
			int i2 = 0;
			for (int i = 0; i < charles.length; i++) {
				if (charles[i]>0) {
					charles[i] +=1;
					i2++;
				} else if (charles[i]<0) {
					charles[i] -= 1;
				} else charles[i] = charles[i];
			}
			return i2;
		}
		
		public static String[] getFirstWords(String s1, String s2, String s3) {
			String[] sArr = new String[3];
			sArr[0] = s1.split(" ")[0];
			sArr[1] = s2.split(" ")[0];
			sArr[2] = s3.split(" ")[0];
			
			return sArr;
			
		}
		
		public static Set<Integer> neverTellMeTheOdds(int[] iArr){
			Set<Integer> evens = new LinkedHashSet<>();
			for (Integer i : iArr) {
				if (i % 2 == 0) {
					evens.add(i);
				}
			}
			return evens;
		}
		
		public static ArrayList<Character> updateList(ArrayList<Character> cList, Character c){
			//ArrayList<Character> vowels = new ArrayList<>();
			if (!cList.contains(c)) {
				cList.add(c);
			} return cList;
		}
		
		public static LinkedList<Double> updateValue(LinkedList<Double> dList, Double d){
			dList.addFirst(d);
			return dList;
		}
		
		
		public static int catchThis(String s1,String s2,String s3) {
			try {
			int i = Integer.parseInt(s1);
			int i2 = Integer.parseInt(s2);
			int i3 = Integer.parseInt(s3);
			return i+i2+i3;
			} catch (Exception pe) {
				System.out.println(pe);
				return 0;
			}
		}
	}