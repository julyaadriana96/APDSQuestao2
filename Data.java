import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Data {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Julia", "UFRN");
	
		 
		 LocalDate DataDeAdmissao6 = LocalDate.of( 2005, 8, 31);
		 LocalDate DataDeRecisão6 = LocalDate.of(2022, 10, 8);

		 Period periodo6 = Period.between(DataDeAdmissao6, DataDeRecisão6);
		 int days6 = periodo6.getDays();
		 int months6 = periodo6.getMonths();
		 int years6 = periodo6.getYears();
		 
		     
		System.out.println("Seu nome é: " + pessoa.getNome());	
		System.out.println("Sua empresa é " + pessoa.getEmpresas()); 
		System.out.println("calculando seu tempo de trabalho: "); 
		System.out.println(years6 + " ano(s), " + months6 + " mes(es) e " + days6 + " dia(s) ");
		
		System.out.println("-----------------------------");
		
		Pessoa pessoa1 = new Pessoa("Maria", "AMBEV");
		LocalDate DataDeAdmissao1 = LocalDate.of(2005, 8, 31);
		LocalDate DataDeRecisao1 = LocalDate.of(2022, 8, 31);
		
		Period periodo1 = Period.between(DataDeAdmissao1, DataDeRecisao1);
		int days1 = periodo1.getDays();
		int months1 = periodo1.getMonths();
		int years1 = periodo1.getYears();
		
		System.out.println("Seu nome é: " + pessoa1.getNome());	
		System.out.println("Sua empresa é " + pessoa1.getEmpresas()); 
		System.out.println("calculando seu tempo de trabalho"); 
		System.out.println(years1 + " ano(s), " + months1 + " mes(es) e " + days1 + " dia(s)");
		
		System.out.println("-----------------------------");
		
		Pessoa pessoa2 = new Pessoa("João", "GUARARAPES");
		LocalDate DataDeAdmissao2 = LocalDate.of(1989, 5, 26);
		LocalDate DataDeRecisao2 = LocalDate.of(2020, 10, 7);
		
		Period periodo2 = Period.between(DataDeAdmissao2, DataDeRecisao2);
		int days2 = periodo2.getDays();
		int months2 = periodo2.getMonths();
		int years2 = periodo2.getYears();
		
			System.out.println("Seu nome é: " + pessoa2.getNome());	
			System.out.println("Sua empresa é " + pessoa2.getEmpresas()); 
			System.out.println("calculando seu tempo de trabalho"); 
			System.out.println(years2 + " ano(s), " + months2 + " mes(es) e " + days2 + " dia(s)");
		
		System.out.println("-----------------------------");
		
		Pessoa pessoa3 = new Pessoa("Antônio", "COMPERVE");
		LocalDate DataDeAdmissao3 = LocalDate.of(2000, 1, 30);
		LocalDate DataDeRecisao3 = LocalDate.of(2016, 2, 28);
		
		Period periodo3 = Period.between(DataDeAdmissao3, DataDeRecisao3);
		int days3 = periodo3.getDays();
		int months3 = periodo3.getMonths();
		int years3 = periodo3.getYears();
		   
			System.out.println("Seu nome é: " + pessoa3.getNome());	
			System.out.println("Sua empresa é " + pessoa3.getEmpresas()); 
			System.out.println("calculando seu tempo de trabalho"); 
			System.out.println(years3 + " ano(s), " + months3 + " mes(es) e " + days3 + " dia(s)");
		
		System.out.println("-----------------------------");
		
		Pessoa pessoa4 = new Pessoa("José", "MARISA");
		LocalDate DataDeAdmissao4 = LocalDate.of(2022, 1, 20);
		LocalDate DataDeRecisao4 = LocalDate.of(2022, 10, 8);
		Period periodo4 = Period.between(DataDeAdmissao4, DataDeRecisao4);
		int days4 = periodo4.getDays();
		int months4 = periodo4.getMonths();
		int years4 = periodo4.getYears();
		   
		   
			System.out.println("Seu nome é: " + pessoa4.getNome());	
			System.out.println("Sua empresa é " + pessoa4.getEmpresas()); 
			System.out.println("calculando seu tempo de trabalho"); 
			System.out.println(years4 + " ano(s), " + months4 + " mes(es) e " + days4 + " dia(s)");

	
	}

		
		
		
		
	}


