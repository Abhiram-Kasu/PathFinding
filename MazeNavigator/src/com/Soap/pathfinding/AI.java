package com.Soap.pathfinding;

public class AI {

	public int[][] traverseMaze(int[][] maze, int xmax, int ymax) throws InterruptedException {
		boolean foundpath = false;
		int x = 1;
		int y = 1;
		maze[1][1] = 2;
		int i = 0;
		int extrad = 0;
		int extrar = 0;
		final long startTime = System.nanoTime();

		try {
			while (!foundpath) {
				extrad = 0;
				extrar = 0;

				if (x == xmax && y == ymax) {
					break;
				}
				// if can move down, then move down

				if (maze[y + 1][x] != 1  && maze[y + 1][x] != 3) {

					x += 0;
					y += 1;
					maze[y][x] = 2;

					System.out.println("down");
					i++;
				}
				// if can move right then move right
				else if (maze[y][x + 1] != 1  && maze[y][x + 1] != 3) {

					x += 1;
					y += 0;
					maze[y][x] = 2;

					System.out.println("right");
					i++;

				}
				// if can move left, then move left
				else if (maze[y][x - 1] != 1  && maze[y][x - 1] != 3 ) {
					maze[y][x] = 3;
					x -= 1;
					y += 0;

					System.out.println("left");
					i++;
					extrad++;
				}
				// if can move up, then move up
				else if (maze[y - 1][x] != 1  && maze[y - 1][x] != 3 ) {
					maze[y][x] = 3;
					x += 0;
					y -= 1;

					System.out.println("up");
					i++;
					extrad++;
				}
				
				
				
				// if can move right move right
				if (maze[y][x + 1] != 1  && maze[y][x + 1] != 3) {

					x += 1;
					y += 0;
					maze[y][x] = 2;

					System.out.println("right");
					i++;

				}
				// if can move down, then move down

				else if (maze[y + 1][x] != 1  && maze[y + 1][x] != 3) {

					x += 0;
					y += 1;
					maze[y][x] = 2;

					System.out.println("down");
					i++;
				}
				// if can move left, then move left
				else if (maze[y][x - 1] != 1  && maze[y][x - 1] != 3 ) {
					maze[y][x] = 3;
					x -= 1;
					y += 0;

					System.out.println("left");
					i++;
					extrad++;
				}
				// if can move up, then move up
				else if (maze[y - 1][x] != 1  && maze[y - 1][x] != 3 ) {
					maze[y][x] = 3;
					x += 0;
					y -= 1;

					System.out.println("up");
					i++;
					extrad++;
				}
				
				
				

				
				else {
					break;
				}
				
				
				
				
				
				
				
//				System.out.println();
//				GUI.print2dArray(maze);
//				Thread.sleep(500);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This maze is unsolvable(or its stupid):(");
		}
		final long timeElapsed = System.nanoTime() - startTime;
		System.out.println("execution time in nano seconds: "+ timeElapsed);
		System.out.println("The amount of moves made were: " + i);
		return maze;

	}

}
