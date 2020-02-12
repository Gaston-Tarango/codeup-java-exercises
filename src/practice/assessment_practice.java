package practice;

public class assessment_practice {
//    package com.qa.javaAssessment;

    public class Assessment {

        // Given a string, return a string where
        // for every char in the original string,
        // there are three chars.

        // multChar("The") ==> "TTThhheee"
        // multChar("AAbb") ==> "AAAAAAbbbbbb"
        // multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"

        public String multChar(String input) {
            String word = "";
            for (int i = 0; i < input.length(); i++) {
                word += input.substring(i, i + 1);
                word += input.substring(i, i + 1);
                word += input.substring(i, i + 1);
            }
            return word;
        }

        // Return the string (backwards) that is between the first and last appearance
        // of "bert"
        // in the given string, or return the empty string "" if there is not 2
        // occurances of "bert" - Ignore Case

        // getBert("bertclivebert") ==> "evilc"
        // getBert("xxbertfridgebertyy") ==> "egdirf"
        // getBert("xxBertfridgebERtyy") ==> "egdirf"
        // getBert("xxbertyy") ==> ""
        // getBert("xxbeRTyy") ==> ""

        public String getBert(String input) {
            String wordReturned = "";
            String lookingFor = "bert";
            int startInt = 0;
            int endInt = 0;
            String wordReversed = "";
            int count = 0;
            int i = 0;

            for (i = 0; i < input.length(); i++) {

                String individualChar = input.substring(i, i + 1);

// if this char equals substring
                if (individualChar.equalsIgnoreCase(lookingFor.substring(0, 1))) {

// if the content between the substring and substring + length of word equals the word
                    if (input.substring(i, i + lookingFor.length()).equalsIgnoreCase(lookingFor)) {

// this gives the location of the first letter of the middle word
                        if (count == 0) {
                            startInt = i + lookingFor.length();
                            i = startInt;
                            count++;
                        } else if (count >= 1) {
                            endInt = i - 1;
                        }


                    } else {
                        return "";
                    }
                }
            }
            //return the middle word reversed
            for (i = endInt; i >= startInt; i--) {
                wordReturned = input.substring(i, i + 1);
                wordReversed = wordReversed + wordReturned;
            }
            return wordReversed;
        }

        // Given three ints, a b c, one of them is small, one is medium and one is
        // large. Return true if the three values are evenly spaced, so the
        // difference between small and medium is the same as the difference between
        // medium and large. Do not assume the ints will come to you in a reasonable
        // order.

        // evenlySpaced(2, 4, 6) ==> true
        // evenlySpaced(4, 6, 2) ==> true
        // evenlySpaced(4, 6, 3) ==> false
        // evenlySpaced(4, 60, 9) ==> false

        public boolean evenlySpaced(int a, int b, int c) {

            if (a < b && a < c) {
                if (b - a == c - b || c - a == b - c) {
                    return true;
                }
            }

            if (b < a && b < c) {
                if (a - b == c - a || c - b == a - c) {
                    return true;
                }
            }

            if (c < a && c < b) {
                if (a - c == b - a || b - c == a - b) {
                    return true;
                }
            }

            return false;

        }

        // Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
        // The string length will be at least n, and be odd when the length of the input is odd.

        // nMid("Hello", 3) ==> "Ho"
        // nMid("Chocolate", 3) ==> "Choate"
        // nMid("Chocolate", 1) ==> "Choclate"

        public String nMid(String input, int a) {

            int lengthBeforeSplit = (input.length() - a) / 2;

            String firstHalf = input.substring(0, lengthBeforeSplit);

            String lastHalf = input.substring(lengthBeforeSplit + a);

            String result = firstHalf + lastHalf;

            return result;
        }


        // Given a string, return the length of the largest "block" in the string.
        // A block is a run of adjacent chars that are the same.
        //
        // superBlock("hoopplla") ==> 2
        // superBlock("abbCCCddDDDeeEEE") ==> 3
        // superBlock("") ==> 0

