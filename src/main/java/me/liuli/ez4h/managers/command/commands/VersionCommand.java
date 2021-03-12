package me.liuli.ez4h.managers.command.commands;

import me.liuli.ez4h.EZ4H;
import me.liuli.ez4h.managers.command.CommandBase;
import me.liuli.ez4h.minecraft.Client;

public class VersionCommand implements CommandBase {
    @Override
    public String getCommandName() {
        return "version";
    }

    @Override
    public String getHelpMessage() {
        return "Show EZ4H version";
    }

    @Override
    public void exec(String[] args, Client client) {
        client.sendAlert("This proxy is running EZ4H v" + EZ4H.getVersion() + " for Minecraft: BE v" + EZ4H.getBedrockCodec().getMinecraftVersion() + " (Protocol" + EZ4H.getBedrockCodec().getProtocolVersion() + ')');
    }
}
