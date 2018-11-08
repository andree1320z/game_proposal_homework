package pe.upao.andree.events;


/**
 * The event that is invoked from the low levels of this game (like engine) and
 * not from the ui.
 * 
 * @author andree
 */
public interface Event {

	String getType();
	
}
