package IA.ProbIA5;

import java.util.Arrays;

/**
 * Created by bejar on 17/01/17.
 */
public class ProbIA5Board {
    /* Class independent from AIMA classes
       - It has to implement the state of the problem and its operators
     *

    /* State data structure
        vector with the parity of the coins (we can assume 0 = heads, 1 = tails
     */

    private int [] board;
    private static int [] solution;

    /* Constructor */
    public ProbIA5Board(int []init, int[] goal) {

        board = new int[init.length];
        solution = new int[init.length];

        for (int i = 0; i< init.length; i++) {
            board[i] = init[i];
            solution[i] = goal[i];
        }

    }

    /* vvvvv TO COMPLETE vvvvv */
    public void flip_it(int i){
        board[i] ^= 1;
        board[i+1] ^= 1;
        // flip the coins i and i + 1
    }

    /* Heuristic function */
    public double heuristic(){
        int cnt = 0;
        for(int i = 0; i < board.length; ++i) if(board[i] != solution[i]) ++cnt;
        return cnt;
        // compute the number of coins out of place respect to solution
    }

     /* Goal test */
     public boolean is_goal(){
         return heuristic() < 0.5;
         // compute if board = solution

     }

     /* auxiliary functions */

     // Some functions will be needed for creating a copy of the state

    /* ^^^^^ TO COMPLETE ^^^^^ */
    public ProbIA5Board get_Copy() {
        return new ProbIA5Board(board, solution);
    }

    public int length() {
        return board.length;
    }
    
    public String board() {
        return Arrays.toString(board);
    }
}
