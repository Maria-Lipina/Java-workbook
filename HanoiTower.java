public class HanoiTower {

    public static void doTowers(int topN, char source, char destination, char buffer) {
        if (topN == 1) {
            System.out.printf("Disk 1 from %s to %s \n", source, destination);
            return;
        }
        doTowers(topN - 1, source, buffer, destination);
        System.out.printf("Disk %s from %s to %s\n", topN, source, destination);
        doTowers(topN - 1, buffer, destination, source);
    }
}
