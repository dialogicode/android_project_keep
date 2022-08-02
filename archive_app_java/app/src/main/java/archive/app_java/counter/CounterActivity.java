package archive.app_java.counter;

import android.os.Bundle;
import android.view.View;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import archive.app_java.BaseActivity;
import archive.app_java.databinding.ActivityCounterBinding;

public class CounterActivity extends BaseActivity {
	private CounterViewModel vm;
	private ActivityCounterBinding bind;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// set ViewModel
		vm = new ViewModelProvider(this).get(CounterViewModel.class);

		// set viewBinding & layout
		bind = ActivityCounterBinding.inflate(getLayoutInflater());
		setContentView(bind.getRoot());

		vm.count.observe(this, new Observer<Integer>() {
			@Override
			public void onChanged(Integer integer) {
				bind.countShow.setText(Integer.toString(integer));
			}
		});

		bind.countPlus.setOnClickListener(this::click_listener_plus);
		bind.countMinus.setOnClickListener(this::click_listener_minus);
	}

	private void click_listener_plus(View view) {
		vm.increaseCount();
	}

	private void click_listener_minus(View view) {
		vm.decreaseCount();
	}
}
