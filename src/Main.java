public class Main {
    public static void main(String[] args) {
        String[] strs = {
            "flower",
            "flow",
            "flight"
                };
        System.out.println(strs[1].indexOf("flower"));
if (strs.length==0)
    System.out.println("");
String prefix = strs[0];
        for (int i = 0; i < strs.length; i++)  {
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty())
                    System.out.println("");
            }
            System.out.println(prefix);
        }
    }
}
