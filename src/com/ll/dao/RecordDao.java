package com.ll.dao;

import com.ll.entity.InStorageMerchandise;
import com.ll.entity.OutStorageMerchandise;

public interface RecordDao {
	public boolean outStorage(OutStorageMerchandise outStorageMerchandise);
	public boolean inStorage(InStorageMerchandise inStorageMerchandise);
}
