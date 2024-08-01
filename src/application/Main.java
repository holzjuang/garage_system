package application;

import entities.Car;
import entities.Client;
import entities.Parking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parking parking = new Parking();
        boolean menu = true;


        System.out.println("Garagem do seu Zé");

        while (menu) {
            System.out.println("Bem-vindo(a)!\n");
            System.out.println("1 - Listar clientes.");
            System.out.println("2 - Cadastrar cliente.");
            System.out.println("3 - Remover cliente.");
            System.out.println("4 - Encerrar.");

            System.out.print("Escolha umas das opções acima: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    parking.listClients();
                    break;
                case 2:
                    System.out.print("Nome: ");
                    String name = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Marca do carro: ");
                    String brand = sc.nextLine();
                    System.out.print("Modelo: ");
                    String model = sc.nextLine();
                    System.out.print("Ano: ");
                    int year = sc.nextInt();

                    Client client = new Client(name, cpf, new Car(brand, model, year));
                    parking.addNewClient(client);

                    System.out.println("\nCliente cadastrado com sucesso!");
                    break;
                case 3:



                    break;
                case 4:
                    menu = false;
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }


        sc.close();
    }
}
