package br.net.guiaapp.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.net.guiaapp.R;
import br.net.guiaapp.model.Local;
import br.net.guiaapp.ui.activity.LocalDetailActivity;
import br.net.guiaapp.ui.adapter.LocalAdapter;

/**
 * Created by thaleslima on 09/03/14.
 */
public class LocalFragment extends Fragment {
    public static final String ARG_ID_LOCAL = "idLocal";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_local, container, false);

        int idLocal = getArguments().getInt(ARG_ID_LOCAL, 0);

        List<Local> locals = new ArrayList<Local>();
        locals.add(new Local(1, "Pousada Rio Grande", 5f));
        locals.add(new Local(2, "Hotel JP", 2));
        locals.add(new Local(3, "Hotel Skalla", 3.5f));
        locals.add(new Local(4, "Camping Urbano Vila Delfinópolis", 1));

        ListView lvLocals = (ListView) rootView.findViewById(R.id.lvLocals);
        LocalAdapter localAdapter = new LocalAdapter(rootView.getContext(), locals);
        lvLocals.setAdapter(localAdapter);

        lvLocals.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent i = new Intent();
            i.setClass(view.getContext(), LocalDetailActivity.class);
            startActivity(i);
            }
        });

        return rootView;
    }
}
