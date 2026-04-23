package JSixTechnologiesTraineCode.Strings.pwLeetcode;

public class StringCompression {
    public static void main(String[] args) {

        // refer 4850 drive decode -> string -> notes
        String s = "aaaabbbbddddwwrrrr";
        char[] arr=s.toCharArray();
        StringBuilder str = new StringBuilder("");

        int i = 0 ,j = 0;

        while(j<arr.length) {

            if (arr[i] == arr[j]) {
                j++;
            } else {
                str.append(arr[i]);
                int len = j - i;
                if (len > 1) str.append(len);
                i = j;
            }
        }
            str.append(arr[i]);
            int len = j - i;
            if(len > 1) str.append(len);
            i = j;

        System.out.println(str);
    }

}

//output:
//a4b4d4w2r4