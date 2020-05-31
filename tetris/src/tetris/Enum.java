package tetris;

import java.util.Random;

public class Enum<T> {
    private static final Random RANDOM = new Random();
//    private static int random = (int) (Math.random() * 10);// 生成种子
//    private static Random rand = new Random(random);
//
//    public static <T extends Enum<T>> T random(Class<T> ec) {
//        return random(ec.getEnumConstants());
//    }
//
//    public static <T> T random(T[] values) {
//        return values[rand.nextInt(values.length)];
//    }


    public static <BrickEnum extends Enum<?>> BrickGenerator.BrickEnum random(Class<BrickGenerator.BrickEnum> brickEnumClass) {
        int x = RANDOM.nextInt(brickEnumClass.getEnumConstants().length);
        return brickEnumClass.getEnumConstants()[x];
    }
}
