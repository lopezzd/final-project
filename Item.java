import java.util.Objects;

public abstract class Item implements Comparable <Item>{
    String nome, descricao;
    Efeito efeito;
    int quantidade;

    enum Efeito{DANO, MUNICAO, MAGIA, BONUS_DEFESA} 

    public String getNome(){ return this.nome; }
    public String getDescricao(){ return this.descricao; }
    public Efeito getEfeito(){ return this.efeito; }
    public int getQuantidade(){ return this.quantidade; }

    public void setQuantidade(int quantidade){ if(quantidade >= 0) this.quantidade = quantidade; }

    public Item(String nome, String descricao, Efeito efeito, int quantidade){
        this.nome = nome;
        this.descricao = descricao;
        this.efeito = efeito;
        this.quantidade = quantidade;
    }
    
    public Item(Item outro){ // construtor de cópia
        this.nome = outro.getNome();
        this.descricao = outro.getDescricao();
        this.efeito = outro.getEfeito();
        this.quantidade = outro.getQuantidade();
    }

    @Override
    public String toString(){
        return "\nNome do Item: " + this.nome + "\nDescricao do Item: " + this.descricao + "\nEfeito do Item: " + this.efeito + "\nQuantidade: " + this.quantidade;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null || this.getClass() != obj.getClass()) return false;
        if (this == obj) return true;
        
        Item outroItem = (Item) obj;

        return this.nome.equals(outroItem.getNome()) && this.efeito.equals(outroItem.getEfeito());

        
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome, efeito);
    }

    
    public int compareTo(Item outro){ // efeito é o que desempata a comparação
        int comparaNome = this.nome.compareTo(outro.getNome());
        int comparaEfeito = this.efeito.compareTo(outro.getEfeito());

        if (comparaNome != 0) return comparaNome;
        if (comparaEfeito != 0) return comparaEfeito;
        return 0;
        
    }

}