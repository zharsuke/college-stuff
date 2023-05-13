package Assignment;

public class Queue {
    public int max, size, front, rear;
    public Student [] stdQueue;

    public Queue(int n) {
        max = n;
        create();
    }

    public void create() {
        stdQueue = new Student[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("The first element : " + stdQueue[front].nim + " " + stdQueue[front].nim + " " + stdQueue[front].classNumber + " " + stdQueue[front].gpa);
        } else {
            System.out.println("stdQueueueue is still empty");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("The last element : " + stdQueue[rear].nim + " " + stdQueue[rear].nim + " " + stdQueue[rear].classNumber + " " + stdQueue[rear].gpa);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("Queue is still empty");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println("The first element : " + stdQueue[front].nim + " " + stdQueue[front].nim + " " + stdQueue[front].classNumber + " " + stdQueue[front].gpa);
                i = (i+1) % max;
            }
            System.out.println(stdQueue[i] + " ");
            System.out.println("Element amount : " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue has been cleared successfully");
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void Enqueue(Student data) {
        if (isFull()) {
            System.out.println("Queue is already full");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            stdQueue[rear] = data;
            size++;
        }
    }

    public Student Dequeue() {
        Student data = new Student("", "", 0, 0);
        if (isEmpty()) {
            System.out.println("Queue is still empty");
        } else {
            data = stdQueue[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }

    public void peekPosition(String nim) {
        if (!isEmpty()) {
            for (int i = front; i != rear; i = (i + 1) % max) {
                if (stdQueue[i].nim.equals(nim)) {
                    System.out.println("Student found at position " + (i - front + 1));
                    return;
                }
            }
            if (stdQueue[rear].nim.equals(nim)) {
                System.out.println("Student found at position " + (rear - front + 1));
                return;
            }
            System.out.println("Student not found in the queue");
        } else {
            System.out.println("Queue is empty");
        }
    }
    
    public void printStudent(int position) {
        if (!isEmpty() && position > 0 && position <= size) {
            int index = (front + position - 1) % max;
            System.out.println("Student at position " + position + ": " + stdQueue[index].nim + " " + stdQueue[index].name + " " + stdQueue[index].classNumber + " " + stdQueue[index].gpa);
        } else {
            System.out.println("Invalid position or queue is empty");
        }
    }
    
}
