public class TwoCommands {
    /**
     * @param source
     * @param target
     * @param c
     * @param d
     * @return генерируется строка path, содержащая "К1" и "К2" - порядок выполнения
     *         команд, посредством которых можно получить из числа source число
     *         target. К1 - умножить source на c. K2 - прибавить к source d
     */
    static void generate(int source, int target, int c, int d, String path) { 
        if (source > target) return;
        if (source == target) {
            System.out.println(path);
            return;
        }
        generate(source * c, target, c, d, path + "K1 ");
        generate(source + d, target, c, d, path + "K2 ");
        }

}
