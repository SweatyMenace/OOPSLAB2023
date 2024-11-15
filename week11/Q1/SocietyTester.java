import java.util.ArrayList;

class SocietyTester {
    public static void main(String[] args) {
        Society society = new Society();

        StandardMember standardMember1 = new StandardMember("Alice", "123 Main St", 100);
        SeniorMember seniorMember1 = new SeniorMember("Bob", "456 Elm St", 80);

        society.addMember(standardMember1);
        society.addMember(seniorMember1);

        int totalFee = society.calculateTotalFee();// Adds fee of Alice and Bob
        System.out.println("Total Fee: " + totalFee);
    }
}


abstract class Member {
    private String name;
    private String address;

    public Member(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public abstract int getFee();
}

class Society {
    private ArrayList<Member> members;

    public Society() {
        members = new ArrayList<>();
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public int calculateTotalFee() {
        int totalFee = 0;
        for (Member member : members) {
            totalFee += member.getFee();
        }
        return totalFee;
    }
}

class SeniorMember extends Member {
    private int fee;

    public SeniorMember(String name, String address, int fee) {
        super(name, address);
        this.fee = fee;
    }

    @Override
    public int getFee() {
        return fee;
    }
}


class StandardMember extends Member {
    private int fee;

    public StandardMember(String name, String address, int fee) {
        super(name, address);
        this.fee = fee;
    }

    @Override
    public int getFee() {
        return fee;
    }
}




