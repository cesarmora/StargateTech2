package stargatetech2.common;

import stargatetech2.api.StargateTechAPI;
import stargatetech2.common.util.StargateLogger;

public final class APIImplementation extends StargateTechAPI {
	private static final int VERSION_MAJOR	= 0;
	private static final int VERSION_MINOR	= 1;
	private static final int VERSION_MNT	= 0;
	private static final int VERSION_REV	= 3;
	private static final String API_STATUS	= "draft";
	
	public void enableExternalAccess(){
		StargateLogger.info("Enabling StargateTech2 API.");
		StargateLogger.info("API Version: " + getVersionString());
		apiInstance = this;
	}
	
	@Override
	public String getVersionString() {
		return VERSION_MAJOR + "." + VERSION_MINOR + "." + VERSION_MNT + "." + VERSION_REV + "-" + API_STATUS;
	}

	@Override
	public int[] getVersionNumbers() {
		return new int[]{VERSION_MAJOR, VERSION_MINOR, VERSION_MNT, VERSION_REV};
	}
}