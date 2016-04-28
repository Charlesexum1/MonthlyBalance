/*
 * monthly.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;
public class MonthlyBalance {
	
	private int balance;
	private int month = 1;	
	private void setBalance(){
		Scanner keys = new Scanner(System.in);
		int counter = 0;
		int input;
		System.out.println("Please input a transaction.");
		while (counter <= 11) {
			input = keys.nextInt();			
			balance += input;
			counter++;
			System.out.println("your transaction for month: " + month + " is " + input);
			month++;
			}
		System.out.println("Your balance at the end of 12 months: " + balance);
		}
	
	public static void main (String args[]) {
		
		MonthlyBalance demo = new MonthlyBalance();
		demo.setBalance();
		
	}
}

