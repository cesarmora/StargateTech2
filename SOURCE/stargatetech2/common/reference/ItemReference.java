package stargatetech2.common.reference;

import java.util.ArrayList;

public class ItemReference {
	public static final ArrayList<String> ALL_ITEMS = new ArrayList<String>(10);
	
	public static final String TABLET_PC = "tabletPC";
	public static final String NAQUADAH_INGOT = "naquadahIngot";
	public static final String PERSONAL_SHIELD = "personalShield";
	
	static{
		ALL_ITEMS.add(TABLET_PC);
		ALL_ITEMS.add(NAQUADAH_INGOT);
		ALL_ITEMS.add(PERSONAL_SHIELD);
	}
}
