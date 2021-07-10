package creationalDesignPattern.abstractFactory.gcp;


import creationalDesignPattern.abstractFactory.Instance;
import creationalDesignPattern.abstractFactory.ResourceFactory;
import creationalDesignPattern.abstractFactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Instance.Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
