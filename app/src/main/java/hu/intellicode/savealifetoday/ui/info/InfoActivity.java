package hu.intellicode.savealifetoday.ui.info;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;

import hu.intellicode.savealifetoday.R;
import hu.intellicode.savealifetoday.ui.BaseActivity;


public class InfoActivity extends BaseActivity {
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		View view = getLayoutInflater().inflate(R.layout.activity_info, contentContainer, false);

		Toolbar toolbar = view.findViewById(R.id.toolbar);

		setSupportActionBar(toolbar);

		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		contentContainer.addView(view);
	}
}
