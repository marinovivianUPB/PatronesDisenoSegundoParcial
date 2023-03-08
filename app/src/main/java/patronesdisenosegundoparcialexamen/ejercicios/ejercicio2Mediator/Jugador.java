package patronesdisenosegundoparcialexamen.ejercicios.ejercicio2Mediator;

public abstract class Jugador {
    private String alias;
    private String nombre;
    private String ranking;
    private String tipo;
    private IChat chat;

    
    public abstract void send(String msg, String indicador);
    public abstract void messageReceived(String msg);

    public void show(){
        System.out.println("Nombre: "+nombre+" Alias: "+alias);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((alias == null) ? 0 : alias.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((ranking == null) ? 0 : ranking.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        result = prime * result + ((chat == null) ? 0 : chat.hashCode());
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Jugador other = (Jugador) obj;
        if (alias == null) {
            if (other.alias != null)
                return false;
        } else if (!alias.equals(other.alias))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (ranking == null) {
            if (other.ranking != null)
                return false;
        } else if (!ranking.equals(other.ranking))
            return false;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        if (chat == null) {
            if (other.chat != null)
                return false;
        } else if (!chat.equals(other.chat))
            return false;
        return true;
    }



    public Jugador(String alias, String nombre, String ranking, IChat chat) {
        this.alias = alias;
        this.nombre = nombre;
        this.ranking = ranking;
        this.chat = chat;
    }



    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRanking() {
        return ranking;
    }
    public void setRanking(String ranking) {
        this.ranking = ranking;
    }
    public IChat getChat() {
        return chat;
    }
    public void setChat(IChat chat) {
        this.chat = chat;
    }



    public String getTipo() {
        return tipo;
    }



    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

}
