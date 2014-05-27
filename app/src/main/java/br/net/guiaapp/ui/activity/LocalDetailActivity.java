package br.net.guiaapp.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;

import br.net.guiaapp.R;
import br.net.guiaapp.ui.fragment.LocalDetailFragment;
import br.net.guiaapp.ui.fragment.LocalFragment;

/**
 * Created by thaleslima on 09/03/14.
 */
public class LocalDetailActivity extends ActionBarActivity {

    public static final String ARG_NAME_LOCAL = "nameLocal";
    public static final String ARG_ID_LOCAL = "idLocal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_detail);


        if (savedInstanceState == null) {

            int idLocal = getIntent().getIntExtra(ARG_ID_LOCAL, 0);

            Fragment fragment = new LocalDetailFragment();
            Bundle args = new Bundle();
            args.putInt(LocalFragment.ARG_ID_LOCAL, idLocal);
            fragment.setArguments(args);

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container_local_detail, fragment)
                    .commit();
        }
    }
}
