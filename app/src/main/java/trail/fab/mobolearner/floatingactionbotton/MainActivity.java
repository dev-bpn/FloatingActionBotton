package trail.fab.mobolearner.floatingactionbotton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @InjectView(R.id.toolbar)
    Toolbar toolbar;

    @InjectView(R.id.fab_menu)
    FloatingActionMenu floatingActionMenu;

    @InjectView(R.id.menu_item0)
    FloatingActionButton fab0;

    @InjectView(R.id.menu_item1)
    FloatingActionButton fab1;

    @InjectView(R.id.menu_item2)
    FloatingActionButton fab2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        setSupportActionBar(toolbar);

        floatingActionMenu.setOnClickListener(this);
        floatingActionMenu.setClosedOnTouchOutside(true);
        fab0.setOnClickListener(this);
        fab1.setOnClickListener(this);
        fab2.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

        floatingActionMenu.toggle(true);

        if (view.getId() == R.id.fab_menu) {

            Toast.makeText(this, "clicked fab_menu", Toast.LENGTH_SHORT).show();

        } else if (view.getId() == R.id.menu_item0) {

            Toast.makeText(this, "clicked menu_item0", Toast.LENGTH_SHORT).show();

        } else if (view.getId() == R.id.menu_item1) {

            Toast.makeText(this, "clicked menu_item1", Toast.LENGTH_SHORT).show();

        } else if (view.getId() == R.id.menu_item2) {

            Toast.makeText(this, "clicked menu_item2", Toast.LENGTH_SHORT).show();

        }

    }
}
