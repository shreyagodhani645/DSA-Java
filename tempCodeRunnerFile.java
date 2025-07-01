        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            StringBuilder sb = new StringBuilder();

            int index1 = -1;
            int index2 = -1;
            for (int j = 0; j < emails[i].length()-4; j++) {
                char chr1 = emails[i].charAt(j);
                if (chr1 != '.') {
                 sb.append(chr1);
                }
                if (chr1 == '+'){
                    index1 = j;
                }
                if (chr1 == '@'){
                    index2 = j;
                }
            }
            sb.replace(index1-1,index2-1,"");
            hs.add(sb.toString());
            // System.out.println(sb.toString());  
        }
        System.out.println(hs.size());