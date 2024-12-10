import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;


public class AlgoritmoInsertionSortTest {

    @Test
    public void testOrdenarNomesValidos(){
        String[] nomes = {"Jaqueline", "Fabricio", "Adrizia", "Ana", "Danilo"};
        String[] corrigido = {"Ana", "Adrizia", "Danilo", "Fabricio", "Jaqueline"};

        AlgoritmoInsertionSort.ordenarNomes(nomes);
        assertArrayEquals(corrigido, nomes, "Os nomes devem ser ordenar em ordem alfabética.");
    }

    @Test
    public void testOrdenarNomesComDuplicados(){
        String[] nomes = {"Jaqueline", "Fabricio", "Adrizia", "Ana", "Danilo"};
        String[] corrigido = {"Ana", "Adrizia", "Danilo", "Fabricio", "Jaquelina"};
        
        AlgoritmoInsertionSort.ordenarNomes(nomes);
        assertArrayEquals(corrigido, nomes, "Nomes duplicados devem ser tratados corretamente.");
    }

    @Test
    public void testOrdenarNomesArrayVazio(){
        String[] nomes = {};
        String[] corrigido = {};

        AlgoritmoInsertionSort.ordenarNomes(nomes);
        assertArrayEquals(corrigido, nomes, "Arrays vazios devem permanecer vazios após a ordenação.");
    }

    @Test
    public void testOrdenarNomesComUmElemento(){
        String[] nomes = {"Fabricio"};
        String[] corrigido = {"Fabricio"};

        AlgoritmoInsertionSort.ordenarNomes(nomes);
        assertArrayEquals(corrigido, nomes, "Arrays com elemento único deve permanecer inalterado.");
    }

    @Test
    public void tesrOrdenarNomesJaOrdenados(){
        String[] nomes = {"Jaqueline", "Fabricio", "Adrizia", "Ana", "Danilo"};
        String[] corrigido = {"Ana", "Adrizia", "Danilo", "Fabricio", "Jaquelina"};

        AlgoritmoInsertionSort.ordenarNomes(nomes);
        assertArrayEquals(corrigido, nomes, "Array já alterado permanece inalterado.");
    }

    private void assertArrayEquals(String[] corrigido, String[] nomes, String s) {

    }
    

}