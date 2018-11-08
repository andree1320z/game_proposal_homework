package pe.upao.andree.events;

import pe.upao.andree.events.engine.FlipDownCardsEvent;
import pe.upao.andree.events.engine.GameWonEvent;
import pe.upao.andree.events.engine.HidePairCardsEvent;
import pe.upao.andree.events.ui.BackGameEvent;
import pe.upao.andree.events.ui.DifficultySelectedEvent;
import pe.upao.andree.events.ui.FlipCardEvent;
import pe.upao.andree.events.ui.NextGameEvent;
import pe.upao.andree.events.ui.StartEvent;
import pe.upao.andree.events.ui.ThemeSelectedEvent;


public interface EventObserver {

	void onEvent(FlipCardEvent event);

	void onEvent(DifficultySelectedEvent event);

	void onEvent(HidePairCardsEvent event);

	void onEvent(FlipDownCardsEvent event);

	void onEvent(StartEvent event);

	void onEvent(ThemeSelectedEvent event);

	void onEvent(GameWonEvent event);

	void onEvent(BackGameEvent event);

	void onEvent(NextGameEvent event);

}
