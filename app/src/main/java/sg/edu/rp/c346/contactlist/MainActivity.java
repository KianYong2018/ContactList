package sg.edu.rp.c346.contactlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Contact> arrayList;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        arrayList = new ArrayList<>();
        Contact item1 = new Contact("Mary",65,65442334);
        Contact item2 = new Contact("Ken",65,97442437);

        arrayList.add(item1);
        arrayList.add(item2);

        caContact = new CustomAdapter(this,R.layout.contacts_item,arrayList);

        listView.setAdapter(caContact);
    }
}