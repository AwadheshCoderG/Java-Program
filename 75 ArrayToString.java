class ArrayToString {
    public static void main(String[] args) {
        String[] arr = new String[] { "Make",
                "My Delivery.", "CA-Final", "Audit",
                "question", "bank.", "Learn", "with", "Fun" };

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s).append(" ");
        }

        System.out.println(sb);
        }
    }
