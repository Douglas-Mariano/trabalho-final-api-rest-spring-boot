package br.com.serratec.ecommerce.dto.pedidoItens;

public class PedidoItensBaseDTO {

    private long idProduto;
    private double vlUnitario;
    private double descontoProd;
    private double acrescimoProd;
    private long quantidade;

    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public double getDescProduto() {
        return descontoProd;
    }

    public void setDescProduto(double descontoProd) {
        this.descontoProd = descontoProd;
    }

    public double getAcresProduto() {
        return acrescimoProd;
    }

    public void setAcresProduto(double acrescimoProd) {
        this.acrescimoProd = acrescimoProd;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }   
    
     public double getVlUnitario() {
        return vlUnitario;
    }

    public void setVlUnitario(double vlUnitario) {
        this.vlUnitario = vlUnitario;
    }
}
