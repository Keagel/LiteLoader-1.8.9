package com.mumfrey.liteloader.client.ducks;

import java.util.Map;

public interface IRegistrySimple<K, V>
{
    public abstract Map<K, V> getRegistryObjects();
}
