package sg.edu.rp.c346.contactlist;

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
 * Created by 16038975 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{
    Context parent_context;
    int layout_id;
    ArrayList<Contact> contacts;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Contact> objects){
        super(context, resource,objects);
        parent_context = context;
        layout_id = resource;
        contacts = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvNum = rowView.findViewById(R.id.textViewPhoneNum);
        TextView tvCode = rowView.findViewById(R.id.textViewCountryCode);

        Contact currentlist = contacts.get(position);
        String name = currentlist.getName();
        int cc = currentlist.getCode();
        int phone = currentlist.getNum();

        tvName.setText(name);
        tvNum.setText(String.valueOf(phone));
        tvCode.setText("+" + String.valueOf(cc));

        return rowView;
    }

}
