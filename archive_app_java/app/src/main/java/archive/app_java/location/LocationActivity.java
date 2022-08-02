package archive.app_java.location;

import android.os.Bundle;
import android.widget.CompoundButton;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import archive.app_java.BaseActivity;
import archive.app_java.R;
import archive.app_java.databinding.ActivityLocationBinding;

public class LocationActivity extends BaseActivity {
	private LocationViewModel vm;
	private ActivityLocationBinding bind;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		vm = new ViewModelProvider(this).get(LocationViewModel.class);
		bind = DataBindingUtil.setContentView(this, R.layout.activity_location);
		bind.setLifecycleOwner(this);
		bind.setVm(vm);

		vm.setUpdates(bind.updateSw.isChecked());
		vm.setSensor(bind.sensorSw.isChecked());

		bind.updateSw.setOnCheckedChangeListener(this::onCheckedChanged_updates);
		bind.sensorSw.setOnCheckedChangeListener(this::onCheckedChanged_sensor);
	}

	public void onCheckedChanged_updates(CompoundButton compoundButton, boolean bool) {
		vm.setUpdates(bool);
	}

	public void onCheckedChanged_sensor(CompoundButton compoundButton, boolean bool) {
		vm.setSensor(bool);
	}
}