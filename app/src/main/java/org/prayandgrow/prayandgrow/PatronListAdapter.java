package org.prayandgrow.prayandgrow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mgarapich on 10.04.16.
 */
public class PatronListAdapter extends ArrayAdapter<Patron> {

    public PatronListAdapter(Context context, List<Patron> objects) {
        super(context, R.layout.patron_list_item, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.patron_list_item, parent, false);

        Patron patron = getItem(position);

        TextView name = (TextView)row.findViewById(R.id.patronName);
        name.setText(patron.getName());

        TextView reason = (TextView)row.findViewById(R.id.patronReason);
        reason.setText("dupa");

        return row;
    }
}
