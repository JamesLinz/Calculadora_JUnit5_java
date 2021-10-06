package calculadora;

public @interface CsvFileSource {

	int numLinesToSkip();

	String resources();

}
