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

     @Test
     public void testCalculaSalarioNeto6(){
         assertEquals(999.0, EmpleadoBR.calculaSalarioNeto(999), 0.1);
     }


     @Test
     public void testCalculaSalarioNeto7(){
         assertEquals(500, EmpleadoBR.calculaSalarioNeto(500));
     }


     @Test
     public void testCalculaSalarioNeto8(){
         assertEquals(0, EmpleadoBR.calculaSalarioNeto(0));
     }


     @Test
     public void testCalculaSalarioNeto9(){
         assertEquals(-1, EmpleadoBR.calculaSalarioNeto(-1));
     }

     @Test
     public void calculaSalarioBruto1(){
        assertEquals(1360, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 2000, 8));
     }

     @Test
     public void calculaSalarioBruto2(){
         assertEquals(1260, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 1500, 3));
     }

     @Test
     public void calculaSalarioBruto3(){
         assertEquals(1110, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 1499.99f, 0.5f), 0.0010f);
     }

     @Test
     public void calculaSalarioBruto4(){
         assertEquals(1760, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encaarregat, 1250, 8));
     }

     @Test
     public void calculaSalarioBruto5(){
         assertEquals(1600, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encaarregat, 1000, 0));
     }

     @Test
     public void calculaSalarioBruto6(){
         assertEquals(1560, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encaarregat, 999.99f, 3), 0.0010f);
     }


     @Test
     public void calculaSalarioBruto7(){
         assertEquals(1500, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encaarregat, 500, 0));
     }

     @Test
     public void calculaSalarioBruto8(){
         assertEquals(1660, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encaarregat, 0, 8));
     }

     @Test
     public void calculaSalarioBruto9(){
         assertEquals(-1, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, -1, 8));
     }

     @Test
     public void calculaSalarioBruto10(){
         assertEquals(-1, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 1500, -1));
     }

     @Test
     public void calculaSalarioBruto11(){
         assertEquals(-1, EmpleadoBR.calculaSalarioBruto(null , 1500, 8));
     }













}
