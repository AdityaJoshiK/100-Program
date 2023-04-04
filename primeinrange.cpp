#include<iostream>
using namespace std;

int main()
{

    int a,b,c=0;

    cout<<"Enter n1:";
    cin>>a;

    cout<<"Enter n2:";
    cin>>b;

    for (int i = a; i <= b; i++)
    {
        c=0;
        for (int j = 2; j < i; j++)
        {
            if (i%j==0)
            {
                c++;
            }
            
        }

        if (c==0 && i != 1)
        {
            cout<<i<<", ";
        }
        
    }
    

    return 0;

}