/*
 * package Arith; import java.util.ArrayList; import java.util.HashMap; import
 * java.util.Iterator; import java.util.List; import java.util.Map; import
 * java.util.Map.Entry; import java.util.Set;
 * 
 * //create enum to specify own type of currency enum
 * money{Rupee,Dollar,Yen,Dinar,Euro} public class Enumdemo { //instance
 * variables int currency; String countryName; money currencyType; money
 * indianCurrency=money.Rupee; money usCurrency=money.Dollar; money
 * kuwiatCurrency=money.Dinar;
 * 
 * 
 * Currency(){} //constructor overloading Currency(money currencyType ) {
 * 
 * this.currencyType=currencyType; }
 * 
 * @Override public String toString() {
 * 
 * 
 * 
 * }
 * 
 * public static void main(String[] args) { Map<String,Currency>countries=new
 * HashMap<String,Currency>(); List<Country> countrylist=new
 * ArrayList<Country>(); countries.put("India", new Currency(money.Rupee));
 * countries.put("USA", new Currency(money.Dollar)); countries.put("Kuwiat", new
 * Currency(money.Dinar));
 * 
 * for(Map.Entry<String,Currency> country:countries.entrySet()) {
 * System.out.println(country.getKey()+country.getValue()); countrylist.add(new
 * Country(country.getKey(),country.getValue()));
 * 
 * }
 * 
 * 
 * } } }
 */