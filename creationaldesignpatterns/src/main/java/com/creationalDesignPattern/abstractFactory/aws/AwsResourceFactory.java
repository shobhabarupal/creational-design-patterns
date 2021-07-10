package creationalDesignPattern.abstractFactory.aws;


import creationalDesignPattern.abstractFactory.Instance;
import creationalDesignPattern.abstractFactory.ResourceFactory;
import creationalDesignPattern.abstractFactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Instance.Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
