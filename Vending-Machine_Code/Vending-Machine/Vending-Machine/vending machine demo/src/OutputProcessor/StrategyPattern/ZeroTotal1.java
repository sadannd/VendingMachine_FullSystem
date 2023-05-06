package OutputProcessor.StrategyPattern;

import DataStore.*;

//Strategy pattern
//Implements ZeroCF abstract class and used for Vending Machine1 and Vending Machine2

public class ZeroTotal1 implements ZeroTotal{
	private DataStore ds;
//	This class implemets ZeroCF
	@Override
	public DataStore getDataStore() {
		// TODO Auto-generated method stub
		return ds;
	}

	@Override
	public void setDataStore(DataStore ds) {
		// TODO Auto-generated method stub
		this.ds = ds;
	}

//	This method reads the value of cf from the datastore and sets it to 0
	
	@Override
	public void ZeroTotal() {
		// TODO Auto-generated method stub
		ds.setTotal(0);
//		System.out.println("CF set to 0");
	}

}
