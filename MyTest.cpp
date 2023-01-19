//#include<iostream>
//#include<algorithm>
//#include<stdbool.h>
//#include<set>
//using namespace std;
//struct myRule
//{
//bool operator()(const int &a,const int&b)
//const{
//return a%10>b%10;
//     }
//};
//int main(void)
//{
//int a[5]={11,12,13,24,35};
//sort(a,a+5,myRule());
//bool m=binary_search(a,a+5,3,myRule());
//int *p=upper_bound(a,a+5,3,myRule());
//*p=42;
////int *b=lower_bound(a,a+5,2,myRule());
////*b=42;
//for(int i:a)
//{
//printf("%3d",i);}
//cout<<endl;cout<<m;
//int main(void)
//{
//multiset <int> a;
//   for(int i=10;i>=0;i--)
//    {
//	a.insert(i);
//    }
//    a.erase(1);
//    multiset<int>::iterator i;
//    i=a.find(0); 
//    a.erase(i);
//   for(i=a.begin();i!=a.end();i++)
//   cout<<*i ;
//
//return 0;
//}
//#include<iostream>
//#include<algorithm>
//#include<set>
//using namespace std;
//struct myRule
//{
//bool operator()(const int &a,const int &b)const{
//return a>b;
//}
//};
//int main(void)
//{multiset<int,myRule> M;
//for(int i=0;i<10;i++)
//M.insert(i);
//multiset<int,myRule>::iterator i;
//for(i=M.begin();i!=M.end();i++)
//{
//cout<<*i<<endl;
//}
//cout<<"Next"<<endl;
//return 0;
//}
//#include<set>
//#include<iostream>
//#include<string.h>
//using namespace std;
//struct myRule{
//	bool operator()(const char &a,const char &b)const{
//	return (int)a>(int)b;
//	}
//};
//int main(void)
//{
//set<char,myRule> a;
//set<char,myRule>::iterator i;
//char h[10];
//cin>>h;
//for(int i=0;i<strlen(h);i++)
//a.insert(h[i]);
//for(i=a.begin();i!=a.end();i++)
//{
//	cout<<*i<<endl;
//}
//pair<set<char,myRule>::iterator,bool>result=a.insert('a');
//if(result.second==false)
//cout<<"插入失败,"<<*result.first<<"已经存在"<<endl;
//else cout<<"插入成功"<<endl;
//return 0;
//}