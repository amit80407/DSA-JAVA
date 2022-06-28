package LinearSearch;
// search the charecter i  present in the strig or not if present the return index;
public class SearchString {
    public static void main(String[] args) {
        String name ="amit kumar ";
         char  target  = ' ';
        System.out.println( " i present in the index "+search(name,target));
    }
    public static int search(String str ,char target)
    {
        if(str.length()==0)
        {
            return -1;
        }
        for(int i =0;i<str.length();i++)
        {
            if(target ==str.charAt(i))
            {
                return i;
            }
        }
        return -1;

    }
    
}
