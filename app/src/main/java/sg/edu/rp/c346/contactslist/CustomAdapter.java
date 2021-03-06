package sg.edu.rp.c346.contactslist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by 16033265 on 7/23/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context  parent_context;
    int layout_id;
    ArrayList<Contacts> contactList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Contacts> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        contactList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent,false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCc = rowView.findViewById(R.id.textViewCountryCode);
        TextView tvPhone = rowView.findViewById(R.id.textViewPhoneNum);

        Contacts currentItem = contactList.get(position);
        String name = currentItem.getName();
        String cc = currentItem.getCountryCode()+"";
        String phone = currentItem.getPhoneNum()+"";

        tvName.setText(name);
        tvCc.setText(cc);
        tvPhone.setText(phone);

        return rowView;

    }
}
