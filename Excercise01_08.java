//1.08 - 1/28
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* Print area given a radius */

import java.util.Scanner;

public class Exercise01_08 {
{
public static void main (String[] args)
{
Scanner input = new Scanner(System.in);
int radius = input.nextInt();
double area = radius * radius * Math.PI;
System.out.println(area);
}}
/*https://github.com/Asherehsa/Projects/blob/master/Excercise01_08.java
 ▄▄▄▄▄▄▄    ▄▄▄  ▄ ▄  ▄▄   ▄▄▄▄▄▄▄
 █ ▄▄▄ █  ▀▀ ▄  ▄█  ▄█▄▄▄▄ █ ▄▄▄ █
 █ ███ █ █▄  ▀▀█ █▀▄█▀▀▀▄  █ ███ █
 █▄▄▄▄▄█ ▄ ▄▀█ ▄ █ █ ▄▀█ █ █▄▄▄▄▄█
 ▄▄   ▄▄▄ ▄▀█  ██▄▄ ▀ ▄█▄█   ▄▄   
 ▄ ▄▀▀▄▄ ▀▀▄ ▀█▄█▄▄▄▀▄▄ ▀   ██▄▀█ 
  ██▀ ▀▄ ██ ▄█ █ ▄  ▀█  ▄▄▀██▀ ▀▄▄
 █▀█▄▄▄▄█▄▀▄▄▄ ▀██  ▀▀ ▀▀▄▄█▄▄  █▀
 ██▄█ █▄▄▄▀ █ ▄▀█▀▄▀▄  █▀▀█ ▄█ ▀▄▀
  ▀▀▀ ▀▄ ▀ ▀▄▀████▄▀██▀ █  ▀▀▄▀ ▀█
  ▄█▀▄▀▄▀ ▄  █▄ █▄▄ ▀  █ ▄▀ ▀▄ ▀▄ 
 █▀ ▀ █▄▀█▀▀▄▄███▄▄▄▀▄▀▀▀▄▄▄█▀█ █ 
 █▄ ▀▀█▄▀█▀█▀▄  ▄█ █▀█   ███▄██▀▄ 
 ▄▄▄▄▄▄▄ ██▀ ▀█ ███▀▀▄▄▄▄█ ▄ ██▀▄▀
 █ ▄▄▄ █ ▀▄▄ █▄██▀  ▀█ ▄▀█▄▄▄█▀▀█▀
 █ ███ █   ██▄▄▄██▄▀██ ▄█▄█▄ █ ▄ ▄
 █▄▄▄▄▄█ █▄ ▀ ▄█ ▄▄  █ ██▄▄   █▀▄ 
*/