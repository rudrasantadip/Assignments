#include<stdio.h>
#include<stdlib.h>

     struct node
     {
         int data;
         struct node *next;
     };

      struct node *head=0,*temp;


       void create()
       {
           int choice=1;
           while(choice==1)
           {
               struct node *newnode=(struct node *)malloc(sizeof(struct node));
               printf("\n enter data : ");
               scanf("%d",&newnode->data);
               newnode->next=0;
               if(head==0)
               {
                   head=newnode;
                   temp=newnode;
               }
               else
                {
                    temp->next=newnode;
                    temp=newnode;
                }
                printf("\n want to continue enter 1 or 0");
                scanf("%d",&choice);
           }
       }


          void insert_first()
          {
              struct node *newnode=(struct node *)malloc(sizeof(struct node));
               printf("\n enter new data : ");
               scanf("%d",&newnode->data);
               newnode->next=head;
               head=newnode;
          }


           void insert_last()
           {
               struct node *newnode=(struct node *)malloc(sizeof(struct node));
               struct node *anotherNode = head;
               printf("\n enter new data : ");
               scanf("%d",newnode->data);
               while (anotherNode->next!=NULL)
               {
                anotherNode=anotherNode->next;
               }
               
               temp->next=newnode;
               newnode->next=0;
           }

            void display()
            {
                temp=head;
                printf("\n the linkedlist is: ");
                while(temp!=0)
                {
                    printf(" %d",temp->data);
                    temp=temp->next;
                }
            }

            void main()
            {
                int ch;
                while(1)
                {
                printf("\n enter choice \n 1 for create  \n 2 for create insert_first \n 3 for create insert last \n 4 for display ");
                scanf("%d",&ch);
                if(ch==1)
                {
                    create();
                }
                else if(ch==2)
                {
                    insert_first();
                }
                else if(ch==3)
                {
                    insert_last();
                }
                else if(ch==4)
                {
                    display();
                }
                else if(ch==5)
                {
                    printf("\n wrong choice ");
                }
                }
            }