package company.sanchezz.realqueue.Views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import company.sanchezz.realqueue.R;

public class ListSelectionActivity extends AppCompatActivity {

    ArrayList<String> elementsAdded;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_selection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        String title = getIntent().getExtras().getString(getString(R.string.extra_title));
        assert title != null;
        toolbar.setTitle(getString(R.string.add_elements_to) + title);
        setSupportActionBar(toolbar);

        elementsAdded = new ArrayList<>();

    }

}
