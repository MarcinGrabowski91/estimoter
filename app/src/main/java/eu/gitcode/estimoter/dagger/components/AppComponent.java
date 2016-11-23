package eu.gitcode.estimoter.dagger.components;

import javax.inject.Singleton;

import dagger.Component;
import eu.gitcode.estimoter.dagger.modules.AppModule;

@Singleton
@Component(
        modules = {AppModule.class}
)
public interface AppComponent {

}
