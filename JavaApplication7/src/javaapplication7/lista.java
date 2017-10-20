/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Estudiantes
 */
public class lista {
    int c=3;
    Nodo cab [] = new Nodo[10];
            lista(){
                for(int i=0;i<10;i++){
                    cab[i] = null;
                 c=c+4;   
                }c=c+1;
            }
            void insertar(int n, int l){
                Nodo p,q,nv;
                nv = new Nodo(n);
                p=cab[l];
                c=c+3;
                if(p == null){
                    cab[l] = nv;
                    c=c+3;
                    return;
                }c=c+1;
                q = null;
                while(p!=null){
                    q = p;
                    p = p.sig;
                    c=c+3;
                }c=c+1;
                q.sig=nv;
            }
            int agrupar(int a[]){
                c=c+1;
                int i,j = 0;
                Nodo p;
                c=c+4;
                for(i=0;i<10;i++){
                    p = cab[i];
                    while(p!=null){
                        a[j] = p.dato;
                        j++;
                        p = p.sig;
                        c=c+6;
                    }
                    cab[i] = null;
                    c=c+1;
                    
                }
            return c;} 
}
