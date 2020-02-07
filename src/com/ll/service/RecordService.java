package com.ll.service;

import com.ll.entity.InStorageMerchandise;
import com.ll.entity.OutStorageMerchandise;

public interface RecordService {
	public boolean outStorage(OutStorageMerchandise outStorageMerchandise);

	public boolean inStorage(InStorageMerchandise inStorageMerchandise);

}
