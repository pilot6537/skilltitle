package yourname.levelup_toast;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ModMain.MOD_ID, value = Dist.CLIENT)
public class EventHandler {

    private static int tickCounter = 0;

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onTick(TickEvent.ClientTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;

        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) return;

        tickCounter++;

        if (tickCounter >= 200) {
            tickCounter = 0;
            mc.player.sendSystemMessage(Component.literal("\ue62d §aLevel Up!"));
        }
    }
}