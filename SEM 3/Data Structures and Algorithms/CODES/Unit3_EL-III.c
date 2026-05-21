//Unit 3 EL- III

#include <stdio.h>
#include <stdlib.h>

// Node structure (DLL)
struct Node {
    int data;
    struct Node *prev, *next;
};

struct Node *front = NULL, *rear = NULL;

// Insert at rear (enqueue)
void insertRear(int value) {
    struct Node *newNode = (struct Node*) malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->next = NULL;
    newNode->prev = rear;
    if (rear == NULL)
        front = rear = newNode;
    else {
        rear->next = newNode;
        rear = newNode;
    }
    printf("%d inserted at rear\n", value);
}

// Insert at front (for Deque)
void insertFront(int value) {
    struct Node *newNode = (struct Node*) malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->prev = NULL;
    newNode->next = front;
    if (front == NULL)
        front = rear = newNode;
    else {
        front->prev = newNode;
        front = newNode;
    }
    printf("%d inserted at front\n", value);
}

// Delete from front (dequeue)
void deleteFront() {
    if (front == NULL) {
        printf("Queue Underflow!\n");
        return;
    }
    struct Node *temp = front;
    printf("%d deleted from front\n", front->data);
    front = front->next;
    if (front == NULL)
        rear = NULL;
    else
        front->prev = NULL;
    free(temp);
}

// Delete from rear (for Deque)
void deleteRear() {
    if (rear == NULL) {
        printf("Queue Underflow!\n");
        return;
    }
    struct Node *temp = rear;
    printf("%d deleted from rear\n", rear->data);
    rear = rear->prev;
    if (rear == NULL)
        front = NULL;
    else
        rear->next = NULL;
    free(temp);
}

// Display the queue
void display() {
    if (front == NULL) {
        printf("Queue is empty\n");
        return;
    }
    struct Node *temp = front;
    printf("Queue elements (front → rear): ");
    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

// Main function
int main() {
    int choice, value;
    do {
        printf("\n1.Insert Front\n2.Insert Rear\n3.Delete Front\n4.Delete Rear\n5.Display\n0.Exit\nEnter choice: ");
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                printf("Enter value: ");
                scanf("%d", &value);
                insertFront(value);
                break;
            case 2:
                printf("Enter value: ");
                scanf("%d", &value);
                insertRear(value);
                break;
            case 3:
                deleteFront();
                break;
            case 4:
                deleteRear();
                break;
            case 5:
                display();
                break;
        }
    } while (choice != 0);
    return 0;
}
