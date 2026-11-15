package com.choongang;

public class K_AddToBack {
    public int[] addToBack(int[] arr, int el) {
        // TODO:
        int[] result = new int[arr.length + 1];

        result[result.length - 1] = el;
//        result[arr.length] = el;

        for(int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        // 참고: 위의 반복문은 System.arraycopy(arr, 0, result, 0, arr.length); 한 줄로도 쓸 수 있습니다.

        return result;
    }

}
