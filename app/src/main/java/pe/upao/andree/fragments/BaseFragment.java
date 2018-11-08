package pe.upao.andree.fragments;

import android.support.v4.app.Fragment;

import pe.upao.andree.events.EventObserver;
import pe.upao.andree.events.engine.FlipDownCardsEvent;
import pe.upao.andree.events.engine.GameWonEvent;
import pe.upao.andree.events.engine.HidePairCardsEvent;
import pe.upao.andree.events.ui.BackGameEvent;
import pe.upao.andree.events.ui.FlipCardEvent;
import pe.upao.andree.events.ui.NextGameEvent;
import pe.upao.andree.events.ui.ThemeSelectedEvent;
import pe.upao.andree.events.ui.DifficultySelectedEvent;
import pe.upao.andree.events.ui.StartEvent;

public class BaseFragment extends Fragment implements EventObserver {

	@Override
	public void onEvent(FlipCardEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(DifficultySelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(HidePairCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(FlipDownCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(StartEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ThemeSelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(GameWonEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(BackGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(NextGameEvent event) {
		throw new UnsupportedOperationException();
	}

}
