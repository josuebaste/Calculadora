package jarduera51;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class akieta {
	private static Connection conexioa() {
		/*
		Irudiko eskema duen datu basea emanda (atxikituta ere badago), 
		honako menua kontutan hartzen duen programa garatu,
		MVC modeloa jarraituta:
		1 - Jokalariak ikusi.
		2- Taldeak ikusi.
		3- Jokalari bat gehitu.
		4- Talde bat gehitu.
		5- Jokalaria erakutsi ID-a emanda.
		6- Taldea ikusi ID-a emanda.
		7- IRTEN.
		*/
		String url = "jdbc:mysql://localhost:3306/futbol";
		String username = "root";
		String password = "";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Konektatzen.");
		}
		catch (SQLException e) {
			System.out.println("Error" + e.getMessage());
		}
		return connection;
	}
	public static void main(String[]args) throws SQLException {
		int a;
		Scanner scan=new Scanner (System.in);
		do {
			System.out.println("Menua.");
			System.out.println("1- Jokalariak ikusi.");
			System.out.println("2- Taldeak ikusi.");
			System.out.println("3- Jokalari bat gehitu.");
			System.out.println("4- Talde bat gehitu.");
			System.out.println("5- Jokalaria erakutsi ID-a emanda.");
			System.out.println("6- Taldea ikusi ID-a emanda.");
			System.out.println("7- IRTEN.");
			a = Integer.parseInt(scan.nextLine());
			switch (a) {
			case 1:
				jokalarienZerrenda();
				break;
			case 2:
				taldeenZerrenda();
				break;
			case 3:
				jokalariBatSartu();
				break;
			case 4:
				taldeBatSartu();
				break;
			case 5:
				bilatuJokalariaIDarekin();
				break;
			case 6:
				bilatuTaldeaIDarekin();
				break;
			case 7:
				System.out.println("Agur.");
				break;
			default:
				break;
			}
		} while(a!=7);
	}
	private static void bilatuTaldeaIDarekin() {
		
	}
	private static void bilatuJokalariaIDarekin() {
		
	}
	private static void taldeBatSartu() {
		
	}
	private static void jokalariBatSartu() {
			
	}
	private static void taldeenZerrenda() throws SQLException {
		Connection zerrendatu = conexioa();
		Statement st = zerrendatu.createStatement();
		String contsultatu= "SELECT * FROM equipos WHERE 1";
		ResultSet resultSet = (ResultSet) st.executeQuery(contsultatu);
		Taldea taldea=new Taldea();
		while (resultSet.next()) {
			
		}
	}
	private static void jokalarienZerrenda()throws SQLException {
		Connection sartu = conexioa();
		Statement st = sartu.createStatement();
		String consulta= "SELECT * FROM futbolistas WHERE 1";
		ResultSet resultSet = (ResultSet) st.executeQuery(consulta);
		Jokalaria fut=new Jokalaria();
		while (resultSet.next()) {
			dni= resultSet.getInt("id");
			String izena = resultSet.getString("izena");
			String funtzioa = resultSet.getString("abizena");
			for (int i=0; i< funtzioak.split(",").length;i++) {
			funtzioak.add(funtzioa.split(",")[i]);
			}
		}
	}
}