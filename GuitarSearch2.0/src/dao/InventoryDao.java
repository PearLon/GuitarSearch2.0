package dao;

import java.util.List;

import bean.Guitar;
import model.InventoryModel;

public interface InventoryDao {
	
	public InventoryModel search(String serialNumber)throws Exception;
	public List<Guitar> search2(String serialNumber)throws Exception;
}
