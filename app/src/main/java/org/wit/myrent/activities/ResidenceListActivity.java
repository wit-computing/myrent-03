package org.wit.myrent.activities;

import org.wit.myrent.R;
import org.wit.myrent.app.MyRentApp;
import org.wit.myrent.models.Portfolio;
import android.widget.ListView;
import android.app.Activity;
import android.os.Bundle;

public class ResidenceListActivity extends Activity
{
  private ListView listView;
  private Portfolio portfolio;

  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setTitle(R.string.app_name);
    setContentView(R.layout.activity_residencelist);

    listView = (ListView) findViewById(R.id.residenceList);

    MyRentApp app = (MyRentApp) getApplication();
    portfolio = app.portfolio;
  }
}