package br.net.guiaapp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

import br.net.guiaapp.R;
import br.net.guiaapp.model.Local;

/**
 * Created by thaleslima on 20/10/13.
 */
public class LocalAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private List<Local> locals;

    public LocalAdapter(Context context, List<Local> locals) {

        this.locals = locals;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return locals.size();
    }

    @Override
    public Object getItem(int position) {
        return locals.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ItemList itemHolder;

        if (view == null) {
            view = mInflater.inflate(R.layout.list_item_local, null);

            itemHolder = new ItemList();
            itemHolder.tvLocalName = ((TextView) view.findViewById(R.id.tvLocalName));
            itemHolder.ivLogo = ((ImageView) view.findViewById(R.id.ivImage));
            itemHolder.rbRating = ((RatingBar) view.findViewById(R.id.rbRating));

            view.setTag(itemHolder);
        } else {
            itemHolder = (ItemList) view.getTag();
        }
        itemHolder.tvLocalName.setText(locals.get(position).Name);
        //itemHolder.ivLogo.setBackgroundColor(view.getResources().getColor(locals.get(position).logo));
        itemHolder.rbRating.setRating(locals.get(position).Rating);

        return view;
    }

    private class ItemList {
        TextView tvLocalName;
        ImageView ivLogo;
        RatingBar rbRating;
    }
}
