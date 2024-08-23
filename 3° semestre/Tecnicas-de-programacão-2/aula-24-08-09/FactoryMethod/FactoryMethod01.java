// variante em JAVA

// classe base de veiculo
class Veiculo {
    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public void mostrarDetalhes() {
        System.out.println("Modelo: " + modelo);
    }
}

// subclasses de veiculo
class Carro extends Veiculo {
    public Carro(String modelo) {
        super(modelo);
    }
}

class Moto extends Veiculo {
    public Moto(String modelo) {
        super(modelo);
    }
}

class Barco extends Veiculo {
    public Barco(String modelo) {
        super(modelo);
    }
}

// fabrica abstrata de veiculos
abstract class FabricaDeVeiculos {
    public abstract Veiculo criarVeiculo(String modelo);
}


// fabrica concreta de carros
class FabricaDeCarros extends FabricaDeVeiculos{
    public Veiculo criarVeiculo(String modelo){
        return new Carro(modelo);
    }
}

// fabrica concreta de motos
class FabricaDeMotos extends FabricaDeVeiculos{
    public Veiculo criarVeiculo(String modelo){
        return new Moto(modelo);
    }
}
// fabrica concreta de barcos
class FabricaDeBarcos extends FabricaDeVeiculos{
    public Veiculo criarVeiculo(String modelo){
        return new Barco(modelo);
    }
}
// --------------------------- uso do Factory Method ------------------------------
public class FactoryMethod01{
    public static void main(String[] args){
        FabricaDeVeiculos fabricaDeCarros = new FabricaDeCarros();
        Veiculo carro1 = fabricaDeCarros.criarVeiculo("Sedan");
        Veiculo carro2 = fabricaDeCarros.criarVeiculo("Fusca 68");
        carro1.mostrarDetalhes();
        carro2.mostrarDetalhes();

        FabricaDeVeiculos fabricaDeMotos = new FabricaDeMotos();
        Veiculo moto = fabricaDeMotos.criarVeiculo("Esportiva");
        moto.mostrarDetalhes();

        FabricaDeVeiculos fabricaDeBarcos = new FabricaDeBarcos();
        Veiculo barco = fabricaDeBarcos.criarVeiculo("Lancha");
        barco.mostrarDetalhes();
    }
}