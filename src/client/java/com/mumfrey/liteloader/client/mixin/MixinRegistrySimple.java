package com.mumfrey.liteloader.client.mixin;

import java.util.Map;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import com.mumfrey.liteloader.client.ducks.IRegistrySimple;

import net.minecraft.util.RegistrySimple;

@Mixin(RegistrySimple.class)
public abstract class MixinRegistrySimple<K, V> implements IRegistrySimple<K, V>
{
    @Shadow protected Map<K, V> registryObjects;
    
    @Override
    public Map<K, V> getRegistryObjects()
    {
        return this.registryObjects;
    }
}
