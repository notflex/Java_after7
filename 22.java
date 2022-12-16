   public static <T extends Comparable<T>> Map<T, Integer> toMap(List<T> list) {
        Map<T, Integer> map = new TreeMap<>();
        for (T elem : list) {
            if (map.containsKey(elem))
                map.put(elem, map.get(elem) + 1);
            else
                map.put(elem, 1);
        }

        return map;
    }
