package com.lin.conditional.impl;

import com.lin.conditional.ListServer;

public class WindowsListServerImpl implements ListServer {
    @Override
    public String showCmd() {
        return "dir";
    }
}
