public static <V extends Comparable<V>, K> Map<V, ArrayList<K>> swapKeyAndValue(Map<K, V> map) {
        Map<V, ArrayList<K>> reverseMap = new TreeMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (reverseMap.containsKey(entry.getValue()))
                reverseMap.get(entry.getValue()).add(entry.getKey());
            else
                reverseMap.put(entry.getValue(), new ArrayList<K>(Arrays.asList(entry.getKey())));
        }

        return reverseMap;
    }
