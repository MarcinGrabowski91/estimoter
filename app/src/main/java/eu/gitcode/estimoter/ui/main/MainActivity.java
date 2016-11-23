package eu.gitcode.estimoter.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import eu.gitcode.estimoter.App;
import eu.gitcode.estimoter.R;
import eu.gitcode.estimoter.base.BaseMvpActivity;

public class MainActivity extends BaseMvpActivity<MainActivityContract.View, MainActivityContract.Presenter>
        implements MainActivityContract.View {
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, MainActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_activity);
        setUpToolbar();
    }

    @NonNull
    @Override
    public MainActivityContract.Presenter createPresenter() {
        return DaggerMainActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .build()
                .getMainActivityPresenter();
    }

    private void setUpToolbar() {
        toolbar.setTitle(R.string.welcome);
    }
}