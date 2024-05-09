import java.util.Map;
import java.util.HashMap;

class Solution{
		public boolean canConstruct(String ransomNote, String magazine){
			Map<Character,Integer> map = new HashMap<>();
			for (int i = 0; i < magazine.length(); i++) {
				char c = magazine.charAt(i);
				Character ctemp = Character.valueOf(c);
				if (map.containsKey(ctemp)){
					map.put(ctemp, map.get(ctemp)+1);
				}else{
					map.put(ctemp, 1);
				}
			}
			for (int i = 0; i < ransomNote.length(); i++) {
				char c = ransomNote.charAt(i);
				Character ctemp = Character.valueOf(c);
				if(!map.containsKey(ctemp)){
					return false;
				}
				int cAmount = map.get(ctemp) - 1;
				if(cAmount == 0){
					map.remove(ctemp);
				}else{
					map.put(ctemp, cAmount);
				}
			}
			return true;

		}

		public static void main(String[] args){
			boolean result = new Solution().canConstruct("aa" , "ab");
			System.out.println(result);
		}
}