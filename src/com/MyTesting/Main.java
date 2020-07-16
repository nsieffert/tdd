package com.MyTesting;

public class Main {

	public static void main(String[] args) {

		InPuts inputs = new InPuts();
		System.out.println("InputOne");
		inputs.addItems(ShopItems.BOOK);
		inputs.addItems(ShopItems.CHOCOLATEBAR);
		inputs.addItems(ShopItems.MUSICCD);
		System.out.println("=========");


		System.out.println("InputTwo");
		inputs.addItems(ShopItems.IMPORTCHOCOLATESMALL);
		inputs.addItems(ShopItems.IMPORTPERFUMELARGE);
		System.out.println("=========");


		System.out.println("InputThree");
		inputs.addItems(ShopItems.IMPORTPERFUMESMALL);
		inputs.addItems(ShopItems.PERFUME);
		inputs.addItems(ShopItems.HEADACHEPILLS);
		inputs.addItems(ShopItems.IMPORTCHOCOLATELARGE);
		System.out.println("=========");

		CalculatePrintOutputs calc = new CalculatePrintOutputs();
		OutPuts outs1 = new OutPuts();
		System.out.println("OutPutOne");
		outs1.addItems(ShopItems.BOOK);
		outs1.addItems(ShopItems.CHOCOLATEBAR);
		outs1.addItems(ShopItems.MUSICCD);
		calc.totalOutPutPrice(outs1);
		System.out.println("==tax should be 1.50==");
		System.out.println("=========");

		OutPuts outs2 = new OutPuts();
		System.out.println("OutPutTwo");
		outs2.addItems(ShopItems.IMPORTCHOCOLATESMALL);
		outs2.addItems(ShopItems.IMPORTPERFUMELARGE);
		calc.totalOutPutPrice(outs2);
		System.out.println("==tax should be 7.65==");
		System.out.println("=========");

		OutPuts outs3 = new OutPuts();
		System.out.println("OutPutThree");
		outs3.addItems(ShopItems.IMPORTPERFUMESMALL);
		outs3.addItems(ShopItems.PERFUME);
		outs3.addItems(ShopItems.HEADACHEPILLS);
		outs3.addItems(ShopItems.IMPORTCHOCOLATELARGE);
		calc.totalOutPutPrice(outs3);
		System.out.println("==tax should be 6.70==");
		System.out.println("=========");
	}
	}


