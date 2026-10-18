class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int ans[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int a = board[i][j];
                int count = cc(board,i,j);
                if(a == 0 && count == 3){
                    ans[i][j] = 1;
                }
                if(a == 1 && (count == 2 || count == 3)){
                    ans[i][j] = 1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j] = ans[i][j];
            }
        }
    }

    public static int cc(int arr[][] , int i , int j){
        int count = 0;
        int m = arr[0].length;
        int n = arr.length;
        int a1=0,a2=0;
        if(i > 0){
            a1 = i-1;
            a2 = j;
            if(arr[a1][a2] == 1){
                count++;
            }
        }

        if(i > 0 && j < m-1){
            a1 = i-1;
            a2 = j+1;
            if(arr[a1][a2] == 1){
                count++;
            }
        }

        if(j < m-1){
            a1 = i;
            a2 = j+1;
            if(arr[a1][a2] == 1){
                count++;
            }
        }

        if(i < n-1 && j < m-1){
            a1 = i+1;
            a2 = j+1;
            if(arr[a1][a2] == 1){
                count++;
            }
        }

        if(i < n-1){
            a1 = i+1;
            a2 = j;
            if(arr[a1][a2] == 1){
                count++;
            }
        }

        if(i < n-1 && j > 0){
            a1 = i+1;
            a2 = j-1;
            if(arr[a1][a2] == 1){
                count++;
            }
        }

        if(j > 0){
            a1 = i;
            a2 = j-1;
            if(arr[a1][a2] == 1){
                count++;
            }
        }

        if(i > 0 && j > 0){
            a1 = i-1;
            a2 = j-1;
            if(arr[a1][a2] == 1){
                count++;
            }
        }
        return count;
    }
}