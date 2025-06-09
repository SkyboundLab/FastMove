package io.github.beeebea.fastmove.mixin;


import io.github.beeebea.fastmove.IFastPlayer;
import io.github.beeebea.fastmove.MoveState;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BipedEntityModel.class)
public abstract class BipedEntityModelMixin {

    @Shadow public boolean sneaking;

    @Inject(method = "setAngles(Lnet/minecraft/entity/LivingEntity;FFFFF)V", at=@At("HEAD"), cancellable = true)
    private void fastmove_isInSneakingPose(LivingEntity livingEntity, float f, float g, float h, float i, float j, CallbackInfo ci){
        if(livingEntity instanceof PlayerEntity) {
            IFastPlayer fastPlayer = (IFastPlayer) livingEntity;
            if(fastPlayer != null){
                var moveState = fastPlayer.fastmove_getMoveState();
                if (moveState == MoveState.SLIDING ){
                    sneaking = false;
                }
            }
        }
    }
}
