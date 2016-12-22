import java.util.*;

public class InterestingParty
{
	public static void main(String args[]){
		String[] first = {"v","d","l","c"};
		String[] second = {"t","s","dd","m"};
		
		InterestingParty check = new InterestingParty();

		int result = check.bestInvitation(first, second);

		System.out.println(result);

		// for(int value:result){
		// 	System.out.println(value);
		// }
	}
	public int bestInvitation(String[] first, String[] second){
		
		HashMap<String, Integer> dic = new HashMap<String, Integer>();

		for(int i=0; i<first.length; i++){
			dic.put(first[i], 0);
			dic.put(second[i], 0);
		}

		for(int i=0; i<first.length; i++){
			dic.put(first[i], dic.get(first[i])+1);
			dic.put(second[i], dic.get(second[i])+1);
		}

		int ans = 0;
		for(String key: dic.keySet()){
			ans = Math.max(ans dic.get(key));
		}

		// int i, j;
		// int ans = 0;

		// for(i=0; i<first.length; i++){
		// 	int f = 0;
		// 	int s = 0;
		// 	for(j=0;j<first.length; j++){
		// 		if(first[i].equals(first[j])) f++;
		// 		if(first[i].equals(second[j])) f++;
		// 		if(second[i].equals(first[j])) s++;
		// 		if(second[i].equals(second[j])) s++;
		// 	}
		// 	ans = Math.max(f, ans);
		// 	ans = Math.max(s, ans);
		// }
		return ans;
	}
}