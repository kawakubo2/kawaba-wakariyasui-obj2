package chapter17.second;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ListVsSet {
    private static final int RAND_MAX = 1_000_000_000;
    private static final int COLLECTION_SIZE = RAND_MAX / 1_000;
    private static final int TEST_COUNT = 10_000;
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        // listとsetに重複がないよう、100万件の要素を格納する
        while (set.size() < COLLECTION_SIZE) {
            int r = rand.nextInt(RAND_MAX) + 1;
            while (!set.contains(r)) {
                list.add(r);
                set.add(r);
            }
        }
        // テスト用の乱数を格納したList(1万回のテスト用に1万個の乱数を格納)
        var randomList = new ArrayList<Integer>();
        for (int i = 0; i < TEST_COUNT; i++) {
            randomList.add(rand.nextInt(RAND_MAX) + 1);
        }

        Collections.sort(list);
        System.out.println("---< リストの二分探索 >---");
        long listStart = System.currentTimeMillis();
        int listOk = 0;
        int listNg = 0;
        for (int i = 0; i < TEST_COUNT; i++) {
            if (binarySearch(list, randomList.get(i))) {
                listOk++;
            } else {
                listNg++;
            }
        }
        long listEnd = System.currentTimeMillis();
        System.out.println("検索成功: " + listOk);
        System.out.println("検索失敗: " + listNg);
        System.out.println("処理時間: " + (listEnd - listStart) + "ミリ秒");
        
        System.out.println("---< セットの検索 >---");
        long setStart = System.currentTimeMillis();
        int setOk = 0;
        int setNg = 0;
        for (int i = 0; i < TEST_COUNT; i++) {
            if (set.contains(randomList.get(i))) {
                setOk++;
            } else {
                setNg++;
            }
        }
        long setEnd = System.currentTimeMillis();
        System.out.println("検索成功: " + setOk);
        System.out.println("検索失敗: " + setNg);
        System.out.println("処理時間: " + (setEnd - setStart) + "ミリ秒");
    }

    public static boolean binarySearch(List<Integer> list, Integer target) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target > list.get(mid)) {
                left = mid + 1;
            } else if (target < list.get(mid)) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
