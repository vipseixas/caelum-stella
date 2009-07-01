package br.com.caelum.stella.nfe.builder.generated;

import java.math.BigDecimal;

public final class ICMSTotImplTest {
    @org.junit.Test
    public void testICMSTotInterface() {
        ICMSTotal iCMSTot = new ICMSTotalImpl().withValorDaBaseDeCalculo(new BigDecimal("1")).withValorTotal(new BigDecimal("1")).withValorDaBaseDeCalculoDoICMSSubstituicaoTributaria(
                new BigDecimal("1")).withValorTotalDoICMSSubstituicaoTributaria(new BigDecimal("1")).withValorTotalDosProdutosEServicos(new BigDecimal("1")).withValorTotalDoFrete(
                new BigDecimal("1")).withValorTotalDoSeguro(new BigDecimal("1")).withValorTotalDeDesconto(new BigDecimal("1")).withValorTotalDoII(
                new BigDecimal("1")).withValorTotalDoIPI(new BigDecimal("1")).withValorTotalDoPIS(new BigDecimal("1")).withValor(
                new BigDecimal("1")).withValorTotalDeOutrasDespesas(new BigDecimal("1")).withValorTotalDaNF(new BigDecimal("1"));
        assertModelWasFilled(iCMSTot);
    }

    private void assertModelWasFilled(final ICMSTotal iCMSTot) {
        new br.com.caelum.stella.nfe.builder.BuilderTestHelper(iCMSTot).assertModelWasFilled();
    }
}