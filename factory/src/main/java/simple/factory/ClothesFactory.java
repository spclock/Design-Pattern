package simple.factory;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * 做衣服的工厂
 */
public class ClothesFactory {

    public List<Clothes> createClothes(String type, int count) {
        if (type.equals("TShirt")) {
            return this.batchProduce(count, TShirt.class);

        } else if (type.equals("LongSleeves")) {
            return this.batchProduce(count, LongSleeves.class);

        } else if (type.equals("Jacket")) {
            return this.batchProduce(count, Jacket.class);

        } else if (type.equals("Garments")) {
            return this.batchProduce(count, Garments.class);

        } else {
            return null;
        }
    }


    private List<Clothes> batchProduce(int count, Class<? extends Clothes> clazz) {
        if (count <= 0) {
            return null;
        }

        List<Clothes> clothes = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            try {
                Clothes instance = clazz.getConstructor().newInstance();
                clothes.add(instance);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        return clothes;
    }
}
