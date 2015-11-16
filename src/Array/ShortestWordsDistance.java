package Array;

public class ShortestWordsDistance {

	/*
	 * Given a list of words and two words word1 and word2, 
	 * return the shortest distance between these two words in the list.
	   For example,
	   Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
       Given word1 = "coding", word2 = "practice", return 3. 
       Given word1 = "makes", word2 = "coding", return 1.
	 * 
	 * 
	 * You may assume that word1 does not equal to word2, 
	 * and word1 and word2 are both in the list.
	 */
	
	public int getDistance(String word1, String word2, String[] words){
		
		if(word1.length() == 0 || word2.length() == 0 || words.length == 0)
			return -1;
		
		int index1 = -1, index2 = -1, minDistance = words.length+1;
		
		for(int i = 0; i < words.length; i++){
			
			if(word1.equals(words[i]))
				index1 = i;
			
			if(word2.equals(words[i]))
				index2 = i;
			
			if(index1 != -1 && index2 != -1)
				minDistance = Math.min(minDistance, Math.abs(index1-index2));
		}
		
		if(minDistance == words.length+1)
			return -1;
		
		return minDistance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"practice", "makes", "perfect", "coding", "makes"};
		System.out.println(new ShortestWordsDistance().getDistance("coding", "practice", words));
		System.out.println(new ShortestWordsDistance().getDistance("coding", "makes", words));
		
	}

}
