package trabalho;

public class DisplayTemperatura extends Display<Temperatura> {
	private Temperatura temperatura;
	private Format<Temperatura> temperaturaFormatter;
	
	DisplayTemperatura(Temperatura temperatura, Format<Temperatura> temperaturaFormat){
		this.temperatura = temperatura;
		this.temperaturaFormatter = temperaturaFormat;
	}
	@Override
	void show() {
		System.out.println(temperaturaFormatter.formatter(temperatura));
	}
}
