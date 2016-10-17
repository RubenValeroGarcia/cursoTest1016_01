package main.practica1.intro;

import org.junit.Test;

/**
 * Created by ruben on 29/10/2014.
 */
public class variables_y_referencias {

    /**
     *      Paso de parámetros por valor
            Paso de parámetros por referencia

        =>   En Java todos los parámetros se pasan por valor
     */

    private void ejemploEnteros(int arg){
        arg = 7;
    }

    @Test
    public void ejemploEnterosTest() {
        int x = 5;
        ejemploEnteros(x);
//        Assert.assertEquals(5, x);
    //    Assert.assertEquals(7, x);
        int y = x;
        y = 7;
        //    Assert.assertEquals(7,x);
        //    Assert.assertEquals(5,x);
    }


    private void ejemploArray1(String[] arg){
        arg = new String[]{"hola"};
    }

    @Test
    public void ejemploArray1Test () {
        String[] strings = new String[]{"adios"};
        ejemploArray1(strings);
//        Assert.assertEquals("hola", strings[0]);
//        Assert.assertEquals("adios", strings[0]);
    }


    private void ejemploArray2(String[] arg) {
        arg[0] = "hola";
    }

    @Test
    public void ejemploArray2Test(){
        String[] arr = new String[]{"adios"};
        ejemploArray2(arr);
//        Assert.assertEquals("hola",arr[0]);
//        Assert.assertEquals("adios",arr[0]);
    }

}
