class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list=new ArrayList<>();
        if(s.length()<p.length()){
            return list;
        }
        int count1[]=new int[26];
        int count2[]=new int[26];

        int k=p.length();
        for(int i=0;i<k;i++){
            count1[p.charAt(i)-'a']++;
        }
        
        for(int i=0;i<k;i++){
            count2[s.charAt(i)-'a']++;
        }

        if(Arrays.equals(count1,count2)){
            list.add(0);
        }

        //slide win 
        for(int i=k;i<s.length();i++){
            count2[s.charAt(i)-'a']++;
            count2[s.charAt(i-k)-'a']--;
            
            if(Arrays.equals(count1,count2)){
                list.add(i-k+1);
            }
        }
        return list;
    }
}