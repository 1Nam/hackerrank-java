//Write your code here
        HashSet<String> hs = new HashSet<String>();
        for (int i = 0; i < t; i++) {
            hs.add(pair_left[i] + " ," + pair_right[i]);
            System.out.println(hs.size());
        }
        s.close();
