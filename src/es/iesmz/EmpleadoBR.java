package es.iesmz;

public class EmpleadoBR {

    public static float calculaSalarioBruto(TipoEmpleado tipo, float ventasMes, float horasExtra) {
        if (tipo == null || ventasMes < 0 || horasExtra < 0) {
            return -1;
        }

        float salarioBase;
        if (tipo == TipoEmpleado.venedor) {
            salarioBase = 1000;
        } else {
            salarioBase = 1500;
        }



        float prima;
        if (ventasMes >= 1500) {
            prima = 200;
        } else if (ventasMes >= 1000) {
            prima = 100;
        } else {
            prima = 0;
        }

        if(horasExtra > 0){
            salarioBase += (horasExtra * 20);
        }

        return salarioBase + prima ;
    }

    public static float calculaSalarioNeto(float salarioBruto) {
        if (salarioBruto < 0) {
            return -1;
        }
        if(salarioBruto < 1000){
            return salarioBruto;
        }
        float retencion;
        if (salarioBruto < 1500) {
            retencion = 0.16f;
        } else {
            retencion = 0.18f;
        }

        return salarioBruto * (1 - retencion);
    }
}
