package archive.app_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import archive.app_java.counter.CounterActivity;

public class MainActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button btn_counter = findViewById(R.id.btn_counter);
		btn_counter.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(MainActivity.this, CounterActivity.class);
				startActivity(intent);
			}
		});
	}
}