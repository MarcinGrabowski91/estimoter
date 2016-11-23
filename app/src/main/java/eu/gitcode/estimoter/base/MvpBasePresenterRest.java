package eu.gitcode.estimoter.base;

import com.hannesdorfmann.mosby.mvp.MvpNullObjectBasePresenter;

import timber.log.Timber;

public class MvpBasePresenterRest<V extends MvpViewRest> extends MvpNullObjectBasePresenter<V> {

    public void handleHttpErrorResponse(Throwable throwable, String errorText) {
        Timber.d("%s:, %s", errorText, throwable.getLocalizedMessage());
        getView().showViewOnServerError();
    }
}
