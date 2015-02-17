package com.split;;
/**
 * @author vinay.pawar
 *
 */
public class DAO {
	
	private Divisional orignalDivisional;
	private Divisional currentDivisional;
	/**
	 * @param orignalDivisional
	 * @param currentDivisional
	 */
	public DAO(Divisional orignalDivisional, Divisional currentDivisional) {
		super();
		this.orignalDivisional = orignalDivisional;
		this.currentDivisional = currentDivisional;
	}
	/**
	 * @return the orignalDivisional
	 */
	public Divisional getOrignalDivisional() {
		return orignalDivisional;
	}
	/**
	 * @param orignalDivisional the orignalDivisional to set
	 */
	public void setOrignalDivisional(Divisional orignalDivisional) {
		this.orignalDivisional = orignalDivisional;
	}
	/**
	 * @return the currentDivisional
	 */
	public Divisional getCurrentDivisional() {
		return currentDivisional;
	}
	/**
	 * @param currentDivisional the currentDivisional to set
	 */
	public void setCurrentDivisional(Divisional currentDivisional) {
		this.currentDivisional = currentDivisional;
	}
}
