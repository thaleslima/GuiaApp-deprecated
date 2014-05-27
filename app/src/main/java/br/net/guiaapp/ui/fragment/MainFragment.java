package br.net.guiaapp.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import br.net.guiaapp.R;
import br.net.guiaapp.ui.activity.LocalActivity;

/**
 * Created by thaleslima on 09/03/14.
 */
public class MainFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        LinearLayout linearLayout = (LinearLayout) rootView.findViewById(R.id.option01);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(view.getContext(), LocalActivity.class);
                startActivity(i);
            }
        });


        LinearLayout linearLayout02 = (LinearLayout) rootView.findViewById(R.id.option02);
        linearLayout02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        LinearLayout linearLayout03 = (LinearLayout) rootView.findViewById(R.id.option03);
        linearLayout03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        LinearLayout linearLayout04 = (LinearLayout) rootView.findViewById(R.id.option04);
        linearLayout04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        LinearLayout linearLayout05 = (LinearLayout) rootView.findViewById(R.id.option05);
        linearLayout05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        return rootView;
    }
}
