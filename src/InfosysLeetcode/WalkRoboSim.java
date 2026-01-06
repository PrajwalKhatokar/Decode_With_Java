package InfosysLeetcode;

public class WalkRoboSim {
    public static void main(String[] args) {
    }

            public int robotSim(int[] commands, int[][] obstacles) {

                // -------------------------------
                // 1️⃣ DIRECTION SETUP
                // -------------------------------
                // We number directions in clockwise order:
                // 0 = North, 1 = East, 2 = South, 3 = West
                //
                // Each direction tells how x and y change
                int[][] dirs = {
                        {0, 1},   // North → y increases
                        {1, 0},   // East  → x increases
                        {0, -1},  // South → y decreases
                        {-1, 0}   // West  → x decreases
                };

                // Robot starts facing North
                int dir = 0;

                // Robot starting position
                int x = 0;
                int y = 0;

                // This will store the maximum distance² reached
                int maxDist = 0;

                // -------------------------------
                // 2️⃣ OBSTACLE STORAGE (IMPORTANT)
                // -------------------------------
                // We need FAST checking:
                // "Is this position blocked?"
                //
                // So we use a HashSet
                java.util.Set<String> obs = new java.util.HashSet<>();

                // Convert each obstacle into a string "x,y"
                for (int[] o : obstacles) {
                    // o[0] = x coordinate
                    // o[1] = y coordinate
                    // Example: (2,4) → "2,4"
                    obs.add(o[0] + "," + o[1]);
                }

                // -------------------------------
                // 3️⃣ PROCESS EACH COMMAND
                // -------------------------------
                for (int cmd : commands) {

                    // -------- TURN LEFT --------
                    if (cmd == -2) {
                        // Turning left means anti-clockwise
                        // +3 works like -1 but avoids negative numbers
                        dir = (dir + 3) % 4;
                    }

                    // -------- TURN RIGHT --------
                    else if (cmd == -1) {
                        // Turning right means clockwise
                        dir = (dir + 1) % 4;
                    }

                    // -------- MOVE FORWARD --------
                    else {
                        // Move ONE STEP at a time
                        // (Important because obstacles may stop us)
                        for (int step = 0; step < cmd; step++) {

                            // Calculate next position
                            int nextX = x + dirs[dir][0];
                            int nextY = y + dirs[dir][1];

                            // -------------------------------
                            // 4️⃣ OBSTACLE CHECK (CRITICAL)
                            // -------------------------------
                            // Convert next position to string
                            // Example: (2,4) → "2,4"
                            if (obs.contains(nextX + "," + nextY)) {
                                // If obstacle found → STOP moving
                                break;
                            }

                            // -------------------------------
                            // 5️⃣ MOVE ROBOT
                            // -------------------------------
                            x = nextX;
                            y = nextY;

                            // -------------------------------
                            // 6️⃣ UPDATE MAX DISTANCE
                            // -------------------------------
                            int dist = x * x + y * y;
                            maxDist = Math.max(maxDist, dist);
                        }
                    }
                }

                // -------------------------------
                // 7️⃣ RETURN FINAL ANSWER
                // -------------------------------
                return maxDist;
            }
        }



