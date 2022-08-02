package archive.app_java.counter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import archive.app_java.BaseActivity;
import archive.app_java.R;

public class CounterActivity extends BaseActivity {
	private int count = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_counter);

		TextView count_show = findViewById(R.id.count_show);
		Button count_plus = findViewById(R.id.count_plus);
		Button count_minus = findViewById(R.id.count_minus);

		count_show.setText(Integer.toString(count));

		count_plus.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				count++;
				count_show.setText(Integer.toString(count));
			}
		});

		count_minus.setOnClickListener(v -> {
			count--;
			count_show.setText(Integer.toString(count));
		});
	}
}