package archive.app_java.location;

import androidx.lifecycle.MutableLiveData;

import archive.app_java.BaseViewModel;

public class LocationViewModel extends BaseViewModel {
	private MutableLiveData<Double> latitude;
	private MutableLiveData<Double> longitude;
	private MutableLiveData<Double> altitude;
	private MutableLiveData<Float> accuracy;
	private MutableLiveData<Float> speed;
	private MutableLiveData<String> address;
	private MutableLiveData<String> updates;
	private MutableLiveData<String> sensor;

	public LocationViewModel() {
		getLatitude().setValue(0.0);
		getLongitude().setValue(0.0);
		getAltitude().setValue(0.0);
		getAccuracy().setValue(0.0F);
		getSpeed().setValue(0.0F);
		getAddress().setValue("");
	}

	public MutableLiveData<Double> getLatitude() {
		if (latitude == null) latitude = new MutableLiveData<>();
		return latitude;
	}

	public MutableLiveData<Double> getLongitude() {
		if (longitude == null) longitude = new MutableLiveData<>();
		return longitude;
	}

	public MutableLiveData<Double> getAltitude() {
		if (altitude == null) altitude = new MutableLiveData<>();
		return altitude;
	}

	public MutableLiveData<Float> getAccuracy() {
		if (accuracy == null) accuracy = new MutableLiveData<>();
		return accuracy;
	}

	public MutableLiveData<Float> getSpeed() {
		if (speed == null) speed = new MutableLiveData<>();
		return speed;
	}

	public MutableLiveData<String> getAddress() {
		if (address == null) address = new MutableLiveData<>();
		return address;
	}

	public MutableLiveData<String> getUpdates() {
		if (updates == null) updates = new MutableLiveData<>();
		return updates;
	}

	public MutableLiveData<String> getSensor() {
		if (sensor == null) sensor = new MutableLiveData<>();
		return sensor;
	}

	public void setUpdates(boolean bool) {
		getUpdates().setValue(bool ? "ON" : "OFF");
	}

	public void setSensor(boolean bool) {
		getSensor().setValue(bool ? "GPS Sensor" : "Cell Tower + WIFI");
	}
}
