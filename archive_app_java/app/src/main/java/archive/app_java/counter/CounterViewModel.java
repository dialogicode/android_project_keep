package archive.app_java.counter;

import androidx.lifecycle.MutableLiveData;

import archive.app_java.BaseViewModel;

public class CounterViewModel extends BaseViewModel {
	public MutableLiveData<Integer> count = new MutableLiveData<>();

	public CounterViewModel() {
		count.setValue(0);
	}

	public void increaseCount() {
		count.setValue(count.getValue() + 1);
	}

	public void decreaseCount() {
		count.setValue(count.getValue() - 1);
	}
}
