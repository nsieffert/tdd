package com.MyTesting;

public class Main {

	public static void main(String[] args) {

		InPuts inputs1 = new InPuts();
		System.out.println("InputOne");
		inputs1.addItems(ShopItems.BOOK);
		inputs1.addItems(ShopItems.CHOCOLATEBAR);
		inputs1.addItems(ShopItems.MUSICCD);
		System.out.println("=========");

		InPuts inputs2 = new InPuts();
		System.out.println("InputTwo");
		inputs2.addItems(ShopItems.IMPORTCHOCOLATESMALL);
		inputs2.addItems(ShopItems.IMPORTPERFUMELARGE);
		System.out.println("=========");

		InPuts inputs3 = new InPuts();
		System.out.println("InputThree");
		inputs1.addItems(ShopItems.IMPORTPERFUMESMALL);
		inputs1.addItems(ShopItems.PERFUME);
		inputs1.addItems(ShopItems.HEADACHEPILLS);
		inputs1.addItems(ShopItems.IMPORTCHOCOLATELARGE);
		System.out.println("=========");

		CalcOutputPrice calc = new CalcOutputPrice();
		OutPuts outs1 = new OutPuts();
		System.out.println("OutPutOne");
		outs1.addItems(ShopItems.BOOK);
		outs1.addItems(ShopItems.CHOCOLATEBAR);
		outs1.addItems(ShopItems.MUSICCD);
		calc.totalOutPutPrice(outs1);
		System.out.println("==tax should be 1.50==");

		OutPuts outs2 = new OutPuts();
		System.out.println("OutPutTwo");
		outs2.addItems(ShopItems.IMPORTCHOCOLATESMALL);
		outs2.addItems(ShopItems.IMPORTPERFUMELARGE);
		calc.totalOutPutPrice(outs2);
		System.out.println("==tax should be 7.65==");

		OutPuts outs3 = new OutPuts();
		System.out.println("OutPutThree");
		outs3.addItems(ShopItems.IMPORTPERFUMESMALL);
		outs3.addItems(ShopItems.PERFUME);
		outs3.addItems(ShopItems.HEADACHEPILLS);
		outs3.addItems(ShopItems.IMPORTCHOCOLATELARGE);
		calc.totalOutPutPrice(outs3);
		System.out.println("==tax should be 6.70==");
	}
	}


