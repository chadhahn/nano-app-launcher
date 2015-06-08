package com.example.chahn.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

  private static final Map<Integer, Integer> TOAST_MAP = new HashMap<>();

  static {
    TOAST_MAP.put(R.id.spotify_button, R.string.spotify_toast);
    TOAST_MAP.put(R.id.scores_button, R.string.scores_toast);
    TOAST_MAP.put(R.id.library_button, R.string.library_toast);
    TOAST_MAP.put(R.id.build_it_button, R.string.build_it_toast);
    TOAST_MAP.put(R.id.xyz_button, R.string.xyz_toast);
    TOAST_MAP.put(R.id.capstone_button, R.string.capstone_toast);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void mainButtonClick(View view) {
    Integer toastResourceId = TOAST_MAP.get(view.getId());
    String msg = getResources().getString(toastResourceId);
    Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
  }

}
