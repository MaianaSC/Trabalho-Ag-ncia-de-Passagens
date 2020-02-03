package paraisoTropical;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Maiana
 */
public class Passageiro extends Pessoa implements Serializable {
    private int numero;
    private String nome;
    private String cpf;
    private boolean ocupado = false;
    private String rg;
    private String dataNascimento;
    private String endereco;
    private String telefone;
    private String email;
    Date dataCadastro;
    
   public Passageiro(int assento, String nome,String cpf){
   
        this.numero=assento;
        this.nome= nome;
        this.cpf = cpf;
    }

    Passageiro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Date getDataCadastro(){
        return dataCadastro;
    }
    
    public void setDataCadastro(Date dataCadastro){
        this.dataCadastro = dataCadastro;
    }
    
    public void ocupar(){
        this.ocupado = true;
    }
    public boolean cadOcupada(){
        return ocupado;
    }
    public void setNumero(int x){
        this.numero=x;
    }
    public int getNumero(){
        return numero;
    }
   
    
    @Override
    public String salvar(){
          try{
            FileWriter fw = new FileWriter("clientes.txt", true); // se nao colocar o true toda vez que cadastrar um novo cliente ele vai sobreescrever o ja existente.
            //O true serve pra dizer que o novo conteudo sera acrescentado e nao substituido.
            
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Nome: " + this.nome);
            pw.println("CPF: " + this.cpf);
            pw.println("RG: " + this.rg);
            pw.println("Data de Nascimento: " + this.dataNascimento);
            pw.println("Endereco: " + this.endereco);
            pw.println("Telefone: " + this.telefone);
            pw.println("E-mail: " + this.email);
            pw.println("Data de Cadastro: " + this.dataCadastro);
            
            pw.println();
            
            pw.flush();
            pw.close();
            fw.close(); // fechando so o pw ja seria suficiente.
            
        }catch(IOException ex){
            Logger.getLogger(Passageiro.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return "Cadastrado com Sucesso!";
     }
}
