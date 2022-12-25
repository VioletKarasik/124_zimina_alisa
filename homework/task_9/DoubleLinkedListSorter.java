package task;

public class DoubleLinkedListSorter {
    public DoubleLinkedListSorter() {
    }

    public static <T extends Comparable<T>> void sort(DoubleLinkedList<T> list) {
        for(int i = 0; i < list.getSize(); ++i) {
            DoubleLinkedListItem minItem = list.getFirst();
            DoubleLinkedListItem currentItem = list.getFirst();

            for(int j = 0; j < list.getSize() - i; ++j) {
                if (currentItem.getData().compareTo(minItem.getData()) < 0) {
                    minItem = currentItem;
                }

                currentItem = currentItem.getNext();
            }

            list.remove(minItem);
            list.insertAfter(list.getLast(), (T) minItem.getData());
        }
    }
}
