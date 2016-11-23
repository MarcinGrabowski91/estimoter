package eu.gitcode.estimoter.ui.main;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;

public class MainActivityContract {
    interface View extends MvpView {
    }

    interface Presenter extends MvpPresenter<View> {
    }
}