package archive.app_java.counter;

import android.os.Bundle;
import android.view.View;

import archive.app_java.BaseActivity;
import archive.app_java.databinding.ActivityCounterBinding;

public class CounterActivity extends BaseActivity {
	private int count = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// set viewBinding & layout
		ActivityCounterBinding bind = ActivityCounterBinding.inflate(getLayoutInflater());
		setContentView(bind.getRoot());

		bind.countShow.setText(Integer.toString(count));

		bind.countPlus.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				count++;
				bind.countShow.setText(Integer.toString(count));
			}
		});

		bind.countMinus.setOnClickListener(v -> {
			count--;
			bind.countShow.setText(Integer.toString(count));
		});
	}
}