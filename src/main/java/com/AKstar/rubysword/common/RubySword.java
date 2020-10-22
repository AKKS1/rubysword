package com.AKstar.rubysword.common;

import com.AKstar.rubysword.client.proxy.ClientProxy;
import com.AKstar.rubysword.common.proxy.IProxy;
import com.AKstar.rubysword.server.proxy.ServerProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RubySword.ID)
public class RubySword {

    public static final String ID = "rubysword";

    public static final IProxy PROXY = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    public RubySword() {
        IEventBus mod = FMLJavaModLoadingContext.get().getModEventBus(),
            forge = MinecraftForge.EVENT_BUS;

        PROXY.setup(mod, forge );
    }
}
