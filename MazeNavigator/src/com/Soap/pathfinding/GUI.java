package com.Soap.pathfinding;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {
	boolean click;
	JPanel panel;
	JFrame frame;
	JButton button;
	JLabel label;

	public GUI() {
		/*
		 * int xsize = 500; int ysize = 500; frame = new JFrame(); panel = new JPanel();
		 * 
		 * 
		 * 
		 * panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		 * panel.add(button); panel.add(label); frame.setSize(xsize, ysize);
		 * panel.setLayout(new GridLayout(5, 5)); frame.add(panel, BorderLayout.CENTER);
		 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setTitle("Maze");
		 * frame.setVisible(true);
		 */
	}
	public static int[][] generateMaze(int[][] maze) {
		Random rand = new Random();
		for(int x = 0; x < maze.length; x++) {
			maze[x][0] = 1;
			maze[x][maze.length-1] = 1;
			
			
		}
		for(int u = 0;u < maze.length; u++) {
			
			maze[0][u] = 1;
			maze[maze.length-1][u] = 1;
			
		}
		int i = 1;
		int y = 1;
		 
		for( y = 1;y <  maze.length-1;y++) {
		for( i = 1;i < maze.length-1;i++) {
			if(rand.nextInt(5) == 1) {
				maze[i][y] = 1;
				
			}
			else {
				maze[i][y] = 0;
			}
		}
			
		}
		maze[maze.length-2][maze.length-2] = 0;
		
		return maze;
	}
	public static void print2dArray(int[][] array) {
		 Arrays.stream(array).forEach((i) -> {
		        Arrays.stream(i).forEach((j) -> System.out.print(j + " "));
		        System.out.println();
		    });
	}

	public static void main(String[] args) throws InterruptedException {
		new GUI();
		int xsize = 20;
		int ysize = 20;
		int[][] maze = new int[xsize+2][ysize+2];
		
		maze = generateMaze(maze);
		print2dArray(maze);
		AI ai = new AI();
		
		int[][] newmaze = ai.traverseMaze(maze, xsize, ysize);
		print2dArray( newmaze);  
		
	
		
		
		
		
		
		
		
		
		
	}

	

}
