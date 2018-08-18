package Controle;

import Visao.DadosTalentos;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FicheiroDados {
     public static ArrayList<DadosTalentos> array=new ArrayList<>();
    ////////nome do ficheiro
    static String ficheiro="Vendas.dat";

    
    
    
    
    
    
    public static void gravar(DadosTalentos f){
        ler();
        array.add(f);
        
        try{
            FileOutputStream meuFicheiro = new FileOutputStream(ficheiro); 
            ObjectOutputStream os = new ObjectOutputStream(meuFicheiro);

            os.writeObject(array);
            meuFicheiro.flush(); 
            meuFicheiro.close();
             os.flush(); 
             os.close(); 
             System.out.println("sucesso!"); 
             JOptionPane.showMessageDialog(null, "Sucesso!");
        } catch(Exception e) {
            e.printStackTrace( );   
        }
    }
      



    
      
      
      
      
      
      
      
    
    public static void ler(){
        try{
                FileInputStream fis = new FileInputStream(ficheiro);
                ObjectInputStream ois = new ObjectInputStream(fis);
                array = (ArrayList<DadosTalentos>) ois.readObject();
                ois.close();
        } catch(Exception e){
//                System.out.print("Ficheiro nao encontrado");
//                JOptionPane.showMessageDialog(null, "Ficheiro nao encontrado");
           }
    }
    
    
    
  
    
    
    
    
    
    
    
    public static int verificar(String titulo){   /////verifica a existencia do objecto passado como o parametro a serie
        
        for(int i =0;i<array.size();i++){

            if(array.get(i).getTitulo()==titulo){
                          return i;    
                        }
                     
                    } 
        return -1;
    }
    
   
  
    
    
    
    
    
    
    
    
       public static void editar(DadosTalentos c, int encontrado){
       int posicao=-1;
       
       ler();
           for(int i =0;i<FicheiroDados.array.size();i++){
                        if(FicheiroDados.array.get(i).getCodigo()==encontrado){
                          posicao= i;    
                        }
                     
                    }
           int codigo=c.getCodigo();
           int numeroBilhetes = c.getNumeroBilhetes();
               
                String titulo=c.getTitulo();
                String categoria=c.getCategoria();
                String data=c.getData();
      
           
          
        if(posicao!=-1){
            array.get(posicao).setCodigo(codigo);
           array.get(posicao).setNumeroBilhetes(numeroBilhetes);
           array.get(posicao).setTitulo(titulo);
           array.get(posicao).setCategoria(categoria);
           array.get(posicao).setData(data);
          
           
               
        }
           sv();
      
         }
        
       
            
    
       
       
       
       
       
       
       
       
       
    
    public static void sv(){
   
        try{
            FileOutputStream meuFicheiro = new FileOutputStream(ficheiro); 
            ObjectOutputStream os = new ObjectOutputStream(meuFicheiro);

            os.writeObject(array);
            meuFicheiro.flush(); 
            meuFicheiro.close();
             os.flush(); 
             os.close(); 
             System.out.println("Sucesso!"); 
             JOptionPane.showMessageDialog(null, "Sucesso!");
        } catch(Exception e) {
            e.printStackTrace( );
           
        }
        
        
    }    
    
    
    
    
    
    
    
    
    
    public static void eliminar(int n){
     ler();
    for(int i=0;i<array.size();i++){
     if(array.get(i).getCodigo()==n){
      System.out.println(n); 
 
    array.get(i).setEstado("nao");

        }
              }
       sv();  
          } 
          
          
         
    
    
  
    
    
    
    
       
          
          
          
          
          
          
     
  public static void main(String[] args) {
    
    
  }
  
  
}

