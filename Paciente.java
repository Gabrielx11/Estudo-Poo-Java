public class Paciente {
    
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Paciente(){

    }
    
    public Paciente(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public double calcularIMC() {   
        return peso / (altura * altura);
    }

    
    public String classificarIMC() {
        double imc = calcularIMC();

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 34.9) {
            return "Obesidade Grau I";
        } else if (imc >= 35 && imc < 39.9) {
            return "Obesidade Grau II";
        } else {
            return "Obesidade Grau III (mórbida)";
        }
    }

    
    @Override
    public String toString() {
        return "Paciente: " + nome + ", Idade: " + idade + " anos, Peso: " + peso + " kg "
        + "altura: " + altura;
    }
}