        public int superBlock(String input) {

            int count = 1;
            int finalCount = 1;

            if (input.length() >= 1) {

                for (int i = 1; i < input.length(); i++) {

                    if (input.charAt(i) == input.charAt(i - 1)) {
                        count++;

                        if (count >= finalCount) {
                            finalCount = count;
                        }
                    } else
                        count = 1;
                }

                return finalCount;

            } else
                return 0;
        }

        //given a string - return the number of times "am" appears in the String ignoring case -
        // BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
        //
        //amISearch("Am I in Amsterdam") ==> 1
        //amISearch("I am in Amsterdam am I?") ==> 2
        //amISearch("I have been in Amsterdam") ==> 0

        public int amISearch(String arg1) {

            String mainString = arg1.toLowerCase();
            int count = 0;

            //find 'am' if at start of string
            if (mainString.indexOf("am ") == 0) {
                count++;
            }

            //find 'am' if at end of string
            if (mainString.indexOf(" am", mainString.length() - 3) == mainString.length() - 3) {
                count++;
            }

            //find 'am' in the middle (don't need to check very beginning)

            for (int i = 1; i < mainString.length() - 3; i++) {

                if (mainString.substring(i, i + 4).equals(" am ")) {
                    count++;
                }
            }
            return count;
        }


        //given a number
        // if this number is divisible by 3 return "fizz"
        // if this number is divisible by 5 return "buzz"
        // if this number is divisible by both 3  and 5return "fizzbuzz"
        //
        //fizzBuzz(3) ==> "fizz"
        //fizzBuzz(10) ==> "buzz"
        //fizzBuzz(15) ==> "fizzbuzz"

        public String fizzBuzz(int arg1) {


            if (arg1 % 3 == 0 && arg1 % 5 == 0) {
                return "fizzbuzz";
            }

            if (arg1 % 3 == 0) {
                return "fizz";
            }

            if (arg1 % 5 == 0) {
                return "buzz";
            } else
                return null;

        }

        //Given a string split the string into the individual numbers present
        //then add each digit of each number to get a final value for each number
        // String example = "55 72 86"
        //
        // "55" will = the integer 10
        // "72" will = the integer 9
        // "86" will = the integer 14
        //
        // You then need to return the highest vale
        //
        //largest("55 72 86") ==> 14
        //largest("15 72 80 164") ==> 11
        //largest("555 72 86 45 10") ==> 15

        public int largest(String arg1) {

            int number = 0;
            int largestTotal = 0;

            for (int i = 0; i < arg1.length(); i++) {

                if (!(arg1.substring(i, i + 1)).equals(" ")) {
                    number = number + Integer.parseInt(arg1.substring(i, i + 1));

                    if (number >= largestTotal) {

                        largestTotal = number;
                    }
                } else {

                    number = 0;
                }
            }

            //System.out.println(largestTotal);
            return largestTotal;

        }
    }
}

        //////////////////////////////////////////////////////////////////////////////////////////////////////
