package archive.app_java.counter;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import archive.app_java.BaseActivity;
import archive.app_java.R;
import archive.app_java.databinding.ActivityCounterBinding;

public class CounterActivity extends BaseActivity {
	private CounterViewModel vm;
	private ActivityCounterBinding bind;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// set ViewModel
		vm = new ViewModelProvider(this).get(CounterViewModel.class);

		// set dataBinding & layout
		bind = DataBindingUtil.setContentView(this, R.layout.activity_counter);

		// set dataBinding LifeCycleOwner
		bind.setLifecycleOwner(this);

		// set dataBinding variable
		bind.setVm(vm);
	}
}
