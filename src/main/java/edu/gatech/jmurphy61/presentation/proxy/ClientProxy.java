package edu.gatech.jmurphy61.presentation.proxy;

import edu.gatech.jmurphy61.presentation.init.ModItems;

public class ClientProxy implements CommonProxy {
    @Override
    public void init() {
        ModItems.registerRenders();
    }
}
