package java_20200726;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test
 * @Description
 * @Author by小房
 * @Date 2020/7/26 23:46
 */
public class Test {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str != null && str.length() > 0) {
            PermutationHelper(str.toCharArray(), 0, result);

            Collections.sort(result);
        }
        return result;
    }

    private void PermutationHelper(char[] str, int start, ArrayList<String> result) {
        if(start == str.length - 1){
            if(!IsExist(result, str)){
                result.add(new String(str));
            }
            return;
        }
        for(int i = start; i < str.length; i++){
            Swap(str, start, i);
            PermutationHelper(str, start+1, result);
            Swap(str, start, i);
        }
    }

    private void Swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    private boolean IsExist(ArrayList<String> result, char[] str) {
        return result.contains(String.valueOf(str));
    }
}
