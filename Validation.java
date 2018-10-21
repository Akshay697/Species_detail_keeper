package myp;
class Validation
{
public int tagn(String tag)
{
int r=0;
int l=tag.length();
for(int i=0;i<l;i++)
{
if(tag.charAt(i)=='0'|| tag.charAt(i)=='1'|| tag.charAt(i)=='2'|| tag.charAt(i)=='3'|| tag.charAt(i)=='4'|| tag.charAt(i)=='5'|| tag.charAt(i)=='6'|| tag.charAt(i)=='7'|| tag.charAt(i)=='8'|| tag.charAt(i)=='9')
{
r=1;
}
else{
break;
}
}
return r;
}
public boolean string(String a)
{
boolean e=false;
int l=a.length();
for(int i=0;i<l;i++)
{
char ch=a.charAt(i);
if(ch>='a'&&ch<='z')
{
e= true;
}
else {

e= false;
}
}
return e;
}
public boolean heigth(String heigth)
{
boolean r=false;
for(int i=0;i<heigth.length();i++)
{
if(heigth.charAt(i)=='0'||heigth.charAt(i)=='1'||heigth.charAt(i)=='2'||heigth.charAt(i)=='3'||heigth.charAt(i)=='4'||heigth.charAt(i)=='5'||heigth.charAt(i)=='6'||heigth.charAt(i)=='7'||heigth.charAt(i)=='8'||heigth.charAt(i)=='9'||heigth.charAt(i)=='.')
{
r= true;
}
}
return r;
}
public boolean weigth(String weigth)
{
boolean r=false;
for(int i=0;i<weigth.length();i++)
{
if(weigth.charAt(i)=='0'||weigth.charAt(i)=='1'||weigth.charAt(i)=='2'||weigth.charAt(i)=='3'||weigth.charAt(i)=='4'||weigth.charAt(i)=='5'||weigth.charAt(i)=='6'||weigth.charAt(i)=='7'||weigth.charAt(i)=='8'||weigth.charAt(i)=='9'||weigth.charAt(i)=='.')
{
r= true;
}
}
return r;
}  
public int  email(String a)
{
int f=0,f1=0,f2=0,f3=0,f4=0,j=0,k=0,l,c=0,d=0,n=0,r=0,fd=0;
l=a.length();
for(int i=0;i<l;i++)
{
char ch=a.charAt(i);
if(('a'<=ch&&ch<='z')||ch=='@'||ch=='.'||(ch>='0'&&ch<='9'))
{
f=1;
}
else{
f=0;
break;
}
}
for(int i=0;i<l;i++)
{
char ch=a.charAt(i);
if((ch>='0'&&ch<='9'))
{
n+=1;
}
if(ch>='a'&&ch<='z')
{
d+=1;
}
if(ch=='@'||ch=='.')
{
r=i;
break;
}
}
if(n>0&&d>0)
{
if(n+d==r)
{
fd=1;
}
}
if(f==1)
{
if((a.charAt(0)>='a'&&a.charAt(0)<='z')||(a.charAt(0)>='0'&&a.charAt(0)<='9'))
{
f1=1;
}
for(int i=1;i<l;i++)
{
char ch=a.charAt(i);
if(ch=='@')
{
j=i;
}
if(ch=='.')
{
k=i;
}
if((ch>='0'&&ch<='9'))
{
c=i;
}
if((j<k)&&((c<i)&&(c<k)))
{
f2=1;
}
}
}
if((f1==1&&f2==1)&&fd==1)
{
f4=1;
}
else{
 f4=0;
}
return f4;
}
public boolean choice(String s)
{
boolean t=false;
if(s.equals("Select"))
{
t=true;
}
return t;
}
}