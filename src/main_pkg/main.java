package main_pkg;

import java.util.Scanner;
import main_pkg.validate;

public class main{

	public static void main(String[] args) {
	//�⺻ �帧 �����ϴ� ���� �Լ�
		validate();
		
		print_menu();
		
		Scanner pwd_scan = new Scanner(System.in);
		Scanner menu_scan = new Scanner(System.in);
		int menu_input = menu_scan.nextInt();
		
		if(menu_input == 1) {
			
		}else if(menu_input == 2) {
			
		}else if(menu_input == 3) {
			
		}else if(menu_input == 4) {
			
		}else if(menu_input == 5) {
			String pwd = pwd_scan.next();
			if(password(pwd) == true) {
				System.exit(0);
			}else {
				System.out.println("��й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
				print_menu();
			}
		}else if(menu_input == 6) {
			print_help();
		}else if(menu_input == 7) {
			String pwd = pwd_scan.next();
			if(password(pwd) == true) {
				validate();
			}else {
				System.out.println("��й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
			}
		}else {	
			System.out.println("�ش� ��ɾ�� �������� �ʽ��ϴ�.");
			print_menu();
		}
	}

	private static void validate() {
		
	}
	
	private static void print_menu() {
		System.out.println("------------------------------");
		System.out.println("              �޴�");
		System.out.println("------------------------------");
		System.out.println("1. �����ϱ�");
		System.out.println("2. ���� ��ȸ");
		System.out.println("3. ���� ���");
		System.out.println("4. ���� ����");
		System.out.println("5. ���α׷� ����");
		System.out.println("6. ���� ���");
		System.out.println("7. ���Ἲ �˻�\n");
		System.out.println("���Ͻô� ��ȣ�� �����ϼ���:");
		
		
	}
	
	private static boolean password(String pwd) {
		if(pwd == "1234") {
			return true;
		}else {
			return false;
		}
	}
	
	private static void print_help() {
		System.out.println("1. ���α׷� �ȳ�\n");
		System.out.println("- �������θ� ��Ǵ� ��������� ���� ���� ���α׷��Դϴ�.");
		
	}
}