public class Aluno {
    private String matricula;
    private String nome;
    private double nota;

    public Aluno(){

    }

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome(){
        return this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularMedia(double n1, double n2){
        return this.nota = (n1 + n2) / 2;
       
    }

    public double getMedia() {
        return this.nota; 
    }

    public String verificarAprovacao(){
        if (nota >= 7.0) {
            return "APROVADO";
        }else {
            return "REPROVADO";
        }
    }

    public void verificarMatricula(String matricula) {
        this.matricula = matricula;
        if (matricula.length() == 11) {
            System.out.println("Matrícula válida");
        } else {
            System.out.println("Matrícula inválida. Ela deve conter 11 caracteres");
            System.exit(0);  

            // Quando o método é void, ele não precisa retornar nada e pode usar System.exit(0) para terminar o programa imediatamente se a matrícula for inválida.
            // Então caso o tipo seja trocado para Strig, o código quebra, pois este metodo espera-se uma resposta. EX: return
        }
    }

    @Override
    public String toString(){
        
        return "A matrícula de número " + getMatricula() + 
        " pertence ao aluno " + getNome() + "\n" +
        "Sua situação se encontra " + verificarAprovacao() + 
        " com média de " + getMedia();
               
    }
}