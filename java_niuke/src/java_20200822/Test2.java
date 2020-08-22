package java_20200822;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test2
 * @Description
 * @Author by小房
 * @Date 2020/8/22 13:37
 */
public class Test2 {
    public static void main(String[] args) {
       // System.out.println(exist(  , "ABCCED"));

    }

    public boolean exist(char[][] board, String word) {
        int len = word.length();
        int rows = board.length;
        int cols = board[0].length;
        if (rows*cols < len) {
            return false;
        }
        boolean[][] str_t = new boolean[rows][cols];

        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < cols; j++) {
                if (hasPathhelper(board,rows,cols,i,j,word,str_t,0)) {
                    return true;
                }
            }
        }
        return false;
    }


    private boolean hasPathhelper(char[][] matrix, int rows, int cols, int i, int j, String str, boolean[][] str_t, int index) {
        if (i < 0 || j < 0 || i >= rows|| j>= cols||str_t[i][j] ||matrix[i][j] != str.charAt(index)) {
            return false;
        }
        if (index < str.length()  && ( matrix[i][j] == str.charAt(index) && str_t[i][j] == false)) {
            str_t[i][j] = true;
            if(index+1 >= str.length() ) {
                return true;
            }
        }
        //if(index+1 >= str.length() ) {
        //    return false;
        //}
        if (hasPathhelper(matrix,rows,cols,i +1,j,str,str_t,index +1)||
                hasPathhelper(matrix,rows,cols,i ,j+1,str,str_t,index+1)||
                hasPathhelper(matrix,rows,cols,i -1,j,str,str_t,index+1)||
                hasPathhelper(matrix,rows,cols,i ,j-1,str,str_t,index+1)) {
            return true;
        }
        str_t[i][j] = false;
        return false;

    }
}
