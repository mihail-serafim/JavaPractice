public class Assignment1 {

	public static void main(String [] args){
		int[][] map = {{200,102,105,45},
				       {103,102,105,87},
					   {102,102,108,9},
				  	   {1000,0,300,10}};

		int[] cell = {1,1};
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
		return new int[0]; //Placeholder
	}
	
	public static void rotateMap(int[][] map) {
		return; //Placeholder
	}
	
}
