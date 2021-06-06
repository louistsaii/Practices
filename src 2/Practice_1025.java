public class Practice_1025 {
    public static void main(String[] args) {
        // ======================
// 1
// ======================
// start tag <s>
// end tag <e>
// find the text between <s> and <e>
        String ex1 = "Strings are constant; their values cannot be <sssssssssssssssssssss>changed<eeeeeeeeeeeeee> after they are created.";
    String tag = "<sssssssssssssssssssss>";
        int x = ex1.indexOf(tag);
        System.out.println(x);
        int y = ex1.indexOf("<eeeeeeeeeeeeee>");
        System.out.println(y);
        String s2 = ex1.substring(x+tag.length(),y);
        System.out.println(s2);
        System.out.println();
    }

    public static void main2(String[] args) {
        int[] counter = new int[26];
        String CNN = "One evening in August, a 14-year-old boy snuck out of his home and boarded a private bus to travel from his village in Bihar to Jaipur, a chaotic, crowded and historical city 800 miles away in India's Rajasthan state.\n" +
                "\n" +
                "He and his friends had been given 500 rupees (about $7) by a man in their village to \"go on vacation\" in Jaipur, said the boy, who CNN is calling Mujeeb because Indian law forbids naming suspected victims of child trafficking.\n" +
                "As the bus entered Jaipur, it was intercepted by police.\n" +
                "The man was arrested and charged under India's child trafficking laws, along with two other suspects. Nineteen children, including Mujeeb, were rescued. Jaipur police said they were likely being taken to bangle factories to be sold as cheap labor.";

        for (int i = 0; i < CNN.length(); i++) {
            char c1 = CNN.charAt(i);
            if ('a' <= c1 && c1 <= 'z') {
                int id = c1 - 'a';
                counter[id]++;
            }
            if ('A' <= c1 && c1 <= 'Z') {
                int id = c1 - 'A';
                counter[id]++;
            }
        }
        for (int j = 0; j < counter.length; j++) {
            int x = j+'a';
            System.out.println((char)x + "-->" + counter[j]  );
        }
    }

    public static void main1(String[] args) {
        String CNN = "One evening in August, a 14-year-old boy snuck out of his home and boarded a private bus to travel from his village in Bihar to Jaipur, a chaotic, crowded and historical city 800 miles away in India's Rajasthan state.\n" +
                "\n" +
                "He and his friends had been given 500 rupees (about $7) by a man in their village to \"go on vacation\" in Jaipur, said the boy, who CNN is calling Mujeeb because Indian law forbids naming suspected victims of child trafficking.\n" +
                "As the bus entered Jaipur, it was intercepted by police.\n" +
                "The man was arrested and charged under India's child trafficking laws, along with two other suspects. Nineteen children, including Mujeeb, were rescued. Jaipur police said they were likely being taken to bangle factories to be sold as cheap labor.";

        int spaces = 0;
        for (int i = 0; i < CNN.length(); i++) {
            char c1 = CNN.charAt(i);
            if (c1 == ' ') {
                spaces = spaces + 1;
            }
        }
        System.out.println("Spaces: " + spaces);
    }
}
