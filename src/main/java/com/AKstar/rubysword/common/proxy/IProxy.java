package com.AKstar.rubysword.common.proxy;

import net.minecraftforge.eventbus.api.IEventBus;

public interface IProxy {
    void setup(IEventBus mod, IEventBus forge);
}
