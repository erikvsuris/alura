package poo.conversormoeda;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public double converterDolarParaReal(double valorEmDolares) {
        return valorEmDolares * 4.87;
    }
    
    @Override
    public double converterRealParaDolar(double valorEmReais) {
        return valorEmReais / 4.87;
    }
}
