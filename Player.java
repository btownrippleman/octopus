import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Player extends GameObject
{//Player Class
   static boolean onGround=false;
   public Player(int x,int y,Color c)
   {//Player()
      super(); //HOW DO I SIMPLIFY THIS? 4/9/2022 11:41a
      if(x<12)
      xCtr=12;
      else
      xCtr=x+12;
      if(y<12)
      yCtr=12;
      else
      yCtr=y+12;
      this.c=c;

      
   }//Player()
   
   public void left()
   {
       xCtr--;
   }
   
      public void right()
   {
      xCtr++;
   }
   
      public void up()
   {
      yCtr--;
   }
   
      public void down()
   {
      yCtr++;
   }
   
      public void jump()
   {
      yCtr-=7;   
   }
   
  /*@Override
   public void draw(Graphics g)
   {//draw
      g.setColor(this.getColor());
      g.drawRect(this.getX()-12,this.getY()-12,25,25);
      g.fillRect(this.getX()-12,this.getY()-12,25,25);
   }//draw
   */
   
   public boolean isOnGround(ArrayList<ArrayList<GameObject>> goaY)  
   {//isOnGround
         //System.out.println("In the method on ground");
           
      boolean canMoveDown=false;
      GameObject current;
      
      yCtr++;
      for(int j=0; j<goaY.size(); j++)
      {//Outer J loop
     // System.out.println("Outer loop");
         for(int i=0; i<goaY.get(j).size(); i++)
         {
            current =goaY.get(j).get(i);
            
             
            if(current!=null)
            {
               if(this.getBottom() == current.getTop() &&
                  this.getRight() > current.getLeft() &&
                  this.getLeft() < current.getRight() &&
                  this.getTop() < current.getBottom() )
               {
                  

                  canMoveDown=true;
               }
               //else
               //{temp=false;}
               //onGround=temp;
            }
           
         }
      }//Outer J loop
      yCtr--;
      return canMoveDown;
      
   }//isOnGround
   
   public void convertXYtoArrayListCoordinate(){
      int xCoord = this.getX();
      int yCoord = this.getY();
      // screen


   }


   public boolean[] canMove(ArrayList<ArrayList<GameObject>> goaY)
   {//move
      return new boolean[] {true,true,true,true};
}

      // System.out.println("goaY.size()= "+goaY.size());
      /*
      boolean canMoveLeft=true;
      boolean canMoveRight=true;
      boolean canMoveUp=true;
      boolean canMoveDown =true;
      
      GameObject current;
      
      //To the left
      // xCtr++;
      for(int j=0; j<goaY.size(); j++)
      {//Outer J loop
         for(int i=0; i<goaY.get(j).size(); i++)
         {
            current =goaY.get(j).get(i);
            if(current!=null)
            {
               if(this.getBottom()>current.getTop() &&
               this.getTop()<current.getBottom() &&
               this.getLeft()==current.getRight())
      
               {
                  canMoveLeft=false;
                  System.out.println("Can'T MOVE LEfft");
               }
               
          
            }
         }
      }//Outer J loop
     //  xCtr++;
      
      
      //Is there anything to the right?
    // xCtr++;
      for(int j=0; j<goaY.size(); j++)
      {//Outer J loop
         for(int i=0; i<goaY.get(j).size(); i++)
         {
            current =goaY.get(j).get(i);
            if(current!=null)
            {
               if(this.getBottom()>current.getTop() &&
               this.getTop()<current.getBottom() &&
               this.getRight()==current.getLeft())
      
               {
                  canMoveRight=false;
                  System.out.println("can move right is  "+canMoveRight);

               }
              
            }
         }
      }//Outer J loop
 
      
      
      //Is there anything above?
     
      for(int j=0; j<goaY.size(); j++)
      {//Outer J loop
         for(int i=0; i<goaY.get(j).size(); i++)
         {
            current=goaY.get(j).get(i);
            if(current!=null)
            {
               if(this.getBottom()>current.getTop() &&
               this.getTop()<current.getBottom() &&
               this.getRight()>current.getLeft()&&
               this.getLeft()<current.getRight())
               {
               canMoveUp=false;
                          System.out.println("can move up is  "+this.canMove(goaY)[2]);

               }
              
            }
         }
      }//Outer J loop
    
       for(int j=0; j<goaY.size(); j++)
      {//Outer J loop
         for(int i=0; i<goaY.get(j).size(); i++)
         {
            current =goaY.get(j).get(i);
            if(current!=null)
            {
               if(this.getBottom()==current.getTop() &&
               this.getLeft()<current.getRight() &&
               this.getRight()>current.getLeft())
      
               {
                  canMoveDown=false;
                             System.out.println("can move down is  "+this.canMove(goaY)[3]);

               }
              
            }
         }
      }//Outer J loop
    
    
    //canMoveDown=mushi.isOnGround(goaY);
      return new boolean[]  {canMoveLeft,canMoveRight, canMoveUp,canMoveDown};
   
   }//move
   
         */


   public boolean collides(ArrayList<ArrayList<GameObject>> goaY) //Backup Parameter phrase--> //ArrayList<? extends ArrayList<?>>goaX 
   {//collides
      boolean temp=false;
      GameObject current;
      for(int j=0; j<goaY.size(); j++)
      {//Outer J loop
         for(int i=0; i<goaY.get(i).size(); i++)
         {
            current=goaY.get(j).get(i);
            if(goaY.get(j).get(i)!=null)
            {
               if(this.collides(current))
               {
                  temp=true;
                  System.out.println("Collided");
               }
            }
         }
      }//Outer J loop
      
return temp;
      
   }//collides
   
   

   
}//Player Class 



           


