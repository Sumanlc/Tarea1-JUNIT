package es.iesmz;

import  org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class EmpleadoBRTest {

    @Test
    public void testCalculaSalarioNeto1(){
        assertEquals(1640,EmpleadoBR.calculaSalarioNeto(2000));
    }

    @Test
     public void testCalculaSalarioNeto2(){
        assertEquals(1230,EmpleadoBR.calculaSalarioNeto(1500));
    }

    @Test
     public void testCalculaSalarioNeto3(){
        assertEquals(1259.9916f,EmpleadoBR.calculaSalarioNeto(1499.99f), 0.001f);
    }

     @Test
     public void testCalculaSalarioNeto4(){
         assertEquals(1050, EmpleadoBR.calculaSalarioNeto(1250));
     }

    @Test
     public void testCalculaSalarioNeto5(){
        assertEquals(840, EmpleadoBR.calculaSalarioNeto(1000), 0.01f);
    }



}
