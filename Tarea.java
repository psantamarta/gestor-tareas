/**
 * Las tareas tienen una descripcion y pueden estar completadas o no.
 * Además también tienen una prioridad, que puede ser de 1 (prioridad maxima) a 5
 * (prioridad minima)
 */ 
public class Tarea
{
    private String descripcion;
    private boolean estaCompletada;
    private int prioridad;
    private int dia;
    private int mes;
    private int ano;
    private boolean conFechaFijada;
    
    
    public Tarea(String textoDescripcion) {
        descripcion = textoDescripcion;
        estaCompletada = false;
        prioridad = 5;
        dia = 0;
        mes = 0;
        ano = 0;
        conFechaFijada = false;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public boolean getEstaCompletada() {
        return estaCompletada;
    }
    
    public int getPrioridad(){
        return prioridad;
    }
    
    public void marcarComoCompletada() {
        estaCompletada = true;
    }
    
    public void setPrioridad(int nuevaPrioridad){
        if (nuevaPrioridad >= 1 && nuevaPrioridad <= 5) {
            prioridad = nuevaPrioridad;
        }        
    }
    
    public void setFechaVencimiento(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        conFechaFijada = true;
    }
    
    /** 
     * Devuelve la cadena vacia si la tarea no tiene fecha de 
     * vencimiento o un texto incluyendo la fecha de vencimiento
     * en caso de que si la tenga
     */
    public String getFechaVencimiento() {
        String textoADevolver = "";
        if (conFechaFijada) {
            if (dia < 10) {
                textoADevolver += "0";
            }
            textoADevolver += dia + "/";
            if (mes < 10) {
                textoADevolver += "0";
            }
            textoADevolver += mes + "/";
            textoADevolver += ano;            
        }        
        return textoADevolver;
    }
    
    public boolean tieneFechaDeVecimiento() {
        return conFechaFijada;
    }
    
 }

 
 
 
