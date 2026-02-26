package com.example.encapsulamento;

public class Main {
    public static void main(String[]args){
        //String nome;
        //Int idade;

        //Nome = "Marta"
        //Idade  = 22;

        Cliente cliente1 = new Cliente("nicolas", 18);
        //cliente1.setNome("Marta");
        //cliente1.setIdade(22);

        Pet pet1 = new Pet("rb", 2, "pitbull", "pequeno", "racao");
        //pet1.setNome("Pinscher");
        //pet1.setIdade(3);

        Livro livro1 = new Livro("homem aranha", "daniel lima miranda", "45", 0);
        //livro1.setTitulo("Diario de um banana");
        //livro1.setPreco(100);

        Livro livro2 = new Livro("harry potter", "nobru", "300", 133);

        Funcionario funcionario1 = new Funcionario("Nicolas", "inspetor de calculos", 2000);
        //uncionario1,setNome("Nicolas");
        //funcionario1.setCargo("inspetor de calculos");
        //funcionario1.setSalario(2000);

        Aluno aluno1 = new Aluno("nicolas", "nicolas@gmail.com");
        System.out.println("Nome;" + aluno1.getNome());
        System.out.println("Email:" + aluno1.getEmail());


        System.out.println("nome: " + cliente1.getNome());
        System.out.println("idade: " + cliente1.getIdade());

        System.out.println("nome do pet: " + pet1.getNome());
        System.out.println("idade do pet: " + pet1.getIdade());
        System.out.println("raça do pet: " + pet1.getRaca());
        System.out.println("porte do pet: " + pet1.getPorte());
        System.out.println("alimentação do pet: " + pet1.getAlimentacao());

        System.out.println("titulo do livro: " + livro1.getTitulo());
        System.out.println("autor do livro: " + livro1.getAutor());
        System.out.println("numero de paginas do livro: " + livro1.getNumerodepaginas());
        System.out.println("preco do livro: " + livro1.getPreco());

        System.out.println("titulo do livro: " + livro2.getTitulo());
        System.out.println("autor do livro: " + livro2.getAutor());
        System.out.println("numero de paginas do livro: " + livro2.getNumerodepaginas());
        System.out.println("preco do livro: " + livro2.getPreco());


        System.out.println("nome do funcionario: " + funcionario1.getNome());
        System.out.println("cargo do funcionario: " + funcionario1.getCargo());
        System.out.println("salario do funcionario: " + funcionario1.getSalario());
    }

}
