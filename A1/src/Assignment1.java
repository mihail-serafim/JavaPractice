public class Assignment1 {

	public static void main(String [] args){
		//int[][] map = {{0,100,0,45},{200,100,100,87},{100,100,0,9},{1000,0,300,10}};
		//int[] out = findPeak(map);
		//System.out.println(out[0]);
		//System.out.println(out[1]);
	}
	
	public static int[] findPeak(int[][] map){
		int max = map[0][0];
		int[] maxcell = new int[2];

		for (int i = 0; i < map.length; i++){
			for (int j = 0; j < map[i].length; j++ ){
				if(map[i][j] > max){
					max = map[i][j];
					maxcell[0] = i;
					maxcell[1] = j;

				}
			}
		}

		return maxcell;
	}
	
	public static boolean isSink(int[][] map, int[] cell) {
		if(cell[0] + 1 < map.length){
			if(map[cell[0]][cell[1]] < map[cell[0]+1][cell[1]]){
				return true;
			} else if(){

			}

		}


		return true; //Placeholder
	}
	
	public static int[] findLocalSink(int[][] map, int[] startCell) {
		return new int[0]; //Placeholder
	}
	
	public static void rotateMap(int[][] map) {
		return; //Placeholder
	}
	
}
