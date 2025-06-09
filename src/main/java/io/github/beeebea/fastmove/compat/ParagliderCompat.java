package io.github.beeebea.fastmove.compat;


import tictim.paraglider.fabric.impl.PlayerMovementAccess;
import tictim.paraglider.impl.movement.PlayerMovement;

public class ParagliderCompat {
    public static void useParagliderStamina(int amount){
        var client = net.minecraft.client.MinecraftClient.getInstance();
        if(client.player != null) {
            PlayerMovement pm = ((PlayerMovementAccess) client.player).paragliderPlayerMovement();
            pm.stamina().takeStamina(amount,false,false);
        }
    }
    public static boolean hasParagliderStamina(){
        var client = net.minecraft.client.MinecraftClient.getInstance();
        if(client.player != null) {
            PlayerMovement pm = ((PlayerMovementAccess) client.player).paragliderPlayerMovement();
            return pm.stamina().stamina() >= 1;
        }
        return false;
    }
}
