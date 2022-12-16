 public static <T, Func extends Function<T, Boolean>> void deleteExcess(List<T> list, Func func) {
        for (int i = 0; i < list.size(); i++) {
            if (func.apply(list.get(i))) {
                list.remove(i);
                i--;
            }
        }
    }