//        public class Assessment {
//
//
//            public static int square(int num) {
//                return num * num;
//            }
//
//            public static int sum(int a, int b) {
//                return a + b;
//            }
//
//            public static double sum(double a, double b) {
//                return a + b;
//            }
//
//            public static double average(int[] array) {
//                int sum = 0;
//                for (int i : array) sum += i;
//                return ((double) sum) / array.length;
//            }
//
//            public static ArrayList<User> capitalizeRecords(ArrayList<User> users) {
//
//                ArrayList<User> usersCopy = new ArrayList<>();
//
//                for (User user : users) {
//                    usersCopy.add(new User(user.getFirstName(), user.getLastName(), user.isAdmin()));
//                }
//
//                for(User user : usersCopy) {
//
//                    String firstName = user.getFirstName();
//                    String lastName = user.getLastName();
//                    String pattern = "[a-z].*";
//
//                    if (firstName.matches(pattern)) {
//                        firstName = capitalizeName(firstName);
//                        user.setFirstName(firstName);
//                    }
//
//                    if (lastName.matches(pattern)) {
//                        lastName = capitalizeName(lastName);
//                        user.setLastName(lastName);
//                    }
//
//                }
//
//                return usersCopy;
//
//            }
//
//            public static String capitalizeName(String nameToCapitalize) {
//                return nameToCapitalize.toUpperCase().charAt(0) + nameToCapitalize.substring(1).toLowerCase();
//            }
//
//
////            public static void main(String[] args) {
//////        testing methods here
////                int[] x = {2, 2, 2, 2};
////                System.out.println(square(8));
////                System.out.println(sum(3.5, 4));
////                System.out.println(sum(2, 4));
////                System.out.println(average(x));
//
//            }
//
//        }
//
//    public interface Greeter {
//
//        String sayHello();
//
//    }
//    public class Person implements Greeter {
//
//        private String firstName;
//        private String lastName;
//
//        public Person(String firstName, String lastName) {
//            if (firstName == null || lastName == null) {
//                throw new IllegalArgumentException("first/last name invalid");
//            }
//            this.firstName = firstName;
//            this.lastName = lastName;
//        }
//
//        public String getFirstName() {
//            return firstName;
//        }
//
//        public void setFirstName(String firstName) {
//            this.firstName = firstName;
//        }
//
//        public String getLastName() {
//            return lastName;
//        }
//
//        public void setLastName(String lastName) {
//            this.lastName = lastName;
//        }
//
//        public String sayHello() {
//            return "Hello" + this.firstName + " " + this.lastName;
//        }
//
//        public static void main(String[] args) {
//            Person p = new Person("Allie", "Scott");
//
//            System.out.println(p);
//
//
//        }
//    }
//
//    public class User extends Person {
//
//        protected boolean isAdmin;
//
//        public User(String firstName, String lastName) {
//            super(firstName, lastName);
//        }
//
//        public User(String firstName, String lastName, boolean isAdmin) {
//            super(firstName, lastName);
//            this.isAdmin = isAdmin;
//        }
//
//        public boolean isAdmin() {
//            return isAdmin;
//        }
//    }
//    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    import java.lang.reflect.Array;
//
//import static java.lang.System.out;
//
//    public class Assessment {
//
//        public static int square (int num) {
//            return num * num;
//        }
//
//        static double sum (double num1, double num2) {
//            return num1 + num2;
//        }
//
//        static double average(int[] array) {
//            double sum = 0;
//            for (int number : array) {
//                sum += number;
//            }
//
//            return sum/array.length;
//        }
//
//
//
//        public static void main(String[] args) {
//            int[] array = {1, 2, 3, 4, 5, 6};
//
//            out.println(square(5));
//            out.println(sum(5,5));
//            out.println(average(array));
//
//        }
//    }
//
//    //Serperate class
//    public interface Greeter {
//
//        String sayHello();
//
//    }
//
//    //Serperate class
//    public class Person implements Greeter {
//
//        protected String firstName;
//        protected String lastName;
//
//        public String getFirstName() {
//            return firstName;
//        }
//
//        public void setFirstName(String firstName) {
//            this.firstName = firstName;
//        }
//
//        public String getLastName() {
//            return lastName;
//        }
//
//        public void setLastName(String lastName) {
//            this.lastName = lastName;
//        }
//
//
//        @Override
//        public String sayHello() {
//            return "Hello, " + this.firstName + " " + this.lastName + ".";
//        }
//
//
//        public Person(String firstName, String lastName) {
//            try {
//                if (firstName == null || lastName == null) {
//                    throw new IllegalArgumentException("Name has no content");
//                }
//
//                this.firstName = firstName;
//                this.lastName = lastName;
//
//            } catch (IllegalArgumentException e) {
//
//                System.out.println("Name has no content");
//            }
//
//
//        }
//    }
//
//    // Seperate Class
//    public class User extends Person {
//
//        protected boolean admin;
//
//        public boolean isAdmin() {
//            return admin;
//        }
//
//
//        public User(String firstName, String lastName, boolean admin) {
//            super(firstName, lastName);
//            this.admin = admin;
//        }
//
//
//        public static void main(String[] args) {
//            User userOne = new User("Abby", "Perez", true);
//
//            System.out.println(userOne.isAdmin());
//
//            System.out.println(userOne.sayHello());
//        }
//    }
//
//
//}
//}
