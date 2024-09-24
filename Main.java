import java.util.Scanner;

public class Main{
    public static void main(String[] args ) {
        Scanner leia = new Scanner(System.in);

        Aluno aluno1 = new Aluno(); // Instânciando o objeto na main
        System.out.println("Digite sua matricula");
        String matricula = leia.nextLine();
        aluno1.setMatricula(matricula); // Está setando os dados 
        aluno1.verificarMatricula(matricula);

        System.out.println("Digite seu nome");
        String nome = leia.nextLine();
        aluno1.setNome(nome);

        System.out.println("Digite a sua primeira nota: ");
        double n1 = leia.nextDouble();
        System.out.println("Digite a sua segunda nota: ");
        double n2 = leia.nextDouble();

        double media = aluno1.calcularMedia(n1, n2);
        aluno1.verificarMatricula(matricula);
        

        System.out.println(aluno1.toString()); 

        leia.nextLine(); // Usado para o Sistema ler a proxima linha após o nextDouble, nextInt e etc. 
//------------------------------------------------------------------------------
        
        Celular celularAtual = new Celular();

        System.out.println("Informe a marca do seu celular atual");
        String marca = leia.nextLine();
        celularAtual.setMarca(marca);

        System.out.println("Informe o modelo deste celular");
        String modelo = leia.nextLine();
        celularAtual.setModelo(modelo);

        System.out.println("Informe qual foi o preço da compra deste celular ");
        Double preco = leia.nextDouble();
        celularAtual.setPreco(preco);

        Celular celularNovo = new Celular();

        System.out.println("----Celulares top de linha---- ");
        System.out.println("1 [Apple - iPhone 15 Pro Max - R$ 8.354]");
        System.out.println("2 [Samsung - Samsung Galaxy S24 Ultra - R$ 6.999]");
        System.out.println("3 [Asus - ROG Phone 7 - R$ 4.952,36 + imposto]");
        System.out.println("4 [Xiaomi - Xiaomi 14 Ultra - R$ 4.909,10 + imposto]");
        System.out.println("5 [Motorola - Edge 50 Pro - R$ 3.000]");
        System.out.println("Selecione sua escolha digitando o número: ");
        int escolha = leia.nextInt();

        leia.nextLine();
        
        switch (escolha) {
            case 1:
                System.out.println("Você selecionou o iPhone 15 Pro Max");
                celularNovo.setMarca("Apple");
                celularNovo.setModelo("iPhone 15 Pro Max");
                celularNovo.setPreco(8354.00);
                break;
            case 2:
                System.out.println("Você selecionou o Samsung Galaxy S24 Ultra");
                celularNovo.setMarca("Samsung");
                celularNovo.setModelo("Samsung Galaxy S24 Ultra");
                celularNovo.setPreco(6999.00);
                break;
            case 3:
                System.out.println("Você selecionou o ROG Phone 7");
                celularNovo.setMarca("Asus");
                celularNovo.setModelo("ROG Phone 7");
                celularNovo.setPreco(4952.36);
                celularNovo.aplicarImposto(10); // Aplica imposto 
                break;
            case 4:
                System.out.println("Você selecionou o Xiaomi 14 Ultra");
                celularNovo.setMarca("Xiaomi");
                celularNovo.setModelo("Xiaomi 14 Ultra");
                celularNovo.setPreco(4909.10);
                celularNovo.aplicarImposto(8);
                break;
            case 5:
                System.out.println("Você selecionou o Edge 50 Pro");
                celularNovo.setMarca("Motorola");
                celularNovo.setModelo("Edge 50 Pro");
                celularNovo.setPreco(3000.00);
                break;
        }
        

        System.out.println("Deseja comparar o preço do seu antigo celular com o seu atual ?");
        String comparacao = leia.nextLine();


        if (comparacao.equalsIgnoreCase("sim") || comparacao.equalsIgnoreCase("yes")) {
            celularAtual.compararPreco(celularNovo);
        } else {
            System.out.println("Comparação não realizada.");
        }

        System.out.println("\n");
    
        System.out.println(celularAtual.toString());

        System.out.println("\n");
        
//----------------------------------------------------------------------------------------    
        
        Paciente paciente1 = new Paciente();

        System.out.println("Sistema de calculo de IMC");

        System.out.println("Informe o nome do paciente: ");
        String Nome = leia.nextLine();
        paciente1.setNome(nome);

        System.out.println("Informe a idade do paciente: ");
        int idade = leia.nextInt();
        paciente1.setIdade(idade);

        System.out.println("Informe o peso do paciente (kg): ");
        double peso = leia.nextDouble();
        paciente1.setPeso(peso);

        System.out.println("Informe a altura do paciente (m): ");
        double altura = leia.nextDouble();
        paciente1.setAltura(altura);

        // Calcular o IMC do paciente
        double IMC = paciente1.calcularIMC();
        System.out.println("O IMC do paciente é: " + IMC);

        String classificacaoIMC = paciente1.classificarIMC();
        System.out.println("Classificação do IMC: " + classificacaoIMC);

        System.out.println(paciente1.toString());
    }

}
