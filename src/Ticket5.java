import java.util.*;

public class Ticket5 {
    private static int count(List<Integer> list, int target) {
        int c = 0;

        for (var item : list)
            if (item == target)
                ++c;

        return c;
    }

    public static int rarest(Map<String, Integer> map) throws Exception {
        if (map.isEmpty()) {
            throw new Exception("Empty");
        }

        List<Integer> list = new ArrayList<>(map.values());

        int minCount = Integer.MAX_VALUE;
        int rarestValue = 0;

        for (int i = 0; i < list.size(); ++i) {
            int currentCount = count(list, list.get(i));

            if (currentCount < minCount) {
                minCount = currentCount;
                rarestValue = list.get(i);
            }
        }
        return rarestValue;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("skibidi", 4);
        map.put("rizz", 4);
        map.put("kai cenat", 6);
        map.put("ohio", 7);
        map.put("gyat", 7);

        try {
            System.out.println(rarest(map));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
