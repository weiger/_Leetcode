package Array;

public class WordSearch {

	public boolean isExist(char[][] matrix, String word){
		if(matrix.length == 0 || word.length() == 0)
			return false;
		
		int m = matrix.length, n = matrix[0].length;
		boolean[][] visited = new boolean[m][n];
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(dfs(matrix,i,j,0,word,visited))
					return true;
			}
		}
		return false;
	}
	
	public boolean dfs(char[][] matrix, int row, int col, int start, String word, boolean[][] visited){
		
		if(row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length)
			return false;
		
		if(start == word.length())
			return true;
		
		if(matrix[row][col] != word.charAt(start))
			return false;
		
		if(visited[row][col])
			return false;
		
		visited[row][col] = true;
		
		boolean res = dfs(matrix,row+1,col,start+1,word,visited) || 
				      dfs(matrix,row-1,col,start+1,word,visited) ||
				      dfs(matrix,row,col+1,start+1,word,visited) ||
				      dfs(matrix,row,col-1,start+1,word,visited);
		
		visited[row][col] = false;
		
		return res;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = {
				  {'A','B','C','E'},
				  {'S','F','C','S'},
				  {'A','D','E','E'}
		};
		
		System.out.println(new WordSearch().isExist(matrix, "ABCCED"));
		System.out.println(new WordSearch().isExist(matrix, "SEE"));
		System.out.println(new WordSearch().isExist(matrix, "ABCB"));
		
	}

}
