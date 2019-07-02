package trabalho;

public class DisplayCalendario extends Display<Calendario> {
    	private Format<Calendario> data;
	private Calendario calendario;

	
	DisplayCalendario(Calendario calendario, Format<Calendario> data){
            	this.data = data;
		this.calendario = calendario;

	}
	
	@Override
	void show() {
		System.out.println("Dia" + " " + "Mês" + " " + "Ano");
		System.out.println(data.formatter(calendario));
		
	}

}
