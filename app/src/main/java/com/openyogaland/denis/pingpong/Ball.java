package com.openyogaland.denis.pingpong;

import android.graphics.Point;

// this class represents a ping-pong ball
class Ball
{
  // constants
  final static int RADIUS      = 10;  // радиус мяча
  final static int MIN_SPEED   = 10;  // минимальная скорость мяча
  final static int MAX_SPEED   = 30;  // максимальная скорость мяча
  
  // fields
  private int x;
  private int y;
  private int color;
  
  // game variables
  private int speedX;
  private int speedY;
  
  // flags
  boolean isMovingLeft;
  boolean isMovingUp;
  boolean isServed;
  
  // default constructor
  Ball(int x, int y, int color)
  {
    this.x      = x;
    this.y      = y;
    this.color  = color;
    
    isMovingUp   = false;
    isMovingLeft = false;
    isServed     = false;
  }
  
  // alternative constructor
  Ball(Point point, int color)
  {
    this(point.x, point.y, color);
  }
  
  // getter getX()
  int getX()
  {
    return x;
  }
  // getter getY()
  int getY()
  {
    return y;
  }
  // getter getColor()
  int getColor()
  {
    return color;
  }
  // getter getSpeedX()
  int getSpeedX()
  {
    return speedX;
  }
  // getter getSpeedY()
  int getSpeedY()
  {
    return speedY;
  }
  
  
  // setter setX()
  void setX(int x)
  {
    this.x = x;
  }
  // setter setY()
  void setY(int y)
  {
    this.y = y;
  }
  // setter setSpeedX()
  void setSpeedX(int speedX)
  {
    this.speedX = speedX;
  }
  // setter setSpeedY()
  void setSpeedY(int speedY)
  {
    this.speedY = speedY;
  }
  
  
  // the ball bounces from vertical sides
  void bounceFromVertical(boolean isMovingLeft)
  {
    if (isServed)
    {
      this.isMovingLeft = !isMovingLeft;
    }
  }
  // the ball bounces from horizontal sides
  void bounceFromHorizontal(boolean isMovingUp)
  {
    if (isServed)
    {
      this.isMovingUp = !isMovingUp;
    }
  }
}
