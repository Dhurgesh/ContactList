package sg.edu.rp.c346.contactslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contacts> alContactList;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.listViewContacts);
        alContactList = new ArrayList<>();
        Contacts c1 = new Contacts("Mary",65,65442334);
        Contacts c2 = new Contacts("Ken",65,97442437);

        alContactList.add(c1);
        alContactList.add(c2);

        caContact = new CustomAdapter(this,R.layout.contacts_item,alContactList);

        lvContact.setAdapter(caContact);

    }
}
