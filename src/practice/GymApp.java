package practice;

import java.lang.reflect.Array;
import java.lang.reflect.Member;
import java.util.Arrays;

public class GymApp {

    private Membership[] memberships;
    private static int totalMembers = 3;

    public GymApp(Membership[] memberships) {
        this.memberships = memberships;
    }
    public static int getTotalMembers() {
        return totalMembers;
    }

    public static void main(String[] args) {
        // initial persons
        Person gaston = new Person("gaston", "Tarango", 175, 1, new String[]{"Lose weight"});
        Person mateo = new Person("mateo", "Tarango", 175, 1, new String[]{"Lose weight"});
        Person tarango = new Person("tarango", "Tarango", 175, 1, new String[]{"Lose weight"});
        // initial memberships
        Membership member1 = new Membership(gaston, "elite", 40.00,"monthly", true);
        Membership member2 = new Membership(mateo, "basic", 20.00,"monthly", true);
        Membership member3 = new Membership(tarango, "gold", 30.00,"monthly", true);
        Membership[] currentMembers = new Membership[] {member1, member2, member3};


//        Membership[] currentMembers = new Membership[]{member1, member2, member3}

        GymApp app = new GymApp(currentMembers);
        System.out.println("Total members: " + GymApp.getTotalMembers());
        app.memberships = addMember(app.memberships, new Membership(new Person("tom", "hall", 150, 13, new String[]{"workout"}), "elite", 300, "annual", true));
        System.out.println("total members: " + GymApp.getTotalMembers());

    }
    //Print Person Info
    public static void printPersonInfo(Person personObj){
        System.out.println("Person info below: \n");
        System.out.printf("First Name: %s\n" + "Last Name: %s\n" + "Weight%d\n" + "Member ID: %d\n", personObj.firstName, personObj.lastName, personObj.getWeight(), personObj.getMemberID());
        System.out.println("Their goals: ");
        for (String goals : personObj.getGoals()) {
            System.out.printf("%s ", goals);
        }
        System.out.println("\n");
    }

    // add a member, add membership to array, increase total members

    public static Membership[] addMember(Membership[] oldMembershipArray, Membership newMembership) {
        Membership[] returnArray;
        returnArray = Arrays.copyOf(oldMembershipArray, oldMembershipArray.length + 1);
        returnArray[returnArray.length -1] = newMembership;
        GymApp.totalMembers++;
        return returnArray;
    }


    // delete member

    public static void deletePersonInfo(){

    }

    // edit person info

//    public static void editPersonInfo(){
//
//    }
//
    // print person info
}
