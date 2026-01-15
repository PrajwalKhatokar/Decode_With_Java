package AmazonLeetcode.day2;

public class KokoBanana {
    public static void main(String[] args) {

    }
    class Solution {

        public int minEatingSpeed(int[] piles, int h) {

            // left = minimum possible eating speed
            // Koko must eat at least 1 banana per hour
            int left = 1;

            // right = maximum possible eating speed
            // We will set it as the largest pile size
            int right = 0;

            // answer will store the minimum valid speed found so far
            int answer = 0;

            // STEP 1: Find the maximum pile
            // Why?
            // Because if Koko eats at speed = max pile,
            // she can finish any pile in 1 hour.
            for (int pile : piles) {
                right = Math.max(right, pile);
            }

            // Initially assume worst case:
            // eating speed = maximum pile
            answer = right;

            // STEP 2: Binary Search on eating speed
            // We are NOT searching piles
            // We are searching the SPEED (k)
            while (left <= right) {

                // mid is the eating speed we are testing now
                // left + (right - left) / 2 prevents overflow
                int mid = left + (right - left) / 2;

                // STEP 3: Check feasibility
                // Question:
                // If Koko eats at speed = mid,
                // can she finish all bananas within h hours?
                if (canfinish(piles, h, mid)) {

                    // mid works → it is a VALID speed
                    // Store it as a possible answer
                    answer = mid;

                    // But we want the MINIMUM speed
                    // So try smaller speeds
                    right = mid - 1;

                } else {

                    // mid is too slow
                    // Koko cannot finish within h hours
                    // So we must increase the speed
                    left = mid + 1;
                }
            }

            // After binary search ends,
            // answer contains the minimum valid eating speed
            return answer;
        }

        // Helper function to check if a given speed k is possible
        private boolean canfinish(int[] piles, int h, int k) {

            // hours = total hours needed to eat all piles
            // Use long to avoid overflow
            long hours = 0;

            // Go pile by pile
            for (int pile : piles) {

                // (pile + k - 1) / k
                // This calculates CEIL(pile / k)
                // Meaning:
                // how many hours are needed to eat this pile
                hours += (pile + k - 1) / k;
            }

            // If total hours needed is within allowed time
            // then this speed k is valid
            return hours <= h;
        }
    }

}
