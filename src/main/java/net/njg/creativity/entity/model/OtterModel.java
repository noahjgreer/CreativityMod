package net.njg.creativity.entity.model;
// Made with Blockbench 4.7.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.QuadrupedModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.njg.creativity.Creativity;
import net.njg.creativity.entity.custom.Otter;

public class OtterModel extends EntityModel<Otter> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Creativity.MOD_ID, "otter"), "main");
	private final ModelPart rightFrontLeg;
	private final ModelPart leftFrontLeg;
	private final ModelPart rightHindLeg;
	private final ModelPart leftHindLeg;
	private final ModelPart tail;
	private final ModelPart head;
	private final ModelPart torso;

	public OtterModel(ModelPart root) {
		this.rightFrontLeg = root.getChild("rightFrontLeg");
		this.leftFrontLeg = root.getChild("leftFrontLeg");
		this.rightHindLeg = root.getChild("rightHindLeg");
		this.leftHindLeg = root.getChild("leftHindLeg");
		this.tail = root.getChild("tail");
		this.head = root.getChild("head");
		this.torso = root.getChild("torso");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rightFrontLeg = partdefinition.addOrReplaceChild("rightFrontLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 23.0F, -5.9142F));

		PartDefinition cube_r1 = rightFrontLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(9, 16).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -0.625F, 0.0F, 0.7854F, 0.0F));

		PartDefinition leftFrontLeg = partdefinition.addOrReplaceChild("leftFrontLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 23.0F, -5.9142F));

		PartDefinition cube_r2 = leftFrontLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(9, 16).mirror().addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0F, -0.625F, 0.0F, -0.7854F, 0.0F));

		PartDefinition rightHindLeg = partdefinition.addOrReplaceChild("rightHindLeg", CubeListBuilder.create().texOffs(9, 16).mirror().addBox(-1.0F, -1.0F, -4.625F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-3.0F, 23.0F, 3.0F));

		PartDefinition leftHindLeg = partdefinition.addOrReplaceChild("leftHindLeg", CubeListBuilder.create().texOffs(9, 16).addBox(-1.0F, -1.0F, -4.125F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 23.0F, 2.5F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(1, 11).addBox(-2.0F, -1.5F, 0.25F, 4.0F, 3.0F, 11.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 4.125F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -2.0F, -1.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(3.0F, -2.0F, -1.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 26).addBox(-5.0F, -4.0F, -5.125F, 10.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -3.0F, -4.625F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(22, 1).addBox(-2.0F, -1.0F, -5.625F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.0F, -5.0F));

		PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 10).addBox(-2.5F, -2.0F, -5.75F, 5.0F, 4.0F, 11.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.5F, -0.875F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Otter entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.xRot = headPitch * ((float)Math.PI / 180F);
		this.head.yRot = netHeadYaw * ((float)Math.PI / 180F);
		this.rightHindLeg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.25F * limbSwingAmount;
		this.leftHindLeg.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.25F * limbSwingAmount;
		this.rightFrontLeg.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 0.75F * limbSwingAmount;
		this.leftFrontLeg.xRot = Mth.cos(limbSwing * 0.6662F) * 0.75F * limbSwingAmount;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		rightFrontLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftFrontLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightHindLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftHindLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}