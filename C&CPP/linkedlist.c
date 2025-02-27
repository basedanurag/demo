#include<stdio.h>
#include<stdlib.h>
struct node 
{
int data;
struct node*next;
   
};
int main (){
    struct node*head;
     head = (struct node*) malloc(sizeof(struct node ));
     scanf("%d", &head-> data);
     head -> next = NULL;
     while(head!=NULL){
        printf("%d", head -> data);
     }
}