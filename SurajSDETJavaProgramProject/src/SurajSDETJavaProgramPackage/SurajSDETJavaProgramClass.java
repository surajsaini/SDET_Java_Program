package SurajSDETJavaProgramPackage;

import java.util.*;

public class SurajSDETJavaProgramClass {

	public static void main(String[] args) {
		test12();

	}

	public static void test12() {

		int[] arr = { 2, 55, 2, 5, 5, 8};

		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(map.containsValue(10 - arr[i])) {
				
				System.out.println( arr[i] + "--"+ (10-arr[i]));
			}
			
			
				
				map.put(i,arr[i]);
			
		}
		
	}

	public static String leetcode3163(String word) {

//		String aa = "aaaaaaaaaaaaasssssdddd";
		StringBuilder sb = new StringBuilder();

		int count = 0;
		char chr = word.charAt(0);

		for (int j = 0; j < word.length(); j++) {

			if (word.charAt(j) == chr && count < 9) {
				count++;
			}

			else {
				sb.append(count).append(chr);
				chr = word.charAt(j);
				count = 1;
			}

		}
		sb.append(count).append(chr);
		System.out.println(sb);
		return sb.toString();
	}

	public static boolean leetcode796(String s, String goal) {

		StringBuilder bb = new StringBuilder(s);

		boolean aa = true;
		for (int j = 0; j < s.length(); j++) {
			for (int i = 1; i < s.length(); i++) {

				bb.append(bb.charAt(i));
			}

			bb.append(bb.charAt(0));

			bb.delete(0, 5);

			if (bb.toString().equals(goal)) {

				aa = true;
				break;
			}

			else {
				aa = false;
			}
		}

		System.out.println(aa);
		return aa;

	}

	public static void tt() {
		int[] arr = { 4, 6, 12, 7, 15, 22 };
		int aa = 0;
		int bb = 1000;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > aa) {

				aa = arr[i];
			}
			if (arr[i] < bb) {

				bb = arr[i];
			}

		}

		System.out.println(aa + "---" + bb);
		Arrays.sort(arr);

		System.out.println(arr[0] - arr[arr.length - 1]);

	}

	public static void leetcode(String ll) {

		String[] str = ll.split(" ");
		boolean ss = true;

		for (int i = 0; i < str.length - 1; i++) {

			if (str[i].charAt(str[i].length() - 1) == str[i + 1].charAt(0)) {

				ss = true;
			} else {
				ss = false;
				break;
			}
		}
		System.out.println(ss);

		if (ss == true) {
			if (str[0].charAt(0) == str[str.length - 1].charAt((str[str.length - 1]).length() - 1)) {
				ss = true;

			} else {
				ss = false;
			}
		}
		System.out.println(ss);
	}

	public static void leetcode1957() {

		String s = "leeetcode";
		// Output: "leetcode"
		int count = 0;
		StringBuilder aa = new StringBuilder();
		aa.append(s.charAt(0));

		for (int i = 1; i < s.length(); i++) {

			if (s.charAt(i) == aa.charAt(aa.length() - 1)) {

				count++;

				if (count < 3) {
					aa.append(s.charAt(i));
				}
			} else {
				aa.append(s.charAt(i));
				count = 1;
			}
		}
		System.out.println(aa);
	}

	public static void anagramString() {

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(strs);
		Map<String, List<String>> map = new HashMap<>();

		for (String word : strs) {
			char[] charArray = word.toCharArray();
			Arrays.sort(charArray);
			String sortedWord = new String(charArray);
			if (!map.containsKey(sortedWord)) {
				map.put(sortedWord, new ArrayList<>());
			}
			map.get(sortedWord).add(word);
		}
		System.out.println(map.values());
	}

	public static void longestSquareStreak() {
		int[] ab = { 3, 4, 2, 6, 4, 9, 8, 81 };
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();

		// Add elements to list and sort it
		for (int num : ab) {
			list.add(num);
		}
		Collections.sort(list);

		int longestStreak = 0;

		for (int num : list) {
			int count = 1;
			int current = num;

			// Check for consecutive squares
			while (list.contains(current * current)) {
				current = current * current;
				count++;
			}

			// Update longest streak if current streak is longer
			longestStreak = Math.max(longestStreak, count);
		}

		System.out.println("Longest Square Streak: " + longestStreak);
	}

	public static void removeDuplicateWordFromString() {

		String ab = "I love love india my india";
		String[] bc = ab.split(" ");
		List<String> list = new LinkedList<>();

		for (int i = 0; i < bc.length; i++) {

			if (!list.contains(bc[i])) {
				list.add(bc[i]);
			}
		}

		System.out.println(list);

	}

	public static void sumOfDIgit() {

		String ab = "12345";
		int sum = 0;
		System.out.println(ab.charAt(0));

		for (int i = 0; i < ab.length(); i++) {
			int zz = Character.getNumericValue(ab.charAt(i));
			sum = sum + zz;

		}
		System.out.println(sum);
	}

	public static void primenumber(int ab) {
		Boolean Flag = true;
		for (int i = 3; i <= Math.sqrt(ab); i++) {
			if (ab % i == 0 || ab == 2) {
				Flag = false;
				break;
			}
		}
		if (Flag) {
			System.out.println(ab + "- prime");
		} else {
			System.out.println(ab + "- not prime");
		}

	}

	public static void hollowStarSquare(int n, int m) {

		int i;
		int j;

		for (i = 0; i < n; i++) {

			for (j = 0; j < m; j++) {

				if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
					System.out.print("* ");
				}

				else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}

	public static void starTriangle() {

		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < 6 - i - 1; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < i + 1; k++) {

				System.out.print(" *");
			}
			System.out.println();
		}

	}

	public static void reverseString(String n) {

		String b = "";

		for (int i = n.length() - 1; i >= 0; i--) {

			b = b + n.charAt(i);

		}

		System.out.print(b);
	}

	public static void RASarray(String b) {

		char[] ab = b.toCharArray();

		for (int i = b.length() - 1; i >= 0; i--) {

			System.out.print(ab[i]);
		}

	}

	public static void ArrayConsecutive() {

		int[] ab = { 1, 2, 4, 5, 6, 7 };
		int count = 1;
		int bc = 1;

		for (int i = 0; i < ab.length - 1; i++) {
			if (ab[i + 1] == ab[i] + 1) {
				count++;
			} else if (count > bc) {
				bc = count;
				count = 1;
			}
		}
		if (count > bc) {
			bc = count;
		}
		System.out.println(bc);
	}

	public static void CountCapitalAlphabet() {

		String ab = "SuRajSaIniGZB";
		int count = 0;
		String ac = "";

		for (int i = 0; i <= ab.length() - 1; i++) {

			if (ab.charAt(i) >= 'A' && ab.charAt(i) <= 'Z') {

				count++;

				ac = ac + ab.charAt(i);
			}

		}
		System.out.print(count);
		System.out.print(ac);

	}

	public static void ReverseArray() {

		char[] abc = { 's', 'u', 'r', 'a', 'j' };

		int right = abc.length - 1;
		int left = 0;

		while (left < right) {

			char c = abc[right];
			abc[right] = abc[left];
			abc[left] = c;

			right--;
			left++;

		}

		System.out.print(abc);

	}

	public static void ReverseString() {

		String ab = "SuRaj";
		String bc = "";

		for (int i = ab.length() - 1; i >= 0; i--) {

			bc = bc + ab.toUpperCase().charAt(i);

		}

		System.out.print(bc);

	}

	public static void LargestElementinArray() {

		int[] ab = { 3, 5, 12, 22, 0, 3, 29 };

		int aa = Integer.MIN_VALUE;
		for (int i = 0; i < ab.length; i++) {
			if (aa < ab[i]) {
				aa = ab[i];
			}
		}
		System.out.println(aa);
	}

	public static void Palindroma() {

		String abc = "qwertyTrewq";

		String cba = "";
		for (int i = abc.length() - 1; i >= 0; i--) {

			cba = cba + abc.charAt(i);

		}

		if (cba.equals(abc)) {

			System.out.println("it is palindrome");
		} else {
			System.out.println("it is not");
		}
		System.out.println(cba);
		System.out.println(abc);

	}

	public static void SecondLargestElementinArray() {

		int[] ab = { 8, 4, 5, 1, 9, 2, -1, 8, 3 };

		int FL = 0;
		int SL = 0;

		for (int i = 0; i < ab.length; i++) {
			if (ab[i] > FL) {
				SL = FL;
				FL = ab[i];
			} else if (ab[i] > SL && ab[i] != FL) {
				SL = ab[i];
			}
		}
		System.out.print("FL =" + FL + " and SL =" + SL);

	}

	public static void removeDuplicateCharFromString() {

		String ab = "programming";
		StringBuilder bc = new StringBuilder();
		Set<Character> cd = new HashSet<>();
		for (int i = 0; i < ab.length(); i++) {
			if (!cd.contains(ab.charAt(i))) {
				cd.add(ab.charAt(i));
				bc.append(ab.charAt(i));
			}
		}
		System.out.print(bc);
	}

	public static void ReordedArray() {

		int[] ab = { 8, 4, -5, -1, 9, 2, -1, 8, -3 };
		ArrayList<Integer> bc = new ArrayList<>();
		ArrayList<Integer> cd = new ArrayList<>();

		for (int i = 0; i < ab.length; i++) {

			if (ab[i] < 0) {

				bc.add(ab[i]);

			}

			else {
				cd.add(ab[i]);

			}

		}
		bc.addAll(cd);
		System.out.println(bc);
		System.out.println(bc.get(5));
	}

	public static void TargetSum() {

		int[] ab = { 2, 6, 1, 4, 8, 3, 3, 2, 3, 9 };
		int bc = 0;

		for (int i = 0; i < ab.length; i++) {
			bc = ab[i];
			for (int j = i + 1; j < ab.length; j++) {

				bc = bc + ab[j];
				if (bc == 11) {

					for (int k = i; k <= j; k++) {
						System.out.print(ab[k]);
					}
					System.out.println(" ");

				}
			}
		}

	}

	public static void TargetSum(int TS) {

		int[] ab = { 3, 5, 7, 4, 6 };

		Map<Integer, Integer> numMap2 = new HashMap<>();

		for (int i = 0; i < ab.length; i++) {

			int diff = TS - ab[i];

			if (numMap2.containsKey(diff)) {

				System.out.println(numMap2.get(diff) + "and" + i);

			}

			numMap2.put(ab[i], i);

		}
	}

	public static void CountAlphabet() {

		String ab = "aaabbbbcaaccaadd";

		Map<Character, Integer> CA = new HashMap<>();
		for (int i = 0; i < ab.length(); i++) {
			char ch = ab.charAt(i);

			if (CA.containsKey(ch)) {

				CA.put(ch, CA.get(ch) + 1);
			} else {
				CA.put(ch, 1);
			}
		}

		System.out.println(CA);
		for (Map.Entry<Character, Integer> entry : CA.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

	public static void ConvertNumricToChar() {

		String ab = "a4d3v2";

		for (int i = 0; i < ab.length(); i++) {

			if (Character.isAlphabetic(ab.charAt(i))) {

				System.out.print(ab.charAt(i));

			} else {
				int a = Character.getNumericValue(ab.charAt(i));

				for (int j = 1; j < a; j++) {

					System.out.print(ab.charAt(i - 1));
				}
			}
		}
	}

	public static void ProductArrayExpectSelf() {

		int[] ab = { 3, 4, 1, 9 };
		int n = ab.length;

		int[] rightab = new int[n];
		int[] leftab = new int[n];
		int[] outputab = new int[n];

		leftab[0] = 1;
		rightab[n - 1] = 1;

		for (int i = 1; i < n; i++) {
			leftab[i] = ab[i - 1] * leftab[i - 1];
		}

		for (int j = n - 2; j >= 0; j--) {

			rightab[j] = ab[j + 1] * rightab[j + 1];
		}

		for (int m = 0; m < n; m++) {
			// System.out.println(leftab[m] + "L");
			// System.out.println(rightab[m] + "R");
			// outputab[m] = leftab[m] * rightab[m];
			System.out.println(leftab[m] * rightab[m]);

		}
	}

	public static void SortAnArray() {
		int[] ab = { 7, 1, 0, 2 };

		int bc = 0;
		for (int j = 0; j < ab.length; j++) {
			for (int i = j + 1; i < ab.length; i++) {

				if (ab[j] > ab[i]) {

					bc = ab[j];
					ab[j] = ab[i];
					ab[i] = bc;

				}
			}
		}
		for (int j = 0; j < ab.length; j++) {
			System.out.print(ab[j]);
		}
	}

	public static void test1() {

		String ab = "geeksforgeeks";
		String bc = "";
		int count = 0;
		for (int i = 0; i < ab.length(); i++) {

			if (ab.charAt(i) == ab.charAt(ab.length() - 1 - i)) {

				bc = bc + ab.charAt(i);
			} else {
				count++;
			}

		}
		System.out.print(bc + "" + count);
	}

	public static void SubArraywithTargetSum() {

		int[] ab = { 4, 9, 3, 2, 5, 2, 6 };
		int TS = 12;

		for (int i = 0; i < ab.length; i++) {
			int sum = ab[i];

			for (int j = i + 1; j < ab.length; j++) {
				sum = sum + ab[j];

				if (sum == TS) {

					for (int n = i; n <= j; n++) {
						System.out.print(ab[n]);
					}
				}

			}
			System.out.println(" ");
		}
	}

	public static void largestWordInTheString(String ab) {

		String[] words = ab.split(" ");
		String largestWord = "";

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > largestWord.length()) {
				largestWord = words[i];
			}
		}
		System.out.println(largestWord);
	}

	public static void SmallWordInString() {
		String sentence = "your name is suraj";
		int startOfSmallestWord = 0; // Starting index of the smallest word
		int lengthOfSmallestWord = Integer.MAX_VALUE; // Length of the smallest word (initialized to max value)
		int startIndex = 0; // Starting index of the current word
		int currentIndex = 0; // Iterator

		while (currentIndex <= sentence.length()) {
			if (currentIndex < sentence.length() && sentence.charAt(currentIndex) != ' ') {
				currentIndex++;
			} else {
				int wordLength = currentIndex - startIndex;
				if (wordLength < lengthOfSmallestWord && wordLength > 0) {
					lengthOfSmallestWord = wordLength;
					startOfSmallestWord = startIndex;
				}
				currentIndex++;
				startIndex = currentIndex;
			}
		}

		System.out.println("Smallest word: "
				+ sentence.substring(startOfSmallestWord, startOfSmallestWord + lengthOfSmallestWord));
	}

	public static void SmallWordInString2() {

		String sentence = "your name is suraj";

		String s1 = sentence + " ";

		System.out.println(s1);
		int ab = 0;
		int bc = 0;
		int ef = 0;
		int de = 0;
		HashMap<Integer, Integer> cd = new HashMap<>();

		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == ' ') {
				ab = i; // space index
				ef = i - de;
				de = i;

				cd.put(ab, ef);

			}

		}
		List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(cd.entrySet());
		entries.sort(Map.Entry.comparingByValue());
		System.out.println(cd.keySet());
		System.out.println(cd.values());
		System.out.println(entries.size());
		System.out.println(s1.substring(entries.size(), de));
	}

	public static void stringOperators() {

		String a = "EPAM";
		String b = new String("EPAM");
		String d = new String("EPAM");
		String c = "EPAM";
		System.out.println(d == b);
		System.out.println(a.equals(b));
		System.out.println(a == c);
		System.out.println(a == b);

	}

	public static void collectionHashMap() {

		Map<String, String> st = new HashMap<>();

		st.put("Suraj", "2000");
		st.put("Hema", "1998");
		st.put("suresh", "2007");

		for (Map.Entry<String, String> entry : st.entrySet()) {

			if (Integer.parseInt(entry.getValue()) > 2000) {

				System.out.println(entry.getKey());
			}
		}

	}

	public static void findDuplicateArrayUsingHashMap() {

		int[] ab = { 3, 5, 1, 3, 7, 8, 5 };
		Map<Integer, Integer> bc = new HashMap<>();

		for (int i = 0; i < ab.length; i++) {

			if (bc.containsValue(ab[i])) {

				System.out.println(ab[i] + " duplicate");
			} else {
				bc.put(i, ab[i]);
			}
		}
	}

	public static void test() {

		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= 5; j++) {

				if (j == 0 || i == 0 || j == 5 || i == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void CharCountInStringUsingHashSet() {
		String word = "google";
		int count = 0;
		Set<Character> word2 = new HashSet();

		for (int j = 0; j < word.length(); j++) {

			if (word2.contains(word.charAt(j))) {
				continue;
			}

			for (int i = 0; i < word.length(); i++) {

				if (word.charAt(j) == (word.charAt(i))) {

					count++;
				}
			}
			word2.add(word.charAt(j));

			System.out.println(word.charAt(j) + "--" + count);
			count = 0;
		}

	}

	public static void CharCountInStringUsingHashMap() {
		String word = "google";

		Map<Character, Integer> word2 = new HashMap<>();

		for (int i = 0; i < word.length(); i++) {

			if (word2.containsKey(word.charAt(i))) {

				int n = word2.get(word.charAt(i));
				n++;
				word2.put(word.charAt(i), n);
			} else {
				word2.put(word.charAt(i), 1);
			}
		}
		System.out.println(word2);
	}

	public static void makeFirstCharUpperCase() {

		String ab = "i love canada";
		StringBuilder zz = new StringBuilder();
		String[] bc = ab.split(" ");

		for (int i = 0; i < bc.length; i++) {
			char yy = Character.toUpperCase(bc[i].charAt(0));
			zz.append(yy);

			for (int j = 1; j < bc[i].length(); j++) {

				char ii = bc[i].charAt(j);
				zz.append(ii);
			}
			zz.append(" ");
		}
		System.out.println(zz);
	}

	public static void printOddEven() {

		int a = 9;
		int b = 6;

		int c = a;

		System.out.println(a % 2 == 0);

		for (int i = 1; i <= b; i++) {
			if (a % 2 != 0) {
				System.out.println(a);
				a = a + 2;
			}

			if (a % 2 == 0) {
				System.out.println(a);
				a = a + 2;
			}
		}
		System.out.println("=====" + "" + c);
		c = c + 1;
		System.out.println(c);
		for (int j = 2; j <= b; j++) {
			c = c + 2;
			System.out.println(c);

		}

	}

	public static void eachWordReverse() {
		String ab = "I love you jann";
		String[] bc = ab.split(" ");
		StringBuilder cd = new StringBuilder();

		for (int i = 0; i < bc.length; i++) {

			for (int j = bc[i].length() - 1; j >= 0; j--) {

				cd.append(bc[i].charAt(j));

			}
			cd.append(" ");
		}
		System.out.println(cd.toString());
	}

}
