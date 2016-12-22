public class KiwiJuiceEasy
{
	public static void main(String args[]){
		int[] capacities = {30,20,10};
		int[] bottles = {10,5,5};
		int[] fromId = {0,1,2};
		int[] toId = {1,2,2};

		KiwiJuiceEasy check = new KiwiJuiceEasy();

		int[] result = check.thePouring(capacities,bottles,fromId,toId);

		for(int value:result){
			System.out.println(value);
		}
	}
	public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId)
	{
		for (int i=0; i<fromId.length; i++)
		{
			int sum = bottles[fromId[i]]+bottles[toId[i]];
			bottles[toId[i]] = Math.min(sum, capacities[toId[i]]);
			bottles[fromId[i]] = sum - bottles[toId[i]];
			// int f = fromId[i];
			// int t = toId[i];
			// int space = capacities[t] - bottles[t];

			// if(space >= bottles[f]){
			// 	int vol = bottles[f];
			// 	bottles[t] += vol;
			// 	bottles[f] = 0;
			// }else{
			// 	int vol = space;
			// 	bottles[t] += vol;
			// 	bottles[f] -= vol;
			// }
		}

		return bottles;
	}
}

