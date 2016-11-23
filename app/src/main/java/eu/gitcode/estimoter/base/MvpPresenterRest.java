package eu.gitcode.estimoter.base;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;

public interface MvpPresenterRest<V extends MvpView> extends MvpPresenter<V> {
    void handleHttpErrorResponse(Throwable throwable, String errorText);
}
