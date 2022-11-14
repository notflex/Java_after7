 public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new LinkedHashSet<>(collection);
    }
