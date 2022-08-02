package archive.app_java.counter;

import androidx.lifecycle.MutableLiveData;

import archive.app_java.BaseViewModel;

public class CounterViewModel extends BaseViewModel {
	private MutableLiveData<Integer> count;

	public CounterViewModel() {
		getCount().setValue(0);
	}

	public MutableLiveData<Integer> getCount() {
		if (count == null) count = new MutableLiveData<>();
		return count;
	}

	public void increaseCount() {
		getCount().setValue(getCount().getValue() + 1);
	}

	public void decreaseCount() {
		getCount().setValue(getCount().getValue() - 1);
	}
}
