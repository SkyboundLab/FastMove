package io.github.beeebea.fastmove.config;

import io.github.beeebea.fastmove.FastMove;
import io.wispforest.owo.config.Option;
import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;
import io.wispforest.owo.config.annotation.SectionHeader;
import io.wispforest.owo.config.annotation.Sync;

@Modmenu(modId = FastMove.MOD_ID)
@Config(name = "fastmove", wrapperName = "FMConfig")
public class FastMoveConfig {
    public FastMoveConfig() {

    }
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public boolean enableFastMove = true;
    @SectionHeader("diveRoll")
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public boolean diveRollEnabled = true;
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public int diveRollStaminaCost = 20;
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public double diveRollSpeedBoostMultiplier = 1;
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public int diveRollCoolDown = 0;
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public boolean diveRollWhenSwimming = false;
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public boolean diveRollWhenFlying = false;
    @SectionHeader("wallRun")
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public boolean wallRunEnabled = true;
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public int wallRunStaminaCost = 0;
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public double wallRunSpeedBoostMultiplier = 1;
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public int wallRunDurationTicks = 60;
    @SectionHeader("slide")
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public boolean slideEnabled = true;
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public int slideStaminaCost = 10;
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public double slideSpeedBoostMultiplier = 1;
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public int slideCoolDown = 0;
    @SectionHeader("compat")
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public boolean useCombatRoll = true;
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public boolean useParaglider = true;

}
