package micdoodle8.mods.galacticraft.core.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class GCCoreContainerExtendedInventory extends Container
{
    public InventoryPlayer inventoryPlayer;
    public GCCoreInventoryExtended extendedInventory;

    public GCCoreContainerExtendedInventory(EntityPlayer thePlayer, GCCoreInventoryExtended extendedInventory)
    {
        this.inventoryPlayer = thePlayer.inventory;
        this.extendedInventory = extendedInventory;

        int i;
        int j;

        for (i = 0; i < 4; ++i)
        {
            this.addSlotToContainer(new GCCoreSlotArmor(thePlayer, thePlayer.inventory, thePlayer.inventory.getSizeInventory() - 1 - i, 61, 8 + i * 18, i));
        }

        for (i = 0; i < 3; ++i)
        {
            for (j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(thePlayer.inventory, j + (i + 1) * 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (i = 0; i < 9; ++i)
        {
            this.addSlotToContainer(new Slot(thePlayer.inventory, i, 8 + i * 18, 142));
        }

        this.addSlotToContainer(new GCCoreSlotPlayer(extendedInventory, 0, 106, 17));
        this.addSlotToContainer(new GCCoreSlotPlayer(extendedInventory, 1, 115, 35));
        this.addSlotToContainer(new GCCoreSlotPlayer(extendedInventory, 2, 106, 53));
        this.addSlotToContainer(new GCCoreSlotPlayer(extendedInventory, 3, 124, 53));
        this.addSlotToContainer(new GCCoreSlotPlayer(extendedInventory, 4, 124, 17));
    }

    @Override
    public boolean canInteractWith(EntityPlayer var1)
    {
        return true;
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotID)
    {
        return null;
    }
}
