public class Celular {
    private String marca;
    private String modelo;
    private double preco;

    public Celular(){

    }

    public Celular(String marca, String modelo, Double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public Double getPreco(){
        return this.preco;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    // Metodos
    public void compararPreco(Celular outroCelular) {
    double margemErro = 0.001; // Margem para lidar com imprecisões de double

    if (Math.abs(this.preco - outroCelular.getPreco()) < margemErro) {
        System.out.println("Os dois celulares têm o mesmo preço.");
    } else if (this.preco > outroCelular.getPreco()) {
        System.out.println("O seu celular atual custou mais que o novo.");
    } else {
        System.out.println("O novo celular custa mais que o seu celular atual.");
    }
    }
   
    public void aplicarImposto(double Imposto) {
        if (Imposto > 0) {
            double valorImposto = this.preco * (Imposto / 100); // calcula o valor que está na main por 
            this.preco += valorImposto;
            System.out.println("Imposto de " + Imposto + "% aplicado. Preço final com imposto: R$ " + this.preco);
        }
    }
    


@Override    
    public String toString(){
        return "----Celular Atual----" + "\n" +
               "Marca: " + getMarca() + "\n" +
               "Modelo: " + getModelo() + "\n" +
               "Preço: " + getPreco();


    }
}

