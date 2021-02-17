package newhorizon.content;

import arc.graphics.Color;
import mindustry.ctype.ContentList;
import mindustry.type.Item;

public class NHItems implements ContentList{
	
	//Load Mod Items
	
	public static Item 
	presstanium, seniorProcessor, juniorProcessor,
	zeta, fusionEnergy, multipleSteel, irayrondPanel,
	setonAlloy, darkEnergy, upgradeSort, metalOxhydrigen,
	thermoCorePositive, thermoCoreNegative,
	emergencyReplace;
	
	@Override
	public void load(){
		emergencyReplace = new Item("emergency-replace", Color.valueOf("#BD0019")){
			@Override
			public boolean isHidden(){return true;}
		};
		thermoCorePositive = new Item("thermo-core-positive", Color.valueOf("CFFF87")){{
			explosiveness = 5f;
		}};
		thermoCoreNegative = new Item("thermo-core-negative", Color.valueOf("#7D95B2")){{
			explosiveness = 2f;
		}};
		presstanium = new Item("presstanium", Color.valueOf("6495ED"));
		seniorProcessor = new Item("processor-senior", Color.valueOf("FFFACD"));
		juniorProcessor = new Item("processor-junior", Color.valueOf("808080"));
		zeta = new Item("zeta", Color.valueOf("#FFAE87")){{
			hardness = 4;
		}};
		fusionEnergy = new Item("fusion-core-energy", Color.valueOf("ffe4b5")){{
			explosiveness = 3f;
		}};
		multipleSteel = new Item("multiple-steel", Color.valueOf("cedbe3"));
		irayrondPanel = new Item("irayrond-panel", Color.valueOf("E4F0FF"));
		setonAlloy = new Item("seton-alloy", Color.valueOf("#151C23")){{
		}};
		darkEnergy = new Item("dark-energy", Color.valueOf("#BE91FF")){{
			radioactivity = 25f;
			explosiveness = 10f;
		}};
		upgradeSort = new Item("upgradeSort", Color.valueOf("1D1E23"));
		metalOxhydrigen = new Item("metal-oxhydrigen", Color.valueOf("#BFF3FF"));
	}
	
}










