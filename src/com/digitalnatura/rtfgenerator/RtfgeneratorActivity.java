package com.digitalnatura.rtfgenerator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;

public class RtfgeneratorActivity extends Activity {

	String titulo = "TITULO MAYÚSCULA";
	String by = "by";
	String nome = "Xes García Santamarina";
	String direccion = "C/ Álvaro Cunqueiro nº2 8ºB";
	String cp = "A Coruña CP. 15008 Spain";
	String tf = "Tf. +34645657166";
	String email = "email: xesgarcia@gmail.com";

	String encabezamento = "EXT." + "FOREST" + "DAY";
	String fadein = "FADE IN" + ":";
	String descripcion = "DOROTHY, TIN MAN, SCARECROW and TOTO walk through a thick forest in the Land of Oz. Dorothy carries a basket, the Tin Man carries an axe and an oil can. The á é í ó ú Á É Í Ó Ú ñ Ñ ç Ç ü Ü ¿ ¡  ride branches and dead leaves. The Emerald City is seen far in the distance.";
	String personaje = "DOROTHY";
	String acotacion = "(perfecto xa esta)";
	String dialogo = "I wonder what we will do for the forest and kill a deer for you. You can roast it by the fire, since your tastes are so peculiar.";
	
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		cargarTemplate();
		
		
		
		
		generarString();
		
		
		

		try {
			escribirString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	


	private void escribirString() throws IOException {
		// TODO Auto-generated method stub
		 File newTextFile = new File(Environment.getExternalStorageDirectory()+"/"+"json.json");
	     FileWriter fw = new FileWriter(newTextFile);
	     fw.write(dialogo);
	     fw.close();
		
	}


	private void generarString() {
		// TODO Auto-generated method stub
		
	}


	private void cargarTemplate() {
		// TODO Auto-generated method stub
		
	}
}