public class SearchStudent {
    Students [] listStd;
    int idx;

    public SearchStudent(int amount) {
        listStd = new Students[amount];
    }

    public void add(Students std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already full");
        }
    }

    public void display() {
        for (Students students : listStd) {
            students.display();
            System.out.println("==================================");
        }
    }

    public int findBinarySearch(int search, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left+right) / 2;
            if (search == listStd[mid].nim) {
                return (mid);
            } else if (listStd[mid].nim > search) {
                return findBinarySearch(search, left, mid-1);
            } else {
                return findBinarySearch(search, mid+1, right);
            }
        }
        return -1;
    }

    public int findSeqSearch(String search) {
        int position = -1;
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i].name.equalsIgnoreCase(search)) {
                position = i;
                break;
            }
        }
        return position;
    }

    public void showPosition(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " is found in index-" + pos);
        } else {
            System.out.println("Data : " + x + " is not found!");
        }
    }

    public void showData(String x, int pos) {
        if (pos != -1) {
            System.out.println("NIM \t = " + x);
            System.out.println("Name \t = " + listStd[pos].name);
            System.out.println("Age \t = " + listStd[pos].age);
            System.out.println("GPA \t = " + listStd[pos].gpa);
        } else {
            System.out.println("Data " + x + " is not found!");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listStd.length-1; i++) {
            for (int j = 1; j < listStd.length-i; j++) {
                if (listStd[j].nim < listStd[j-1].nim) {
                    // swap
                    Students tmp = listStd[j];
                    listStd[j] = listStd[j-1];
                    listStd[j-1] = tmp;
                }
            }
        }
    }
}
