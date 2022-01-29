package algorithm;

/*
System.arraycopy는 native 메서드로 직접 루프를 돌려 배열을 복사하는것보다 성능이 2배이상 빠르며, Arrays.copyOf는 내부적으로 System.arraycopy을 호출한다
https://stackoverflow.com/questions/18638743/is-it-better-to-use-system-arraycopy-than-a-for-loop-for-copying-arrays

System.arraycopy 사용 방법
Object src  : 복사하고자 하는 배열. 즉, 원본 배열이라고 생각하면 된다
int srcPos  : 원본 배열의 몇번째 인덱스부터 읽을지를 선택. 처음부터 데이터를 읽어올거라면 0 을 입력
Object dest : 데이터를 복사할 배열
int destPos : 복사할 배열의 몇번째 인덱스부터 데이터를 복사하기 시작할지 선택. 처음부터 복사할거라면 0 을 입력
int length : 원본에서 복사본으로 복사할 데이터의 길이
 */
public class MergeSort {
    public void mergeSort(int[] array) {
        mergeSort(array, false);
    }

    public void mergeSort(int[] array, boolean desc) {
        mergeSort(array, array.length, desc);
    }

    private void mergeSort(int[] array, int arrayLength, boolean desc) {
        if (arrayLength <= 1) {
            return;
        }

        int pivot = arrayLength / 2;
        int[] left = new int[pivot];
        int[] right = new int[arrayLength - pivot];

        System.arraycopy(array, 0, left, 0, left.length);
        mergeSort(left, left.length, desc);

        System.arraycopy(array, pivot, right, 0, right.length);
        mergeSort(right, right.length, desc);

        merge(array, left, right, desc);
    }

    private void merge(int[] array, int[] left, int[] right, boolean desc) {
        int li = 0; // left index
        int ri = 0; // right index
        int ai = 0; // array index

        while (li < left.length && ri < right.length) {
            if (desc) {
                if (left[li] >= right[ri]) {
                    array[ai++] = left[li++];
                }
                else {
                    array[ai++] = right[ri++];
                }
            }
            else {
                if (left[li] <= right[ri]) {
                    array[ai++] = left[li++];
                }
                else {
                    array[ai++] = right[ri++];
                }
            }
        }

        while (li < left.length) {
            array[ai++] = left[li++];
        }

        while (ri < right.length) {
            array[ai++] = right[ri++];
        }
    }
}
