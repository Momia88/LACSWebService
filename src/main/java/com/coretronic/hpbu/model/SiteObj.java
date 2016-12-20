package com.coretronic.hpbu.model;

import java.util.List;

public class SiteObj {
	String WSN;
	String SITE_STATE_KEY;
	String SITE_RESULT;
	String SITE_KEY;
	String RECORD_TIME;
	String MODEL_TYPE;

	
	public String getSITE_STATE_KEY() {
		return SITE_STATE_KEY;
	}
	public void setSITE_STATE_KEY(String sITE_STATE_KEY) {
		SITE_STATE_KEY = sITE_STATE_KEY;
	}
	public String getSITE_RESULT() {
		return SITE_RESULT;
	}
	public void setSITE_RESULT(String sITE_RESULT) {
		SITE_RESULT = sITE_RESULT;
	}
	public String getWSN() {
		return WSN;
	}
	public void setWSN(String wSN) {
		WSN = wSN;
	}
	public String getSITE_KEY() {
		return SITE_KEY;
	}
	public void setSITE_KEY(String sITE_KEY) {
		SITE_KEY = sITE_KEY;
	}
	public String getRECORD_TIME() {
		return RECORD_TIME;
	}
	public void setRECORD_TIME(String rECORD_TIME) {
		RECORD_TIME = rECORD_TIME;
	}
	public String getMODEL_TYPE() {
		return MODEL_TYPE;
	}
	public void setMODEL_TYPE(String mODEL_TYPE) {
		MODEL_TYPE = mODEL_TYPE;
	}
	
}
