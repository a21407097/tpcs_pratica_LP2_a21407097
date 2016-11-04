/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpc1pratica;

class Cliente {

        String nome;
        String apelido;
        long nif;
        int numeroCliente;
        Morada morada;

        Cliente(String nome, String apelido, long nif, int numeroCliente, 
                Morada morada) {
            this.nome = nome;
            this.apelido = apelido;
            this.nif = nif;
            this.numeroCliente = numeroCliente;
            this.morada = morada;
        }

        public String imprimeCliente() {
            return "Nome: " + this.nome + "\n" + "Apelido: " + this.apelido + 
                    "\n" + "NIF: " + this.nif + "\n" + "Numero Cliente: " + 
                    this.numeroCliente + "\n" + this.morada.imprimeMorada()
                    + "\n";
        }
        
        boolean eClienteVIP(){
            if (numeroCliente < 100){
                return true;
            }
            else{
                return false;
            }
        }
    }

    class Morada {

        String rua;
        String localidade;
        String codigoPostal;
        String pais;

        Morada(String rua, String localidade, String codigoPostal, String pais) {
            this.rua = rua;
            this.localidade = localidade;
            this.codigoPostal = codigoPostal;
            this.pais = pais;
        }

        public String imprimeMorada() {
            return ("Rua: " + rua + "\n" + "Localidade: " + localidade + "\n" + "Codigo Postal: " +codigoPostal + "\n" + "País: " + pais);
        }
    }

public class tpc1pratica {

    public static void main(String[] args) {
        Morada moradaCliente1 = new Morada("Av. da Liberdade Av. da Liberdade nº310, 1º A", "Lisboa", "1200-000", "Portugal" );
        Cliente cliente1 = new Cliente ("Rui", "Barnabé", 0, 123, moradaCliente1);
        
        Morada moradaCliente2 = new Morada("Casal das Rudas nº 33","Arruda dos Vinhos", "2025-138", "Portugal");
        Cliente cliente2 = new Cliente ("João", "Pintas", 0, 21407097, moradaCliente2);
       
        Morada moradaCliente3 = new Morada("Casal das Cascas nº8","Santarém", "3000-123", "Portugal");
        Cliente cliente3 = new Cliente ("Pedro", "Correia", 0, 98, moradaCliente3);
        
        System.out.println(cliente1.imprimeCliente());
        System.out.println(cliente2.imprimeCliente());
        System.out.println(cliente3.imprimeCliente());
        
        System.out.println("\n");
        
        System.out.println(cliente1.eClienteVIP());
        System.out.println(cliente3.eClienteVIP());

    }

}
