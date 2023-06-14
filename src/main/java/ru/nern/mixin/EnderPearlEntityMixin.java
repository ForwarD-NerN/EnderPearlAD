package ru.nern.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(EnderPearlEntity.class)
public class EnderPearlEntityMixin
{
	@Redirect(method = "tick",
			at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;isAlive()Z"))
	private boolean isAlive(Entity owner) {
		return true;
	}
}
