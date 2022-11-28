package exceptionhandling.program4;

import java.util.Scanner;

public class Test {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			Item[] items = new Item[3];

			items[0] = new Item();
			items[1] = new Item();
			items[2] = new Item();

			ItemBought[] itemBought = new ItemBought[3];

			itemBought[0] = new ItemBought();
			itemBought[1] = new ItemBought();
			itemBought[2] = new ItemBought();

			int no_of_items;
			int j = 0;
			int quant;
			int id;

			System.out.println("Enter items details");

			while (j < 3) {
				System.out.println("Item id");
				itemBought[j].setItemid(sc.nextInt());
				System.out.println("Item Name");
				items[j].setItem_name(sc.next());
				System.out.println("Item Price");
				items[j].setPrice(sc.nextInt());
				if (items[j].getPrice() == 0) {
					try {
						throw new ItemPurchaseLimitExceed("Price cannot be 0");
					} catch (ItemPurchaseLimitExceed e) {
						System.out.println(e.getMessage());
					}
				}
				System.out.println("Limit of purchase");
				items[j].setMaximum_no_of_item(sc.nextInt());
				if (items[j].getMaximum_no_of_item() == 0) {
					try {
						throw new ItemPurchaseLimitExceed("Limit cannot be 0");
					} catch (ItemPurchaseLimitExceed e) {
						System.out.println(e.getMessage());
					}
				}
				j++;
			}

			System.out.println("Enter how many items you have purchased");
			no_of_items = sc.nextInt();
			for (int i = 1; i <= no_of_items; i++) {
				System.out.println("Enter item id");
				id = sc.nextInt();
				System.out.println("Enter number of quantity");
				quant = sc.nextInt();
				if (itemBought[0].getItemid() == id) {
					if (items[0].getMaximum_no_of_item() < quant) {
						try {
							throw new ItemPurchaseLimitExceed("Limit of quantity is exceeded.");
						} catch (ItemPurchaseLimitExceed e) {
							System.out.println(e.getMessage());
						}
					}else {
						System.out.println("Item Id: "+itemBought[0].getItemid()+", Item Name: "+items[0].getItem_name()+","
								+ " Price: "+items[0].getPrice()+", limit of purchasing: "+items[0].getMaximum_no_of_item()+","
										+ " Total billing amount: "+(quant*items[0].getPrice()));
					}
				} else {
					if (itemBought[1].getItemid() == id) {
						if (items[1].getMaximum_no_of_item() < quant) {
							try {
								throw new ItemPurchaseLimitExceed("Limit of quantity is exceeded.");
							} catch (ItemPurchaseLimitExceed e) {
								System.out.println(e.getMessage());
							}
						}else {
							System.out.println("Item Id: "+itemBought[1].getItemid()+", Item Name: "+items[1].getItem_name()+","
									+ " Price: "+items[1].getPrice()+", limit of purchasing: "+items[1].getMaximum_no_of_item()+","
											+ " Total billing amount: "+(quant*items[1].getPrice()));
						}
					} else {
						if (items[2].getMaximum_no_of_item() < quant) {
							try {
								throw new ItemPurchaseLimitExceed("Limit of quantity is exceeded.");
							} catch (ItemPurchaseLimitExceed e) {
								System.out.println(e.getMessage());
							}
						}else {
							System.out.println("Item Id: "+itemBought[2].getItemid()+", Item Name: "+items[2].getItem_name()+","
									+ " Price: "+items[2].getPrice()+", limit of purchasing: "+items[2].getMaximum_no_of_item()+","
											+ " Total billing amount: "+(quant*items[2].getPrice()));
						}
					}
				}
			}
		}
}
}
