package com.mumfrey.liteloader.client.overlays;

import net.minecraft.client.audio.SoundList;
import net.minecraft.util.ResourceLocation;

public interface ISoundHandler
{
    public abstract void addSound(ResourceLocation sound, SoundList soundList);
}
