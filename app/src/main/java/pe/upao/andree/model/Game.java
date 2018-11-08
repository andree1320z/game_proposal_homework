package pe.upao.andree.model;

import pe.upao.andree.themes.Theme;

/**
 * This is instance of active playing game
 * 
 * @author andree
 */
public class Game {

	/**
	 * The board configuration
	 */
	public BoardConfiguration boardConfiguration;

	/**
	 * The board arrangment
	 */
	public BoardArrangment boardArrangment;

	/**
	 * The selected theme
	 */
	public Theme theme;

	public GameState gameState;

}
