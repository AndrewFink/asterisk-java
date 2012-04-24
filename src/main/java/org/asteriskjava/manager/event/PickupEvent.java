package org.asteriskjava.manager.event;

public class PickupEvent extends ManagerEvent {
	private String channel;
	private String targetChannel;


	public PickupEvent (Object source) {
		super(source);
	}


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	public String getChannel () {
		return channel;
	}


	public void setChannel (String channel) {
		this.channel = channel;
	}


	public String getTargetChannel () { return targetChannel;}

	public void setTargetChannel (String tch) { targetChannel = tch;}

}