import java.util.ArrayList;
import java.util.List;

class Locadora {
    private String nome;
    private String endereco;
    private String telefone;
    private List<Carros> carros;
    private List<Cliente> clientes;
    private List<Emprestimo> emprestimos;

      public Locadora(String nome, String endereco, String telefone, List<Carros> carros, List<Cliente> cliente, List<Emprestimo> emprestimos) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.carros = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

      public String getNome() {
        return nome;
      }

      public void setNome(String nome) {
        this.nome = nome;
      }

      public String getEndereco() {
        return endereco;
      }

      public void setEndereco(String endereco) {
        this.endereco = endereco;
      }

      public String getTelefone() {
        return telefone;
      }

      public void setTelefone(String telefone) {
        this.telefone = telefone;
      }

      public List<Carros> getCarros() {
        return carros;
      }

      public void setCarros(List<Carros> carros) {
        this.carros = carros;
      }

      public List<Cliente> getCliente() {
        return clientes;
      }

      public void setCliente(List<Cliente> cliente) {
        this.clientes = cliente;
      }

      public List<Emprestimo> getEmprestimo() {
        return emprestimos;
      }

      public void setEmprestimo(List<Emprestimo> emprestimo) {
        this.emprestimos = emprestimo;
      }


      public void casdastrarCarro(Carros carro){
        carros.add(carro);
      }

      public void cadastrarClientes(Cliente cliente){
        clientes.add(cliente);
      }

      public void registrarEmprestimo(String placa, String nomeCliente){
        Carros carroSelecionado = null;
        Cliente clienteSelecionado = null;

        for (Carros carros : carros){
          if(carros.getPlaca().equalsIgnoreCase(placa)){
            carroSelecionado = carros;
            break;
          }
        }

        if (carroSelecionado == null){
          System.out.println("Carro não encontrado");
          return;
        }

        for (Cliente clientes : clientes){
          if(clientes.getNome().equalsIgnoreCase(nomeCliente)){
            clienteSelecionado = clientes;
            break;
          }
        }

        if(clienteSelecionado == null){
          System.out.println("Cliente não encontrado");
          return;
        }

        Emprestimo emprestimo = new Emprestimo(carroSelecionado, clienteSelecionado, 0);
        emprestimos.add(emprestimo);
        clienteSelecionado.registrarEmprestimo();
        carros.remove(carroSelecionado);

        System.out.println("Emprestimo realizado com sucesso");
      }


      public void finalizarEmprestimo(String placa, String nomeCliente){
        Emprestimo emprestimoSelecionado = null;

        for(Emprestimo emprestimo : emprestimos){
          if(emprestimo.getCarros().getPlaca().equalsIgnoreCase(placa) && emprestimo.getCliente().getNome().equalsIgnoreCase(nomeCliente)){
            emprestimoSelecionado = emprestimo;
            break;
          }
        }
        if (emprestimoSelecionado == null){
          System.out.println("Emprestimo não encontrado");
        }

        double valorTotal = emprestimoSelecionado.calcularValorTotal();
        System.out.println("Valor total do emprestimo é de R$" +valorTotal);

        Cliente cliente = emprestimoSelecionado.getCliente();
        cliente.finalizarEmprestimo();
        carros.add(emprestimoSelecionado.getCarros());
        emprestimos.remove(emprestimoSelecionado);
        
        System.out.println("Empretimo finalizado com sucesso");
      }

      public void renovarEmprestimo (String placa, String nomeCliente){
        Emprestimo emprestimoSelecionado = null;

        for(Emprestimo emprestimo : emprestimos){
          if(emprestimo.getCarros().getPlaca().equals(placa) && emprestimo.getCliente().getNome().equalsIgnoreCase(nomeCliente)){
            emprestimoSelecionado = emprestimo;
            break;
          }
        }

        if(emprestimoSelecionado == null){
          System.out.println("Emprestimo  não encontrado");
          return;
        }

        emprestimoSelecionado.renovar();
        System.out.println("Emprestimo renovado com sucesso");
      }
}