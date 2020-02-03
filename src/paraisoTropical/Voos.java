package paraisoTropical;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Calendar;
/**
 *
 * @author Maiana
 */
public class Voos implements Serializable{
    private String origem ;
    private String destino ;
    private String escala;
    private String horario;
    private String Data;
    private int assentos; //quantidade de assentos do voo
    public ArrayList<Passageiro> poltronas = new ArrayList<>(); //lista de poltronas com numero,
    //dados do passageiro e situaçao (ocupada ou livre) da poltrona
    
    
    public Voos(String origem , String destino ,String escala, String horario, String data, int assento){
        this.origem = origem;
        this.destino = destino;
        this.escala = escala;
        this.horario = horario;
        this.Data = data;
        this.assentos = assento;
        int i;
        for(i=0;i<assentos;i++){ //inicia as poltronas apenas com o numero de cada uma
            poltronas.add(new Passageiro(i,"",""));
        }
    }

    Voos() {
     
    }
    public Passageiro[] vagos(){ //retorna um vetor de passageiros com as poltronas vagas
        Passageiro[] vago = new Passageiro[qtdpoltronasVagas()];
        int i=0;
        for(Passageiro p: poltronas){
            if(!p.cadOcupada()){
                vago[i] = p;
                i++;
            }
        }
        return vago;
    }
    public int qtdpoltronasVagas(){ //retorna a quantidade de poltronas vagas
        int x = 0;
        for(Passageiro p : poltronas){
            if(!p.cadOcupada())
                x++;
        }
        return x;
    }
    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
      public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }


    public String getHorario() {
        return horario;
    }

    public void setHorario(String horaio) {
        this.horario = horaio;
    }
    public int getAssentos(){
        return assentos;
    }
    public double valor(String dest,String origem, String data, String horario){
        double valor =0;
        Calendar atual =  Calendar.getInstance();
        int diaAtual, mesAtual, anoAtual, diaViagem, mesViagem, anoViagem;
        int periodo, totalViagem, totalAtual, diaSemana;
        String day, month, year;
        anoAtual = (atual.getTime().getYear()-100) + 2000;
        mesAtual = atual.getTime().getMonth()+1;
        diaAtual = atual.getTime().getDate();

        day = data.substring(0, 2);
        month = data.substring(3,5);
        year = data.substring(6, 10);
        
        diaViagem = Integer.parseInt(day);
        mesViagem = Integer.parseInt(month);
        anoViagem = Integer.parseInt(year);
        
        
        
        
        
        atual.set(anoViagem, mesViagem-1, diaViagem);
        diaSemana = (atual.getTime().getDay());
        int dist;
        if("São Paulo".equals(origem) && "Belo Horizonte".equals(dest) )
        {
            dist = 305;
            totalAtual = ((mesAtual -1)*30 + diaAtual);
            totalViagem = ((mesViagem -1)*30 + diaViagem);
            periodo = totalViagem - totalAtual;
            
            if(periodo <= 3)    valor = (dist * 0.36) * 4.52;
            
            else if(periodo > 3 && periodo <= 6)    valor = (dist * 0.36) * 3.21;
            
            else if(periodo > 6 && periodo <= 10)    valor = (dist * 0.36) * 2.25;
            
            else if(periodo > 10 && periodo <= 15)    valor = (dist * 0.36) * 1.98;
            
            else if(periodo > 15 && periodo <= 20)    valor = (dist * 0.36) * 1.78;
            
            else if(periodo > 20 && periodo <= 30)    valor = (dist * 0.36) * 1.65;
            
            else    valor = (dist * 0.36) * 1.45;
            
            System.out.println(diaSemana);
            
            if (diaSemana == 0 || diaSemana == 6)
            {
                if((diaViagem==1 && mesViagem==1) || (diaViagem==30 && mesViagem==03) || ((diaViagem==01 || diaViagem==21) && mesViagem==04) || ((diaViagem==01 || diaViagem==31) && mesViagem==05) || (diaViagem==07 && mesViagem==9) || (diaViagem==12 && mesViagem==10) || ((diaViagem==02 || diaViagem==15) && mesViagem==11) || (diaViagem==25 && mesViagem==12))
                {
                    valor = valor * 3.56;
                    return valor;
                }
                
                valor *= 1.21;
            }
            else
            {
                if((diaViagem==1 && mesViagem==1) || (diaViagem==30 && mesViagem==03) || ((diaViagem==01 || diaViagem==21) && mesViagem==04) || ((diaViagem==01 || diaViagem==31) && mesViagem==05) || (diaViagem==07 && mesViagem==9) || (diaViagem==12 && mesViagem==10) || ((diaViagem==02 || diaViagem==15) && mesViagem==11) || (diaViagem==25 && mesViagem==12))
                {
                    valor = valor * 3.56;
                    return valor;
                }
            }
            
            return valor;
            //valor = (dist * 0.29);
        }
        
        else if("São Paulo".equals(origem) && "Brasília".equals(dest) )
        {
            dist = 541;
            totalAtual = ((mesAtual -1)*30 + diaAtual);
            totalViagem = ((mesViagem -1)*30 + diaViagem);
            periodo = totalViagem - totalAtual;
            
            if(periodo <= 3)    valor = (dist * 0.29) * 4.52;
            
            else if(periodo > 3 && periodo <= 6)    valor = (dist * 0.29) * 3.21;
            
            else if(periodo > 6 && periodo <= 10)    valor = (dist * 0.29) * 2.25;
            
            else if(periodo > 10 && periodo <= 15)    valor = (dist * 0.29) * 1.98;
            
            else if(periodo > 15 && periodo <= 20)    valor = (dist * 0.29) * 1.78;
            
            else if(periodo > 20 && periodo <= 30)    valor = (dist * 0.29) * 1.65;
            
            else    valor = (dist * 0.29) * 1.45;
            
            System.out.println(diaSemana);
            
            if (diaSemana == 0 || diaSemana == 6)
            {
                if((diaViagem==1 && mesViagem==1) || (diaViagem==30 && mesViagem==03) || ((diaViagem==01 || diaViagem==21) && mesViagem==04) || ((diaViagem==01 || diaViagem==31) && mesViagem==05) || (diaViagem==07 && mesViagem==9) || (diaViagem==12 && mesViagem==10) || ((diaViagem==02 || diaViagem==15) && mesViagem==11) || (diaViagem==25 && mesViagem==12))
                {
                    valor = valor * 3.56;
                    return valor;
                }
                
                valor *= 1.21;
            }
            else
            {
                if((diaViagem==1 && mesViagem==1) || (diaViagem==30 && mesViagem==03) || ((diaViagem==01 || diaViagem==21) && mesViagem==04) || ((diaViagem==01 || diaViagem==31) && mesViagem==05) || (diaViagem==07 && mesViagem==9) || (diaViagem==12 && mesViagem==10) || ((diaViagem==02 || diaViagem==15) && mesViagem==11) || (diaViagem==25 && mesViagem==12))
                {
                    valor = valor * 3.56;
                    return valor;
                }
            }
            
            return valor;
            //valor = (dist * 0.29);
        }
        
        else if("São Paulo".equals(origem) && "Fortaleza".equals(dest) )
        {
            dist = 464;
            totalAtual = ((mesAtual -1)*30 + diaAtual);
            totalViagem = ((mesViagem -1)*30 + diaViagem);
            periodo = totalViagem - totalAtual;
            
            if(periodo <= 3)    valor = (dist * 0.36) * 4.52;
            
            else if(periodo > 3 && periodo <= 6)    valor = (dist * 0.36) * 3.21;
            
            else if(periodo > 6 && periodo <= 10)    valor = (dist * 0.36) * 2.25;
            
            else if(periodo > 10 && periodo <= 15)    valor = (dist * 0.36) * 1.98;
            
            else if(periodo > 15 && periodo <= 20)    valor = (dist * 0.36) * 1.78;
            
            else if(periodo > 20 && periodo <= 30)    valor = (dist * 0.36) * 1.65;
            
            else    valor = (dist * 0.36) * 1.45;
            
            System.out.println(diaSemana);
            
            if (diaSemana == 0 || diaSemana == 6)
            {
                if((diaViagem==1 && mesViagem==1) || (diaViagem==30 && mesViagem==03) || ((diaViagem==01 || diaViagem==21) && mesViagem==04) || ((diaViagem==01 || diaViagem==31) && mesViagem==05) || (diaViagem==07 && mesViagem==9) || (diaViagem==12 && mesViagem==10) || ((diaViagem==02 || diaViagem==15) && mesViagem==11) || (diaViagem==25 && mesViagem==12))
                {
                    valor = valor * 3.56;
                    return valor;
                }
                
                valor *= 1.21;
            }
            else
            {
                if((diaViagem==1 && mesViagem==1) || (diaViagem==30 && mesViagem==03) || ((diaViagem==01 || diaViagem==21) && mesViagem==04) || ((diaViagem==01 || diaViagem==31) && mesViagem==05) || (diaViagem==07 && mesViagem==9) || (diaViagem==12 && mesViagem==10) || ((diaViagem==02 || diaViagem==15) && mesViagem==11) || (diaViagem==25 && mesViagem==12))
                {
                    valor = valor * 3.56;
                    return valor;
                }
            }
            
            return valor;
            //valor = (dist * 0.29);
        }
        
        else if("São Paulo".equals(origem) && "Vitória".equals(dest) )
        {
            dist = 464;
            totalAtual = ((mesAtual -1)*30 + diaAtual);
            totalViagem = ((mesViagem -1)*30 + diaViagem);
            periodo = totalViagem - totalAtual;
            
            if(periodo <= 3)    valor = (dist * 0.36) * 4.52;
            
            else if(periodo > 3 && periodo <= 6)    valor = (dist * 0.36) * 3.21;
            
            else if(periodo > 6 && periodo <= 10)    valor = (dist * 0.36) * 2.25;
            
            else if(periodo > 10 && periodo <= 15)    valor = (dist * 0.36) * 1.98;
            
            else if(periodo > 15 && periodo <= 20)    valor = (dist * 0.36) * 1.78;
            
            else if(periodo > 20 && periodo <= 30)    valor = (dist * 0.36) * 1.65;
            
            else    valor = (dist * 0.36) * 1.45;
            
            System.out.println(diaSemana);
            
            if (diaSemana == 0 || diaSemana == 6)
            {
                if((diaViagem==1 && mesViagem==1) || (diaViagem==30 && mesViagem==03) || ((diaViagem==01 || diaViagem==21) && mesViagem==04) || ((diaViagem==01 || diaViagem==31) && mesViagem==05) || (diaViagem==07 && mesViagem==9) || (diaViagem==12 && mesViagem==10) || ((diaViagem==02 || diaViagem==15) && mesViagem==11) || (diaViagem==25 && mesViagem==12))
                {
                    valor = valor * 3.56;
                    return valor;
                }
                
                valor *= 1.21;
            }
            else
            {
                if((diaViagem==1 && mesViagem==1) || (diaViagem==30 && mesViagem==03) || ((diaViagem==01 || diaViagem==21) && mesViagem==04) || ((diaViagem==01 || diaViagem==31) && mesViagem==05) || (diaViagem==07 && mesViagem==9) || (diaViagem==12 && mesViagem==10) || ((diaViagem==02 || diaViagem==15) && mesViagem==11) || (diaViagem==25 && mesViagem==12))
                {
                    valor = valor * 3.56;
                    return valor;
                }
            }
            
            return valor;
            //valor = (dist * 0.29);
        }
        
        else if("Florianópolis".equals(origem) && "São Paulo".equals(dest) )
        {
            dist = 304;
            totalAtual = ((mesAtual -1)*30 + diaAtual);
            totalViagem = ((mesViagem -1)*30 + diaViagem);
            periodo = totalViagem - totalAtual;
            
            if(periodo <= 3)    valor = (dist * 0.36) * 4.52;
            
            else if(periodo > 3 && periodo <= 6)    valor = (dist * 0.36) * 3.21;
            
            else if(periodo > 6 && periodo <= 10)    valor = (dist * 0.36) * 2.25;
            
            else if(periodo > 10 && periodo <= 15)    valor = (dist * 0.36) * 1.98;
            
            else if(periodo > 15 && periodo <= 20)    valor = (dist * 0.36) * 1.78;
            
            else if(periodo > 20 && periodo <= 30)    valor = (dist * 0.36) * 1.65;
            
            else    valor = (dist * 0.36) * 1.45;
            
            System.out.println(diaSemana);
            
            if (diaSemana == 0 || diaSemana == 6)
            {
                if((diaViagem==1 && mesViagem==1) || (diaViagem==30 && mesViagem==03) || ((diaViagem==01 || diaViagem==21) && mesViagem==04) || ((diaViagem==01 || diaViagem==31) && mesViagem==05) || (diaViagem==07 && mesViagem==9) || (diaViagem==12 && mesViagem==10) || ((diaViagem==02 || diaViagem==15) && mesViagem==11) || (diaViagem==25 && mesViagem==12))
                {
                    valor = valor * 3.56;
                    return valor;
                }
                
                valor *= 1.21;
            }
            else
            {
                if((diaViagem==1 && mesViagem==1) || (diaViagem==30 && mesViagem==03) || ((diaViagem==01 || diaViagem==21) && mesViagem==04) || ((diaViagem==01 || diaViagem==31) && mesViagem==05) || (diaViagem==07 && mesViagem==9) || (diaViagem==12 && mesViagem==10) || ((diaViagem==02 || diaViagem==15) && mesViagem==11) || (diaViagem==25 && mesViagem==12))
                {
                    valor = valor * 3.56;
                    return valor;
                }
            }
            
            return valor;
            //valor = (dist * 0.29);
        }
        
        else if("Florianópolis".equals(origem) && "Brasília".equals(dest) )
        {
            dist = 816;
            totalAtual = ((mesAtual -1)*30 + diaAtual);
            totalViagem = ((mesViagem -1)*30 + diaViagem);
            periodo = totalViagem - totalAtual;
            
            if(periodo <= 3)    valor = (dist * 0.25) * 4.52;
            
            else if(periodo > 3 && periodo <= 6)    valor = (dist * 0.25) * 3.21;
            
            else if(periodo > 6 && periodo <= 10)    valor = (dist * 0.25) * 2.25;
            
            else if(periodo > 10 && periodo <= 15)    valor = (dist * 0.25) * 1.98;
            
            else if(periodo > 15 && periodo <= 20)    valor = (dist * 0.25) * 1.78;
            
            else if(periodo > 20 && periodo <= 30)    valor = (dist * 0.25) * 1.65;
            
            else    valor = (dist * 0.25) * 1.45;
            
            System.out.println(diaSemana);
            
            if (diaSemana == 0 || diaSemana == 6)
            {
                if((diaViagem==1 && mesViagem==1) || (diaViagem==30 && mesViagem==03) || ((diaViagem==01 || diaViagem==21) && mesViagem==04) || ((diaViagem==01 || diaViagem==31) && mesViagem==05) || (diaViagem==07 && mesViagem==9) || (diaViagem==12 && mesViagem==10) || ((diaViagem==02 || diaViagem==15) && mesViagem==11) || (diaViagem==25 && mesViagem==12))
                {
                    valor = valor * 3.56;
                    return valor;
                }
                
                valor *= 1.21;
            }
            else
            {
                if((diaViagem==1 && mesViagem==1) || (diaViagem==30 && mesViagem==03) || ((diaViagem==01 || diaViagem==21) && mesViagem==04) || ((diaViagem==01 || diaViagem==31) && mesViagem==05) || (diaViagem==07 && mesViagem==9) || (diaViagem==12 && mesViagem==10) || ((diaViagem==02 || diaViagem==15) && mesViagem==11) || (diaViagem==25 && mesViagem==12))
                {
                    valor = valor * 3.56;
                    return valor;
                }
            }
            
            return valor;
            //valor = (dist * 0.29);
        }
        
        return valor ;
    }

}
