package eu.gitcode.estimoter.ui.main;

import dagger.Component;
import eu.gitcode.estimoter.dagger.components.AppComponent;
import eu.gitcode.estimoter.dagger.scopes.ActivityScope;

@ActivityScope
@Component(
        dependencies = {AppComponent.class}
)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);

    MainActivityPresenter getMainActivityPresenter();
}
