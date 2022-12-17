package programmers;

import java.util.Arrays;

public class ColoringBook {
    private static boolean[][] visited;
    private static int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};

    public static void main(String[] args) {

        int[][] picture = {
                {1,1,1,0},
                {1,2,2,0},
                {1,0,0,1},
                {0,0,0,1},
                {0,0,0,3},
                {0,0,0,3}
        };

        for(int i : solution(6,4, picture)){
            System.out.print(i+", ");
        }
    }

    public static int[] solution(int m, int n, int[][] picture) {
        visited = new boolean[m][n];
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        for(int row = 0;row<m;row++){
            for(int col=0;col<n;col++){
                if(!visited[row][col] && picture[row][col]!=0){
                    int region = dfs(row, col, picture);
                    numberOfArea++;
                    maxSizeOfOneArea = Math.max(region, maxSizeOfOneArea);
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    private static int dfs(int row, int col, int[][] picture){
        visited[row][col] = true;
        int region = 1;

        for(int[] direction : directions){
            int newRow = row + direction[0];
            int newCol = col + direction[1];
            if(newRow>=0 && newRow<picture.length && newCol>=0 && newCol<picture[0].length && !visited[newRow][newCol]
                && picture[newRow][newCol] == picture[row][col]){
                region += dfs(newRow, newCol, picture);
            }
        }

        return region;
    }
}
