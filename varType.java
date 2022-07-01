public class varType {

    /**
     * @param o Object
     * @return Наименование класса-обертки для переменной o
     */
    public static String getType(Object o){
    return o.getClass().getSimpleName();
}
}
