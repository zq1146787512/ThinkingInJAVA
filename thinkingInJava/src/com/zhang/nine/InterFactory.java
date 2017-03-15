package com.zhang.nine;

interface Game{   boolean move();  }
interface GameFactory{   Game getGame();  }
class Checkers implements Game {
	private int moves=0;
	private static final int MOVES=3;
	
	@Override
	public boolean move() {
		System.out.println("Checkers move"+moves);
		return ++moves!=MOVES;
	}
	
}
class CheckersFactory implements GameFactory{

	@Override
	public Game getGame() {		
		return new Checkers();
	}
	
}
class Chess implements Game {
	private int moves=0;
	private static final int MOVES=4;
	
	@Override
	public boolean move() {
		System.out.println("Chess move"+moves);
		return ++moves!=MOVES;
	}
	
}

class ChessFactory implements GameFactory{

	@Override
	public Game getGame() {		
		return new Chess();
	}
	
}
public class InterFactory {
	public static void playGame(GameFactory gamefac){
		Game g=gamefac.getGame();
		while(g.move()){}
	}
	
	public static void playgame2(Game g){
		while(g.move()){}
	}
	public static void main(String[] args) {
		playGame(new CheckersFactory());
		playGame(new ChessFactory());//实现代码与结构的相分离？？？？没看出来
		System.out.println("********************");
		playgame2(new Checkers());
		playgame2(new Chess());
		
	}

}
