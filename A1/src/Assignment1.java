import java.util.Arrays;

public class Assignment1 {

	public static void main(String [] args){
		int[][] map = {{200,10,105,45},
				       {103,9,12,87},
					   {102,4,3,9},
				  	   {1000,5,300,0}};

		//int[][] map = {
		//				{1,2,3},
		//				{9,8,7},
		//				{4,5,6}
		//			   };
		int[] cell = {0,1};

		System.out.println(findLocalSink(map,cell)[0]);
		System.out.println(findLocalSink(map,cell)[1]);

		//int[][] arr = rotateMap(map);

		//for (int i = 0; i < arr.length; i++) {
		//	System.out.println(Arrays.toString(arr[i]));
		//}

		//int[] out = findPeak(map);
		//System.out.println(out[0]);
		//System.out.println(out[1]);
		//System.out.println(isSink(map,cell));
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

		try {
			if	   (map[cell[0]][cell[1]] <= map[cell[0]-1][cell[1]-1] &&
					map[cell[0]][cell[1]] <= map[cell[0]-1][cell[1]] &&
					map[cell[0]][cell[1]] <= map[cell[0]-1][cell[1]+1] &&
					map[cell[0]][cell[1]] <= map[cell[0]][cell[1]-1] &&
					map[cell[0]][cell[1]] <= map[cell[0]][cell[1]+1] &&
					map[cell[0]][cell[1]] <= map[cell[0]+1][cell[1]-1] &&
					map[cell[0]][cell[1]] <= map[cell[0]+1][cell[1]] &&
					map[cell[0]][cell[1]] <= map[cell[0]+1][cell[1]+1]){ return true; }
		}
		catch(Exception e) {
			try {
				if	   (map[cell[0]][cell[1]] <= map[cell[0]][cell[1]-1] &&
						map[cell[0]][cell[1]] <= map[cell[0]][cell[1]+1] &&
						map[cell[0]][cell[1]] <= map[cell[0]+1][cell[1]-1] &&
						map[cell[0]][cell[1]] <= map[cell[0]+1][cell[1]] &&
						map[cell[0]][cell[1]] <= map[cell[0]+1][cell[1]+1]){ return true; }
			}
			catch(Exception f) {
				try {
					if	   (map[cell[0]][cell[1]] <= map[cell[0]-1][cell[1]-1] &&
							map[cell[0]][cell[1]] <= map[cell[0]-1][cell[1]] &&
							map[cell[0]][cell[1]] <= map[cell[0]][cell[1]-1] &&
							map[cell[0]][cell[1]] <= map[cell[0]+1][cell[1]-1] &&
							map[cell[0]][cell[1]] <= map[cell[0]+1][cell[1]]){ return true; }
				}
				catch(Exception g) {
					try {
						if	   (map[cell[0]][cell[1]] <= map[cell[0]-1][cell[1]-1] &&
								map[cell[0]][cell[1]] <= map[cell[0]-1][cell[1]] &&
								map[cell[0]][cell[1]] <= map[cell[0]-1][cell[1]+1] &&
								map[cell[0]][cell[1]] <= map[cell[0]][cell[1]-1] &&
								map[cell[0]][cell[1]] <= map[cell[0]][cell[1]+1]){ return true; }
					}
					catch(Exception h) {
						try {
							if	   (map[cell[0]][cell[1]] <= map[cell[0]-1][cell[1]] &&
									map[cell[0]][cell[1]] <= map[cell[0]-1][cell[1]+1] &&
									map[cell[0]][cell[1]] <= map[cell[0]][cell[1]+1] &&
									map[cell[0]][cell[1]] <= map[cell[0]+1][cell[1]] &&
									map[cell[0]][cell[1]] <= map[cell[0]+1][cell[1]+1]){ return true; }
						}
						catch(Exception i) {
							try {
								if	   (map[cell[0]][cell[1]] <= map[cell[0]][cell[1]+1] &&
										map[cell[0]][cell[1]] <= map[cell[0]+1][cell[1]] &&
										map[cell[0]][cell[1]] <= map[cell[0]+1][cell[1]+1]){ return true; }
							}
							catch(Exception j) {
								try {
									if	   (map[cell[0]][cell[1]] <= map[cell[0]][cell[1]-1] &&
											map[cell[0]][cell[1]] <= map[cell[0]+1][cell[1]-1] &&
											map[cell[0]][cell[1]] <= map[cell[0]+1][cell[1]]){ return true; }
								}
								catch(Exception k) {
									try {
										if	   (map[cell[0]][cell[1]] <= map[cell[0]-1][cell[1]-1] &&
												map[cell[0]][cell[1]] <= map[cell[0]-1][cell[1]] &&
												map[cell[0]][cell[1]] <= map[cell[0]][cell[1]-1]){ return true; }
									}
									catch(Exception l) {
										try {
											if	   (map[cell[0]][cell[1]] <= map[cell[0]-1][cell[1]] &&
													map[cell[0]][cell[1]] <= map[cell[0]-1][cell[1]+1] &&
													map[cell[0]][cell[1]] <= map[cell[0]][cell[1]+1]){ return true; }
										}
										catch(Exception m) {
											return false;
											}
										}
									}
								}
							}
						}
					}
				}
			}
			return false;
		}

	
	public static int[] findLocalSink(int[][] map, int[] startCell) {
		int[] cell = startCell;
		while(!(isSink(map,cell))){
			int[] mincell = cell;
			if (cell[0]-1 >= 0 && cell[1]-1 >= 0 && map[cell[0]-1][cell[1]-1] < map[mincell[0]][mincell[1]]){
				mincell[0] = cell[0]-1;
				mincell[1] = cell[1]-1;
			}
			if (cell[0]-1 >= 0 && map[cell[0]-1][cell[1]] < map[mincell[0]][mincell[1]]){
				mincell[0] = cell[0]-1;
				mincell[1] = cell[1];
			}
			if (cell[0]-1 >= 0 && cell[1]+1 < map.length && map[cell[0]-1][cell[1]+1] < map[mincell[0]][mincell[1]]){
				mincell[0] = cell[0]-1;
				mincell[1] = cell[1]+1;
			}
			if (cell[1]-1 >= 0 && map[cell[0]][cell[1]-1] < map[mincell[0]][mincell[1]]){
				mincell[0] = cell[0];
				mincell[1] = cell[1]-1;
			}
			if (cell[1]+1 < map.length && map[cell[0]][cell[1]+1] < map[mincell[0]][mincell[1]]){
				mincell[0] = cell[0]-1;
				mincell[1] = cell[1]+1;
			}
			if (cell[0]+1 < map.length && cell[1]-1 >= 0 && map[cell[0]+1][cell[1]-1] < map[mincell[0]][mincell[1]]){
				mincell[0] = cell[0]+1;
				mincell[1] = cell[1]-1;
			}
			if (cell[0]+1 < map.length && map[cell[0]+1][cell[1]] < map[mincell[0]][mincell[1]]){
				mincell[0] = cell[0]+1;
				mincell[1] = cell[1];
			}
			if (cell[0]+1 < map.length && cell[1]+1 < map.length && map[cell[0]+1][cell[1]+1] < map[mincell[0]][mincell[1]]){
				mincell[0] = cell[0]+1;
				mincell[1] = cell[1]+1;
			}
			cell = mincell;
			System.out.println("***");
			System.out.println(cell[1]);
			System.out.println(cell[1]);
			System.out.println("***");

		}

		return cell;
	}
	
	public static void rotateMap(int[][] map) {
		int[][] newmap = new int[map.length][map[0].length];

		for (int i = 0; i < map.length; ++i)
			for (int j = 0; j < map[0].length; ++j)
				newmap[i][j] = map[j][map.length - i - 1];
		map = newmap;
		return;
	}
	
}
