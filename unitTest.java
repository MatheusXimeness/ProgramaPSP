package primeiroprograma;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ProgramaPSP.java;

public class teste {
    
    @Test
    void teste1()
    {
        ProgramaPSP teste1 = new ProgramaPSP();
        int distA[] = new int [] { 500, 700 };
        int distD[] = new int [] { 700, 500, 500 };
        char answer = teste1.solve( distA, distD, 2, 3 );

        assertEquals( "N",  answer );
    }

    @Test
    void teste2()
    {
        ProgramaPSP teste2 = new ProgramaPSP();
        int distA[] = new int [] { 200, 400 };
        int distD[] = new int [] { 200, 1000 };
        char answer = teste2.solve( distA, distD, 2, 2 );

        assertEquals( "Y", answer );
    }

    @Test
    void teste3()
    {
        ProgramaPSP teste3 = new ProgramaPSP();
        int distA[] = new int [] { 530, 510, 490 };
        int distD[] = new int [] { 480, 470, 50, 310 };
        char answer = teste3.solve( distA, distD, 3, 4 );

        assertEquals( "N", answer );
    }
}
