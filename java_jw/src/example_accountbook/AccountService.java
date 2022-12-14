package example_accountbook;

import java.util.ArrayList;
import java.util.Scanner;

public interface AccountService {
			void insertItem(ArrayList<Item> list, Item item); //가계부에 있는 내역 리트스, 추가할 아이템
			void printItem(ArrayList<Item> list); // 가계부에 있는 내역 리스트
			boolean updateItem(ArrayList<Item> list, int index, Item item); // 가계부에 있는 내역 리스트, 몇 번지, 수정할 아이템
			boolean deleteItem(ArrayList<Item> list, int index); //가계부에 있는 내역 리스트, 몇 번지

			void printMenu();
			void runMenu(ArrayList<Item>list, int menu, Scanner sc);
}
