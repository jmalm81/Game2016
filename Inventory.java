import java.util.*;

public class Inventory{

	enum InventorySlot{HEAD, CHEST, LEGS, FEET, LHAND, RHAND};
	public List<Item> inventory = new ArrayList<Item>();
	public HashMap<InventorySlot, Item> equipped = new HashMap<InventorySlot, Item>();
	
	public Inventory(){
	}
	
	public void pickUp(){
		inventory.add(new Item());
	}
	public void drop(){}
	
	public void equip(InventorySlot slot, Item item){
		equipped.put(slot, item);
	}
	
	//public void unEquip(InventorySlot slot, Item item){
	//	if(equipped.contains(item)) equipped.remove(equipped.indexOf(item));
	//}
	
	public void listInventory(){
		for(Item i:inventory)
		System.out.println(i.toString());
	}
	public void listEquipped(){
		System.out.println(equipped.get(InventorySlot.HEAD));
		System.out.println(equipped.get(InventorySlot.HEAD));
		System.out.println(equipped.get(InventorySlot.HEAD));
		System.out.println(equipped.get(InventorySlot.HEAD));
		System.out.println(equipped.get(InventorySlot.HEAD));
	}

}