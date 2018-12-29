package com.lin.conditional.impl;

import com.lin.conditional.ListServer;

public class LinuxListServerImpl implements ListServer {
    @Override
    public String showCmd() {
        return "ls";
    }
}
