package trabalho;

public class TemperaturaFormat implements Format<Temperatura>{

	@Override
	public String formatter(Temperatura value) {
		String temperatura = new String();
		temperatura = value.temperatura + "°" + value.celsius;
		return temperatura;
	}

}
