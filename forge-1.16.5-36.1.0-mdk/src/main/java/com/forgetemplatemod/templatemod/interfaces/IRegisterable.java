package com.forgetemplatemod.templatemod.interfaces;

public interface IRegisterable<T> {
    void registerItemModel();
    void updateRegistryAndLocalizedName(String name);
}
