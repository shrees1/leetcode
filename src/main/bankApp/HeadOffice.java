import java.util.List;

public class HeadOffice {
    private List<Branch> branches;

    public void createBranch() {
        Branch branch = new Branch();
        Integer branchId = branches.size() + 1;
        branch.setBranchId(branchId.toString());

        branches.add(branch);
    }

    public Branch getBranchById(String branchId) {
        Branch branch = null;
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getBranchId().equals(branchId)) {
                branch = branches.get(i);
            }
        }
        return branch;
    }

    public List<Branch> getBranches() {
        return branches;
    }
}
