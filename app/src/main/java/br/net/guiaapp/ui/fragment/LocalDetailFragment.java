package br.net.guiaapp.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import br.net.guiaapp.R;

/**
 * Created by thaleslima on 09/03/14.
 */
public class LocalDetailFragment extends Fragment {
    public static final String ARG_ID_LOCAL = "idLocal";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_local_detail, container, false);

        return rootView;
    }
}
