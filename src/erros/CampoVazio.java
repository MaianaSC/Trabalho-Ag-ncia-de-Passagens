/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erros;

/**
 *
 * @author Arlon Felipe Scheidegger de Aguiar, Ramon de Souza Barbosa
 */
public class CampoVazio extends RuntimeException{
    public CampoVazio(){
        super("Favor Preencha Todos Os Campos!");
    }
}
