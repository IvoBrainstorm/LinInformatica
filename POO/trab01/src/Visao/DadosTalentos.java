package Visao;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Helia
 */
public class DadosTalentos implements Serializable,Comparable{
    private String titulo,categoria,data,estado;
    private int numeroBilhetes,codigo;

    public DadosTalentos() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

   

    public int getNumeroBilhetes() {
        return numeroBilhetes;
    }

    public void setNumeroBilhetes(int numeroBilhetes) {
        this.numeroBilhetes = numeroBilhetes;
    }
    
    
    
    
    
public void vender(int quant){
    if(numeroBilhetes>=quant)
         { this.numeroBilhetes-=quant;}
    else 
        JOptionPane.showMessageDialog(null, "impossivel efectuar a reservar");
    
}    
      
    

    @Override
    public int compareTo(Object t) {
             
        //comparar atraves de um inteiro{    ordem
        DadosTalentos outro = (DadosTalentos) t; //casting
     if (codigo <outro.codigo) return 1;
     if (codigo>outro.codigo) return -1;
        return 0;
    }

    
    

}