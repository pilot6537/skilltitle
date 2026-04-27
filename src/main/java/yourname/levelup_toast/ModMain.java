package yourname.levelup_toast;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(ModMain.MOD_ID)
public class ModMain {
    public static final String MOD_ID = "levelup_toast";

    public ModMain() {
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }
}