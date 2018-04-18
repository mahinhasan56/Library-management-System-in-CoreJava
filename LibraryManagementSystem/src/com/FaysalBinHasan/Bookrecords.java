package com.FaysalBinHasan;

import java.util.*;
public class Bookrecords
{
  Book []records;
  Scanner sc=new Scanner(System.in);
  int size;
  boolean information=false;
  public Bookrecords()
  {
    records=new Book[15];
    size=0;
  }
  public void Addrecord(String n,String i,String a,String p)
  {
    information=true;
    if(size>=records.length-1)
    {
      resize();
    }
    records[size]=new Book();
    records[size].name=n;
    records[size].id=i;
    records[size].author=a;
    records[size].publisher=p;
    size++;
  }
  public void resize()
  {
  Book temp[]=new Book[size*2];
  for(int c=0;c<size*2;c++)
  {
    temp[c]=records[c];
  }
  records=temp;
  }
  public void printrecord()
  {
    for(int i=0;i<size;i++)
    {
      for(int j=i+1;j<size;j++)
      {
        if((records[i]).name.compareToIgnoreCase(records[j].name)>0)
        {
          Book temp=records [i];
          records[i]=records[j];
          records[j]=temp;
        }
        else if((records[i]).id.compareTo(records[j].id)>0)
        {
          Book temp=records [i];
          records[i]=records[j];
          records[j]=temp;
        }
      }
    }
    for(int c=0;c<size;c++)
    {
      System.out.println(records[c].name+" ");
      System.out.println(records[c].id+" ");
      System.out.println(records[c].author+" ");
      System.out.println(records[c].publisher+" ");
    }
  }
  public void DeleteRecord(String id1)
  {
    boolean idFound=false;
    //loop which will find fast id
    for(int c=0;c<size;c++)
    {
      if(records[c].id.equals(id1))
      {
        idFound=true;
        System.out.println(id1+"is deleted");
        //which will leftshifting .here index passing
        for(int c2=c;c2<size;c2++)
        {
          records[c2]=records[c2+1];
        }
        records[size]=null;
        size--;
        break;
      }
    }
    if(idFound==false)
    {
      System.out.println("Id"+id1+"doesnotexist");
    }
  }
  public void EditRecord(String id)
  {
    if(information==false)
    {
      System.out.println("No Entry");
    }
    for(int c=0;c<size;++c)
    {
      if(records[c].id.equals(id))
      {
        System.out.println("Edit Information"+
                           "Enter 1 for Book name"+
                           "Enter 2 for Book id"+
                           "Enter 3 for Book author"+
                           "Enter 4 for Book publisher"+
                           "Enter # for going back");
                           
      String inf=sc.nextLine();
      if(inf.equals("1"))
      {
        System.out.println("Enter  a new Book Name");
        String book1=sc.nextLine();
        records[c].name= book1;
      }
      else if(inf.equals("2"))
      {
        System.out.println("Enter  a new Book id" );
        String book2=sc.nextLine();
        records[c].id= book2;
      }
      else if(inf.equals("3"))
      {
        System.out.println("Enter  a new Book author" );
        String book3=sc.nextLine();
        records[c].author= book3;
      }
      else if(inf.equals("4"))
      {
        System.out.println("Enter  a new Book publisher" );
        String book4=sc.nextLine();
        records[c].publisher= book4;
      }
      else if(inf.equals("#"))
      {
        return;
      }
      }
      else
      {
        System.out.println("Not Found");
      }
    }
  }
}



    
        