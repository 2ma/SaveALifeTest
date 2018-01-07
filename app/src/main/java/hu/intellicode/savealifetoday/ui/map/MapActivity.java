package hu.intellicode.savealifetoday.ui.map;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;

import hu.intellicode.savealifetoday.R;
import hu.intellicode.savealifetoday.ui.BaseActivity;


public class MapActivity extends BaseActivity {
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		View view = getLayoutInflater().inflate(R.layout.activity_map, contentContainer, false);

		Toolbar toolbar = view.findViewById(R.id.toolbar);

		setSupportActionBar(toolbar);

		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		contentContainer.addView(view);
	}
}
