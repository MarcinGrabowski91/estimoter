package eu.gitcode.estimoter.ui.main;

import com.hannesdorfmann.mosby.mvp.MvpNullObjectBasePresenter;

import javax.inject.Inject;

import eu.gitcode.estimoter.dagger.scopes.ActivityScope;

@ActivityScope
public class MainActivityPresenter extends MvpNullObjectBasePresenter<MainActivityContract.View> implements MainActivityContract.Presenter {


    @Inject
    public MainActivityPresenter() {
    }
}