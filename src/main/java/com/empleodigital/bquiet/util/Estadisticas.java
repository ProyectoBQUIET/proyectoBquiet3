package com.empleodigital.bquiet.util;

import java.util.ArrayList;

public class Estadisticas {
	
	//formato unixtime:valor
	public static String getStats(ArrayList<String> datos) {

		int max = 0;
		int min = 0;

		for(String x : datos) {
			String[] ar = x.split(":");
			int num = Integer.parseInt(ar[1]);
			if(num>max) max = num;
			if(num<max) min=num;
		}

		boolean mayor = false;
		boolean medio = false;
		boolean menor = false;

		//Segundos en cada tipo
		int smayor = 0;
		int smedio = 0;
		int smenor = 0;

		//Ultima fecha en unix
		int ufecha = 0;

		for(String x : datos) {
			String[] ar = x.split(":");
			int num = Integer.parseInt(ar[1]);
			int fecha = Integer.parseInt(ar[0]);


			if(num==max) {

				if(mayor && fecha>0) {

					int seconds1 = UnixTime.unixToSeconds(ufecha);
					int seconds2 = UnixTime.unixToSeconds(fecha);
					smayor += seconds2-seconds1;
					mayor = false;
					if(!medio) medio=true;

				} else {
					mayor = true;
				}

			}
			
			if(num==min) {

				if(menor && fecha>0) {

					int seconds1 = UnixTime.unixToSeconds(ufecha);
					int seconds2 = UnixTime.unixToSeconds(fecha);
					smenor += seconds2-seconds1;
					menor = false;
					if(!medio) medio=true;

				} else {
					menor = true;
				}

			}
			
			if(medio) {
				int seconds1 = UnixTime.unixToSeconds(ufecha);
				int seconds2 = UnixTime.unixToSeconds(fecha);
				smedio += seconds2-seconds1;
			}

			ufecha = Integer.parseInt(ar[0]);
		}

		smedio = smedio - (smayor + smenor);
		
		String json = "{\"registros\" : [{ \"rango\":\"alto\" , \"value\":x}, { \"rango\":\"medio\" , \"value\":y}, { \"rango\":\"bajo\" , \"value\":z}]}";
		json = json.replace("x", ""+smayor);
		json = json.replace("y", ""+smedio);
		json = json.replace("z", ""+smenor);
		System.out.println("Segundos mayor: " + smayor);
		System.out.println("Segundos medio: " + smedio);
		System.out.println("Segundos menor: " + smenor);
		return json;
	}

}
